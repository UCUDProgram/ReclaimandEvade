package com.Reclaim;
//import edu.udel.jatlas.gameframework.Position;


/*	REDO THE PLAYER CLASS BASED ON GAMER SELECTING THEIR GAME CHARACTER 

*/

public class Combatant {
	protected String name;
	protected Position comLocation;
	protected int health;
	protected double movementSpeed;
	protected String weapon;
	protected int direction;
	protected boolean fire;
	
	public static final int DIRECTION_UP = 0;
	public static final int DIRECTION_DOWN = 1;
	public static final int DIRECTION_LEFT = 2;
    public static final int DIRECTION_RIGHT = 3;
    public static final int DIRECTION_NONE = -1;
    public static final char[] DIRECTION_CHARS = {'^','v','<','>'};
    public static final boolean DID_FIRE = true;
    public static final boolean DID_NOT_FIRE = false;
	
	public Combatant(String name, Position comLocation, int health, double movementSpeed, String weapon, int direction, boolean fired) {
		this.name = name;
		this.comLocation = comLocation;
		this.health = health;
		this.movementSpeed = movementSpeed;
		this.weapon = weapon;
		this.direction = direction;
		this.fire = fired;
	}

	public Combatant(){
		
	}
	
	// Getters and Setters for comLocation, health, direction and fired
	// Getters for name, movement Speed and Weapon
	
	
	//Set the combatant Position (based on movement Speed and direction)
	// changed the function to return a position and declared variables for the return position 
	public Position updatePosition(){
		Position newPosition = this.comLocation; 
		if (this.direction == 0)
			newPosition = new Position(this.comLocation.getX(), (this.comLocation.getY() - movementSpeed));
		if (this.direction == 1)
			newPosition = new Position(this.comLocation.getX(), (this.comLocation.getY() + movementSpeed));
		if (this.direction == 2)
			newPosition = new Position((this.comLocation.getX() - movementSpeed), this.comLocation.getY() );
		if (this.direction == 3)
			newPosition = new Position( (this.comLocation.getX() + movementSpeed), this.comLocation.getY() );
	return newPosition;
	}

	public Position getComLocation() {
		return comLocation;
	}

	public void setComLocation(Position comLocation) {
		this.comLocation = comLocation;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public boolean isFire() {
		return fire;
	}

	public void setFire(boolean fire) {
		this.fire = fire;
	}

	public String getName() {
		return name;
	}

	public double getMovementSpeed() {
		return movementSpeed;
	}

	public String getWeapon() {
		return weapon;
	}
	
	
	//  Create the toString Method once all the properties have been Decided
//	@Override
//	public String toString() {
//		return "Combatant [name=" + name + ", xloc=" + xloc + ", yloc=" + yloc
//				+ ", health=" + health + ", movementSpeed=" + movementSpeed
//				+ ", weapon=" + weapon + ", direction=" + direction + ", fire="
//				+ fire + "]";
//	}	
}
