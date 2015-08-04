package edu.udel.dlaw.ReclaimandEvade;
import edu.udel.jatlas.gameframework.Position;

import java.util.ArrayList;
import java.util.List;

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
