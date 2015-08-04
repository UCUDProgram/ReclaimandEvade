package edu.udel.dlaw.ReclaimandEvade;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import edu.udel.jatlas.gameframework.Position;

public class Relic implements Iterable<Position>{
	private String relicName;
	private double relicValue;
	private Position relicLocation;
	private boolean relicCollected;
	private Set<Position> allPositions;
	
	
	public Relic(String relName, double relicVal, Position relLoc, boolean relCol){
		this.allPositions = new HashSet<Position>();
		this.relicName = relName;
		this.relicValue = relicVal;
		this.relicLocation = relLoc;
		this.relicCollected = relCol;
	}

	// Getters and Setters for relicValue and relicCollected
	// Getters for relicName and relicLocation
	
	public double getRelicValue() {
		return relicValue;
	}


	public void setRelicValue(double relicValue) {
		this.relicValue = relicValue;
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
