package edu.udel.dlaw.ReclaimandEvade;

public class Score {
	private double relicScore;
	private double damagedEnemyScore;
	private double damagedPlayerScore;
	private int bulletsRemainingScore;
	private double totalScore;
//	private int timeScore;
	
	//Global Constants Can change them later on
//	final static int BULLETSCORE = 4;
	final static int PLAYERDAMAGE = 5;
	
	
	public Score (double relScore, double enemyDamageScore, double playerDamageScore, int bulletRemainScore, double total){
		this.relicScore = relScore;
		this.damagedEnemyScore = enemyDamageScore;
		this.damagedPlayerScore = playerDamageScore;
		this.bulletsRemainingScore = bulletRemainScore;
		this.totalScore = total;
	}

	// Getters and Setters for relicScore, damagedEnemyScore, damagedPlayerScore and bulletsRemainingScore
		// timeScore will also be Getter and Setter, if We implement a timing mechanism
	
	// Set Player Damage Score
	// Setter: There would be a function that determines this
	// Logic for the function that sets this: (Player.getHealth() * Player.maxHealth) * PLAYERDAMAGE
	public void setPlayerDamageScore(double pDamageScore){
		this.damagedPlayerScore = pDamageScore ; 
	}
	
	// Set Bullet Remaining Score
	// Setter: There would be a function that determines this
	// Logic for the function that sets this:( bulletsRemain * BULLETSCORE)
	public void setBulletRemainScore(int bulletScore){
		this.bulletsRemainingScore = bulletScore;
	}
	
	// Set Enemy Damage Score
	public void setEnemyDamageScore(double enemyhealthScore){
		this.damagedEnemyScore = enemyhealthScore;
	}
	
	// Set the Total Score (Scores that the Player can see and those the player can not see)
	public void setTotalScore(double score){
		this.totalScore = score;
	}
	
	// Set the Visible Score (Scores that the Player can see)
	public int setVisibleScore(){
		int visibleScore = 0;
		
		return visibleScore;
	}
	
	
	
	
	
//  Create the toString Method once all the properties have been Decided
//	@Override
//	public String toString() {
//		return "Score [relicScore=" + relicScore + ", damagedEnemyScore="
//				+ damagedEnemyScore + ", damagedPlayerScore="
//				+ damagedPlayerScore + ", bulletsRemainingScore="
//				+ bulletsRemainingScore + ", timeScore=" + timeScore + "]";
//	}
}
