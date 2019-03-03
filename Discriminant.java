import java.util.Scanner;

public class Discriminant {
	private int a;
	private int b;
	private int c;
	
	Scanner jarvis;
	
	public static void main(String[] args) {
		Discriminant dis = new Discriminant();
		dis.jarvis = new Scanner(System.in);
		dis.getCoeficcient();
		int answer = dis.discrimCalc(dis.a, dis.b, dis.c);
		int sol = dis.discrim(answer);
		dis.printSolution(sol);
	}
	
	public void getCoeficcient() {
		System.out.println("What is the coeficcient a in the equation ?");
		a = jarvis.nextInt();
		System.out.println("What is the coeficcient b in the equation? ");
		b = jarvis.nextInt();
		System.out.println("What is the cofficcient c in the equation? ");
		c = jarvis.nextInt();
		
		}
	public int discrimCalc(int a, int b, int c) {
		return (int) (Math.pow(b, 2) - (4*a*c));
		
	}
	public int discrim(int solution) {
		if(solution > 0) {
			return 2;
		}
		else if(solution == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		
		}
	}
	public void printSolution(int printSol) {
		if(printSol == 2) {
			System.out.println("You have two solution. ");
		}
		else if(printSol == 1) {
			System.out.println("You have one solution. ");
		}
		else {
			System.out.println("You have no real solution.");
		}
		
	}

}
