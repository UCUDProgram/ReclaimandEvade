package edu.udel.dlaw.ReclaimandEvade;

import edu.udel.jatlas.gameframework.Action;

/**
 * A player in the snake game can change the direction the
 * player is heading. The player does not move the snake itself 
 * because that is time-based logic and will happen on
 * each tick of the game.
 *  
 * @author jatlas
 */
public class ChangeDirectionMove implements Action<ReclaimandEvadeGame> {
    private int direction;

    public ChangeDirectionMove(int direction) {
        this.direction = direction;
    }

    /**
     * It is valid to change direction in Snake to anything
     * (even if it is a bad idea to go backwards)
     */
    public boolean isValid(ReclaimandEvadeGame state) {
        return true;
    }

    public void update(ReclaimandEvadeGame game) {
        game.getPlayer1().setDirection(direction);
    }

    public int getDirection() {
        return direction;
    }

    public String toString() {
        return "ChangeDirectionMove [direction=" + Player.DIRECTION_CHARS[direction] + "]";
    }
}
