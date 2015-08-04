package com.Reclaim;
/*
 * This code came from a professor, who provided the code to students to hellp with game Development
 * The Professor was James Atlas, at the University of Delaware
 */

/**
 * An interface that represents the ability of an object
 * to handle events from a game.
 * 
 * @author jatlas
 *
 * @param <G>
 */
public interface GameListener<G extends Game> {
    /**
     * Called after a player performs an Action on a Game
     * 
     * @param action
     * @param game
     */
    public void onPerformActionEvent(Action<G> action, G game);
    
    /**
     * Called after a tick update happens to a Game
     * 
     * @param game
     */
    public void onTickEvent(G game);
    
    /**
     * Called only at the start of the Game
     * 
     * @param game
     */
    public void onStartEvent(G game);
    
    /**
     * Called only at the end of the Game
     * 
     * @param game
     */
    public void onEndEvent(G game);
    
    /**
     * Called by specific Game subclasses for custom events.
     * 
     * @param event
     * @param game
     */
    public void onEvent(String event, G game);
}
