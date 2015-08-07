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
	//int xloc, int yloc, int movementSpeed,
	
	public Enemy (String name, Position enemyLocation , int health, double movementSpeed, String weapon, int direction, boolean fired,int coolOffTime ){
		//xloc, yloc
		super(name, enemyLocation, health, movementSpeed, weapon, direction, fired);
		this.maxHealth = health;
		this.coolOffTime = coolOffTime;
//		int coolOffMax = 
		setCoolOffMax(coolOffTime);
		this.nextDirection = setNextPossDirection();
		
	}

	public Enemy (String name, Position enemLoc, int enemType){
		
	}
	
	
	final static int GRUNTHEALTH = 20;
	final static int JACKALHEALTH = 25;
	final static int ELITEHEALTH = 50;
	final static int ZEALOTHEALTH = 60;
	final static int HUNTERHEALTH = 75;
	final static int PLAYERHEALTH = 100;
	
	final static int GRUNTSCOUTCOOLOFFTIME = 20;
	final static int JACKALSCOUTCOOLOFFTIME = 25;
	final static int GRUNTSNIPERCOOLOFFTIME = 30;
	final static int JACKALSNIPERCOOLOFFTIME = 35;
	final static int ELITECOOLOFFTIME = 40;
//	final static int HUNTERCOOLOFFTIME = 60;	final static int GRUNTHEALTH = 20;
	final static int JACKALHEALTH = 25;
	final static int ELITEHEALTH = 50;
	final static int ZEALOTHEALTH = 60;
	final static int HUNTERHEALTH = 75;
	final static int PLAYERHEALTH = 100;
	
	final static int GRUNTSCOUTCOOLOFFTIME = 20;
	final static int JACKALSCOUTCOOLOFFTIME = 25;
	final static int GRUNTSNIPERCOOLOFFTIME = 30;
	final static int JACKALSNIPERCOOLOFFTIME = 35;
	final static int ELITECOOLOFFTIME = 40;
	final static int HUNTERCOOLOFFTIME = 60;
	
	public double setEnemyMovementSpeed (String enemyName){
		double enemyMoveSpeed = 0;

		if (enemyName == "GruntScout")
			enemyMoveSpeed = .015;
		if (enemyName == "JackalScout")
			enemyMoveSpeed= .015;
		if (enemyName == "GruntSniper")
			enemyMoveSpeed = .01;
		if (enemyName == "JackalSniper")
			enemyMoveSpeed = .01;
		if (enemyName == "Elite")
			enemyMoveSpeed = .007;
		if (enemyName == "Zealot")
			enemyMoveSpeed = .007;
		if (enemyName == "Hunter")
			enemyMoveSpeed = .001;
		
		return enemyMoveSpeed;
	}
	
	// Set the Enemies' Initial Direction
		// Random number generator to set Enemy's Initial Direction
		public int setEnemyInitialDirection(){
			return (int)(Math.random() * 4);
		}
	
	
	
	
	// Getters and Setters for enemyLocation, health, direction, fired and coolOffTime
	// Getters for name, movement Speed and weapon
	
	// Set array for choosing the next direction
	// 
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
	
	
	
	
	
	
	
	
//	public int setEnemyDamage(List<Relic> alofRelics){
//		int enemScore = 0;
//		
//		return enemScore;
//	}
	
//  Create the toString Method once all the properties have been Decided
//	@Override
//	public String toString() {
//		return "Enemy [coolOffTime=" + coolOffTime + ", name=" + name
//				+ ", xloc=" + xloc + ", yloc=" + yloc + ", health=" + health
//				+ ", movementSpeed=" + movementSpeed + ", weapon=" + weapon
//				+ ", direction=" + direction + ", fire=" + fire + "]";
//	}
}
