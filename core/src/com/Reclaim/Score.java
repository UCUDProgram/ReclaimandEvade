package com.Reclaim;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;

public class Score implements Screen, InputProcessor, ApplicationListener {
	private ReclaimGame rGame;
	
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

	
	public Score (ReclaimGame game){
		rGame = game;
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
	
	
	
	
	
	
	
	
	
	public void create(){
		
	}
	
	@Override
	public void render(float delta) {
		
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		rGame.switchScreens(2);
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
//		dispose();
		rGame.switchScreens(2);
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
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
