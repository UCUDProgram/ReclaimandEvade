package edu.udel.dlaw.ReclaimandEvade;
import edu.udel.jatlas.gameframework.Action;
//import edu.udel.jatlas.snake.SnakeGame;


public class Movement implements Action<ReclaimandEvadeGame>{
	private int direction;
	
	public Movement (int direct){
		this.direction = direct;
	}
	
	 public boolean isValid(ReclaimandEvadeGame state) {
	        return true;
	 }
	 
	 public void update(ReclaimandEvadeGame game){
		 
	 }

	public int getDirection() {
		return direction;
	}

	@Override
	public String toString() {
		return "Movement [direction=" + direction + "]";
	}
	 
	 
	
}

