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
	
	public Player (int playNum){
		health = 100;
		name = setPlayerName(playNum);
		weapon = setPlayerWeapon(playNum);
		damageBonus = setPlayerDamageBonus(playNum);
		movementSpeed = setPlayerMovementSpeed(playNum);
		direction = setPlayerInitialDirection();
		fire = false;
	}
	
	/*
	 * Spartan = 1
	 * Avery Johnson = 2
	 * ODST = 3
	 * Marine = 4
	 */
	
	/*
	 * Set Player Name
	 */
	public String setPlayerName(int pNum){
		if (pNum == 1)
			return "Spartan";
		else if (pNum == 2)
			return "Avery Johnson";
		else if (pNum == 3)
			return"ODST";
		else
			return "Marine";
	}
	
	/*
	 * Set Player's Weapon
	 */
	public static String setPlayerWeapon(int pNum){
		if (pNum == 1)
			return "Spartan Laser";
		else if (pNum == 2)
			return "Sniper Rifle";
		else if (pNum == 3)
			return"Shotgun";
		else
			return "Battle Rifle";
	}
	
	/*
	 * Set Player's Damage Value
	 */
	public static double setPlayerDamageBonus(int pNum){
		if ( pNum == 1)
			return 1.30;
		else if ( pNum == 2)
			return 1.25;
		else if (pNum == 3)
			return 1.20;
		else
			return 1.15;
	}
		
	/*
	 * Set Player Movement Speed
	 */
	public static double setPlayerMovementSpeed (int pNum){
		if (pNum == 1)
			return .05;
		else if (pNum == 2)
			return .07;
		else if (pNum == 3)
			return .06;
		else
			return .08;
	}
		
	/*
	 * Set Player's Weapon Damage
	 */
	public static int setPlayerWeaponDamage (int pNum){
		if (pNum == 1)
			return 35;
		if (pNum == 2)
			return 25;
		if (pNum == 3)
			return 30;
		else
			return 15;
	}
		
	
	/*
	 * Set the Enemies' Initial Direction
	 *  Random number generator to set Enemy's Initial Direction
	 */
	public int setPlayerInitialDirection(){
		return (int)(Math.random() * 4);
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

}
