package edu.udel.dlaw.ReclaimandEvade;

import java.util.ArrayList;
import java.util.List;

import edu.udel.jatlas.gameframework.AI;
import edu.udel.jatlas.gameframework.Action;
import edu.udel.jatlas.gameframework.Position;
import edu.udel.dlaw.ReclaimandEvade.Enemy;
import edu.udel.dlaw.ReclaimandEvade.Player;
import edu.udel.dlaw.ReclaimandEvade.ReclaimandEvadeGame;

public class ReclaimandEvadeAI extends AI<ReclaimandEvadeGame> {
    // snake is single-player, so the AI's identity does not matter 
    public ReclaimandEvadeAI(ReclaimandEvadeGame game) {
        super(game, "AI"); 
    }
    
    /**
     * Returns a list of all valid moves from a given state.
     * 
     * @param state
     * @return
     */
    public List<Action<ReclaimandEvadeGame>> getAllValidActions(ReclaimandEvadeGame game) {
        List<Action<ReclaimandEvadeGame>> validMoves = new ArrayList<Action<ReclaimandEvadeGame>>();
        if (!game.isEnd()) {
            // well a valid move is anything in Player
            // (might not be a *good* move though, as you could die on the next tick)
          validMoves.add(new ChangeDirectionMove(Player.DIRECTION_DOWN));
          validMoves.add(new ChangeDirectionMove(Player.DIRECTION_UP));
          validMoves.add(new ChangeDirectionMove(Player.DIRECTION_RIGHT));
          validMoves.add(new ChangeDirectionMove(Player.DIRECTION_LEFT));
        }
        return validMoves;
    }

    
    /**
     * To determine the heuristic score of Snake we want to determine
     * how close we are to the food.  However, sometimes we are facing
     * impending doom (which is bad).  Here is a breakdown of scores:
     * 
     * -1 = we already lost (game is at end already)
     * 0 = we are about to lose 
     * maxDistance - currentDistance = how far are we from the food?
     * 
     * Because we can't be farther from the food than rows + columns, we
     * subtract the distance to give us a high score if we are about to eat
     * the food.
     * 
     * @param state
     * @return
     */
    public double getHeuristicScore(Action<ReclaimandEvadeGame> action, ReclaimandEvadeGame game) {
    	double result = 0;
        if (game.isEnd()) {
            result = -1;
        }
        // all actions in Player are ChangeDirectionMove so this is safe
        ChangeDirectionMove m = (ChangeDirectionMove)action;
        
        // would the direction take us towards death?
        Player player = game.getPlayer1();
        Position next = player.getNextPosition(m.getDirection());
        if (game.isWall(next)) {
            result = 0;
        }
        if (player.getComLocation() == next) {
            result = 0;
        }
        
        int maxDistance = 0;
        for(Relic relic : game.getRelics()){
        	int RowDiff = Math.abs(player.getComLocation().getRow() - relic.getRelicLocation().getRow());
        	int ColumnDiff = Math.abs(player.getComLocation().getColumn() - relic.getRelicLocation().getColumn());
        	maxDistance = RowDiff + ColumnDiff;
        	// ok return a score based on distance from food
        	result = maxDistance - relic.getRelicLocation().blockDistance(next);
        }
        return result;
        
    }

}