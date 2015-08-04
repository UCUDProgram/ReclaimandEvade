package edu.udel.dlaw.ReclaimandEvade;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import edu.udel.jatlas.gameframework.Position;

public class ReclaimandEvadeHuman implements View.OnTouchListener, View.OnKeyListener {
    private ReclaimandEvadeActivity activity;

    public ReclaimandEvadeHuman(ReclaimandEvadeActivity activity) {
        this.activity = activity;
    }

    public boolean onTouch(View v, MotionEvent event) {
        int action = event.getAction();
        ReclaimandEvadeGame game = activity.getCurrentGame();
        if (game != null) {
            // is the game ended? if so restart it!
            if (game.isEnd()) {
                activity.restartGame();
            }
            else if (action == MotionEvent.ACTION_DOWN) {
                // where did they click on the board?
                int row = (int)((event.getY() / v.getHeight()) * 
                        game.WORLDWIDTH);
                int col = (int)((event.getX() / v.getWidth()) * 
                        game.WORLDHEIGHT);
                
                // which direction does that indicate?
                Position player = game.getPlayer1().getComLocation();
                int changeX = col - player.getColumn();
                int changeY = row - player.getRow();
                int direction = game.getPlayer1().getDirection();
                
                // this conditional prevents the user from going back on itself so that
                //  all input "curls" around
                if ((direction == Player.DIRECTION_LEFT && (Math.abs(changeY) > Math.abs(changeX)
                        || (Math.abs(changeY) > 0 && changeX > 0)))
                    || (direction == Player.DIRECTION_RIGHT && (Math.abs(changeY) > Math.abs(changeX)
                        || (Math.abs(changeY) > 0 && changeX < 0)))) {
                    direction = changeY > 0 ? Player.DIRECTION_DOWN : Player.DIRECTION_UP;
                }
                else if ((direction == Player.DIRECTION_UP && (Math.abs(changeX) > Math.abs(changeY)
                        || (Math.abs(changeX) > 0 && changeY > 0)))
                    || (direction == Player.DIRECTION_DOWN && (Math.abs(changeX) > Math.abs(changeY)
                        || (Math.abs(changeX) > 0 && changeY < 0)))) {
                    // we should move sideways
                    direction = changeX > 0 ? Player.DIRECTION_RIGHT : Player.DIRECTION_LEFT;
                }
                
                if (direction != game.getPlayer1().getDirection()) {
                    game.perform(new ChangeDirectionMove(direction));
                }

            }
        }
        
        // we don't need any more events in this sequence
        return false;
    }
    
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        int direction = activity.getCurrentGame().getPlayer1().getDirection();
        if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_UP) {
            direction = Player.DIRECTION_UP;
        }
        else if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_DOWN) {
            direction = Player.DIRECTION_DOWN;
        }
        else if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_LEFT) {
            direction = Player.DIRECTION_LEFT;
        }
        else if (event.getKeyCode() == KeyEvent.KEYCODE_DPAD_RIGHT) {
            direction = Player.DIRECTION_RIGHT;
        }
        
        if (direction != activity.getCurrentGame().getPlayer1().getDirection()
//        		&& direction != activity.getCurrentGame().getPlayer1().getOppositeDirection()) 
        ){
            activity.getCurrentGame().perform(new ChangeDirectionMove(direction));
        }
        
        return false;
    }
}
