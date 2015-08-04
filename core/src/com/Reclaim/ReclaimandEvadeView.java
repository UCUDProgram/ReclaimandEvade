package edu.udel.dlaw.ReclaimandEvade;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import edu.udel.jatlas.gameframework.Position;
import edu.udel.dlaw.ReclaimandEvade.Relic;

public class ReclaimandEvadeView extends View {
    // the activity
    protected ReclaimandEvadeActivity activity;
    
    //--- BEGIN - these properties can be saved so we don't need to recompute ----
    // the width and height of the current game view
    private int width;
    private int height;
    
    // the scale of the game board grid, how many pixels per col (x) and row (y)
    private float scale_x;
    private float scale_y;
    //--- END -----
    
    // the loaded bitmaps of images used to draw the game
    private Bitmap pacmanDown;
    private Bitmap pacmanLeft;
    private Bitmap pacmanRight;
    private Bitmap pacmanUp;
    private Bitmap enemyDown;
    private Bitmap enemyLeft;
    private Bitmap enemyRight;
    private Bitmap enemyUp;
    private Bitmap wallImage;
    private Bitmap relics;
        
    public ReclaimandEvadeView(ReclaimandEvadeActivity context) {
        super(context);
        activity = context;
        
        setBackgroundColor(Color.BLACK);
        
        setFocusable(true);
        setFocusableInTouchMode(true);
        pacmanDown = loadImage("pacman_down");
        pacmanLeft = loadImage("pacman_left");
        pacmanRight = loadImage("pacman_right");
        pacmanUp = loadImage("pacman_up");
        enemyDown = loadImage("enemy_down");
        enemyLeft = loadImage("enemy_left");
        enemyRight = loadImage("enemy_right");
        enemyUp = loadImage("enemy_up");
        wallImage = loadImage("wall");
        relics = loadImage("relic");

    }
    
    /**
     * Helper method so we don't have to write this code as much
     */
    private Bitmap loadImage(String name) {
        return BitmapFactory.decodeResource(activity.getResources(), 
            activity.getResources().getIdentifier(name, "drawable", getClass().getPackage().getName()));
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        
        // draw the walls first
        drawWalls(canvas);
        
//         draw the relics
        drawRelics(canvas);
        
        // draw the snake
        drawPlayer(canvas);
    }
        
    // for performance only
    RectF rectF = new RectF();
    private void setRectFromPosition(Position position) {
        float left = scale_x * position.getColumn();
        float top = scale_y * position.getRow();
        float right = left + scale_x;
        float bottom = top + scale_y;
        rectF.set(left, top, right, bottom);
    }
    
    // Draw Relics
    public void drawRelics(Canvas canvas) {
        for (Relic reliclist : activity.getCurrentGame().getRelics()) {
            for (Position p : reliclist) {
                setRectFromPosition(p);
                canvas.drawBitmap(relics, null, rectF, null);
            }
        }
    }
    
    
    // Draw Walls
    public void drawWalls(Canvas canvas) {
        for (Wall wall : activity.getCurrentGame().getWalls()) {
            for (Position p : wall) {
                setRectFromPosition(p);
                canvas.drawBitmap(wallImage, null, rectF, null);
            }
        }
    }
    
    // Draw Player
    public void drawPlayerLeft(Canvas canvas) {
        Player player = activity.getCurrentGame().getPlayer1();
        setRectFromPosition(player.getComLocation());
        canvas.drawBitmap(pacmanLeft, null, rectF, null);
    }
    public void drawPlayerRight(Canvas canvas) {
        Player player = activity.getCurrentGame().getPlayer1();
        setRectFromPosition(player.getComLocation());
        canvas.drawBitmap(pacmanRight, null, rectF, null);
    }
    public void drawPlayerUp(Canvas canvas) {
        Player player = activity.getCurrentGame().getPlayer1();
        setRectFromPosition(player.getComLocation());
        canvas.drawBitmap(pacmanUp, null, rectF, null);
    }
    public void drawPlayerDown(Canvas canvas) {
        Player player = activity.getCurrentGame().getPlayer1();
        setRectFromPosition(player.getComLocation());
        canvas.drawBitmap(pacmanDown, null, rectF, null);
    }
    
    // Draw Enemy
    public void drawEnemyLeft(Canvas canvas) {
        Player player = activity.getCurrentGame().getPlayer1();
        setRectFromPosition(player.getComLocation());
        canvas.drawBitmap(enemyLeft, null, rectF, null);
    }
    public void drawEnemyRight(Canvas canvas) {
        Player player = activity.getCurrentGame().getPlayer1();
        setRectFromPosition(player.getComLocation());
        canvas.drawBitmap(enemyRight, null, rectF, null);
    }
    public void drawEnemyUp(Canvas canvas) {
        Player player = activity.getCurrentGame().getPlayer1();
        setRectFromPosition(player.getComLocation());
        canvas.drawBitmap(enemyUp, null, rectF, null);
    }
    public void drawEnemyDown(Canvas canvas) {
        Player player = activity.getCurrentGame().getPlayer1();
        setRectFromPosition(player.getComLocation());
        canvas.drawBitmap(enemyDown, null, rectF, null);
    }
    
    public void drawPlayer(Canvas canvas) {
        Player player = activity.getCurrentGame().getPlayer1();
        
//        Bitmap image = 
//            player.getDirection() == Player.DIRECTION_DOWN || 
//            player.getDirection() == Player.DIRECTION_UP ? headUDImage : headLRImage;
        if (player.getDirection() == Player.DIRECTION_LEFT) {
            drawPlayerLeft(canvas);
        }
        else if (player.getDirection() == Player.DIRECTION_RIGHT) {
            drawPlayerRight(canvas);
        }
        else if (player.getDirection() == Player.DIRECTION_UP) {
            drawPlayerUp(canvas);
        }
        else {
            drawPlayerDown(canvas);
        }
        
//        boolean head = true;
        
//        for (Position position : snake.getSegments()) {
//            setRectFromPosition(position);
//            
//            canvas.drawBitmap(image, null, rectF, null);
//            if (head) {
//                image = bodyImage;
//                head = false;
//            }
//        }
        
        Paint textPaint = new Paint();
        textPaint.setTextSize(15);
        textPaint.setTextScaleX(1.5f);
        textPaint.setTypeface(Typeface.SERIF);
        canvas.drawText("Scaled", 0, 0, textPaint);
    }
    
    public void drawEnemy(Canvas canvas) {
        for(Enemy enemy : activity.getCurrentGame().getEnemies()){
//        Bitmap image = 
//            player.getDirection() == Player.DIRECTION_DOWN || 
//            player.getDirection() == Player.DIRECTION_UP ? headUDImage : headLRImage;
        	if (enemy.getDirection() == Enemy.DIRECTION_LEFT) {
        		drawEnemyLeft(canvas);
        	}
        	else if (enemy.getDirection() == Enemy.DIRECTION_RIGHT) {
        		drawEnemyRight(canvas);
        	}
        	else if (enemy.getDirection() == Enemy.DIRECTION_UP) {
        		drawEnemyUp(canvas);
        	}
        	else {
        		drawEnemyDown(canvas);
        	}
        }
        
//        boolean head = true;
        
//        for (Position position : snake.getSegments()) {
//            setRectFromPosition(position);
//            
//            canvas.drawBitmap(image, null, rectF, null);
//            if (head) {
//                image = bodyImage;
//                head = false;
//            }
//        }
        
        Paint textPaint = new Paint();
        textPaint.setTextSize(15);
        textPaint.setTextScaleX(1.5f);
        textPaint.setTypeface(Typeface.SERIF);
        canvas.drawText("Scaled", 0, 0, textPaint);
    }
    
    /**
     * This method is called by the Android platform when the app window size changes.
     * We store the initial setting of these so that we can compute the exact locations
     * to draw the components of our View.
     */
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        width = w;
        height = h;
        
        updateScaling();
    }
    
    private void updateScaling() {
        if (activity.getCurrentGame() != null) {
            scale_x = (float)width / (float)activity.getCurrentGame().WORLDWIDTH;
            scale_y = (float)height / (float)activity.getCurrentGame().WORLDHEIGHT;
        }
    }
}
