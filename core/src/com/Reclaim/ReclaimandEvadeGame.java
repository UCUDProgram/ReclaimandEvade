package edu.udel.dlaw.ReclaimandEvade;

import edu.udel.jatlas.gameframework.ConsoleListener;
import edu.udel.jatlas.gameframework.Position;
import edu.udel.jatlas.gameframework.Tickable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import edu.udel.jatlas.gameframework.Game;
//import edu.udel.jatlas.snake.SnakeAI;

import edu.udel.dlaw.ReclaimandEvade.Wall;
import edu.udel.dlaw.ReclaimandEvade.ReclaimandEvadeAI;

import java.util.Iterator;
// David L. Law
// David Schmetterling

public class ReclaimandEvadeGame extends Game implements Tickable {
	private static double score;
	private static int livesLeft;
	private static Player Player1;
	private static int level;
	private static int relicsLeft;
	private static List<Relic> Relics;	
	private static int numberLevelEnemies;
	private static List<Enemy> Enemies;
	private static List<Wall> Walls;
	
	 // the speed is the number of milliseconds between state updates
    // due to progression of the game. The lower this value, the faster
    // the model will update (later when we add onTick).
    private long speed;
    
	//Global Variables
	
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
	final static int HUNTERCOOLOFFTIME = 60;
	
	final static int PLAYERDAMAGESCORE = 110;
	final static Position DEFAULTPOSITION = new Position(-1,-1);
	final static double THRESHOLD = .3;
	final static int TOTALLIVES = 3;
	final static int WORLDHEIGHT = 20;
	final static int WORLDWIDTH = 20;
	
	final static long GAMESPEED = 200;
	
	//Constructor for Game, Possible Level as well.
	public ReclaimandEvadeGame(double ascore, int alivesleft, Player aPlayer1, int alevel, int arelicsleft, List<Relic> arelic,  
			 int alevelEnemies, List<Enemy> aEnemy1, List<Wall> aWall) {
		score = ascore;
		livesLeft = alivesleft;
		Player1 =  aPlayer1;
		level = alevel;
		relicsLeft = arelicsleft;
		Relics = arelic;
		numberLevelEnemies = alevelEnemies;
		Enemies = aEnemy1;
		Walls = aWall;
	}
																				// GETTERS AND SETTERS FOR RECLAIM AND EVADE GAME
	
	public long getRealTimeTickLength() {
        return getSpeed();
    }
	
	public long getSpeed() {
		return GAMESPEED;
	}

	// Getter & Setter for Wall
	public static List<Wall> getWalls() {
		return Walls;
	}
	
	public static void setWalls(List<Wall> walls) {
		Walls = walls;
	}
	
	// Getter & Setter for Score
	public static double getScore() {
		return score;
	}
	
	public static void setScore(double newscore) {
		score = newscore;
	}
	
	// Getter & Setter for Lives Left
	public static int getLivesLeft() {
		return livesLeft;
	}
	
	public static void setLivesLeft(int newlivesLeft) {
		livesLeft = newlivesLeft;
	}
	
	// Getter & Setter for Player
	public static Player getPlayer1() {
		return Player1;
	}
	
	public static void setPlayer1(Player aplayer1) {
		Player1 = aplayer1;
	}
	
	// Getter & Setter for Level
	public static int getLevel() {
		return level;
	}
	
	public static void setLevel(int alevel) {
		level = alevel;
	}
	
	// Getter & Setter for Relics List
	public List<Relic> getRelics() {
		return Relics;
	}
	
	public static void setRelics(List<Relic> relics) {
		Relics = relics;
	}
	
	// Getter & Setter for Relics Number
	public static int getRelicsLeft() {
		return relicsLeft;
	}
	
	public static void setRelicsLeft(int newrelicsLeft) {
		relicsLeft = newrelicsLeft;
	}
	
	//Getters & Setters for number of Level Enemies
	public static int getNumberLevelEnemies() {
		return numberLevelEnemies;
	}
	
	public static void setNumberLevelEnemies(int newnumberLevelEnemies) {
		numberLevelEnemies = newnumberLevelEnemies;
	}

	// Getters & Setters for Enemies List
	
	public static List<Enemy> getEnemies() {
		return Enemies;
	}
	
	public static void setEnemies(List<Enemy> newenemies) {
		Enemies = newenemies;
	}
	
	 public static String getStatus() {
	        return "Level: " + getLevel() + "  Score: " + getScore() + "  Relics Left" + getRelicsLeft();
	    }
	 
	
																					// INITIALIZATION OF GAME
	// Initialization of pieces
	public static void nextLevelInitialization(){
		getPlayer1().setHealth(PLAYERHEALTH);
		setNumberLevelEnemies(setEnemyTotal());
		setWalls(levelWalls());
		setEnemies(setEnemyList());
		setRelics(setRelicList());
		setRelicsLeft(Relics.size());
	}
	
	//Set the Player's Piece
	public static Player setPlayer(){
		// Code later for playerSelection based on player selection with a Mouse
		int playerSelection =(int) (Math.random() * 4);
		
		// Replaced 100 with PlayerHealth
		// Replace "PlayerLoc with Player Spawn Location
		// Replace "PlayerDirection with Player Direction
		// Replaced "PlayerFire with False
		String name = "";
		if (playerSelection == 0){
			name = "Spart";
		//	return (new Player(name, "SpartLoc", PLAYERHEALTH, .5, setPlayerWeapon(name) , "SpartanDirection", false, setPlayerDamageBonus(name)));
		}
		if (playerSelection == 1){
			name = "AveJoh";
			//return (new Player("AveJoh", "AveJohLoc", PLAYERHEALTH, .5, setPlayerWeapon(name), "AveJohDirection", false, setPlayerDamageBonus(name)));
		}
		if (playerSelection == 2){
			name = "ODST";
		//	return (new Player("ODST", "ODSTLoc", PLAYERHEALTH, .5, setPlayerWeapon(name), "ODSTDirection", false, setPlayerDamageBonus(name)));
		}
		if (playerSelection == 3){
			name = "Marine";
	//		return (new Player("Marine", "MarineLoc", PLAYERHEALTH, .5, setPlayerWeapon(name), "MarineDirection", false, setPlayerDamageBonus(name)));
		}
		return (new Player(name, DEFAULTPOSITION, PLAYERHEALTH, setPlayerMovementSpeed(name), setPlayerWeapon(name) , -1, false, setPlayerDamageBonus(name)));
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
																				// INITIALIZATION OF LEVEL
			
	// Function to generate all the Walls on the board
	public static List<Wall> levelWalls(){
		List <Wall> allLevelWalls = new ArrayList<Wall>();
		allLevelWalls.addAll(Levels.gameBoardInit());
		allLevelWalls.addAll(levelWallGenerator() );
		return allLevelWalls;
	}
	
	
	// Function to Generate the List of Walls in a given Level
	public static List<Wall> levelWallGenerator(){
		List <Wall> levelWalls = new ArrayList<Wall>();
		if (getLevel() == 1)
			levelWalls = Levels.levelOneWalls();
		if (getLevel() == 2)
			levelWalls = Levels.levelTwoWalls();
		if (getLevel() == 3)
			levelWalls = Levels.levelThreeWalls();
		if (getLevel() == 4)
			levelWalls = Levels.levelFourWalls();
		if (getLevel() >= 5)
			levelWalls = Levels.levelFivePlusWallsBasis();
		if (getLevel() == 6)
			levelWalls = Levels.levelSixWalls();
		if (getLevel() == 7)
			levelWalls = Levels.levelSevenWalls();
		if (getLevel() == 8)
			levelWalls = Levels.levelEightWalls();
		return levelWalls;
	}
	

																				// PLAYER INITIALIZATION FOR START OF GAME/LEVEL
	
	// Set Player's Location on Start of Level
	public static void setLevelStart(){
		getPlayer1().setComLocation(new Position( 1.5, 1.5));
//		Player1.comLocation = new Position( 1.5, 1.5);
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
	
		
																				// ENEMY INITIALIZATION FOR START OF GAME/LEVEL
	
	// Set number of enemies that appear on a level
	// Produces a number representing the number of enemies that a level will have
	public static int setEnemyTotal(){
		return (getLevel() * 2);
	}
	
	
	// Consumes a number representing the number of enemies in the list
	// Produces a List of Enemies that has as many enemies as the input number
	public static List<Enemy> setEnemyList(){
		List<Enemy> enemyList = new ArrayList <Enemy>();
		Enemy[] enemList = new Enemy[setEnemyArrayLength()];
		enemList = setEnemyArray();
		
		for (int i = 0; i< setEnemyTotal(); i++){
			
			int enemyGenerator =(int) (Math.random() * setEnemyArrayLength());
			enemyList.add(enemList[enemyGenerator]);
		}						
		return enemyList;
	}
	
	// Alter these values based on ticks and realistic movement
	public static double setEnemyMovementSpeed (String enemyName){
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
	public static int setEnemyInitialDirection(){
		return (int)(Math.random() * 4);	
	}
	
	// Logic: Will take levelnumber and determine which enemies to add
	// Will return the array 
	public static Enemy[] setEnemyArray(){
		int arrayIndex = setEnemyArrayLength();
//		Enemy[] possEnemy;
		Enemy[] possEnemy = new Enemy[arrayIndex];
	
		// Defining the different enemies one could face
		Enemy Elite = new Enemy("Elite", setEnemyPosition(), ELITEHEALTH, setEnemyMovementSpeed("Elite"), "Plasma Rifle", setEnemyInitialDirection(), false, 40);
		Enemy Zealot = new Enemy("Zealot", setEnemyPosition(), ZEALOTHEALTH, setEnemyMovementSpeed("Zealot"), "Energy Sword", setEnemyInitialDirection(), false, 0);
		Enemy GruntScout = new Enemy("GruntScout", setEnemyPosition(), GRUNTHEALTH, setEnemyMovementSpeed("GruntScout"), "Plasma Pistol", setEnemyInitialDirection(), false, 20);
		Enemy JackalScout = new Enemy("JackalScout", setEnemyPosition(), JACKALHEALTH, setEnemyMovementSpeed("JackalScout"), "Plasma Pistol", setEnemyInitialDirection(), false, 25);
		Enemy Hunter = new Enemy("Hunter", setEnemyPosition(), HUNTERHEALTH, setEnemyMovementSpeed("Hunter"), "Plasma Rockets", setEnemyInitialDirection(), false, 60);
		Enemy GruntSniper = new Enemy("GruntSniper", setEnemyPosition(), GRUNTHEALTH, setEnemyMovementSpeed("GruntSniper"), "Needler", setEnemyInitialDirection(), false, 30);
		Enemy JackalSniper = new Enemy("JackalSniper", setEnemyPosition(), JACKALHEALTH, setEnemyMovementSpeed("JackalSniper"), "Beam Rifle", setEnemyInitialDirection(), false, 35);
		
		if (getLevel() == 1 ) {
			possEnemy[0] = GruntScout;
			possEnemy[1] = JackalScout;
			possEnemy[2] = GruntSniper;
		}
		if (getLevel() == 2){
			possEnemy[0] = GruntScout;
			possEnemy[1] = JackalScout;
			possEnemy[2] = GruntSniper;
			possEnemy[3] = JackalSniper;
		}
		if (getLevel() == 3){
			possEnemy[0] = GruntScout;
			possEnemy[1] = JackalScout;
			possEnemy[2] = GruntSniper;
			possEnemy[3] = JackalSniper;
			possEnemy[4] = Elite;
		}
		if (getLevel() == 4){
			possEnemy[0] = GruntScout;
			possEnemy[1] = JackalScout;
			possEnemy[2] = GruntSniper;
			possEnemy[3] = JackalSniper;
			possEnemy[4] = Elite;
			possEnemy[5] = Zealot;
		}
		if (getLevel() == 5){
			possEnemy[0] = GruntScout;
			possEnemy[1] = JackalScout;
			possEnemy[2] = GruntSniper;
			possEnemy[3] = JackalSniper;
			possEnemy[4] = Elite;
			possEnemy[5] = Zealot;
		}
		if (getLevel() == 6){
			possEnemy[0] = GruntSniper;
			possEnemy[1] = JackalSniper;
			possEnemy[2] = Elite;
			possEnemy[3] = Zealot;
			possEnemy[4] = Hunter;
		}
		if (getLevel() == 7){
			possEnemy[0] = JackalSniper;
			possEnemy[1] = Elite;
			possEnemy[2] = Zealot;
			possEnemy[3] = Hunter;
		}
		if (getLevel() == 8){
			possEnemy[0] = Elite;
			possEnemy[1] = Zealot;
			possEnemy[2] = Hunter;
		}
		return possEnemy;
	}
	
	
	// Number will be the level number to determine the number of enemies in the Enemies array
	// Level number
	public static int setEnemyArrayLength(){
		int enemLength = 0;
		if (getLevel() == 1 || getLevel() == 8)
			enemLength = 3;
		if (getLevel() == 2 || getLevel() == 7)
			enemLength = 4;
		if (getLevel() == 3 || getLevel() == 6)
			enemLength = 5;
		if (getLevel() == 4)
			enemLength = 6;
		if (getLevel() == 5)
			enemLength = 7;
		return enemLength;
	}
	
	
	// Set Enemies' Initial Position
	// Function will set this value
	public static Position setEnemyPosition() {
		
	Position EnemyPosition = DEFAULTPOSITION;
		int i = 0;
		int j = 0;
		int zone = (int) (Math.random() * 21);
		// if statements to set the x position
		// i is the basis for the column
		
		//Set i to 0
		if ( (zone >= 0 ) && (zone <= 2))
			i = 0;
		if( (zone >=3) && (zone <= 7))
			i = 1;
		if ( (zone >= 8 ) && (zone <= 12))
			i = 2;
		if( (zone >= 13) && (zone <= 17))
			i = 3;
		if ( (zone >= 18 ) && (zone <= 20))
			i = 4;
		
		// if statements to set the y position
		// j is the basis for the column
		if ( 				 (zone == 3)  || (zone == 8) || (zone == 13) )
			j = 0;
		if ( (zone == 0)  || (zone == 4) || (zone == 9) || (zone == 14) || (zone == 18) )
			j = 1;
		if ( (zone == 1)  || (zone == 5) || (zone == 10) || (zone == 15) || (zone == 19) )
			j = 2;
		if ( (zone == 2)  || (zone == 6) || (zone == 11) || (zone == 16) || (zone == 20) )
			j = 3;
		if ( 				 (zone == 7)  || (zone == 12) || (zone == 17) )
			j = 4;	
		
		boolean validplace = true;
		do{
			EnemyPosition = EnemPos(i,j);
			validplace = wallAvoidancePlacement(EnemyPosition, Walls);
		} while(validplace);
		return EnemyPosition;
	}
	
	//Helper Function 1 to Generate an Enemies' Start Position 
	public static Position EnemPos(int rowdet, int coldet){
		int baseX = setBase(rowdet);
		int baseY = setBase(coldet);
		double setX = Math.random() * 4;
		double setY = Math.random() * 4;
		return new Position((baseX + setX), (baseY + setY) );
	}
	
	// Helper Function 2 to Generate an Enemies' Start Position
	public static int setBase(int number){
		int returnNum = 0;
		if(number == 0)
			returnNum = 0;
		if (number == 1)
			returnNum = 4;
		if (number == 2)
			returnNum = 8;
		if (number == 3)
			returnNum = 12;
		if (number == 4)
			returnNum = 16;
		return returnNum;
	}
	
																				// RELIC INITIALIZATION FOR START OF GAME/LEVEL
	// Set the number of Relics that player has to get in the Level
	public static int setNumberOfRelics (){
		int numberRelics = 0;
		if (getLevel() <= 2)
			numberRelics = getLevel() +1;
		else
			numberRelics = (2 * getLevel() ) -1;
		return numberRelics;
	}
	
	
	// Set the relic list
	public static List<Relic> setRelicList(){
		List<Relic> relicList = new ArrayList <Relic>();
		Relic[] possRelic = new Relic[setRelicArrayLength()];
		possRelic = setRelicArray();
		
		
		// level is the level of the game
		for (int i =0; i< setNumberOfRelics(); i++){
			int relSelection = (int) (Math.random() * setRelicArrayLength() );
			relicList.add(possRelic[relSelection]);
		}
		return relicList;
	}
	
	
	// Logic: Will take levelnumber and determine which Relics to add
	// Will return the array 
	public static Relic[] setRelicArray(){
	
		// Defining the different Relics one can obtain
		Relic Virgil = new Relic("Virgil", 20, setRelicPosition(), false);
		Relic EllenAnders = new Relic("Ellen Anders", 35, setRelicPosition(), false);
		Relic JacobKeyes = new Relic("Jacob Keyes",40, setRelicPosition(), false);
		Relic MirandaKeyes = new Relic("Miranda Keyes", 45, setRelicPosition(), false);
		Relic Index = new Relic("Index", 50, setRelicPosition(), false);
		Relic GuiltySpark = new Relic("343 Guilty Spark", 55, setRelicPosition(), false);
		Relic JanusKey = new Relic("Janus Key", 60, setRelicPosition(), false);
		Relic Librarian = new Relic("Librarian",75, setRelicPosition(), false);
		Relic CatherineHalsey = new Relic("Catherine Halsey", 85, setRelicPosition(), false);
		Relic Cortana = new Relic("Cortana",95, setRelicPosition(), false);

		Relic[] possRelic = new Relic[setRelicArrayLength()];
		// Replace "relicValue" with the initial value of the relic
		if (getLevel() == 1){
			possRelic[0] = Virgil;
			possRelic[1] = EllenAnders;
		}
		if (getLevel() == 2){
			possRelic[0] = EllenAnders;
			possRelic[1] = JacobKeyes;
			possRelic[2] = MirandaKeyes;
		}
		if (getLevel() == 3){
			possRelic[0] = JacobKeyes;
			possRelic[1] = MirandaKeyes;
			possRelic[2] = Index;
		}
		if (getLevel() == 4){
			possRelic[0] = JacobKeyes;
			possRelic[1] = Index;
			possRelic[2] = GuiltySpark;
			possRelic[3] = JanusKey;
			possRelic[4] = Librarian;
		}
		if (getLevel() == 5){
			possRelic[0] = MirandaKeyes;
			possRelic[1] = Index;
			possRelic[2] = GuiltySpark;
			possRelic[3] = JanusKey;
			possRelic[4] = Librarian;
			possRelic[5] = CatherineHalsey;
		}
		if (getLevel() == 6){
			possRelic[0] = JacobKeyes;
			possRelic[1] = MirandaKeyes;
			possRelic[2] = Index;
			possRelic[3] = GuiltySpark;
			possRelic[4] = JanusKey;
			possRelic[5] = Librarian;
			possRelic[6] = Cortana;
		}
		if (getLevel() == 7){
			possRelic[0] = MirandaKeyes;
			possRelic[1] = GuiltySpark;
			possRelic[2] = JanusKey;
			possRelic[3] = Librarian;
			possRelic[4] = CatherineHalsey;
			possRelic[5] = Cortana;
		}
		if (getLevel() == 8){
			possRelic[0] = Index;
			possRelic[1] = GuiltySpark;
			possRelic[2] = JanusKey;
			possRelic[3] = Librarian;
			possRelic[4] = CatherineHalsey;
			possRelic[5] = Cortana;
		}
		return possRelic;
	}
	
	
	// Number will be the level number to determine the number of enemies in the Enemies array
	// Level number
	public static int setRelicArrayLength(){
		int relicLength = 0;
		// CODE HERE FOR SETTING THE RELIC ARRAY LENGTH
		if (getLevel() == 1 )
			relicLength = 2;
		if (getLevel() == 2 )
			relicLength = 3;
		if (getLevel() == 3 )
			relicLength = 4;
		if (getLevel() == 4 )
			relicLength = 5;
		if (getLevel() == 5 || getLevel() == 7 || getLevel() == 8 )
			relicLength = 6;
		if (getLevel() == 6 )
			relicLength = 7;
		
		return relicLength;
	}
	
	
	// Numbers returned are padded with an extra 1 in the least significant digit (the furthest left digit)
	public static int[] setValidRelicZones (int numberZones){
		int[] validZones = new int[numberZones];
		if (numberZones == 4){
			int rand = (int) (Math.random() * 5);
			// Next Level Zone is Zone 4
			if (rand == 0){
			validZones[0] = 12121;
			validZones[1] = 12221;
			validZones[2] = 12321;
			validZones[3] = 11212;
			//(1,1,1,1)
//			possNextLevelBound = 11111;
			}
			// Next Level Zone is Zone 6
			if (rand == 1){
				validZones[0] = 11121;
				validZones[1] = 12112;
				validZones[2] = 13112;
				validZones[3] = 12321;
				//(1,3,1,1)
//				possNextLevelBound =11311;
			}
			// Next Level Zone is Zone 10
			if (rand == 2){
				validZones[0] = 11112;
				validZones[1] = 12121;
				validZones[2] = 13212;
				validZones[3] = 11321;
				//(2,2,1,1)
//				possNextLevelBound = 12211;
			}
			// Next Level Zone is Zone 14
			if (rand == 3){
				validZones[0] = 11121;
				validZones[1] = 11221;
				validZones[2] = 11321;
				validZones[3] = 13212;
				//(3,1,1,1)
//				possNextLevelBound = 13111;
			}
			// Next Level Zone is Zone 16
			if (rand == 4){
				validZones[0] = 11112;
				validZones[1] = 12112;
				validZones[2] = 13112;
				validZones[3] = 11321;
				//(3,3,1,1)
//				possNextLevelBound = 13311;
			}
		}
		if (numberZones == 3){
			int rand = (int) (Math.random() * 4);
			// Next Level Zone is Zone 5
			if (rand == 0){
				validZones[0] = 11112;
				validZones[1] = 12112;
				validZones[2] = 12212;
				//(1,2,1,1)
//				possNextLevelBound = 11211;
			}
			// Next Level Zone is Zone 9
			if (rand == 1){
				validZones[0] = 11112;
				validZones[1] = 13112;
				validZones[2] = 12212;
				//(2,1,1,1)
//				possNextLevelBound = 12111;
			}
			// Next Level Zone is Zone 11
			if (rand == 2){
				validZones[0] = 12112;
				validZones[1] = 11212;
				validZones[2] = 13212;
				//(2,3,1,1)
//				possNextLevelBound = 12311;
			}
			// Next Level Zone is Zone 15
			if (rand == 2){
				validZones[0] = 12121;
				validZones[1] = 11221;
				validZones[2] = 12321;
				//(3,2,1,1)
//				possNextLevelBound = 13211;
			}
		}
//		int temp = possNextLevelBound;
//		int i = temp % 10;
//		temp /= 10;
//		int j = temp % 10;
//		temp /= 10;
//		int k = temp % 10;
//		temp /= 10;
//		int l = temp / 10;
//		
//		boolean valid = true;
//		do{
//			possNextLevel = relPos( l, k, j, i);
//			valid = !wallAvoidancePlacement(possNextLevel, Walls);
//		}
//		while (valid);
//		Next.setNextLevelLocation(possNextLevel);
		
		
		return validZones;
	}
	
	
	// Set the position of the relic
	// Numbers for possRelZone  are padded with an extra 1 in the least significant digit (the furthest left digit)
	public static Position setRelicPosition(){
		Position possRelicPosition = new Position(0,0);
		
		// Set Relic Zones
		int RZDet = 0;
		int random = (int) (Math.random() * 2);
		//Number of Valid Zones will be 4 
		// Next Level Zone is Even Zone Number
		if (random == 0)
			RZDet = 4;
		//Number of Valid Zones will be 3
		// Next Level Zone is Odd Zone Number
		else
			RZDet = 3;
		int relZoneSize = 4 + RZDet;
		int[] possRelZone = new int[relZoneSize];
		possRelZone[0] = 10211;
		possRelZone[1] = 12011;
		possRelZone[2] = 14211;
		possRelZone[3] = 12411;
		
		int[] possRelZoneUpdate = new int[RZDet];
		possRelZoneUpdate = setValidRelicZones(RZDet);
		System.arraycopy(possRelZoneUpdate, 0, possRelZone, 4, possRelZone.length);
		int relZoneSel = (int) (Math.random() * relZoneSize);
		
		int number = possRelZone[relZoneSel];
		int temp = number;
		int i = temp % 10;
		temp /= 10;
		int j = temp % 10;
		temp /= 10;
		int k = temp % 10;
		temp /= 10;
		int l = temp / 10;
		boolean valid = true;
		do{
			possRelicPosition = relPos( l, k, j, i);
			valid = wallAvoidancePlacement(possRelicPosition, Walls);
		}
		while (valid);
		return possRelicPosition;
	}
	
	
	// Helper Function to Generate a relic's Location (Position) 
	public static Position relPos (int xstart, int ystart, int xoffset, int yoffset){
		double x = xstart * 4;
		double y = ystart * 4;
		double xoff = xoffset * 4;
		double yoff = yoffset * 4;
		double xPos = x + (Math.random() * xoff);
		double yPos = y + (Math.random() * yoff);
		
		return new Position(xPos, yPos);
	}
	
																				// GAME/LEVEL UPDATE
	
//	// Move is Valid
//	public boolean isValidMove(){
//		boolean valid = true;
//		if(){
//		valid = 
//		//X and Y positions are within the game boundary of [20,20]
//		// For Enemies and Bullets, Movement is within the game boundary and not in safety Zones
//	//	if 
//		return valid;
//	}
//	
																				// PLAYER UPDATE
	// Set Player Spawn Location after Losing a Life
	public static void playerSpawn(){
	int spawnZone = (int) (Math.random() * 4);
	if (spawnZone == 0)
		getPlayer1().setComLocation(new Position (2,2) );
//		Player1.comLocation = new Position (2,2);
	else if (spawnZone == 1)
		getPlayer1().setComLocation(new Position (2, 18) );
//		Player1.comLocation = new Position (2, 18);
	else if (spawnZone == 2)
		getPlayer1().setComLocation(new Position (18, 2) );
//		Player1.comLocation = new Position (18, 2);
	else
		getPlayer1().setComLocation(new Position (18, 18) );
//		Player1.comLocation = new Position(18, 18);
	}
	
	//Updates the properties after a player has lost a life
	public static void updatePlayerAfterLossLife(){
		livesLeft -=1;	
		Player1.setHealth(PLAYERHEALTH);
		playerSpawn();
		setScore( (getScore()-100) );
	}
	
																				// UPDATE THE ENEMIES LIST
	/*
	 Steps to update the enemies
	 	1. Update their movement
	 		Check for collision with a wall
	 			if Collision, 
	 				Create a temp variable and set the direction randomly
	 				Make move and see if it is valid
	 					Next Move is valid
	 						Set direction to temp
	 						set opposite array
	 						update enemy position
	 					Next Move is Not valid
	 						Set direction to array
	 			if no Collision (else)
	 				Make move (update position)
	 	2. Update Enemies health
	 		Collision 
	 			Decrement the health of enemy
	 			Decrement the health of player
	 	3. Enemy Health
	 		Health < 0
	 		
	 */
	public static void updateEnemyList(){
		Iterator<Enemy> enemiter = getEnemies().iterator();
		while(enemiter.hasNext()){
			Enemy enemyCheck = enemiter.next();
			if (enemyCheck.getHealth() <= 0)
				enemiter.remove();
			}
		
		for( Enemy enemyelement: getEnemies() ){
			updateCombatantPosition(enemyelement);
		}
	}
	
	public static void updateCombatantPosition(Combatant aCombatant){
//		List<Wall> appropriateWalls = new ArrayList<Wall>();
//			int[] nextIntPoss = anEnemy.getNextDirection();
		Set<Integer> nextDirection = new HashSet<Integer>();
		nextDirection.addAll(Arrays.asList(0, 1, 2, 3));
		List<Wall> allWalls = new ArrayList<Wall>();
		int originalDir = aCombatant.getDirection();
//		appropriateWalls = validWalls(aCombatant, Walls);
		if(aCombatant instanceof Enemy){
			allWalls.addAll(getWalls());
			// Safety Zone 1 Player Entrances
			allWalls.add(new Wall (new Position(1.2,4), new Position(1.6,4)));
			allWalls.add(new Wall (new Position(4,.3), new Position(4,.7)));
			// Safety Zone 2 Player Entrances
			allWalls.add(new Wall (new Position(.25,16), new Position(.65,16)));
			allWalls.add(new Wall (new Position(4, 18.36), new Position(4,18.70)));
			//Safety Zone 3 Player Entrances
			allWalls.add(new Wall (new Position(16,2.4), new Position(16,2.8)));
			allWalls.add(new Wall (new Position(19.3,4), new Position(19.7,4)));
			//Sofety Zone 4 Player Entrances
			allWalls.add(new Wall (new Position(16,17.75), new Position(16,18.15)));
			allWalls.add(new Wall (new Position(17,16), new Position(17.4,16)));
		} else
			allWalls.addAll(getWalls());
		
		
//		for (Wall gameWall: appropriateWalls){
//		for (Wall gameWall : getWalls() ) {
		for (Wall gameWall : allWalls ) {
			for (int i = 0; i < 4; i++) {
				aCombatant.setDirection(i);
				boolean appWall = isWithinWallCollision(aCombatant, gameWall);
				if (appWall) {
					nextDirection.remove(i);
				}
			}
		}

		// if there was a collision with any wall in the original direction
		if (!nextDirection.contains(originalDir)) {
			if (aCombatant instanceof Enemy) {
				Integer[] validDirections = nextDirection.toArray(new Integer[nextDirection.size()]);
				aCombatant.setDirection(validDirections[(int) (Math.random() * validDirections.length)]);
			} else {
				// it is a player so set Player to none
				aCombatant.setDirection(Combatant.DIRECTION_NONE);
			}
		}
		else {
			aCombatant.setDirection(originalDir);
		}
		// Get original Position to test for collision with player
		Position originalPosition = aCombatant.getComLocation();
		
		aCombatant.setComLocation(aCombatant.updatePosition());
		
		Position updatePosition = aCombatant.getComLocation();
	
		if (aCombatant instanceof Enemy){
			// Collision check with a player and an enemy
			if( (originalPosition.getY() == updatePosition.getY() ) && (Player1.getComLocation().getY() == originalPosition.getY() ) ){
				if (aCombatant.getDirection() == Combatant.DIRECTION_LEFT){
					if ( ( Player1.getComLocation().getX() < originalPosition.getX() ) && updatePosition.getX() < Player1.getComLocation().getX() ){
						int playerDamageHealth = getPlayer1().getHealth() - setDamageDone(aCombatant.getName());
						getPlayer1().setHealth(playerDamageHealth);
						aCombatant.setHealth(aCombatant.getHealth() - 20);
					}
				}
				if (aCombatant.getDirection() == Combatant.DIRECTION_RIGHT){
					if ( (originalPosition.getX() <  Player1.getComLocation().getX() ) && Player1.getComLocation().getX() < updatePosition.getX() ){
						int playerDamageHealth = getPlayer1().getHealth() - setDamageDone(aCombatant.getName());
						getPlayer1().setHealth(playerDamageHealth);
						aCombatant.setHealth(aCombatant.getHealth() - 20);
					}
				}
			} else {
				if (aCombatant.getDirection() == Combatant.DIRECTION_DOWN){
					if ( ( originalPosition.getY() < Player1.getComLocation().getY() ) && Player1.getComLocation().getY() < updatePosition.getY() ){
						int playerDamageHealth = getPlayer1().getHealth() - setDamageDone(aCombatant.getName());
						getPlayer1().setHealth(playerDamageHealth);
						aCombatant.setHealth(aCombatant.getHealth() - 20);
					}
				}
				if (aCombatant.getDirection() == Combatant.DIRECTION_UP){
					if ( ( Player1.getComLocation().getY() < originalPosition.getY() ) && updatePosition.getY() < Player1.getComLocation().getY() ){
						int playerDamageHealth = getPlayer1().getHealth() - setDamageDone(aCombatant.getName());
						getPlayer1().setHealth(playerDamageHealth);
						aCombatant.setHealth(aCombatant.getHealth() - 20);
					}
				}
			}
		}
		
	}
	
	public static int setDamageDone(String comName){
		int bullSpeed = 0;
			if ( (comName == "GruntScout") || (comName == "GruntSniper") )
				bullSpeed = 10;
			if ( (comName == "JackalScout") || (comName == "JackalSniper") )
				bullSpeed = 15;
			if (comName == "Elite")
				bullSpeed = 25;
			if (comName == "Zealot")
				bullSpeed = PLAYERHEALTH;
			if (comName == "Hunter")
				bullSpeed = 40;
			
			return bullSpeed;
	}
	
																				// UPDATE THE RELIC LIST
		
		// Update the relicList
			//Check for player's location at a relic's location
			// Delete the relic from the relic list and decrement the relicsLeft counter by one
			// Update Score
	public static void updateRelicList(){
		double proximity = .01;
		Iterator<Relic> relicIter = Relics.iterator();
		while (relicIter.hasNext()) {
			Relic aRelic = relicIter.next();
			if ( (Math.abs(Player1.comLocation.getX() - aRelic.getRelicLocation().getX() ) <= proximity) &&   
				(Math.abs(Player1.comLocation.getY() - aRelic.getRelicLocation().getY() ) <= proximity) ) {
				setScore((getScore() + aRelic.getRelicValue() ) );
				setRelicsLeft(getRelicsLeft() - 1);
				relicIter.remove();
			}		
		}
	}
	
	
	
	
																				// SCORING METHODS
		
		// Set player Total Score
		// setBulletScore()+ setEnemyDamageScore() + setRelicScore() - setPlayerDamageScore()
//		public void setTotalScore(double number ){
//			this.score += number  ;
//		}
																				// ON TICK METHOD
	// Update Score
	// Update Player Position
	// Update Enemy Position
		public void onTick(){
			
			updateCombatantPosition(getPlayer1());
			updateEnemyList();
			updateRelicList();
			//Player Health Check
			if (getPlayer1().getHealth() <= 0)
				updatePlayerAfterLossLife();
			
			
			//End of Level (Relic number = 0)
			if(getRelicsLeft() == 0){
				nextLevel();
			}
		
			getPlayer1().setDirection(Combatant.DIRECTION_NONE);
		}
		
		
																				// NEXT LEVEL FUNCTIONS
		/**
	     * Updates to change to the next level. In Snake this does the
	     * following:
	     * 
	     * 1. Increase level number 
	     * 2. Clear Level 
	     * 3. Generate Level Pieces 
	     */
	    public static void nextLevel() {
	        setLevel(getLevel() + 1);
	        nextLevelInitialization();
	    }
	
																				// COLLISION DETECTION / COMBATANT MOVEMENT 

	// Direct Wall Placement check
	//Boolean to determine if wall collision for placement of enemy is valid
	// Returns True => There is a wall Placement Problem
	// Returns False => There is no wall Placement Problems
	public static boolean wallAvoidancePlacement(Position itemPosition, List<Wall> listWalls){
		boolean valid = false;
		
			for( Wall lWalls: listWalls) {
				if (valid)
					break;
				else {
				// Check for Vertical Walls
				if (lWalls.getStart().getX() == lWalls.getEnd().getX() ){
					if (itemPosition.getX() == lWalls.getStart().getX() )
						valid = ( (lWalls.getStart().getY() < itemPosition.getY()) && ( itemPosition.getY() < lWalls.getEnd().getY() )  );	
				}
			
				// Check for Horizontal Walls		
				if (lWalls.getStart().getY() == lWalls.getEnd().getY() ){
					if (itemPosition.getY() == lWalls.getStart().getY() )
						valid = ( (lWalls.getStart().getX() < itemPosition.getX()) && ( itemPosition.getX() < lWalls.getEnd().getX() )  );
				}
			}
		}
		return valid;
	}
				
		// Determines if a wall is within contact with a combatant
		// Returns True => Wall is within the combatant
		// Returns False => Wall is not within the combatant
		public static boolean isWithinWallCollision(Combatant comb, Wall wallCheck){
			boolean within = false;
			//if (isVerticalWall(wallCheck)) {
				if (isVerticalWall(wallCheck) && (comb.getDirection() == 2) )
				within = ( ( (comb.getComLocation().getX() - wallCheck.getStart().getX()  < THRESHOLD) && (comb.getComLocation().getX() - wallCheck.getStart().getX() > 0) ) && 
						( (wallCheck.getStart().getY() <= comb.getComLocation().getY() ) && ( comb.getComLocation().getY() <= wallCheck.getEnd().getY() ) ) );
				else if (isVerticalWall(wallCheck) && (comb.getDirection() == 3) )
				within = ( ( (wallCheck.getStart().getX() - comb.getComLocation().getX()  < THRESHOLD) && (wallCheck.getStart().getX() - comb.getComLocation().getX() > 0) ) && 
						( (wallCheck.getStart().getY() <= comb.getComLocation().getY() ) && ( comb.getComLocation().getY() <= wallCheck.getEnd().getY() ) ) );
	//	} else {
				else if (!isVerticalWall(wallCheck) && (comb.getDirection() == 0) )
				within = (( (wallCheck.getStart().getX() <= comb.getComLocation().getX() ) && ( comb.getComLocation().getX() <= wallCheck.getEnd().getX() ) ) &&
						( (comb.getComLocation().getY() - wallCheck.getStart().getY()  < THRESHOLD) && (comb.getComLocation().getY() - wallCheck.getStart().getY() > 0) ) );
				else if (!isVerticalWall(wallCheck) && (comb.getDirection() == 1)	)
				within = ( ( (wallCheck.getStart().getX() <= comb.getComLocation().getX() ) && ( comb.getComLocation().getX() <= wallCheck.getEnd().getX() ) ) &&  
						( (wallCheck.getStart().getY() - comb.getComLocation().getY()   < THRESHOLD) && (wallCheck.getStart().getY() - comb.getComLocation().getY() > 0) ) );
				else within = false;
		return within;
	}
		
		// Determines if a combatant's movement is vertical or horizontal
		// Returns True => Vertical Movement
		// Returns False => Horizontal Movement
		public static boolean isVerticalMovement(Combatant combat){
		return ( ( combat.getDirection() ==0) || (combat.getDirection() == 1));
	}
		
		//Boolean to determine if wall is Horizontal or Vertical
		// Returns True => Vertical Wall
		// Returns False => Horizontal Wall
	public static boolean isVerticalWall(Wall aWall){
		return (aWall.getStart().getX() == aWall.getEnd().getX());
	}
	
	
	// Start Game
	// This will need to be adjusted based on the properties of the Constructor
	public static ReclaimandEvadeGame startGame(){
		// Set the Player
		setPlayer1(setPlayer());
		
		// Set the Level Number to 1
		setLevel(1);
		
		// Set the number of Enemies in a level
		setNumberLevelEnemies(setEnemyTotal());
		
		// Set the Lives Left
		setLivesLeft(TOTALLIVES);
		
		// Set Enemy List
		List<Enemy> Enemyinitial = setEnemyList();
		
		// Set the Game Walls
		List<Wall> Gamewalls = new ArrayList<Wall>();
		Gamewalls.addAll(Levels.gameBoardInit());
		Gamewalls.addAll(levelWallGenerator() );
		
		//Set the Level Relics
		List<Relic> levelRelics = new ArrayList<Relic>();
		levelRelics.addAll(setRelicList());
		
		// Set the relics left integer
		setRelicsLeft(levelRelics.size() );
				
		return new ReclaimandEvadeGame(0,getLivesLeft(), getPlayer1(), getLevel(),
				 getRelicsLeft(),levelRelics,getNumberLevelEnemies(),Enemyinitial, Gamewalls );
	}
	
	
	// Check to see if the game is over
	//Gome over if Player correctly navigates all levels or the Player's Health is less than 0 & lives left ==0
	// Function to determine if the Game is over
//	(  && (Player1.comLocation.getY() == Next.getNextLevelLocation().getY() )		&& (Player1.comLocation.getX() == Next.getNextLevelLocation().getX() ))
	public boolean isEnd() {
		return ( (Player1.health <= 0 ) && livesLeft == 0) || ( ( level == 8 ) && (relicsLeft == 0)  );
//		return false;
	}
	
	
	
	public static void main(String[] args) {
		// Function for Enemy Check
//		Enemy JackalSniper = new Enemy("JackalSniper", new Position(11.2,7.7), JACKALHEALTH, .002, "Beam Rifle", 2, false, 35);
//		
//		System.out.println("Before Functions: The cool off Time of Jackal Sniper is: " + JackalSniper.getCoolOffTime() );
//		System.out.println("Before Functions: The Max cool off Time of Jackal Sniper is: " + JackalSniper.getCoolOffMax());
//		System.out.println("Before Functions: The Position of Jackal Sniper is: " + JackalSniper.getComLocation() );
//		
//		JackalSniper.setComLocation(JackalSniper.updatePosition()) ;
//		JackalSniper.setCoolOffTime();
//		
//		System.out.println("After Functions: The cool off Time of Jackal Sniper is: " + JackalSniper.getCoolOffTime() );
//		System.out.println("After Functions: The Max cool off Time of Jackal Sniper is: " + JackalSniper.getCoolOffMax());
//		System.out.println("After Functions: The Position of Jackal Sniper is: " + JackalSniper.getComLocation() );
//		
		// Function for relic Placement Test
		
		List <Wall>  test = new ArrayList <Wall>();
		
		// Wall from (11.5, 10) to (12.5,10)
		test.add(new Wall(new Position(11.5, 10), new Position(12.5,10) ) );
					
		// Wall from (12.5, 10) to (12.5,14)
		test.add(new Wall(new Position(12.5,10), new Position(12.5,14) ) );
					
		// Wall from (12.5, 14) to (14.3,14)
		test.add(new Wall(new Position(12.5,14), new Position(14.3,14) ) );
		
		List<Enemy> enemyList = new ArrayList<Enemy>();
		
		enemyList.add(new Enemy("JackalSniper", new Position(11.2,7.7), JACKALHEALTH, .02, "Beam Rifle", 2, false, 35)) ;
		
		enemyList.add(new Enemy("GruntSniper", new Position(12.49,12.7), JACKALHEALTH, .05, "Needler", 3, false, 35) );
		
		enemyList.add(new Enemy("Jackal", new Position(13.2,13), JACKALHEALTH, .04, "Beam Rifle", 1, false, 35) );

		enemyList.add(new Enemy("Zealot", new Position(12,10.05), JACKALHEALTH, .07, "Beam Rifle", 0, false, 35) );
		
		enemyList.add(new Enemy("Grunt", new Position(13.2,13), -10, .04, "Beam Rifle", 1, false, 35) );
		
	//	Enemy JackalSniper = new Enemy("JackalSniper", new Position(11.2,7.7), JACKALHEALTH, .002, "Beam Rifle", 2, false, 35);
		
//		Enemy JackalSniper = new Enemy("JackalSniper", new Position(11.2,7.7), JACKALHEALTH, .002, "Beam Rifle", 2, false, 35);
		
		Enemy JackalSnipe = new Enemy("JackalSniper", new Position(11.2,7.7), JACKALHEALTH, .02, "Beam Rifle", 2, false, 35) ;
		
		Enemy GruntSnipe = new Enemy("GruntSniper", new Position(12.49,12.7), JACKALHEALTH, .05, "Needler", 3, false, 35) ;
		
		Enemy Jackal = new Enemy("Jackal", new Position(13.2,13), JACKALHEALTH, .04, "Beam Rifle", 1, false, 35) ;
		
		
		Player aPlayerCollision = new Player("Spartan", new Position(11.19,7.7), 100, .5, "Spartan Laser", -1, false, 1.25);
		
		Player aPlayerNoCollision = new Player("Spartan", new Position(13,7.7), 100, .5, "Spartan Laser", -1, false, 1.25);
		
		List<Relic> reliclist = new ArrayList<Relic>();
		
		reliclist.add(new Relic("Virgil", 20, new Position(5,4), false));
		
		reliclist.add( new Relic("343 Guilty Spark", 55, new Position(15, 13), false));
		
		reliclist.add( new Relic("Catherine Halsey", 85, new Position(14.5, 16), false));
		reliclist.add( new Relic("Cortana",95, new Position(12, 17), false));
		
//		NextLevel theNext = new NextLevel(false, new Position(5.6,7.2)));
		
		// null number of Enemys in Level is 7
		//null, 3, null, null,theNext
		
		
//		ReclaimandEvadeGame game = new ReclaimandEvadeGame(0,3, aPlayerCollision,2,15,reliclist, 6,enemyList,test);		
		
		ReclaimandEvadeGame game = startGame();
		game.addGameListener(new ConsoleListener());
		game.addGameListener(new ReclaimandEvadeAI(game));
		game.start();
		
		//ENEMY AND PLAYER COLLISION DETECTION
		
//		for(Enemy gameEnemy: game.Enemies){
//			System.out.println("Before Enemy Update: The Position of enemy " +  gameEnemy.getName() + " is " + gameEnemy.getComLocation() );
//			System.out.println("Before Enemy Update: The Health of enemy " + gameEnemy.getName() + " is " + gameEnemy.getHealth() );
//			}
//			
////			System.out.println("Before Enemy Update: The Direction of enemy " + gameEnemy.getName() + " is " + gameEnemy.getDirection() );
////			System.out.println("Before Enemy Update: The Next Direction of enemy " + gameEnemy.getName() + " is " + gameEnemy.getNextDirection()[0] + " " +
////					    gameEnemy.getNextDirection()[1] + " " + gameEnemy.getNextDirection()[2] + "." );
//		
//		System.out.println("Before Enemy Update: The Health of the Player " + game.Player1.getName() + " is " + game.Player1.getHealth() );
//		System.out.println("Before Enemy Update: The Position of the Player " +  game.Player1.getName() + " is " + game.Player1.getComLocation() + "\n" );
//		
//		
//		game.onTick();
//		//game.updateEnemyList();
//		
//		for(Enemy gameEnemy: game.Enemies){
//			System.out.println("After Enemy Update: The Position of enemy " + gameEnemy.getName() + " is " + gameEnemy.getComLocation() );
//			System.out.println("After Enemy Update: The Health of enemy " + gameEnemy.getName() + " is " + gameEnemy.getHealth() );
//			}
//		
//		System.out.println("After Enemy Update: The Health of the Player " + game.Player1.getName() + " is " + game.Player1.getHealth() );
//		System.out.println("After Enemy Update: The Position of the Player " + game.Player1.getName() + " is " +  game.Player1.getComLocation() );
//			
////			System.out.println("After Enemy Update: The Direction of enemy " + gameEnemy.getName() + " is " + gameEnemy.getDirection() );
////			System.out.println("After Enemy Update: The Next Direction of enemy " + gameEnemy.getName() + " is " + gameEnemy.getNextDirection()[0] + " " +
////					 + gameEnemy.getNextDirection()[1] + " " + gameEnemy.getNextDirection()[2] + "." );	
//	}

		
//		  game.addGameListener(new ConsoleListener());
		
	      
	}
	
	private ReclaimandEvadeGame() {
		
	}
	public static ReclaimandEvadeGame makeStartGame() {
		ReclaimandEvadeGame g = new ReclaimandEvadeGame();
		return g.startGame();
	}
	
    public boolean isWall(Position p) {
        return wallsContain(Walls, p);
    }
    
    public static boolean wallsContain(List<Wall> walls, Position p) {
        for (Wall wall : walls) {
            if (wall.contains(p)) {
                return true;
            }
        }
        return false;
    }
	
	@Override
	public String toString() {
		return "ReclaimandEvadeGame [score=" + score + ", livesLeft="
				+ livesLeft + ", Player1=" + Player1 + ", level=" + level
				+ ", relicsLeft=" + relicsLeft + ", Relics=" + Relics
				+ ", numberLevelEnemies=" + numberLevelEnemies + ", Enemies="
				+ Enemies + ", Walls=" + Walls + "]";
	}
}