/** Class: CourseGrade
 * @author abaza
 * @version 1.0
 * Course : ITEC 2140 Spring 2018
 * Written: March  18, 2018
 * 
 * This class - gets the bowling average for the each player they have five games.
 */
import java.util.Scanner;

public class CourseGrade {
	private Scanner jarvis;
	
	public static void main(String[] args){
		CourseGrade ic7 = new CourseGrade();
		
		//created an object
		ic7.jarvis = new Scanner(System.in);
		
		String answer;
		do {
			// creating instances and invoking the methods
		String prog = ic7.getGrade("Programming Fundamental");
		String engl = ic7.getGrade("English 1101");
		String math = ic7.getGrade("Math 1113");
		String hist = ic7.getGrade("History 2112");
		
		int pointProg = ic7.getPoints(prog);
		int pointEngl = ic7.getPoints(engl);
		int pointMath = ic7.getPoints(math);
		int pointHist = ic7.getPoints(hist);
		// formula for calculating the GPA
		double gpaCalc = ((pointProg *4 + pointEngl *3 + pointMath * 4 + pointHist *3) / (4.0+3+4+3));
		System.out.printf("GPA is %.2f\n", gpaCalc);
		//if the person says no the program  will stop otherwise it'll keep running 
		System.out.println("Do you want to enter more grades? (Y/N)");
		
		answer = ic7.jarvis.nextLine().toUpperCase();
		}while(answer.equals("Yes")|| answer.equals("Y")) ;
		
	}
	
	private String getGrade(String course){
		// method for grades in letter
		String grade = "";
		do {
			System.out.println("Please enter the grade for " + course);
			grade = jarvis.nextLine().toUpperCase();
			
		}while(!(grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) );
		//only one return type
		return grade;
	}
	
	private int getPoints(String grade) {
		int pts;
		// this method converts the letter grades into numbers.
		if (grade.equals("A")) {
		   pts = 4;
		}
		else if (grade.equals("B")) {
			pts = 3;
		}
		else if (grade.equals("C")) {
			pts = 2;
		}
		else if (grade.equals("D")) {
			pts = 1;
		}
		else {
			pts = 0;
		}
		
		// returns the points
		return pts;
	}
}
