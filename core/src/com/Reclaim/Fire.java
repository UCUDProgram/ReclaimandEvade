package com.Reclaim;

//import edu.udel.jatlas.gameframework.Action;

public class Fire {
	private boolean fired;
	
	public Fire (boolean fire){
		this.fired = fire;
	}
	
	
	public boolean isValid(ReclaimandEvadeGame state) {
        return true;
 }
 
 public void update(ReclaimandEvadeGame game){
	 
 }


public boolean isFired() {
	return fired;
}


@Override
public String toString() {
	return "Fire [fired=" + fired + "]";
}
 
 
	
}
