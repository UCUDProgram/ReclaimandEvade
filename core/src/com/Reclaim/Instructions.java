package com.Reclaim;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;


/*
 * REDO THIS CLASS BASED ON THE GAME AND WHAT THE GAMER WILL SEE AND BE ABLE TO DO 
 */


public class Instructions implements Screen, InputProcessor, ApplicationListener {
	private ReclaimGame game;
	private SpriteBatch batch;
	private boolean pageOne,pageTwo, pageThree, pageFour;
	private String instruction;
	private Texture pOne,pTwo,pThree,pFour;
	private int pageCounter;
	private BitmapFont font;
	private float screenHeight, screenWidth;
	private boolean touchInstr,mouseInstr;
	private Skin skin;
	private float scaleX, scaleY;
	private Table table;
	
	public Instructions(ReclaimGame amGame){
		this.game = amGame;
	}
	
	public void create(){
		batch = new SpriteBatch();
		skin = new Skin (Gdx.files.internal("uiskin.json"));
		instruction = "Click to see the next instruction.";
		font = new BitmapFont();
		booleanInitial();
		pageCounter = 0;
		screenHeight = Gdx.graphics.getHeight(); 
		screenWidth = Gdx.graphics.getWidth();
		scaleX = screenWidth/640;
		scaleY = screenHeight/480;
		table = new Table(skin);
		Gdx.input.setInputProcessor(this);
	}

	public void booleanInitial(){
		pageOne = true;
		pageTwo = false;
		pageThree = false;
		pageFour = false;
	}
	
	public void pageTwoInstruct(){
		pageOne = false;
		pageTwo = true;
		pageThree = false;
		pageFour = false;	
	}
	
	public void pageThreeInstruct(){
		pageOne = false;
		pageTwo = false;
		pageThree = true;
		pageFour = false;
	}
	
	public void pageFourInstruct(){
		pageOne = false;
		pageTwo = false;
		pageThree = false;
		pageFour = true;
	}
	
	public void updatePageBooleans(int current){
	if (current == 0)
			pageTwoInstruct();
	if (current == 1)
			pageThreeInstruct();
	if (current == 2)
			pageFourInstruct();
	}
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		batch.begin();
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if(pageOne){
			instruction = "Page One Instructions";
//			System.out.println("Page One Instructions shown");
		}
		
		else if(pageTwo){
			instruction = "Page Two Instructions";
//			System.out.println("Page Two Instructions shown");
		}
		
		else if(pageThree){
			instruction = "Page Three Instructions";
//			System.out.println("Page Three Instructions shown");
		}

		else {
			instruction = "Page Four Instructions";
//			System.out.println("Page Four Instructions shown");
		}
		font.draw(batch,instruction, screenWidth / 3, screenHeight -50);
		
		batch.end();
	}

//	public void addChoiceButton(){
//		
//		
//		final TextButton mouseButton = new TextButton("Mouse Instructions",skin);
//		mouseButton.setName("Mouse Instructions");
//		table.add(mouseButton).width(mouseButton.getWidth()*scaleX).height(mouseButton.getHeight()*scaleY);
//		table.row();
//		mouseButton.addListener(new ClickListener(){
////			@Override
//			public void clicked(InputEvent event, float x, float y) {
//				mouseInstr = true;
//				mouseButton.setVisible(false);
//				touchButton.setVisible(false);
//			}
//		});
//		
//		final TextButton touchButton = new TextButton("Touch Instructions",skin);
//		touchButton.setName("Touch Instructions");
//		table.add(touchButton).width(touchButton.getWidth()*scaleX).height(touchButton.getHeight()*scaleY);
//		table.row();
//		touchButton.addListener(new ClickListener(){
////			@Override
//			public void clicked(InputEvent event, float x, float y) {
//				touchInstr = true;
//				touchButton.setVisible(false);
//				mouseButton.setVisible(false);
//			}
//		});
//		
//		
//		
//		}
	
	
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
//		if (pageOne){
//			pageTwoInstruct();
//		} 
//		if (pageTwo){
//			pageThreeInstruct();
//		} 
//		if (pageThree){
//			pageFourInstruct();
//		} 
		if (pageFour){
			game.switchScreens(2);
			} 
		
		updatePageBooleans(pageCounter);
		pageCounter++;
		
		
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
//		if (pageOne){
//			pageTwoInstruct();
//		} 
//		if (pageTwo){
//			pageThreeInstruct();
//		} 
//		if (pageThree){
//			pageFourInstruct();
//		} 
		
		if (pageFour){
			game.switchScreens(2);
		} 
		
		updatePageBooleans(pageCounter);
		pageCounter++;
		
		
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
	
	
	
	
}
