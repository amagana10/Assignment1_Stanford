import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {
		//runs the karel program until it hits a wall
		while(frontIsClear()) {
			move();
			//algorithm for checking vote
			
			/*checks if beeper is in middle
			 * 
			 * if not then clean vote then skip to next square
			 * if yes then skip to next square
			 */
			if(!beepersPresent()) {
				cleanVote();
			}
			move();
			}
		
	}

	private void cleanVote() {
		// algorithm for cleaning vote
		cleanTop();
		cleanBottom();
		
	}

	private void cleanBottom() {
		// checks the bottom voter box and removes any beepers
		turnRight();
		move();
		while(beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		turnRight();
	}

	private void cleanTop() {
		// checks the top voter box and removes any beepers
		turnLeft();
		move();
		while(beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		turnLeft();
		}
	
		
}
