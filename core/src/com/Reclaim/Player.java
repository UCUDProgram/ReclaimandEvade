package com.Reclaim;
//import edu.udel.jatlas.gameframework.Position;


/*	
 * REDO THE PLAYER CLASS BASED ON GAMER SELECTING THEIR GAME CHARACTER 
 */


public class Player extends Combatant{
	private double damageBonus;

	public Player (String name, Position playerLocation , int health, double movementSpeed, String weapon, int direction, boolean fire, double damBonus){
		super(name, playerLocation, health, movementSpeed, weapon, direction, fire);
		this.damageBonus = damBonus;
	}

	
	// Getters and Setters for playerLocation, health, direction and fire
	// Getters for name, movementSpeed, weapon and damBonus
	
	public Player (){
		
	}
	
	public double getDamageBonus() {
		return damageBonus;
	}
	
	public Position getNextPosition(int direction) {
        Position head = getComLocation();
        Position next = head;
        
        if (direction == DIRECTION_UP) {
            next = new Position(head.getColumn(), head.getRow() - 1);
        }
        else if (direction == DIRECTION_RIGHT) {
            next = new Position(head.getColumn() + 1, head.getRow());
        }
        else if (direction == DIRECTION_DOWN) {
            next = new Position(head.getColumn(), head.getRow() + 1);
        }
        else if (direction == DIRECTION_LEFT) {
            next = new Position(head.getColumn() - 1, head.getRow());
        }
        
        return next;
    }
	
	
	
//  Create the toString Method once all the properties have been Decided
//	@Override
//	public String toString() {
//		return "Player [damageBonus=" + damageBonus + ", name=" + name
//				+ ", xloc=" + xloc + ", yloc=" + yloc + ", health=" + health
//				+ ", movementSpeed=" + movementSpeed + ", weapon=" + weapon
//				+ ", direction=" + direction + ", fire=" + fire + "]";
//	}
}
