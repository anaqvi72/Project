

import java.util.Scanner;
public class RPSDriver {
	Scanner jarvis;
	private String[] plays = {"rock", "paper", "scissor"};
	private int choice;
	public static void main(String[] args) {
		RPSDriver aa = new RPSDriver();
		Scanner jarvis = new Scanner(System.in);
		RPS ab = new RPS();
		String answer;
		do {
			int userChoice = aa.getPlayerChoice();
			int compChoice = ab.randomComputerChoice();
			if(compChoice == ab.ROCK) {
				System.out.println("The Computer picked Rock.");
			}
			else if(compChoice == ab.PAPER) {
				System.out.println("The Computer picked Paper. ");
			}
			else {
				System.out.println("The Computer picked Scissor. ");
			}
			int state = ab.determineWin(userChoice);
			if(state == 0) {
				System.out.println("It is a tie. ");
			}
			else if(state == 1) {
				System.out.println("The user has won. ");
			}
			else {
				System.out.println("The user lost. ");
			}
			System.out.println("Do you want to play again yes or no ? ");
			answer = jarvis.nextLine();
		}while(answer.toUpperCase().equals("YES"));
		
		
	}
	
	public int getPlayerChoice() {
		jarvis = new Scanner(System.in);
		System.out.println("Please enter the number choice: rock = 1, paper = 2, or scissor = 3");
		choice = jarvis.nextInt();
		while(choice < 1 || choice >3) {
			System.out.println("Invalid number choice enterd");
			System.out.println("Please enter the number choice: rock = 1, paper = 2, or scissor = 3");
			choice = jarvis.nextInt();
		}
		if(choice == 1) {
			return RPS.ROCK;
			//rock
		}
		else if(choice == 2) {
			return RPS.PAPER;
			//paper
		}
		else {
			return RPS.SCISSOR;
			//scissor
		}
		
	}
	
	
}
