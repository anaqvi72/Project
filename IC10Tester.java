//UI class with interaction
import java.util.Scanner;
/** Class: IC10
 * @author abaza
 * @version 1.0
 * Course : ITEC 2140 Spring 2018
 * Written: April  18, 2018
 * 
 * This class - gets the bowling average for the each player they have five games.
 */


public class IC10Tester {
	
	public static void main(String[] args) {
		IC10 cc;
		
		Scanner jarvis = new Scanner(System.in);
		String[] ca;
		IC10[] arr = new IC10[3];
		for(int a = 0; a < 3; a++) {
			cc = new IC10();
			ca = new String [4];
			//made an array of ca  with 4 elements
			//every 3 time in this loop its making three new object
			System.out.println("Please enter the student's name");
			cc.setName(jarvis.nextLine());
			if(cc.getName().isEmpty()) {
				break;
			}
			else {
			for (int i = 0; i <= 3; i++) {
					System.out.println("Please enter " + cc.getName() + " course number " + (i+1));
					ca[i] = jarvis.nextLine();
			}
				cc.setCourses(ca);	
				arr[a] = cc;
				//stores the object in another object.
				
			}
			}
		
		int l = 0;
		while(l < 3) {
			if(arr[l] != null) {
				System.out.println(arr[l]);		
			}
			else {
				System.out.println("");
			}
			l++;
		}
	}
}


		
	


