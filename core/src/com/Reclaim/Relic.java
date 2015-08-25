package com.Reclaim;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import com.badlogic.gdx.graphics.Texture;

//import edu.udel.jatlas.gameframework.Position;

public class Relic implements Iterable<Position>{
	private String relicName;
	private double relicValue;
	private double relicLocation;  //Change the double to a Position, consisting of an X & Y Position
	private boolean relicCollected;
	private Texture relicImage;
	
	
	private Set<Position> allPositions;
	
	
	/*
	 * Coin Relic = 1
	 * Cup Relic = 2
	 * Plate Relic = 3
	 * Key Relic = 4
	 * Ring Relic = 5
	 * Chalice Relic = 6
	 * Watch Relic = 7
	 * Trophy Relic = 8
	 * Statue Relic = 9
	 * Pot of Gold = 10
	 * Treasure Chest = 11
	 */
	
	public Relic(String relName, double relicVal, double relLoc, boolean relCol){
		this.allPositions = new HashSet<Position>();
		this.relicName = relName;
		this.relicValue = relicVal;
		this.relicLocation = relLoc;
		this.relicCollected = relCol;
	}

	public Relic(int relNum, double relLoc){
//		this.allPositions = new HashSet<Position>();
		relicName = setRelicName(relNum);
		relicValue = setRelicValue(relNum);
		relicImage = setRelicImage(relNum);
		relicLocation = relLoc;
		relicCollected = false;
	}
	
	public String setRelicName(int number){
		
	}
	
	public double setRelicValue(int number){
		
	}
	
	public Texture setRelicImage(int number){
		
	}

	// Getters and Setters for relicCollected
	// Getters for relicName,relicValue and relicLocation
	
	public double getRelicValue() {
		return relicValue;
	}

	public boolean isRelicCollected() {
		return relicCollected;
	}


	public void setRelicCollected(boolean relicCollected) {
		this.relicCollected = relicCollected;
	}


	public String getRelicName() {
		return relicName;
	}


	public Position getRelicLocation() {
		return relicLocation;
	}

	public boolean playerRelicCollected(Position playerPosition){
		double playerRelicThreshold = .0001;
		boolean collected = false;
		if ( ( Math.abs(playerPosition.getX()- relicLocation.getX()) < playerRelicThreshold ) && 
		 (Math.abs(playerPosition.getY()- relicLocation.getY()) < playerRelicThreshold ) ) 
			collected = true;
		else
			collected = false;
		return collected;
	}
	
    public Iterator<Position> iterator() {
        return allPositions.iterator();
    }
	
	
//  Create the toString Method once all the properties have been Decided
//	@Override
//	public String toString() {
//		return "Relic [relicValue=" + relicValue + "]";
//	}
}
