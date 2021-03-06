package com.Reclaim;

//import edu.udel.jatlas.gameframework.Position;

public class Bullet {
	private double bulletDamage;
	private double bulletSpeed;
	private int bulletHealth;
	private int bulletDirection;
	private Position bulletLocation;
	private boolean playerfired;
//	private boolean enemyfired;
	
	
	public Bullet(double bulletDamage , double bulletSpeed, int bulletHealth, int bulletDir, Position bulletLoc, boolean pFired, boolean eFired) {
		bulletDamage = bulletDamage;
		bulletSpeed = bulletSpeed;
		bulletHealth = 100;
		bulletDirection = bulletDir;
		bulletLocation = bulletLoc;
		playerfired = pFired;
//		this.enemyfired = eFired;
	}
	
	// Getters and Setters for bulletHealth and bulletLocation
	// Getters for bulletDamage, bulletSpeed, playerfired, enemyfired and bulletDirection

	
	/*
	 * Bullet Health is either 100 or 0
	 */
	
	// Get Bullet Health
	public int getBulletHealth(){
		return bulletHealth;
	}

	public Position getBulletLocation() {
		return bulletLocation;
	}

	public void setBulletLocation(Position bulletLocation) {
		this.bulletLocation = bulletLocation;
	}

	public double getBulletDamage() {
		return bulletDamage;
	}

	public double getBulletSpeed() {
		return bulletSpeed;
	}

	public int getBulletDirection() {
		return bulletDirection;
	}

	public boolean isPlayerfired() {
		return playerfired;
	}

//	public boolean isEnemyfired() {
//		return enemyfired;
//	}

	public void setBulletHealth(int bulletHealth) {
		this.bulletHealth = bulletHealth;
	}
	
	
}
