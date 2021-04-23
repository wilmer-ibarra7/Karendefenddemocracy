package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
	// This code runs well
	public void run() {
		while (frontIsClear() ) {
			move();
			checkMiddleBeeper();
			cleanExtraBeeper();
			move();
			
		}				
	}
	private void checkMiddleBeeper()  {
		if (beepersPresent()) {
			move();
			move();
			
		}
	}
	private void cleanExtraBeeper() {
		if (noBeepersPresent() ) {
			cleanBeepersSouth();
			cleanBeepersNorth();
		}
	}
	private void cleanBeepersSouth() {
		turnRight();
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
	}
	private void cleanBeepersNorth() {
		move ();
		if (frontIsClear()) {
			move();
		}
		while (beepersPresent() ) {
			pickBeeper();
			
		}
		turnAround();
		move();
		turnLeft();
		}
	}
