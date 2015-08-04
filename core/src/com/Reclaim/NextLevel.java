package edu.udel.dlaw.ReclaimandEvade;
import edu.udel.jatlas.gameframework.Position;

public class NextLevel {
	private boolean enterNextLevel;
	private Position nextLevelLocation;
	//private double upperXBounds;
//	private double lowerXBounds;
	//private double upperYBounds;
//	private double lowerYBounds;
	
	// double upperX, double lowerX, double upperY, double lowerY
	public NextLevel(boolean nextLevel,Position nextLoc ){
		this.enterNextLevel = nextLevel;
		this.nextLevelLocation = nextLoc;
//		this.upperXBounds = upperX;
//		this.lowerXBounds = lowerX;
//		this.upperYBounds = upperY;
	//	this.lowerYBounds = lowerY;
	}

	public boolean isEnterNextLevel() {
		return enterNextLevel;
	}

	public void setEnterNextLevel(boolean enterNextLevel) {
		this.enterNextLevel = enterNextLevel;
	}

	public void setNextLevelLocation(Position nextLevelLocation) {
		this.nextLevelLocation = nextLevelLocation;
	}

	public Position getNextLevelLocation() {
		return nextLevelLocation;
	}
	
	
	
	
	
//  Create the toString Method once all the properties have been Decided
//	@Override
//	public String toString() {
//		return "NextLevel [enterNextLevel=" + enterNextLevel
//				+ ", upperXBounds=" + upperXBounds + ", lowerXBounds="
//				+ lowerXBounds + ", upperYBounds=" + upperYBounds
//				+ ", lowerYBounds=" + lowerYBounds + "]";
//	}
}
