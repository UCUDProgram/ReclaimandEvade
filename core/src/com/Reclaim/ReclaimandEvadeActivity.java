package edu.udel.dlaw.ReclaimandEvade;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import edu.udel.jatlas.gameframework.Action;
import edu.udel.jatlas.gameframework.Game;
import edu.udel.jatlas.gameframework.GameListener;

public class ReclaimandEvadeActivity extends Activity implements GameListener<ReclaimandEvadeGame> {
    private TextView status;
    private ReclaimandEvadeView gameView;
    private ReclaimandEvadeGame game;
    
    private static final int GAMETYPE_AI = 0;
    private static final int GAMETYPE_HUMAN = 1;
    
    private int gameType;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        status = new TextView(this);
        gameView = new ReclaimandEvadeView(this);
        game = ReclaimandEvadeGame.startGame();
        
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll.addView(status);
        ll.addView(gameView);
        
        startGame();

        setContentView(ll);
    }
    
    public ReclaimandEvadeGame getCurrentGame() {
        return game;
    }
    
    private void startGame() {
    	game =ReclaimandEvadeGame.makeStartGame();
//        game =ReclaimandEvadeGame.startGame();
        game.addGameListener(this);

        if (gameType == GAMETYPE_AI) {
            game.addGameListener(new ReclaimandEvadeAI(game));
        }
        
        game.start();
        ReclaimandEvadeHuman human = new ReclaimandEvadeHuman(this);
        gameView.setOnTouchListener(human);
        gameView.setOnKeyListener(human);
    }
    
    public void restartGame() {
        if (game != null && game.getLivesLeft() == 0) {
            game.end();
        }
        startGame();
    }
    
    @Override
    public void onPerformActionEvent(Action<ReclaimandEvadeGame> action, ReclaimandEvadeGame game) {
        updateViews();
    }

    @Override
    public void onTickEvent(ReclaimandEvadeGame game) {
        updateViews();
    }

    @Override
    public void onStartEvent(ReclaimandEvadeGame game) {
        updateViews();
    }

    @Override
    public void onEndEvent(ReclaimandEvadeGame game) {
        updateViews();
    }

    @Override
    public void onEvent(String event, ReclaimandEvadeGame game) {
        updateViews();
    }
    
    private void updateViews() {
        status.setText(game.getStatus());
        gameView.invalidate();
    }

    
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("Demo");
        menu.add("Play Game");
        menu.add("Restart");
        menu.add("Quit");
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
        CharSequence title = item.getTitle();
        if (title.equals("Demo")) {
            gameType = GAMETYPE_AI;
            restartGame();
        }
        else if (title.equals("Play Game")) {
            gameType = GAMETYPE_HUMAN;
            restartGame();
        }
        else if (title.equals("Restart")) {
            // start a new game with the same players as previous game
            restartGame();
        }
        else if (title.equals("Quit")) {
            finish();
        }
        return true;
    }
    
    
}
