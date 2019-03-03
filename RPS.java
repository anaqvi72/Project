
import java.util.Random;

public class RPS {
	private int compchoice;
	private Random rnd = new Random();
	public static final int ROCK = 0;
	public static final int PAPER = 1;
	public static final int SCISSOR = 2;
	//constant needed in this class 
	public int randomComputerChoice() {
		compchoice = rnd.nextInt(3);
		return compchoice;
	}
	public int determineWin(int playerChoice) {
		RPSDriver ab = new RPSDriver();
		RPS cc = new RPS();
		if(playerChoice == compchoice) {
			
			return 0;
		}
		else if(playerChoice == ROCK &&  compchoice == PAPER) {
			
			return -1;
		}
		else if(playerChoice == ROCK &&  compchoice == SCISSOR) {
			
			return 1;
		}
		else if(playerChoice == PAPER && compchoice == ROCK) {
			
			return 1;
		}
		else if(playerChoice == PAPER &&  compchoice == SCISSOR) {
			
			return -1;
		}
		else if(playerChoice == SCISSOR &&  compchoice == ROCK) {
			
			return 1;
		}
		else  {
			
			return -1;
		}
	}

}
