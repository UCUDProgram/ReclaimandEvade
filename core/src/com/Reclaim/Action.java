package com.Reclaim;
/*
 * This code came from a professor, who provided the code to students to hellp with game Development
 * The Professor was James Atlas, at the University of Delaware
 */


/**
 * An Action is something that a player can perform
 * on a game model. 
 * 
 * @author jatlas
 * 
 * @param <G>
 */
public interface Action<G extends Game> {
    /**
     * Returns true if this Action is valid to perform
     * on the given state of the game
     * 
     * @param game
     * @return
     */
    public boolean isValid(G game);
    
    /**
     * Mutates state of the game according to the properties
     * of this Action
     * 
     * @param game
     */
    public void update(G game);
}
