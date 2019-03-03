//Business class with no interaction 
/** Class: IC10
 * @author abaza
 * @version 1.0
 * Course : ITEC 2140 Spring 2018
 * Written: April  18, 2018
 * 
 * This class - gets the bowling average for the each player they have five games.
 */

public class IC10 {
	private String name;
	private String[] courses;
	// Two variable one string and array of that handles courses.
	
	//two methods created for getName and setName
	//getName is a return type where setName is not. setName stores it.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//These methods are the same getCourses and setCourses
	// getCourses return courses
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	//this method set courses
	public String toString() {
		return  name + " " + courses[0] +  " " +  courses[1] +  " " + courses[2] + " " + courses[3];
	}
	// list out the name and courses in order.
	 
}

	

	

