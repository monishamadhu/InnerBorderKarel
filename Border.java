package week1.borderKarel;

import stanford.karel.*;
public class Border extends SuperKarel {
	public void run() {
		turnLeft();
		move();
		turnRight();
		move();
		for(int i=0;i<4;i++) {
			putBeeperBorder();
		}		
	}
	private void putBeeperBorder() {
		while(frontIsClear()) {
			move();
			putBeeper();
			
		}
		pickBeeper();
		turnAround();
		move();
		turnRight();
	}
}
	

	

