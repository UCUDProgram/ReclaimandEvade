package com.Reclaim;
//import edu.udel.jatlas.gameframework.Position;

import java.util.ArrayList;
import java.util.List;


/*	
 * REDO THE PLAYER CLASS BASED ON GAMER SELECTING THEIR GAME CHARACTER 
 */


public class Enemy extends Combatant{
	private int maxHealth;
	private int coolOffTime;
	private int coolOffMax;
	private int[] nextDirection;
	
//	public Enemy (String name, Position enemyLocation , int health, double movementSpeed, String weapon, int direction, boolean fired,int coolOffTime ){
//		//xloc, yloc
//		super(name, enemyLocation, health, movementSpeed, weapon, direction, fired);
//		this.maxHealth = health;
//		this.coolOffTime = coolOffTime;
////		int coolOffMax = 
//		setCoolOffMax(coolOffTime);
//		this.nextDirection = setNextPossDirection();
//		
//	}

	/*
	 * Grunt Scout Enemy = 1
	 * Jackal Scout Enemy = 2
	 * Grunt Sniper Enemy = 3
	 * Jackal Sniper Enemy = 4
	 * Elite Enemy = 5
	 * Zealot Enemy = 6
	 * Hunter Enemy = 7
	 */

	/*
	 * Constructor for the enemy that passes in an integer and a position
	 */
	public Enemy (int enemType, Position enemLoc){
		this.comLocation = enemLoc;
		this.name = setEnemyName(enemType);
		this.weapon = setEnemyWeapon(enemType);
		this.health = setEnemyInitialHealth(enemType);
		this.coolOffMax = setEnemyInitialCoolDownTime(enemType);
		this.coolOffTime = setEnemyInitialCoolDownTime(enemType);
		this.movementSpeed = setEnemyMovementSpeed(enemType);
		this.direction = setEnemyInitialDirection();
		this.nextDirection = setNextPossDirection();
		this.fire = false;
	}

	/*
	 * Sets the name of the enemy
	 * Passes in an integer, representing the type of enemy
	 * Outputs the name of the enemy
	 */
	public String setEnemyName(int enemNum){
		if (enemNum == 1)
			return "GruntScout";
		else if(enemNum == 2)
			return "JackalScout";
		else if (enemNum == 3) 
			return "GruntSniper";
		else if (enemNum ==4) 
			return "JackalSniper";
		else if (enemNum == 5)
			return "Elite";
		else if (enemNum == 6)
			return "Zealot";
		else
			return "Hunter";
	}
	
	/*
	 * Sets the health of the enemy
	 * Passes in an integer, representing the type of enemy
	 * Outputs the health of the enemy
	 */
	public int setEnemyInitialHealth(int enemNum){
		if ((enemNum == 1) | (enemNum == 3))
			return 20;
		else if ( (enemNum == 2) | (enemNum ==4) )
			return 25;
		else if (enemNum == 5)
			return 50;
		else if (enemNum == 6)
			return 60;
		else
			return 75;
	}
	
	/*
	 * Sets the Max Cool Down Time of the enemy
	 * Passes in an integer, representing the type of enemy
	 * Outputs the cool down time of the enemy
	 */
	public int setEnemyInitialCoolDownTime(int enemNum){
		if (enemNum == 1)
			return 20;
		else if(enemNum == 2)
			return 25;
		else if (enemNum == 3) 
			return 30;
		else if (enemNum ==4) 
			return 35;
		else if (enemNum == 5)
			return 40;
		else
			return 60;
	}
	
	/*
	 * Sets the Movement Speed of the enemy
	 * Passes in an integer, representing the type of enemy
	 * Outputs the speed of the enemy
	 */
	public double setEnemyMovementSpeed (int enemNum){
		if ( (enemNum == 1) | (enemNum == 2) )
			return .015;
		if ( (enemNum == 3) | (enemNum == 4) )
			return .01;
		if ( (enemNum == 5) | (enemNum == 6) )
			return .007;
		else
			return .001;
	}
	
	/*
	 * Sets the Weapon of the enemy
	 * Passes in an integer, representing the type of enemy
	 * Outputs the name of the weapon of the enemy
	 */
	public String setEnemyWeapon(int enemNum){
		if ((enemNum == 1) | (enemNum == 2))
			return "Plasma Pistol";
		else if (enemNum == 3)
			return "Needler";
		else if (enemNum ==4)
			return "Beam Rifle";
		else if (enemNum == 5)
			return "Plasma Rifle";
		else if (enemNum == 6)
			return "Energy Sword";
		else
			return "Plasma Rocket";
	}
	
	/*
	 * Set the Enemies' Initial Direction
	 *  Random number generator to set Enemy's Initial Direction
	 */
	public int setEnemyInitialDirection(){
			return (int)(Math.random() * 4);
		}
	
	
	/*
	 * Set the array for choosing the next direction
	 */
	public int[] setNextPossDirection(){
		int[] opp = new int[3];
		for (int i = 0, index= 0; i < 4; i++){
			if(i != this.direction){
				opp[index] = i;
				index++;
			}
		}
		return opp;
	}	
		
	// Getters and Setters for enemyLocation, health, direction, fired and coolOffTime
	// Getters for name, movement Speed and weapon
	
	public void setCoolOffMax(int coolOffMax) {
		this.coolOffMax = coolOffMax;
	}

	// Set the coolOffTime
	public void setCoolOffTime(){
		if (coolOffTime > 0){
			this.coolOffTime = coolOffTime--;
		}
		else{
			coolOffTime = coolOffMax;
		}
	}
	
	public void setNextDirection(int[] nextDirection) {
		this.nextDirection = nextDirection;
	}

	// Get the coolOffTime
	public int getCoolOffTime(){
		return coolOffTime;
	}

	public int getCoolOffMax() {
		return coolOffMax;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int[] getNextDirection() {
		return nextDirection;
	}
}
