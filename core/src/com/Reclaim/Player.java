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
	
	
	// Set Player's Weapon
		public static String setPlayerWeapon(String pName){
			String Weapon ="";
			if (pName == "Spart")
				Weapon = "Spartan Laser";
			if (pName == "AveJoh")
				Weapon = "Sniper Rifle";
			if (pName == "ODST")
				Weapon = "Shotgun";
			if (pName == "Marine")
				Weapon = "Battle Rifle";
			
			return Weapon;
		}
	
		// Set Player's Damage Value
		public static double setPlayerDamageBonus(String name){
			double PDamage = 0;
			if ( name == "Spart")
				PDamage = 1.30;
			if ( name == "AveJoh")
				PDamage = 1.25;
			if (name == "ODST")
				PDamage = 1.20;
			if (name == "Marine")
				PDamage = 1.15;
			return PDamage;
		}
		
		// Set Player Movement Speed
		// Alter these values based on ticks and realistic movement
		public static double setPlayerMovementSpeed (String playerName){
			double playerMoveSpeed = 0;
			if (playerName == "Spart")
				playerMoveSpeed = .05;
			if (playerName == "AveJoh")
				playerMoveSpeed= .07;
			if (playerName == "ODST")
				playerMoveSpeed = .06;
			if (playerName == "Marine")
				playerMoveSpeed = .08;
			return playerMoveSpeed;
		}
		
		// Set Player's Weapon Damage
		public static int setPlayerWeaponDamage (String WeaponName){
			int WDamage = 0;
			if (WeaponName == "Spartan Laser")
				WDamage = 35;
			if (WeaponName == "Sniper Rifle")
				WDamage = 25;
			if (WeaponName == "Shotgun")
				WDamage = 30;
			if (WeaponName == "Battle Rifle")
				WDamage = 15;
			return WDamage;
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
