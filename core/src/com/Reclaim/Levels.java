package edu.udel.dlaw.ReclaimandEvade;
import java.util.ArrayList;
import java.util.List;

import edu.udel.jatlas.gameframework.Position;

public class Levels {

	// CREATION OF GAMEBOARD FOR GAME/LEVEL
	// Create the Walls
		// Produces a list of Walls that represent Game Boundaries
		public static List<Wall> gameBoundaries(){	
				List<Wall> Gamewallinitial = new ArrayList<Wall>();
				Gamewallinitial.add(new Wall(new Position(0,0), new Position(20,0)));
				Gamewallinitial.add(new Wall(new Position(0,0), new Position(0,20)));
				Gamewallinitial.add(new Wall(new Position(20,0), new Position(20,20)));
				Gamewallinitial.add(new Wall(new Position(0,20), new Position(20,20)));
				return Gamewallinitial;
		}
		
		// Create Safety Zone 1
		// Produces a list of Walls that represent Safety Zone 1
		public static List<Wall> safetyZoneOne(){	
			List<Wall> SafetyZoneOne = new ArrayList<Wall>();
			SafetyZoneOne.add(new Wall(new Position(0,4), new Position(1.2,4) ) );
			SafetyZoneOne.add(new Wall(new Position(1.6,4), new Position(4,4) ) );
			SafetyZoneOne.add(new Wall(new Position(4,0), new Position(4,.3) ) );
			SafetyZoneOne.add(new Wall(new Position(4,.7), new Position(4,4) ) );
				
			return SafetyZoneOne;
		}
		
		// Create Safety Zone 2
		// Produces a list of Walls that represent Safety Zone 2
		public static List<Wall> safetyZoneTwo(){	
			List<Wall> SafetyZoneTwo = new ArrayList<Wall>();
			SafetyZoneTwo.add(new Wall(new Position(0,16), new Position(.25,16) ) );
			SafetyZoneTwo.add(new Wall(new Position(.65,16), new Position(4,16) ) );
			SafetyZoneTwo.add(new Wall(new Position(4,16), new Position(4,18.30) ) );
			SafetyZoneTwo.add(new Wall(new Position(4,18.70), new Position(4,20) ) );		
			return SafetyZoneTwo;
		}

		// Create Safety Zone 3
		// Produces a list of Walls that represent Safety Zone 3
		public static List<Wall> safetyZoneThree(){	
			List<Wall> SafetyZoneThree = new ArrayList<Wall>();
			SafetyZoneThree.add(new Wall(new Position(16,0), new Position(16,2.4) ) );
			SafetyZoneThree.add(new Wall(new Position(16,2.8), new Position(16,4) ) );
			SafetyZoneThree.add(new Wall(new Position(16,4), new Position(19.3,4) ) );
			SafetyZoneThree.add(new Wall(new Position(19.7,4), new Position(20,4) ) );
			return SafetyZoneThree;
		}

		// Create Safety Zone 4
		// Produces a list of Walls that represent Safety Zone 4
		public static List<Wall> safetyZoneFour(){	
			List<Wall> SafetyZoneFour = new ArrayList<Wall>();
			SafetyZoneFour.add(new Wall(new Position(16,16), new Position(16,17.75) ) );
			SafetyZoneFour.add(new Wall(new Position(16,18.15), new Position(16,20) ) );
			SafetyZoneFour.add(new Wall(new Position(16,16), new Position(17,16) ) );
			SafetyZoneFour.add(new Wall(new Position(17.4,16), new Position(20,16) ) );
			return SafetyZoneFour;
		}				
					
		// Initialization of Playable Gameboard
		public static List<Wall> gameBoardInit(){
			List<Wall> gameBoard = new ArrayList <Wall>();
			gameBoard.addAll(gameBoundaries());
			gameBoard.addAll(safetyZoneOne());
			gameBoard.addAll(safetyZoneTwo());
			gameBoard.addAll(safetyZoneThree());
			gameBoard.addAll(safetyZoneFour() );
			
			return gameBoard;
		}
	
	
	
	// Set the list of Walls in the First Level
	public static List<Wall> levelOneWalls(){
		List<Wall> lOneWalls = new ArrayList <Wall>();
			
			// Wall from (.7, 5.5) to (.7, 8.5)
			lOneWalls.add(new Wall(new Position(.7,5.5), new Position(.7,8.5) ) );
			
			// Wall from (.7, 5.5) to (5.1,5.5)
			lOneWalls.add(new Wall(new Position(.7, 5.5), new Position(5.1,5.5) ) );
			
			// Wall from (5.1, 1.7) to (5.1, 5.5)
			lOneWalls.add(new Wall(new Position(5.1, 1.7), new Position(5.1,5.5) ) );
			
			// Wall from (5.1, 1.7) to (7.2,1.7)
			lOneWalls.add(new Wall(new Position(5.1, 1.7), new Position(7.2,1.7) ) );
			
			// Wall from (7.6, 1.7) to (15,1.7)
			lOneWalls.add(new Wall(new Position(7.6, 1.7), new Position(15,1.7) ) );
			
			// Wall from (15, 1.7) to (15,6)
			lOneWalls.add(new Wall(new Position(15, 1.7), new Position(15,6) ) );
			
			// Wall from (15, 6) to (19,6)
			lOneWalls.add(new Wall(new Position(15, 6), new Position(19,6) ) );
			
			// Wall from (19, 6) to (19,14)
			lOneWalls.add(new Wall(new Position(19, 6), new Position(19,14) ) );
			
			// Wall from (18.4, 14) to (19,14)
			lOneWalls.add(new Wall(new Position(18.4, 14), new Position(19,14) ) );
			
			// Wall from (13.7, 14) to (17,14)
			lOneWalls.add(new Wall(new Position(13.7, 14), new Position(17,14) ) );
			
			// Wall from (13.7, 14) to (13.7,18.8)
			lOneWalls.add(new Wall(new Position(13.7, 14), new Position(13.7,18.8) ) );
			
			// Wall from (9.2, 18.8) to (13.7,18.8)
			lOneWalls.add(new Wall(new Position(9.2, 18.8), new Position(13.7,18.8) ) );
			
			// Wall from (4.9, 18.8) to (8.6,18.8)
			lOneWalls.add(new Wall(new Position(4.9, 18.8), new Position(8.6,18.8) ) );
			
			// Wall from (4.9, 14.5) to (4.9,18.8)
			lOneWalls.add(new Wall(new Position(4.9, 14.5), new Position(4.9,18.8) ) );
			
			// Wall from (.7, 14.5) to (4.9,14.5)
			lOneWalls.add(new Wall(new Position(.7, 14.5), new Position(4.9,14.5) ) );
			
			// Wall from (.7, 9.2) to (.7,14.5)
			lOneWalls.add(new Wall(new Position(.7, 9.2), new Position(.7,14.5) ) );
			
			// Wall from (2.7, 7.25) to (2.7,13)
			lOneWalls.add(new Wall(new Position(2.7, 7.25), new Position(2.7,13) ) );
			
			// Wall from (2.7, 7.25) to (4.7,7.25)
			lOneWalls.add(new Wall(new Position(2.7, 7.25), new Position(4.7,7.25) ) );
			
			// Wall from (5.3, 7.25) to (6.1,7.25)
			lOneWalls.add(new Wall(new Position(5.3, 7.25), new Position(6.1,7.25) ) );
			
			// Wall from (6.1, 3.2) to (6.1,7.25)
			lOneWalls.add(new Wall(new Position(6.1, 3.2), new Position(6.1,7.25) ) );
			
			// Wall from (6.1, 3.2) to (13,3.2)
			lOneWalls.add(new Wall(new Position(6.1, 3.2), new Position(13,3.2) ) );
			
			// Wall from (13, 3.2) to (13,7.25)
			lOneWalls.add(new Wall(new Position(13, 3.2), new Position(13,7.25) ) );
			
			// Wall from (13, 7.25) to (14.6,7.25)
			lOneWalls.add(new Wall(new Position(13, 7.25), new Position(14.6,7.25) ) );
			
			// Wall from (15.2, 7.25) to (17.5,7.25)
			lOneWalls.add(new Wall(new Position(15.2, 7.25), new Position(17.5,7.25) ) );
			
			// Wall from (17.5, 7.25) to (17.5, 12)
			lOneWalls.add(new Wall(new Position(17.5, 7.25), new Position(17.5, 12) ) );
			
			// Wall from (12, 12) to (17.5,12)
			lOneWalls.add(new Wall(new Position(12, 12), new Position(17.5,12) ) );
			
			// Wall from (12, 12) to (12,17)
			lOneWalls.add(new Wall(new Position(12, 12), new Position(12,17) ) );
			
			// Wall from (6, 12) to (12,17)
			lOneWalls.add(new Wall(new Position(6, 12), new Position(12,17) ) );
			
			// Wall from (6, 13) to (6,17)
			lOneWalls.add(new Wall(new Position(6, 13), new Position(6,17) ) );
			
			// Wall from (2.7, 13) to (6,13)
			lOneWalls.add(new Wall(new Position(2.7, 13), new Position(6,13) ) );
			
			// Wall from (7.1, 4) to (11.7,4)
			lOneWalls.add(new Wall(new Position(7.1, 4), new Position(11.7,4) ) );
			
			// Wall from (11.7, 4) to (11.7,8)
			lOneWalls.add(new Wall(new Position(11.7, 4), new Position(11.7,8) ) );
			
			// Wall from (11.7, 8) to (16,8)
			lOneWalls.add(new Wall(new Position(11.7, 8), new Position(16,8) ) );
			
			// Wall from (16, 8) to (16, 10.75)
			lOneWalls.add(new Wall(new Position(16, 8), new Position(16, 10.75) ) );
			
			// Wall from (14.4, 10.75) to (16,10.75)
			lOneWalls.add(new Wall(new Position(14.4, 10.75), new Position(16,10.75) ) );
			
			// Wall from (10, 10.75) to (13.8,10.75)
			lOneWalls.add(new Wall(new Position(10, 10.75), new Position(13.8,10.75) ) );
			
			// Wall from (10, 10.75) to (10,16)
			lOneWalls.add(new Wall(new Position(10, 10.75), new Position(10,16) ) );
			
			// Wall from (7, 16) to (10,16)
			lOneWalls.add(new Wall(new Position(7, 16), new Position(10,16) ) );
			
			// Wall from (7, 12) to (7,16)
			lOneWalls.add(new Wall(new Position(7, 12), new Position(7,16) ) );
			
			// Wall from (4.5, 12) to (7,12)
			lOneWalls.add(new Wall(new Position(4.5, 12), new Position(7,12) ) );
			
			// Wall from (4.5, 8) to (4.5,12)
			lOneWalls.add(new Wall(new Position(4.5, 8), new Position(4.5,12) ) );
			
			// Wall from (4.5, 8) to (7.1,8)
			lOneWalls.add(new Wall(new Position(4.5, 8), new Position(7.1,8) ) );
			
			// Wall from (7.1, 6.6) to (7.1,8)
			lOneWalls.add(new Wall(new Position(7.1, 6.6), new Position(7.1,8) ) );
			
			// Wall from (7.1, 4) to (7.1,6)
			lOneWalls.add(new Wall(new Position(7.1, 4), new Position(7.1,6) ) );
			
			// Wall from (8, 6) to (8,4.5)
			lOneWalls.add(new Wall(new Position(8, 6), new Position(8,4.5) ) );
			
			// Wall from (8, 4.5) to (10.2, 4.5)
			lOneWalls.add(new Wall(new Position(8, 4.5), new Position(10.2, 4.5) ) );
			
			// Wall from (10.2, 4.5) to (10.2,7.75)
			lOneWalls.add(new Wall(new Position(10.2, 4.5), new Position(10.2,7.75) ) );
			
			// Wall from (8, 7.75) to (10.2,7.75)
			lOneWalls.add(new Wall(new Position(8, 7.75), new Position(10.2,7.75) ) );
			
			// Wall from (8, 6.6) to (8,7.75)
			lOneWalls.add(new Wall(new Position(8, 6.6), new Position(8,7.75) ) );
			
			// Wall from (9, 5.1) to (9,7.15)
			lOneWalls.add(new Wall(new Position(9, 5.1), new Position(9,7.15) ) );
			
			// Wall from (5, 8.5) to (5.5,8.5)
			lOneWalls.add(new Wall(new Position(5, 8.5), new Position(5.5,8.5) ) );
			
			// Wall from (6.1, 8.5) to (7.1,8.5)
			lOneWalls.add(new Wall(new Position(6.1, 8.5), new Position(7.1,8.5) ) );
			
			// Wall from (7.1, 8.5) to (7.1,11)
			lOneWalls.add(new Wall(new Position(7.1, 8.5), new Position(7.1,11) ) );
			
			// Wall from (5, 11) to (7.1,11)
			lOneWalls.add(new Wall(new Position(5, 11), new Position(7.1,11) ) );
			
			// Wall from (5, 8.5) to (5,11)
			lOneWalls.add(new Wall(new Position(5, 8.5), new Position(5,11) ) );
			
			// Wall from (5.6, 9.5) to (6.5,9.5)
			lOneWalls.add(new Wall(new Position(5.6, 9.5), new Position(6.5,9.5) ) );
			
			// Wall from (8, 8.5) to (10.2,8.5)
			lOneWalls.add(new Wall(new Position(8, 8.5), new Position(10.2,8.5) ) );
			
			// Wall from (8, 8.5) to (8,10.5)
			lOneWalls.add(new Wall(new Position(8, 8.5), new Position(8,10.5) ) );
			
			// Wall from (8, 10.5) to (9,10.5)
			lOneWalls.add(new Wall(new Position(8, 10.5), new Position(9,10.5) ) );
			
			// Wall from (10.2, 8.5) to (10.2,9)
			lOneWalls.add(new Wall(new Position(10.2, 8.5), new Position(10.2,9) ) );
			
			// Wall from (11.50, 8.75) to (15.1,8.75)
			lOneWalls.add(new Wall(new Position(11.50, 8.75), new Position(15.1,8.75) ) );
			
			// Wall from (8.50, 11.5) to (8.5,14.75)
			lOneWalls.add(new Wall(new Position(8.50, 11.5), new Position(8.5,14.75) ) );
			
			// Wall from (11.7,8,75)  to (15,6, 8.75)
			lOneWalls.add(new Wall(new Position(11.7,8,75), new Position(15,6, 8.75) ) );
			
			// Wall from (10.9, 9.75)  to (15.6,9.75)
			lOneWalls.add(new Wall(new Position(10.9, 9.75), new Position(15.6,9.75) ) );
			
			return lOneWalls;
		}
		
		// Set the List of Walls in ther Second Level
		public static List<Wall> levelTwoWalls(){
			List<Wall> lTwoWalls = new ArrayList <Wall>();
					
			// Wall from (.7, 5.5) to (.7, 8.5)
			lTwoWalls.add(new Wall(new Position(.7,5.5), new Position(.7,8.5) ) );
					
			// Wall from (.7, 5.5) to (5.1,5.5)
			lTwoWalls.add(new Wall(new Position(.7, 5.5), new Position(5.1,5.5) ) );
					
			// Wall from (5.1, 1.7) to (5.1, 5.5)
			lTwoWalls.add(new Wall(new Position(5.1, 1.7), new Position(5.1,5.5) ) );
					
			// Wall from (5.1, 1.7) to (7.2,1.7)
			lTwoWalls.add(new Wall(new Position(5.1, 1.7), new Position(7.2,1.7) ) );
					
			// Wall from (7.6, 1.7) to (15,1.7)
			lTwoWalls.add(new Wall(new Position(7.6, 1.7), new Position(15,1.7) ) );
			
			// Wall from (15, 1.7) to (15,6)
			lTwoWalls.add(new Wall(new Position(15, 1.7), new Position(15,6) ) );
			
			// Wall from (15, 6) to (19,6)
			lTwoWalls.add(new Wall(new Position(15, 6), new Position(19,6) ) );
			
			// Wall from (19, 6) to (19,9)
			lTwoWalls.add(new Wall(new Position(19, 6), new Position(19,9) ) );
			
			// Wall from (19, 9.6) to (19,14)
			lTwoWalls.add(new Wall(new Position(19, 9.6), new Position(19,14) ) );
			
			// Wall from (18.4, 14) to (19,14)
			lTwoWalls.add(new Wall(new Position(18.4, 14), new Position(19,14) ) );
			
			// Wall from (13.7, 14) to (17,14)
			lTwoWalls.add(new Wall(new Position(13.7, 14), new Position(17,14) ) );
			
			// Wall from (13.7, 14) to (13.7,15)
			lTwoWalls.add(new Wall(new Position(13.7, 14), new Position(13.7,15) ) );
			
			// Wall from (13.7, 15.8) to (13.7,18.8)
			lTwoWalls.add(new Wall(new Position(13.7, 15.8), new Position(13.7,18.8) ) );
			
			// Wall from (9.2, 18.8) to (13.7,18.8)
			lTwoWalls.add(new Wall(new Position(9.2, 18.8), new Position(13.7,18.8) ) );
			
			// Wall from (4.9, 18.8) to (8.6,18.8)
			lTwoWalls.add(new Wall(new Position(4.9, 18.8), new Position(8.6,18.8) ) );
			
			// Wall from (4.9, 14.5) to (4.9,18.8)
			lTwoWalls.add(new Wall(new Position(4.9, 14.5), new Position(4.9,18.8) ) );
			
			// Wall from (.7, 14.5) to (4.9,14.5)
			lTwoWalls.add(new Wall(new Position(.7, 14.5), new Position(4.9,14.5) ) );
			
			// Wall from (.7, 9.2) to (.7,14.5)
			lTwoWalls.add(new Wall(new Position(.7, 9.2), new Position(.7,14.5) ) );		
					
			// Wall from (2.7, 7.25) to (2.7,10)
			lTwoWalls.add(new Wall(new Position(2.7, 7.25), new Position(2.7,10) ) );
			
			// Wall from (2.7, 10.6) to (2.7,13)
			lTwoWalls.add(new Wall(new Position(2.7, 10.6), new Position(2.7,13) ) );
			
			// Wall from (2.7, 7.25) to (4.7,7.25)
			lTwoWalls.add(new Wall(new Position(2.7, 7.25), new Position(4.7,7.25) ) );
			
			// Wall from (5.3, 7.25) to (6.1,7.25)
			lTwoWalls.add(new Wall(new Position(5.3, 7.25), new Position(6.1,7.25) ) );
			
			// Wall from (6.1, 3.2) to (6.1,7.25)
			lTwoWalls.add(new Wall(new Position(6.1, 3.2), new Position(6.1,7.25) ) );
			
			// Wall from (6.1, 3.2) to (13,3.2)
			lTwoWalls.add(new Wall(new Position(6.1, 3.2), new Position(13,3.2) ) );
			
			// Wall from (13, 3.2) to (13,7.25)
			lTwoWalls.add(new Wall(new Position(13, 3.2), new Position(13,7.25) ) );
			
			// Wall from (13, 7.25) to (14.6,7.25)
			lTwoWalls.add(new Wall(new Position(13, 7.25), new Position(14.6,7.25) ) );
			
			// Wall from (15.2, 7.25) to (17.5,7.25)
			lTwoWalls.add(new Wall(new Position(15.2, 7.25), new Position(17.5,7.25) ) );
			
			// Wall from (17.5, 7.25) to (17.5, 12)
			lTwoWalls.add(new Wall(new Position(17.5, 7.25), new Position(17.5, 12) ) );
			
			// Wall from (12, 12) to (17.5,12)
			lTwoWalls.add(new Wall(new Position(12, 12), new Position(17.5,12) ) );
			
			// Wall from (12, 12) to (12,17)
			lTwoWalls.add(new Wall(new Position(12, 12), new Position(12,17) ) );
			
			// Wall from (6, 17) to (8,17)
			lTwoWalls.add(new Wall(new Position(6, 17), new Position(8,17) ) );
			
			// Wall from (8.6, 17) to (12,17)
			lTwoWalls.add(new Wall(new Position(8.6, 17), new Position(12,17) ) );
			
			// Wall from (6, 13) to (6,17)
			lTwoWalls.add(new Wall(new Position(6, 13), new Position(6,17) ) );
			
			// Wall from (2.7, 13) to (4,13)
			lTwoWalls.add(new Wall(new Position(2.7, 13), new Position(4,13) ) );
			
			// Wall from (4.6, 13) to (6,13)
			lTwoWalls.add(new Wall(new Position(4.6, 13), new Position(6,13) ) );
			
			// Wall from (2.7, 10.6) to (2.7,13)
			lTwoWalls.add(new Wall(new Position(2.7, 10.6), new Position(2.7,13) ) );
			
			// Wall from (2.7, 7.25) to (2.7,10)
			lTwoWalls.add(new Wall(new Position(2.7, 7.25), new Position(2.7,10) ) );		
					
			// Wall from (7.1, 4) to (11.7,4)
			lTwoWalls.add(new Wall(new Position(7.1, 4), new Position(11.7,4) ) );
			
			// Wall from (11.7, 4.6) to (11.7,8)
			lTwoWalls.add(new Wall(new Position(11.7, 4.6), new Position(11.7,8) ) );
			
			// Wall from (11.7, 8) to (16,8)
			lTwoWalls.add(new Wall(new Position(11.7, 8), new Position(16,8) ) );
			
			// Wall from (16, 8) to (16, 10.75)
			lTwoWalls.add(new Wall(new Position(16, 8), new Position(16, 10.75) ) );
			
			// Wall from (14.4, 10.75) to (16,10.75)
			lTwoWalls.add(new Wall(new Position(14.4, 10.75), new Position(16,10.75) ) );
			
			// Wall from (10, 10.75) to (13.2,10.75)
			lTwoWalls.add(new Wall(new Position(10, 10.75), new Position(13.2,10.75) ) );
			
			// Wall from (10, 13.8) to (10,16)
			lTwoWalls.add(new Wall(new Position(10, 13.8), new Position(10,16) ) );
			
			// Wall from (7, 16) to (10,16)
			lTwoWalls.add(new Wall(new Position(7, 16), new Position(10,16) ) );
			
			// Wall from (7, 12) to (7,16)
			lTwoWalls.add(new Wall(new Position(7, 12), new Position(7,16) ) );
			
			// Wall from (4.5, 12) to (5,12)
			lTwoWalls.add(new Wall(new Position(4.5, 12), new Position(5,12) ) );
			
			// Wall from (5.6, 12) to (7,12)
			lTwoWalls.add(new Wall(new Position(5.6, 12), new Position(7,12) ) );
			
			// Wall from (4.5, 8) to (4.5,12)
			lTwoWalls.add(new Wall(new Position(4.5, 8), new Position(4.5,12) ) );
			
			// Wall from (4.5, 8) to (7.1,8)
			lTwoWalls.add(new Wall(new Position(4.5, 8), new Position(7.1,8) ) );
			
			// Wall from (7.1, 6.6) to (7.1,8)
			lTwoWalls.add(new Wall(new Position(7.1, 6.6), new Position(7.1,8) ) );
			
			// Wall from (7.1, 4) to (7.1,6)
			lTwoWalls.add(new Wall(new Position(7.1, 4), new Position(7.1,6) ) );
			
			// Wall from (8, 6) to (8,4.5)
			lTwoWalls.add(new Wall(new Position(8, 6), new Position(8,4.5) ) );
			
			// Wall from (8, 4.5) to (10.2, 4.5)
			lTwoWalls.add(new Wall(new Position(8, 4.5), new Position(10.2, 4.5) ) );
			
			// Wall from (10.2, 4.5) to (10.2,7.75)
			lTwoWalls.add(new Wall(new Position(10.2, 4.5), new Position(10.2,7.75) ) );
			
			// Wall from (8, 7.75) to (10.2,7.75)
			lTwoWalls.add(new Wall(new Position(8, 7.75), new Position(10.2,7.75) ) );
			
			// Wall from (8, 6.6) to (8,7.75)
			lTwoWalls.add(new Wall(new Position(8, 6.6), new Position(8,7.75) ) );
			
			// Wall from (9, 5.1) to (9,7.15)
			lTwoWalls.add(new Wall(new Position(9, 5.1), new Position(9,7.15) ) );		
					
			// Wall from (5, 8.5) to (5.5,8.5)
			lTwoWalls.add(new Wall(new Position(5, 8.5), new Position(5.5,8.5) ) );
			
			// Wall from (6.1, 8.5) to (7.1,8.5)
			lTwoWalls.add(new Wall(new Position(6.1, 8.5), new Position(7.1,8.5) ) );
			
			// Wall from (7.1, 8.5) to (7.1,11)
			lTwoWalls.add(new Wall(new Position(7.1, 8.5), new Position(7.1,11) ) );
			
			// Wall from (5, 11) to (7.1,11)
			lTwoWalls.add(new Wall(new Position(5, 11), new Position(7.1,11) ) );
			
			// Wall from (5, 8.5) to (5,11)
			lTwoWalls.add(new Wall(new Position(5, 8.5), new Position(5,11) ) );
			
			// Wall from (5.6, 9.5) to (6.5,9.5)
			lTwoWalls.add(new Wall(new Position(5.6, 9.5), new Position(6.5,9.5) ) );
					
			// Wall from (8, 8.5) to (10.2,8.5)
			lTwoWalls.add(new Wall(new Position(8, 8.5), new Position(10.2,8.5) ) );
			
			// Wall from (8, 8.5) to (8,10.5)
			lTwoWalls.add(new Wall(new Position(8, 8.5), new Position(8,10.5) ) );
			
			// Wall from (8, 10.5) to (9,10.5)
			lTwoWalls.add(new Wall(new Position(8, 10.5), new Position(9,10.5) ) );
			
			// Wall from (10.2, 8.5) to (10.2,9)
			lTwoWalls.add(new Wall(new Position(10.2, 8.5), new Position(10.2,9) ) );
			
			// Wall from (11.50, 8.75) to (15.1,8.75)
			lTwoWalls.add(new Wall(new Position(11.50, 8.75), new Position(15.1,8.75) ) );		
					
			// Wall from (8.50, 11.5) to (8.5,14.75)
			lTwoWalls.add(new Wall(new Position(8.50, 11.5), new Position(8.5,14.75) ) );		
					
			// Wall from (11.7,8,75)  to (15,6, 8.75)
			lTwoWalls.add(new Wall(new Position(11.7,8,75), new Position(15,6, 8.75) ) );
			
			// Wall from (10.9, 9.75)  to (15.6,9.75)
			lTwoWalls.add(new Wall(new Position(10.9, 9.75), new Position(15.6,9.75) ) );		
					
			return lTwoWalls;
		}
		
		// Set the List of Walls in the Third Level
		public static List<Wall> levelThreeWalls(){
			List<Wall> lThreeWalls = new ArrayList <Wall>();
			
			// Wall from (.7, 5.5) to (.7, 8.5)
			lThreeWalls.add(new Wall(new Position(.7,5.5), new Position(.7,8.5) ) );
			
			// Wall from (.7, 5.5) to (5.1,5.5)
			lThreeWalls.add(new Wall(new Position(.7, 5.5), new Position(5.1,5.5) ) );
			
			// Wall from (5.1, 1.7) to (5.1, 5.5)
			lThreeWalls.add(new Wall(new Position(5.1, 1.7), new Position(5.1,5.5) ) );
			
			// Wall from (5.1, 1.7) to (7.2,1.7)
			lThreeWalls.add(new Wall(new Position(5.1, 1.7), new Position(7.2,1.7) ) );
			
			// Wall from (7.6, 1.7) to (15,1.7)
			lThreeWalls.add(new Wall(new Position(7.6, 1.7), new Position(15,1.7) ) );
			
			// Wall from (15, 1.7) to (15,6)
			lThreeWalls.add(new Wall(new Position(15, 1.7), new Position(15,6) ) );
			
			// Wall from (15, 6) to (19,6)
			lThreeWalls.add(new Wall(new Position(15, 6), new Position(19,6) ) );
			
			// Wall from (19, 6) to (19,9)
			lThreeWalls.add(new Wall(new Position(19, 6), new Position(19,9) ) );
			
			// Wall from (19, 9.6) to (19,14)
			lThreeWalls.add(new Wall(new Position(19, 9.6), new Position(19,14) ) );
			
			// Wall from (18.4, 14) to (19,14)
			lThreeWalls.add(new Wall(new Position(18.4, 14), new Position(19,14) ) );
			
			// Wall from (13.7, 14) to (17,14)
			lThreeWalls.add(new Wall(new Position(13.7, 14), new Position(17,14) ) );
			
			// Wall from (13.7, 14) to (13.7,15)
			lThreeWalls.add(new Wall(new Position(13.7, 14), new Position(13.7,15) ) );
			
			// Wall from (13.7, 15.8) to (13.7,18.8)
			lThreeWalls.add(new Wall(new Position(13.7, 15.8), new Position(13.7,18.8) ) );
			
			// Wall from (9.2, 18.8) to (13.7,18.8)
			lThreeWalls.add(new Wall(new Position(9.2, 18.8), new Position(13.7,18.8) ) );
			
			// Wall from (4.9, 18.8) to (8.6,18.8)
			lThreeWalls.add(new Wall(new Position(4.9, 18.8), new Position(8.6,18.8) ) );
			
			// Wall from (4.9, 14.5) to (4.9,18.8)
			lThreeWalls.add(new Wall(new Position(4.9, 14.5), new Position(4.9,18.8) ) );
			
			// Wall from (.7, 14.5) to (2,14.5)
			lThreeWalls.add(new Wall(new Position(.7, 14.5), new Position(2,14.5) ) );
			
			// Wall from (2.6, 14.5) to (4.9,14.5)
			lThreeWalls.add(new Wall(new Position(2.6, 14.5), new Position(4.9,14.5) ) );
			
			// Wall from (.7, 9.2) to (.7,14.5)
			lThreeWalls.add(new Wall(new Position(.7, 9.2), new Position(.7,14.5) ) );
			
			// Wall from (2.7, 7.25) to (2.7,10)
			lThreeWalls.add(new Wall(new Position(2.7, 7.25), new Position(2.7,10) ) );
			
			// Wall from (2.7, 10.6) to (2.7,13)
			lThreeWalls.add(new Wall(new Position(2.7, 10.6), new Position(2.7,13) ) );
			
			// Wall from (2.7, 7.25) to (4.7,7.25)
			lThreeWalls.add(new Wall(new Position(2.7, 7.25), new Position(4.7,7.25) ) );
			
			// Wall from (5.3, 7.25) to (6.1,7.25)
			lThreeWalls.add(new Wall(new Position(5.3, 7.25), new Position(6.1,7.25) ) );
			
			// Wall from (6.1, 3.2) to (6.1,7.25)
			lThreeWalls.add(new Wall(new Position(6.1, 3.2), new Position(6.1,7.25) ) );
			
			// Wall from (6.1, 3.2) to (13,3.2)
			lThreeWalls.add(new Wall(new Position(6.1, 3.2), new Position(13,3.2) ) );
			
			// Wall from (13, 3.2) to (13,7.25)
			lThreeWalls.add(new Wall(new Position(13, 3.2), new Position(13,7.25) ) );
			
			// Wall from (13, 7.25) to (14.6,7.25)
			lThreeWalls.add(new Wall(new Position(13, 7.25), new Position(14.6,7.25) ) );
			
			// Wall from (15.2, 7.25) to (17.5,7.25)
			lThreeWalls.add(new Wall(new Position(15.2, 7.25), new Position(17.5,7.25) ) );
			
			// Wall from (17.5, 7.25) to (17.5, 12)
			lThreeWalls.add(new Wall(new Position(17.5, 7.25), new Position(17.5, 12) ) );
			
			// Wall from (12, 12) to (17.5,12)
			lThreeWalls.add(new Wall(new Position(12, 12), new Position(17.5,12) ) );
			
			// Wall from (12, 12) to (12,17)
			lThreeWalls.add(new Wall(new Position(12, 12), new Position(12,17) ) );
			
			// Wall from (6, 17) to (8,17)
			lThreeWalls.add(new Wall(new Position(6, 17), new Position(8,17) ) );
			
			// Wall from (8.6, 17) to (12,17)
			lThreeWalls.add(new Wall(new Position(8.6, 17), new Position(12,17) ) );
			
			// Wall from (6, 13) to (6,17)
			lThreeWalls.add(new Wall(new Position(6, 13), new Position(6,17) ) );
			
			// Wall from (2.7, 13) to (4,13)
			lThreeWalls.add(new Wall(new Position(2.7, 13), new Position(4,13) ) );
			
			// Wall from (4.6, 13) to (6,13)
			lThreeWalls.add(new Wall(new Position(4.6, 13), new Position(6,13) ) );
			
			// Wall from (7.1, 4) to (11.7,4)
			lThreeWalls.add(new Wall(new Position(7.1, 4), new Position(11.7,4) ) );
			
			// Wall from (11.7, 4.6) to (11.7,8)
			lThreeWalls.add(new Wall(new Position(11.7, 4.6), new Position(11.7,8) ) );
			
			// Wall from (11.7, 8) to (16,8)
			lThreeWalls.add(new Wall(new Position(11.7, 8), new Position(16,8) ) );
			
			// Wall from (16, 8) to (16, 9.3)
			lThreeWalls.add(new Wall(new Position(16, 8), new Position(16, 9.3) ) );
			
			// Wall from (16, 9.9) to (16, 10.75)
			lThreeWalls.add(new Wall(new Position(16, 9.9), new Position(16, 10.75) ) );
			
			// Wall from (14.4, 10.75) to (16,10.75)
			lThreeWalls.add(new Wall(new Position(14.4, 10.75), new Position(16,10.75) ) );
			
			// Wall from (10, 10.75) to (13.8,10.75)
			lThreeWalls.add(new Wall(new Position(10, 10.75), new Position(13.8,10.75) ) );
			
			// Wall from (10, 13.8) to (10,16)
			lThreeWalls.add(new Wall(new Position(10, 13.8), new Position(10,16) ) );
			
			// Wall from (7, 16) to (10,16)
			lThreeWalls.add(new Wall(new Position(7, 16), new Position(10,16) ) );
			
			// Wall from (7, 12) to (7,13.5)
			lThreeWalls.add(new Wall(new Position(7, 12), new Position(7,13.5) ) );
			
			// Wall from (7, 14.2) to (7,16)
			lThreeWalls.add(new Wall(new Position(7, 14.2), new Position(7,16) ) );
			
			// Wall from (4.5, 12) to (5,12)
			lThreeWalls.add(new Wall(new Position(4.5, 12), new Position(5,12) ) );
			
			// Wall from (5.6, 12) to (7,12)
			lThreeWalls.add(new Wall(new Position(5.6, 12), new Position(7,12) ) );
			
			// Wall from (4.5, 8) to (4.5,9.5)
			lThreeWalls.add(new Wall(new Position(4.5, 8), new Position(4.5,9.5) ) );
			
			// Wall from (4.5, 10.1) to (4.5,12)
			lThreeWalls.add(new Wall(new Position(4.5, 10.1), new Position(4.5,12) ) );
			
			// Wall from (4.5, 8) to (7.1,8)
			lThreeWalls.add(new Wall(new Position(4.5, 8), new Position(7.1,8) ) );
			
			// Wall from (7.1, 6.6) to (7.1,8)
			lThreeWalls.add(new Wall(new Position(7.1, 6.6), new Position(7.1,8) ) );
			
			// Wall from (7.1, 4) to (7.1,6)
			lThreeWalls.add(new Wall(new Position(7.1, 4), new Position(7.1,6) ) );
			
			// Wall from (8, 6) to (8,4.5)
			lThreeWalls.add(new Wall(new Position(8, 6), new Position(8,4.5) ) );
			
			// Wall from (8, 4.5) to (10.2, 4.5)
			lThreeWalls.add(new Wall(new Position(8, 4.5), new Position(10.2, 4.5) ) );
			
			// Wall from (10.2, 4.5) to (10.2,7.75)
			lThreeWalls.add(new Wall(new Position(10.2, 4.5), new Position(10.2,7.75) ) );
			
			// Wall from (8, 7.75) to (10.2,7.75)
			lThreeWalls.add(new Wall(new Position(8, 7.75), new Position(10.2,7.75) ) );
			
			// Wall from (8, 6.6) to (8,7.75)
			lThreeWalls.add(new Wall(new Position(8, 6.6), new Position(8,7.75) ) );
			
			// Wall from (9, 5.1) to (9,7.15)
			lThreeWalls.add(new Wall(new Position(9, 5.1), new Position(9,7.15) ) );
			
			// Wall from (5, 8.5) to (5.5,8.5)
			lThreeWalls.add(new Wall(new Position(5, 8.5), new Position(5.5,8.5) ) );
			
			// Wall from (6.1, 8.5) to (7.1,8.5)
			lThreeWalls.add(new Wall(new Position(6.1, 8.5), new Position(7.1,8.5) ) );
			
			// Wall from (7.1, 8.5) to (7.1,11)
			lThreeWalls.add(new Wall(new Position(7.1, 8.5), new Position(7.1,11) ) );
			
			// Wall from (5, 11) to (7.1,11)
			lThreeWalls.add(new Wall(new Position(5, 11), new Position(7.1,11) ) );
			
			// Wall from (5, 8.5) to (5,11)
			lThreeWalls.add(new Wall(new Position(5, 8.5), new Position(5,11) ) );
			
			// Wall from (5.6, 9.5) to (6.5,9.5)
			lThreeWalls.add(new Wall(new Position(5.6, 9.5), new Position(6.5,9.5) ) );
			
			// Wall from (8, 8.5) to (10.2,8.5)
			lThreeWalls.add(new Wall(new Position(8, 8.5), new Position(10.2,8.5) ) );
			
			// Wall from (8, 8.5) to (8,10.5)
			lThreeWalls.add(new Wall(new Position(8, 8.5), new Position(8,10.5) ) );
			
			// Wall from (8, 10.5) to (9,10.5)
			lThreeWalls.add(new Wall(new Position(8, 10.5), new Position(9,10.5) ) );
			
			// Wall from (10.2, 8.5) to (10.2,9)
			lThreeWalls.add(new Wall(new Position(10.2, 8.5), new Position(10.2,9) ) );
			
			// Wall from (11.50, 8.75) to (15.1,8.75)
			lThreeWalls.add(new Wall(new Position(11.50, 8.75), new Position(15.1,8.75) ) );
			
			// Wall from (8.50, 11.5) to (8.5,14.75)
			lThreeWalls.add(new Wall(new Position(8.50, 11.5), new Position(8.5,14.75) ) );
			
			// Wall from (11.7,8,75)  to (15,6, 8.75)
			lThreeWalls.add(new Wall(new Position(11.7,8,75), new Position(15,6, 8.75) ) );
			
			// Wall from (10.9, 9.75)  to (15.6,9.75)
			lThreeWalls.add(new Wall(new Position(10.9, 9.75), new Position(15.6,9.75) ) );
			
			return lThreeWalls;
		}
		
		// Set the List of Walls in the Fourth Level
		public static List<Wall> levelFourWalls(){
			List<Wall> lFourWalls = new ArrayList <Wall>();
			
			// Wall from (.7, 5.5) to (.7, 8.5)
			lFourWalls.add(new Wall(new Position(.7,5.5), new Position(.7,8.5) ) );
					
			// Wall from (.7, 5.5) to (5.1,5.5)
			lFourWalls.add(new Wall(new Position(.7, 5.5), new Position(5.1,5.5) ) );
					
			// Wall from (5.1, 1.7) to (5.1, 4.3)
			lFourWalls.add(new Wall(new Position(5.1, 1.7), new Position(5.1, 4.3) ) );
					
			// Wall from (5.1, 4.8) to (5.1, 5.5)
			lFourWalls.add(new Wall(new Position(5.1, 4.8), new Position(5.1, 5.5) ) );
			
			// Wall from (5.1, 1.7) to (7.2,1.7)
			lFourWalls.add(new Wall(new Position(5.1, 1.7), new Position(7.2,1.7) ) );
					
			// Wall from (7.6, 1.7) to (15,1.7)
			lFourWalls.add(new Wall(new Position(7.6, 1.7), new Position(15,1.7) ) );
			
			// Wall from (15, 1.7) to (15,6)
			lFourWalls.add(new Wall(new Position(15, 1.7), new Position(15,6) ) );
			
			// Wall from (15, 6) to (19,6)
			lFourWalls.add(new Wall(new Position(15, 6), new Position(19,6) ) );
			
			// Wall from (15, 6) to (16.6,6)
			lFourWalls.add(new Wall(new Position(15, 6), new Position(16.6,6) ) );
			
			// Wall from (17.2, 6) to (19,9)
			lFourWalls.add(new Wall(new Position(17.2, 6), new Position(19,9) ) );
			
			// Wall from (19, 9.6) to (19,14)
			lFourWalls.add(new Wall(new Position(19, 9.6), new Position(19,14) ) );
			
			// Wall from (18.4, 14) to (19,14)
			lFourWalls.add(new Wall(new Position(18.4, 14), new Position(19,14) ) );
			
			// Wall from (13.7, 14) to (17,14)
			lFourWalls.add(new Wall(new Position(13.7, 14), new Position(17,14) ) );
			
			// Wall from (13.7, 14) to (13.7,15)
			lFourWalls.add(new Wall(new Position(13.7, 14), new Position(13.7,15) ) );
			
			// Wall from (13.7, 15.8) to (13.7,18.8)
			lFourWalls.add(new Wall(new Position(13.7, 15.8), new Position(13.7,18.8) ) );
			
			// Wall from (9.2, 18.8) to (13.7,18.8)
			lFourWalls.add(new Wall(new Position(9.2, 18.8), new Position(13.7,18.8) ) );
			
			// Wall from (4.9, 18.8) to (8.6,18.8)
			lFourWalls.add(new Wall(new Position(4.9, 18.8), new Position(8.6,18.8) ) );
			
			// Wall from (4.9, 14.5) to (4.9,16)
			lFourWalls.add(new Wall(new Position(4.9, 14.5), new Position(4.9,16) ) );
			
			// Wall from (4.9, 16.6) to (19,18.8)
			lFourWalls.add(new Wall(new Position(4.9, 16.6), new Position(19,18.8) ) );
			
			// Wall from (.7, 14.5) to (2,14.5)
			lFourWalls.add(new Wall(new Position(.7, 14.5), new Position(2,14.5) ) );
			
			// Wall from (2.6, 14.5) to (4.9,14.5)
			lFourWalls.add(new Wall(new Position(2.6, 14.5), new Position(4.9,14.5) ) );
			
			// Wall from (.7, 9.2) to (.7,14.5)
			lFourWalls.add(new Wall(new Position(.7, 9.2), new Position(.7,14.5) ) );		
			
			// Wall from (2.7, 7.25) to (2.7,10)
			lFourWalls.add(new Wall(new Position(2.7, 7.25), new Position(2.7,10) ) );
			
			// Wall from (2.7, 10.6) to (2.7,13)
			lFourWalls.add(new Wall(new Position(2.7, 10.6), new Position(2.7,13) ) );
			
			// Wall from (2.7, 7.25) to (4.7,7.25)
			lFourWalls.add(new Wall(new Position(2.7, 7.25), new Position(4.7,7.25) ) );
			
			// Wall from (5.3, 7.25) to (6.1,7.25)
			lFourWalls.add(new Wall(new Position(5.3, 7.25), new Position(6.1,7.25) ) );
			
			// Wall from (6.1, 3.2) to (6.1,7.25)
			lFourWalls.add(new Wall(new Position(6.1, 3.2), new Position(6.1,7.25) ) );
			
			// Wall from (6.1, 3.2) to (13,3.2)
			lFourWalls.add(new Wall(new Position(6.1, 3.2), new Position(13,3.2) ) );
			
			// Wall from (13, 3.2) to (13,7.25)
			lFourWalls.add(new Wall(new Position(13, 3.2), new Position(13,7.25) ) );
			
			// Wall from (13, 7.25) to (14.6,7.25)
			lFourWalls.add(new Wall(new Position(13, 7.25), new Position(14.6,7.25) ) );
			
			// Wall from (15.2, 7.25) to (17.5,7.25)
			lFourWalls.add(new Wall(new Position(15.2, 7.25), new Position(17.5,7.25) ) );
			
			// Wall from (17.5, 7.25) to (17.5, 9.8)
			lFourWalls.add(new Wall(new Position(17.5, 7.25), new Position(17.5, 9.8) ) );
			
			// Wall from (17.5, 10.4) to (17.5, 12)
			lFourWalls.add(new Wall(new Position(17.5, 10.4), new Position(17.5, 12) ) );
			
			// Wall from (12, 12) to (13.6,12)
			lFourWalls.add(new Wall(new Position(12, 12), new Position(13.6,12) ) );
			
			// Wall from (14.2, 12) to (17.5,12)
			lFourWalls.add(new Wall(new Position(14.2, 12), new Position(17.5,12) ) );
			
			// Wall from (12, 12) to (12,17)
			lFourWalls.add(new Wall(new Position(12, 12), new Position(12,17) ) );
			
			// Wall from (6, 17) to (8,17)
			lFourWalls.add(new Wall(new Position(6, 17), new Position(8,17) ) );
			
			// Wall from (8.6, 17) to (12,17)
			lFourWalls.add(new Wall(new Position(8.6, 17), new Position(12,17) ) );
			
			// Wall from (6, 13) to (6,17)
			lFourWalls.add(new Wall(new Position(6, 13), new Position(6,17) ) );
			
			// Wall from (2.7, 13) to (4,13)
			lFourWalls.add(new Wall(new Position(2.7, 13), new Position(4,13) ) );
			
			// Wall from (4.6, 13) to (6,13)
			lFourWalls.add(new Wall(new Position(4.6, 13), new Position(6,13) ) );		
					
			// Wall from (7.1, 4) to (11.7,4)
			lFourWalls.add(new Wall(new Position(7.1, 4), new Position(11.7,4) ) );
			
			// Wall from (11.7, 4.6) to (11.7,8)
			lFourWalls.add(new Wall(new Position(11.7, 4.6), new Position(11.7,8) ) );
			
			// Wall from (11.7, 8) to (16,8)
			lFourWalls.add(new Wall(new Position(11.7, 8), new Position(16,8) ) );
			
			// Wall from (16, 8) to (16, 9.3)
			lFourWalls.add(new Wall(new Position(16, 8), new Position(16, 9.3) ) );
			
			// Wall from (16, 9.9) to (16, 10.75)
			lFourWalls.add(new Wall(new Position(16, 9.9), new Position(16, 10.75) ) );
			
			// Wall from (14.4, 10.75) to (16,10.75)
			lFourWalls.add(new Wall(new Position(14.4, 10.75), new Position(16,10.75) ) );
			
			// Wall from (10, 10.75) to (13.8,10.75)
			lFourWalls.add(new Wall(new Position(10, 10.75), new Position(13.8,10.75) ) );
			
			// Wall from (10, 13.8) to (10,16)
			lFourWalls.add(new Wall(new Position(10, 13.8), new Position(10,16) ) );
			
			// Wall from (7, 16) to (10,16)
			lFourWalls.add(new Wall(new Position(7, 16), new Position(10,16) ) );
			
			// Wall from (7, 12) to (7,13.5)
			lFourWalls.add(new Wall(new Position(7, 12), new Position(7,13.5) ) );
			
			// Wall from (7, 14.2) to (7,16)
			lFourWalls.add(new Wall(new Position(7, 14.2), new Position(7,16) ) );
			
			// Wall from (4.5, 12) to (5,12)
			lFourWalls.add(new Wall(new Position(4.5, 12), new Position(5,12) ) );
			
			// Wall from (5.6, 12) to (7,12)
			lFourWalls.add(new Wall(new Position(5.6, 12), new Position(7,12) ) );
			
			// Wall from (4.5, 8) to (4.5,9.5)
			lFourWalls.add(new Wall(new Position(4.5, 8), new Position(4.5,9.5) ) );
			
			// Wall from (4.5, 10.1) to (4.5,12)
			lFourWalls.add(new Wall(new Position(4.5, 10.1), new Position(4.5,12) ) );
			
			// Wall from (4.5, 8) to (7.1,8)
			lFourWalls.add(new Wall(new Position(4.5, 8), new Position(7.1,8) ) );
			
			// Wall from (7.1, 6.6) to (7.1,8)
			lFourWalls.add(new Wall(new Position(7.1, 6.6), new Position(7.1,8) ) );
			
			// Wall from (7.1, 4) to (7.1,6)
			lFourWalls.add(new Wall(new Position(7.1, 4), new Position(7.1,6) ) );		
					
			// Wall from (8, 6) to (8,4.5)
			lFourWalls.add(new Wall(new Position(8, 6), new Position(8,4.5) ) );
			
			// Wall from (8, 4.5) to (10.2, 4.5)
			lFourWalls.add(new Wall(new Position(8, 4.5), new Position(10.2, 4.5) ) );
			
			// Wall from (10.2, 4.5) to (10.2,7.75)
			lFourWalls.add(new Wall(new Position(10.2, 4.5), new Position(10.2,7.75) ) );
			
			// Wall from (8, 7.75) to (10.2,7.75)
			lFourWalls.add(new Wall(new Position(8, 7.75), new Position(10.2,7.75) ) );
			
			// Wall from (8, 6.6) to (8,7.75)
			lFourWalls.add(new Wall(new Position(8, 6.6), new Position(8,7.75) ) );
			
			// Wall from (9, 5.1) to (9,7.15)
			lFourWalls.add(new Wall(new Position(9, 5.1), new Position(9,7.15) ) );		
					
			// Wall from (5, 8.5) to (5.5,8.5)
			lFourWalls.add(new Wall(new Position(5, 8.5), new Position(5.5,8.5) ) );
			
			// Wall from (6.1, 8.5) to (7.1,8.5)
			lFourWalls.add(new Wall(new Position(6.1, 8.5), new Position(7.1,8.5) ) );
			
			// Wall from (7.1, 8.5) to (7.1,11)
			lFourWalls.add(new Wall(new Position(7.1, 8.5), new Position(7.1,11) ) );
			
			// Wall from (5, 11) to (7.1,11)
			lFourWalls.add(new Wall(new Position(5, 11), new Position(7.1,11) ) );
			
			// Wall from (5, 8.5) to (5,11)
			lFourWalls.add(new Wall(new Position(5, 8.5), new Position(5,11) ) );
			
			// Wall from (5.6, 9.5) to (6.5,9.5)
			lFourWalls.add(new Wall(new Position(5.6, 9.5), new Position(6.5,9.5) ) );
					
			// Wall from (8, 8.5) to (10.2,8.5)
			lFourWalls.add(new Wall(new Position(8, 8.5), new Position(10.2,8.5) ) );
			
			// Wall from (8, 8.5) to (8,10.5)
			lFourWalls.add(new Wall(new Position(8, 8.5), new Position(8,10.5) ) );
			
			// Wall from (8, 10.5) to (9,10.5)
			lFourWalls.add(new Wall(new Position(8, 10.5), new Position(9,10.5) ) );
			
			// Wall from (10.2, 8.5) to (10.2,9)
			lFourWalls.add(new Wall(new Position(10.2, 8.5), new Position(10.2,9) ) );
			
			// Wall from (11.50, 8.75) to (15.1,8.75)
			lFourWalls.add(new Wall(new Position(11.50, 8.75), new Position(15.1,8.75) ) );
					
			// Wall from (8.50, 11.5) to (8.5,14.75)
			lFourWalls.add(new Wall(new Position(8.50, 11.5), new Position(8.5,14.75) ) );		
					
			// Wall from (11.7,8,75)  to (15,6, 8.75)
			lFourWalls.add(new Wall(new Position(11.7,8,75), new Position(15,6, 8.75) ) );
			
			// Wall from (10.9, 9.75)  to (15.6,9.75)
			lFourWalls.add(new Wall(new Position(10.9, 9.75), new Position(15.6,9.75) ) );
			
			return lFourWalls;
		}
		
		// Set the List of Walls in the Fifth Level
		public static List<Wall> levelFivePlusWallsBasis(){
			List<Wall> lFiveBaseWalls = new ArrayList <Wall>();
			lFiveBaseWalls.addAll(levelRZOneWalls());
			lFiveBaseWalls.addAll(levelRZTwoWalls());
			lFiveBaseWalls.addAll(levelRZThreeWalls());
			lFiveBaseWalls.addAll(levelRZFourWalls());
			lFiveBaseWalls.addAll(levelRZCenteredWalls());
			return lFiveBaseWalls;
		}
		
		// Set the List of Walls in Relic Zone One
		public static  List<Wall> levelRZOneWalls(){
			List<Wall> rZOne = new ArrayList <Wall>();
			// Wall from (8,4) to (9.1,4)
			rZOne.add(new Wall(new Position(8,4), new Position(9.1,4) ) );
			
			// Wall from (9.10, 3) to (9.1,4)
			rZOne.add(new Wall(new Position(9.10, 3), new Position(9.1,4) ) );
			
			// Wall from (9.10, 3.15) to (9.6,3.15)
			rZOne.add(new Wall(new Position(9.10, 3.15), new Position(9.6,3.15) ) );
			
			// Wall from (8.70, 3) to (9.1,3)
			rZOne.add(new Wall(new Position(8.70, 3), new Position(9.1,3) ) );
			
			// Wall from (8.7, .7) to (8.7,3)
			rZOne.add(new Wall(new Position(8.7, .7), new Position(8.7,3) ) );
			
			// Wall from (8.70, .7) to (10.1,.7)
			rZOne.add(new Wall(new Position(8.70, .7), new Position(10.1,.7) ) );
			
			// Wall from (10.1, .7) to (10.1, 1.25)
			rZOne.add(new Wall(new Position(10.1, .7), new Position(10.1, 1.25) ) );
			
			// Wall from (9.3, 1.25) to (10.1 ,1.25)
			rZOne.add(new Wall(new Position(9.3, 1.25), new Position(10.1 ,1.25) ) );
			
			// Wall from (9.30, 1.25) to (9.3,2)
			rZOne.add(new Wall(new Position(9.30, 1.25), new Position(9.3,2) ) );
			
			// Wall from (10.1, .85) to (11.25, .85)
			rZOne.add(new Wall(new Position(10.1, .85), new Position(11.25, .85) ) );
			
			// Wall from (11.25,.85) to (11.25,2)
			rZOne.add(new Wall(new Position(11.25,.85), new Position(11.25,2) ) );
			
			// Wall from (10.50, 2) to (11.25,2)
			rZOne.add(new Wall(new Position(10.50, 2), new Position(11.25,2) ) );
			
			// Wall from (10.5, 2) to (10.5,3)
			rZOne.add(new Wall(new Position(10.5, 2), new Position(10.5,3) ) );
			
			// Wall from (10.5, 3) to (11.25,3)
			rZOne.add(new Wall(new Position(10.5, 3), new Position(11.25,3) ) );
			
			// Wall from (11.25, 3) to (11.25,3.35)
			rZOne.add(new Wall(new Position(11.25, 3), new Position(11.25,3.35) ) );
			
			// Wall from (10.50, 3.35) to (11.25,3.35)
			rZOne.add(new Wall(new Position(10.50, 3.35), new Position(11.25,3.35) ) );
			
			// Wall from (10.50, 3.35) to (10.5,4)
			rZOne.add(new Wall(new Position(10.50, 3.35), new Position(10.5,4) ) );
			
			// Wall from (10.50, 4) to (12,4)
			rZOne.add(new Wall(new Position(10.50, 4), new Position(12,4) ) );

			// Wall from (12, 0) to (12,2.5)
			rZOne.add(new Wall(new Position(12, 0), new Position(12,2.5) ) );
			
			// Wall from (12, 3.1) to (12,4)
			rZOne.add(new Wall(new Position(12, 3.1), new Position(12,4) ) );
			
			return rZOne;
		}
		
		// Set the List of Walls in Relic Zone Two
		public static List<Wall> levelRZTwoWalls(){
			List<Wall> rZTwo = new ArrayList <Wall>();
			
			// Wall from (16, 8) to (17,8)
			rZTwo.add(new Wall(new Position(16, 8), new Position(17,8) ) );
			
			// Wall from (17, 8) to (17,8.3)
			rZTwo.add(new Wall(new Position(17, 8), new Position(17,8.3) ) );
			
			// Wall from (16, 8) to (16,8.7)
			rZTwo.add(new Wall(new Position(16, 8), new Position(16,8.7) ) );
			
			// Wall from (16, 8.7) to (17,8.7)
			rZTwo.add(new Wall(new Position(16, 8.7), new Position(17,8.7) ) );
			
			// Wall from (17.6, 8) to (20,8)
			rZTwo.add(new Wall(new Position(17.6, 8), new Position(20,8) ) );
			
			// Wall from (17.6, 8) to (17,8.7)
			rZTwo.add(new Wall(new Position(17.6, 8), new Position(17,8.7) ) );
			
			// Wall from (17, 8.7) to (17.6,8.7)
			rZTwo.add(new Wall(new Position(17, 8.7), new Position(17.6,8.7) ) );
			
			// Wall from (16, 9.3) to (16.6,9.3)
			rZTwo.add(new Wall(new Position(16, 9.3), new Position(16.6,9.3) ) );
			
			// Wall from (16.6, 9.3) to (16.6,10.7)
			rZTwo.add(new Wall(new Position(16.6, 9.3), new Position(16.6,10.7) ) );
			
			// Wall from (16.6, 10.7) to (17.3,10.7)
			rZTwo.add(new Wall(new Position(16.6, 10.7), new Position(17.3,10.7) ) );
			
			// Wall from (17.3, 10.7) to (17.3,10.4)
			rZTwo.add(new Wall(new Position(17.3, 10.7), new Position(17.3,10.4) ) );
			
			// Wall from (17.3, 9.3) to (17.3,10.4)
			rZTwo.add(new Wall(new Position(17.3, 9.3), new Position(17.3,10.4) ) );
			
			// Wall from (17.3, 9.3) to (18.7,9.3)
			rZTwo.add(new Wall(new Position(17.3, 9.3), new Position(18.7,9.3) ) );
			
			// Wall from (18.7, 9.3) to (18.7,10.2)
			rZTwo.add(new Wall(new Position(18.7, 9.3), new Position(18.7,10.2) ) );
			
			// Wall from (18.7,10.2 ) to (20,10.2)
			rZTwo.add(new Wall(new Position(18.7,10.2 ), new Position(20,10.2) ) );
			
			// Wall from (16, 9.3) to (16,12)
			rZTwo.add(new Wall(new Position(16, 9.3), new Position(16,12) ) );
			
			// Wall from (16, 12) to (20,12)
			rZTwo.add(new Wall(new Position(16, 12), new Position(20,12) ) );
			
			// Wall from (16.5, 11.2) to (16.5,12)
			rZTwo.add(new Wall(new Position(16.5, 11.2), new Position(16.5,12) ) );
			
			// Wall from (17.3,10.9 ) to (17.3,12)
			rZTwo.add(new Wall(new Position(17.3,10.9 ), new Position(17.3,12) ) );
			
			// Wall from (17.3, 10.9) to (18.7,10.9)
			rZTwo.add(new Wall(new Position(17.3, 10.9), new Position(18.7,10.9) ) );
			
			// Wall from (18.7, 10.5) to (18.7,10.9)
			rZTwo.add(new Wall(new Position(18.7, 10.5), new Position(18.7,10.9) ) );
			
			// Wall from (19.3, 10.5) to (19.3,11.2)
			rZTwo.add(new Wall(new Position(19.3, 10.5), new Position(19.3,11.2) ) );
			
			// Wall from (19.3, 11.2) to (19.6, 11.2)
			rZTwo.add(new Wall(new Position(19.3, 11.2), new Position(19.6, 11.2) ) );
			
			// Wall from (19.3, 10.9) to (20,10.9)
			rZTwo.add(new Wall(new Position(19.3, 10.9), new Position(20,10.9) ) );
			
			return rZTwo;
		}
		
		// Set the List of Walls for Relic Zone Three
		public static List<Wall> levelRZThreeWalls(){
			List<Wall> rZThree = new ArrayList <Wall>();
			
			// Wall from (0, 8) to (1,8)
			rZThree.add(new Wall(new Position(0, 8), new Position(1,8) ) );
			
			// Wall from (1, 8) to (1,9.15)
			rZThree.add(new Wall(new Position(1, 8), new Position(1,9.15) ) );
			
			// Wall from (.6, 9.15) to (1,9.15)
			rZThree.add(new Wall(new Position(.6, 9.15), new Position(1,9.15) ) );
			
			// Wall from (.6, 8.5) to (.6,9.15)
			rZThree.add(new Wall(new Position(.6, 8.5), new Position(.6,9.15) ) );
			
			// Wall from (1, 9) to (2.6,9)
			rZThree.add(new Wall(new Position(1, 9), new Position(2.6,9) ) );
			
			// Wall from (2.3, 9) to (2.3,9.4)
			rZThree.add(new Wall(new Position(2.3, 9), new Position(2.3,9.4) ) );
			
			// Wall from (1.7,9.4 ) to (2.3,9.4)
			rZThree.add(new Wall(new Position(1.7,9.4 ), new Position(2.3,9.4) ) );
			
			// Wall from (2.6, 8.5) to (2.6,9)
			rZThree.add(new Wall(new Position(2.6, 8.5), new Position(2.6,9) ) );
			
			// Wall from (2.6, 8.5) to (3.2,8.5)
			rZThree.add(new Wall(new Position(2.6, 8.5), new Position(3.2,8.5) ) );
			
			// Wall from (1.6, 8) to (1.6,8.5)
			rZThree.add(new Wall(new Position(1.6, 8), new Position(1.6,8.5) ) );
			
			// Wall from (1.6, 8.5) to (2.1,8.5)
			rZThree.add(new Wall(new Position(1.6, 8.5), new Position(2.1,8.5) ) );
			
			// Wall from (1.6, 8) to (4,8)
			rZThree.add(new Wall(new Position(1.6, 8), new Position(4,8) ) );
			
			// Wall from (4, 8) to (4,12)
			rZThree.add(new Wall(new Position(4, 8), new Position(4,12) ) );
			
			// Wall from (3.2, 9) to (3.2,10)
			rZThree.add(new Wall(new Position(3.2, 9), new Position(3.2,10) ) );
			
			// Wall from (1.6, 10) to (3.2,10)
			rZThree.add(new Wall(new Position(1.6, 10), new Position(3.2,10) ) );
			
			// Wall from (2.3, 10) to (2.3,12)
			rZThree.add(new Wall(new Position(2.3, 10), new Position(2.3,12) ) );
			
			// Wall from (2.3, 10) to (2.3,10.5)
			rZThree.add(new Wall(new Position(2.3, 10), new Position(2.3,10.5) ) );
			
			// Wall from (1, 11) to (2.3,11)
			rZThree.add(new Wall(new Position(1, 11), new Position(2.3,11) ) );
			
			// Wall from (.5, 9.8) to (1,9.8)
			rZThree.add(new Wall(new Position(.5, 9.8), new Position(1,9.8) ) );
			
			// Wall from (1, 9.8) to (1,11.4)
			rZThree.add(new Wall(new Position(1, 9.8), new Position(1,11.4) ) );
			
			// Wall from (1, 11.4) to (1.8,11.4)
			rZThree.add(new Wall(new Position(1, 11.4), new Position(1.8,11.4) ) );
			
			// Wall from (.5, 9.8) to (.5,11.4)
			rZThree.add(new Wall(new Position(.5, 9.8), new Position(.5,11.4) ) );
			
			// Wall from (2.9, 10.5) to (2.9,11.7)
			rZThree.add(new Wall(new Position(2.9, 10.5), new Position(2.9,11.7) ) );
			
			// Wall from (2.9, 11.7) to (3.2,11.7)
			rZThree.add(new Wall(new Position(2.9, 11.7), new Position(3.2,11.7) ) );
			
			// Wall from (3.2, 11.7) to (3.2,12)
			rZThree.add(new Wall(new Position(3.2, 11.7), new Position(3.2,12) ) );
			
			// Wall from (2.9, 10.5) to (3.2,10.5)
			rZThree.add(new Wall(new Position(2.9, 10.5), new Position(3.2,10.5) ) );
			
			// Wall from (3.2, 10.5) to (3.2,11)
			rZThree.add(new Wall(new Position(3.2, 10.5), new Position(3.2,11) ) );
			
			// Wall from (3.2, 12) to (4,12)
			rZThree.add(new Wall(new Position(3.2, 12), new Position(4,12) ) );
			
			// Wall from (0, 12) to (2.3,12)
			rZThree.add(new Wall(new Position(0, 12), new Position(2.3,12) ) );
			
			return rZThree;
		}
		
		// Set the List of Walls in Relic Zone Four
		public static List<Wall> levelRZFourWalls(){
			List<Wall> rZFour = new ArrayList <Wall>();
			
			// Wall from (8, 16) to (9,16)
			rZFour.add(new Wall(new Position(8, 16), new Position(9,16) ) );
			
			// Wall from (9, 16) to (9,17)
			rZFour.add(new Wall(new Position(9, 16), new Position(9,17) ) );
			
			// Wall from (9, 17) to (10.2,17)
			rZFour.add(new Wall(new Position(9, 17), new Position(10.2,17) ) );
			
			// Wall from (9.6, 16) to (12,16)
			rZFour.add(new Wall(new Position(9.6, 16), new Position(12,16) ) );
			
			// Wall from (10.2, 16) to (10.2,17)
			rZFour.add(new Wall(new Position(10.2, 16), new Position(10.2,17) ) );
			
			// Wall from (8, 16) to (8,17)
			rZFour.add(new Wall(new Position(8, 16), new Position(8,17) ) );
			
			// Wall from (12, 16) to (12,20)
			rZFour.add(new Wall(new Position(12, 16), new Position(12,20) ) );
			
			// Wall from (10.2, 19) to (12,19)
			rZFour.add(new Wall(new Position(10.2, 19), new Position(12,19) ) );
			
			// Wall from (9, 19) to (9.6,19)
			rZFour.add(new Wall(new Position(9, 19), new Position(9.6,19) ) );
			
			// Wall from (9, 19) to (9,20)
			rZFour.add(new Wall(new Position(9, 19), new Position(9,20) ) );
			
			// Wall from (8, 16.6) to (8,20)
			rZFour.add(new Wall(new Position(8, 16.6), new Position(8,20) ) );
			
			return rZFour;
		}
		
		// Set the List of Walls in the Centered Relic Zone Area
		public static List<Wall> levelRZCenteredWalls(){
			List<Wall> rZCenter = new ArrayList <Wall>();
			
			// Wall from (4, 4) to (5.2,4)
			rZCenter.add(new Wall(new Position(4, 4), new Position(5.2,4) ) );
			// Wall from (5.2, 4) to (5.2,6)
			rZCenter.add(new Wall(new Position(5.2, 4), new Position(5.2,6) ) );
			
			// Wall from (4.9, 6) to (5.2,6)
			rZCenter.add(new Wall(new Position(4.9, 6), new Position(5.2,6) ) );
			
			// Wall from (4, 6) to (4.3,6)
			rZCenter.add(new Wall(new Position(4, 6), new Position(4.3,6) ) );
			
			// Wall from (4.3, 4.5) to (4.3,6)
			rZCenter.add(new Wall(new Position(4.3, 4.5), new Position(4.3,6) ) );
			
			// Wall from (4.9, 4.5) to (4.9,6)
			rZCenter.add(new Wall(new Position(4.9, 4.5), new Position(4.9,6) ) );
			
			// Wall from (5.2, 4) to (8,4)
			rZCenter.add(new Wall(new Position(5.2, 4), new Position(8,4) ) );
			
			// Wall from (12, 4) to (13,4)
			rZCenter.add(new Wall(new Position(12, 4), new Position(13,4) ) );
			
			// Wall from (13.6, 4) to (16,4)
			rZCenter.add(new Wall(new Position(13.6, 4), new Position(16,4) ) );
			
			// Wall from (4, 6.6) to (4,8)
			rZCenter.add(new Wall(new Position(4, 6.6), new Position(4,8) ) );
			
			// Wall from (16, 4) to (16,6)
			rZCenter.add(new Wall(new Position(16, 4), new Position(16,6) ) );
			
			// Wall from (16, 6.6) to (16,8)
			rZCenter.add(new Wall(new Position(16, 6.6), new Position(16,8) ) );
			
			// Wall from (16, 12) to (16,14)
			rZCenter.add(new Wall(new Position(16, 12), new Position(16,14) ) );
			
			// Wall from (16, 14.6) to (16,16)
			rZCenter.add(new Wall(new Position(16, 14.6), new Position(16,16) ) );
			
			// Wall from (12, 16) to (14,16)
			rZCenter.add(new Wall(new Position(12, 16), new Position(14,16) ) );
			
			// Wall from (14.6, 16) to (16,16)
			rZCenter.add(new Wall(new Position(14.6, 16), new Position(16,16) ) );
			
			// Wall from (4, 16) to (5.2,16)
			rZCenter.add(new Wall(new Position(4, 16), new Position(5.2,16) ) );
			
			// Wall from (5.6,16) to (8,16)
			rZCenter.add(new Wall(new Position(5.6,16), new Position(8,16) ) );
			
			// Wall from (4, 12.6) to (4,14)
			rZCenter.add(new Wall(new Position(4, 12.6), new Position(4,14) ) );
			
			// Wall from (4, 14.6) to (4,16)
			rZCenter.add(new Wall(new Position(4, 14.6), new Position(4,16) ) );
			
			// Wall from (4, 13.85) to (4.9,13.85)
			rZCenter.add(new Wall(new Position(4, 13.85), new Position(4.9,13.85) ) );
			
			// Wall from (4.9, 13.85) to (4.9,15)
			rZCenter.add(new Wall(new Position(4.9, 13.85), new Position(4.9,15) ) );
			
			// Wall from (4.9, 15) to (6.8,15)
			rZCenter.add(new Wall(new Position(4.9, 15), new Position(6.8,15) ) );
			
			// Wall from (7.2, 15) to (11.5,15)
			rZCenter.add(new Wall(new Position(7.2, 15), new Position(11.5,15) ) );
			
			// Wall from (12.2, 15) to (15,15)
			rZCenter.add(new Wall(new Position(12.2, 15), new Position(15,15) ) );
			
			// Wall from (9.6, 15) to (9.6,16)
			rZCenter.add(new Wall(new Position(9.6, 15), new Position(9.6,16) ) );
			
			// Wall from (15,12) to (15,15)
			rZCenter.add(new Wall(new Position(15,12), new Position(15,15) ) );
			
			// Wall from (15,9) to (15,11.4)
			rZCenter.add(new Wall(new Position(15,9), new Position(15,11.4) ) );
			
			// Wall from (15,5) to (15,8.4)
			rZCenter.add(new Wall(new Position(15,5), new Position(15,8.4) ) );
			
			// Wall from (12.4, 5) to (15,5)
			rZCenter.add(new Wall(new Position(12.4, 5), new Position(15,5) ) );
			
			// Wall from (8.3, 5) to (11.8,5)
			rZCenter.add(new Wall(new Position(8.3, 5), new Position(11.8,5) ) );
			
			// Wall from (8.3, 5) to (8.3,6)
			rZCenter.add(new Wall(new Position(8.3, 5), new Position(8.3,6) ) );
			
			// Wall from (8.3, 6) to (14.3,6)
			rZCenter.add(new Wall(new Position(8.3, 6), new Position(14.3,6) ) );
			
			// Wall from (10, 6) to (10,8)
			rZCenter.add(new Wall(new Position(10, 6), new Position(10,8) ) );
			
			// Wall from (9.4, 8) to (10,8)
			rZCenter.add(new Wall(new Position(9.4, 8), new Position(10,8) ) );
			
			// Wall from (9.4, 8) to (9.4,9)
			rZCenter.add(new Wall(new Position(9.4, 8), new Position(9.4,9) ) );
			
			// Wall from (9.4, 9) to (11,9)
			rZCenter.add(new Wall(new Position(9.4, 9), new Position(11,9) ) );
			
			// Wall from (11,6.9) to (12.7,6.9)
			rZCenter.add(new Wall(new Position(11,6.9), new Position(12.7,6.9) ) );
			
			// Wall from (12.7, 6.9) to (12.7,7.9)
			rZCenter.add(new Wall(new Position(12.7, 6.9), new Position(12.7,7.9) ) );
			
			// Wall from (12.7, 7.9) to (13.7,7.9)
			rZCenter.add(new Wall(new Position(12.7, 7.9), new Position(13.7,7.9) ) );
			
			// Wall from (13.7, 7.9) to (13.7,8.5)
			rZCenter.add(new Wall(new Position(13.7, 7.9), new Position(13.7,8.5) ) );
			
			// Wall from (12.7, 8.5) to (13.7,8.5)
			rZCenter.add(new Wall(new Position(12.7, 8.5), new Position(13.7,8.5) ) );
			
			// Wall from (12.7, 8.5) to (12.7,9)
			rZCenter.add(new Wall(new Position(12.7, 8.5), new Position(12.7,9) ) );
			
			// Wall from (12.7, 9) to (13.7,9)
			rZCenter.add(new Wall(new Position(12.7, 9), new Position(13.7,9) ) );
			
			// Wall from (11,6.9 ) to (11,7.9)
			rZCenter.add(new Wall(new Position(11,6.9 ), new Position(11,7.9) ) );
			
			// Wall from (11, 7.9) to (11.6,7.9)
			rZCenter.add(new Wall(new Position(11, 7.9), new Position(11.6,7.9) ) );
			
			// Wall from (11.6,7.9) to (11.6,8.5)
			rZCenter.add(new Wall(new Position(11.6,7.9), new Position(11.6,8.5) ) );
			
			// Wall from (11, 8.5) to (11.6,8.5)
			rZCenter.add(new Wall(new Position(11, 8.5), new Position(11.6,8.5) ) );
			
			// Wall from (11, 8.5) to (11,9)
			rZCenter.add(new Wall(new Position(11, 8.5), new Position(11,9) ) );
			
			// Wall from (14.3, 6) to (14.3,14)
			rZCenter.add(new Wall(new Position(14.3, 6), new Position(14.3,14) ) );
			
			// Wall from (5.6, 4) to (5.6,5)
			rZCenter.add(new Wall(new Position(5.6, 4), new Position(5.6,5) ) );
			
			// Wall from (5.6, 5) to (7.7,5)
			rZCenter.add(new Wall(new Position(5.6, 5), new Position(7.7,5) ) );
			
			// Wall from (7.7, 5) to (7.7,6)
			rZCenter.add(new Wall(new Position(7.7,5), new Position(7.7,6) ) );
			
			// Wall from (5.6, 6) to (7.7,6)
			rZCenter.add(new Wall(new Position(5.6, 6), new Position(7.7,6) ) );
			
			// Wall from (5.6, 6) to (5.6,7.1)
			rZCenter.add(new Wall(new Position(5.6, 6), new Position(5.6,7.1) ) );
			
			// Wall from (5, 7.1) to (5.6,7.1)
			rZCenter.add(new Wall(new Position(5, 7.1), new Position(5.6,7.1) ) );
			
			// Wall from (5, 6.5) to (5,7.1)
			rZCenter.add(new Wall(new Position(5, 6.5), new Position(5, 7.1) ) );
			
			// Wall from (4.5, 6.5) to (5,6.5)
			rZCenter.add(new Wall(new Position(4.5, 6.5), new Position(5, 6.5) ) );
			
			// Wall from (4.5, 6.5) to (4.5,8.5)
			rZCenter.add(new Wall(new Position(4.5, 6.5), new Position(4.5,8.5) ) );
			
			// Wall from (4.5, 8.5) to (5.5,8.5)
			rZCenter.add(new Wall(new Position(4.5,8.5), new Position(5.5,8.5) ) );
			
			// Wall from (5.5, 8) to (5.5,8.5)
			rZCenter.add(new Wall(new Position(5.5, 8), new Position(5.5,8.5) ) );
			
			// Wall from (5.5, 8) to (6.75,8)
			rZCenter.add(new Wall(new Position(5.5, 8), new Position(6.75,8) ) );
			
			// Wall from (6.75, 7.1) to (6.75,8)
			rZCenter.add(new Wall(new Position(6.75, 7.1), new Position(6.75,8) ) );
			
			// Wall from (6.75, 7.1) to (7.7,7.1)
			rZCenter.add(new Wall(new Position(6.75, 7.1), new Position(7.7,7.1) ) );
			
			// Wall from (7.7, 7.1) to (7.7,8.5)
			rZCenter.add(new Wall(new Position(7.7, 7.1), new Position(7.7,8.5) ) );
			
			// Wall from (6.4, 8.5) to (7.7,8.5)
			rZCenter.add(new Wall(new Position(6.4, 8.5), new Position(7.7,8.5) ) );
			
			// Wall from (6.4, 8.5) to (6.4,9)
			rZCenter.add(new Wall(new Position(6.4, 8.5), new Position(6.4,9) ) );
			
			// Wall from (6.4, 9) to (8.6,9)
			rZCenter.add(new Wall(new Position(6.4,9), new Position(8.6,9) ) );
			
			// Wall from (8.6, 7) to (8.6,9)
			rZCenter.add(new Wall(new Position(8.6, 7), new Position(8.6,9) ) );
			
			// Wall from (8.6, 7) to (10,7)
			rZCenter.add(new Wall(new Position(8.6, 7), new Position(10,7) ) );
			
			// Wall from (4.5, 9.3) to (4.5,13)
			rZCenter.add(new Wall(new Position(4.5, 9.3), new Position(4.5,13) ) );
			
			// Wall from (4.5, 9.3) to (5.5,9.3)
			rZCenter.add(new Wall(new Position(4.5, 9.3), new Position(5.5,9.3) ) );
			
			// Wall from (5.5,9.3 ) to (5.5,11.5)
			rZCenter.add(new Wall(new Position(5.5,9.3), new Position(5.5,11.5) ) );
			
			// Wall from (5.5, 11.5) to (6,11.5)
			rZCenter.add(new Wall(new Position(5.5,11.5), new Position(6,11.5) ) );
			
			// Wall from (6, 10) to (6,11.5)
			rZCenter.add(new Wall(new Position(6, 10), new Position(6,11.5) ) );
			
			// Wall from (6, 10) to (7.5,10)
			rZCenter.add(new Wall(new Position(6, 10), new Position(7.5,10) ) );
			
			// Wall from (7.5, 10) to (7.5,10.8)
			rZCenter.add(new Wall(new Position(7.5,10), new Position(7.5,10.8) ) );
			
			// Wall from (6.9,10.8) to (7.5,10.8)
			rZCenter.add(new Wall(new Position(6.9,10.8), new Position(7.5,10.8) ) );
			
			// Wall from (6.9, 10.8) to (6.9,13)
			rZCenter.add(new Wall(new Position(6.9,10.8), new Position(6.9,13) ) );
			
			// Wall from (6.9, 11.7) to (7.2,11.7)
			rZCenter.add(new Wall(new Position(6.9, 11.7), new Position(7.2,11.7) ) );
			
			// Wall from (7.1, 13) to (7.1,13.4)
			rZCenter.add(new Wall(new Position(7.1, 13), new Position(7.1,13.4) ) );
			
			// Wall from (5.5, 12.1) to (6.9,12.1)
			rZCenter.add(new Wall(new Position(5.5, 12.1), new Position(6.9,12.1) ) );
			
			// Wall from (5.5, 12.1) to (5.5,14)
			rZCenter.add(new Wall(new Position(5.5, 12.1), new Position(5.5,14) ) );
			
			// Wall from (5.5, 14) to (8.5,14)
			rZCenter.add(new Wall(new Position(5.5,14), new Position(8.5,14) ) );
			
			// Wall from (8.5, 13) to (8.5,14)
			rZCenter.add(new Wall(new Position(8.5, 13), new Position(8.5,14) ) );
			
			// Wall from (7.9, 13) to (8.5,13)
			rZCenter.add(new Wall(new Position(7.9, 13), new Position(8.5, 13) ) );
			
			// Wall from (7.9, 11.7) to (7.9,13)
			rZCenter.add(new Wall(new Position(7.9, 11.7), new Position(7.9, 13) ) );
			
			// Wall from (7.9, 11.7) to (8.5,11.7)
			rZCenter.add(new Wall(new Position(7.9, 11.7), new Position(8.5,11.7) ) );
			
			// Wall from (8.5, 10) to (8.5,11.7)
			rZCenter.add(new Wall(new Position(8.5, 10), new Position(8.5,11.7) ) );
			
			// Wall from (8.5, 10) to (9,10)
			rZCenter.add(new Wall(new Position(8.5, 10), new Position(9,10) ) );
			
			// Wall from (9, 10) to (9,11.7)
			rZCenter.add(new Wall(new Position(9,10), new Position(9,11.7) ) );
			
			// Wall from (9, 11.7) to (10,11.7)
			rZCenter.add(new Wall(new Position(9,11.7), new Position(10,11.7) ) );
			
			// Wall from (10, 11.7) to (10,13)
			rZCenter.add(new Wall(new Position(10,11.7), new Position(10,13) ) );
			
			// Wall from (9, 13) to (10,13)
			rZCenter.add(new Wall(new Position(9, 13), new Position(10,13) ) );
			
			// Wall from (9, 13) to (9,14)
			rZCenter.add(new Wall(new Position(9, 13), new Position(9,14) ) );
			
			// Wall from (9, 14) to (11.5,14)
			rZCenter.add(new Wall(new Position(9,14), new Position(11.5,14) ) );
			
			// Wall from (11.5, 10) to (11.5,14)
			rZCenter.add(new Wall(new Position(11.5, 10), new Position(11.5,14) ) );
			
			// Wall from (11.5, 10) to (12.5,10)
			rZCenter.add(new Wall(new Position(11.5, 10), new Position(12.5,10) ) );
			
			// Wall from (12.5, 10) to (12.5,14)
			rZCenter.add(new Wall(new Position(12.5,10), new Position(12.5,14) ) );
			
			// Wall from (12.5, 14) to (14.3,14)
			rZCenter.add(new Wall(new Position(12.5,14), new Position(14.3,14) ) );
			
			return rZCenter;
		}
		
		// Set the List of Walls in Level Six
		public static List<Wall> levelSixWalls(){
			List<Wall> lSixWalls = new ArrayList <Wall>();
			lSixWalls.addAll(levelFivePlusWallsBasis());
			
			// Wall from (4, 11) to (4.5,11)
			lSixWalls.add(new Wall(new Position(4, 11), new Position(4.5,11) ) );
			return lSixWalls;
		}
	
		//Set the List of Walls in Level Seven
		public static List<Wall> levelSevenWalls(){
			List<Wall> lSevenWalls = new ArrayList <Wall>();
			lSevenWalls.addAll(levelFivePlusWallsBasis());
			
			// Wall from (4, 11) to (4.5,11)
			lSevenWalls.add(new Wall(new Position(4, 11), new Position(4.5,11) ) );
						
			// Wall from (15, 11) to (16,11)
			lSevenWalls.add(new Wall(new Position(4, 11), new Position(4.5,11) ) );
			
			return lSevenWalls;
		}
		
		//Set the List of Walls in Level Seven
		public static List<Wall> levelEightWalls(){
			List<Wall> lEightWalls = new ArrayList <Wall>();
			lEightWalls.addAll(levelFivePlusWallsBasis());
					
			// Wall from (4, 11) to (4.5,11)
			lEightWalls.add(new Wall(new Position(4, 11), new Position(4.5,11) ) );
								
			// Wall from (15, 11) to (16,11)
			lEightWalls.add(new Wall(new Position(15, 11), new Position(16,11) ) );
				
			// Wall from (14.3, 8) to (15,8)
			lEightWalls.add(new Wall(new Position(14.3, 8), new Position(15,8) ) );
			
			
			return lEightWalls;
		}
}
