/*  Jesus Manuel Rodriguez Castro
    ITC115 Winter 2020
    2/09/2020
  Write a method called printGpa 
*/

/* Write a method called printGpa that accepts a Scanner
for the console as a parameter and calculates a student's grade point average. 
The user will type a line of input containing the student's name, then a number
that represents the number of scores, followed by that many integer scores.Here are two examples dialogue:

Enter a student record: Maria 5 72 91 84 89 78
Maria's grade is 82.8

Enter a student record: Jordan 4 86 71 62 90
Jordan's grade is 72.25*/

import java.util.*;
public class Gpa {
	 public static void main(String[] args){
	        printGpa();  // Call the method printGpa
	    }
	    public static void printGpa(){
	    	System.out.print("This program will give you your grade.");
	    	System.out.println();
	        Scanner console = new Scanner(System.in); // Call to library so the user can enter an input. 
	        
	        System.out.print("Enter your name: ");
	        String name = console.nextLine();		  //The input by the user is saved in the variable name
	        										  // It asks for the user name
	        System.out.println();
	        
	        System.out.print("Enter number of grades that you have to calculate: ");
	        int scores = console.nextInt();				//It asks for the amount of grades that the user wants to enter
	        int grade = 0;								
	        for (int i = 1 ; i <= scores; i++) {	//Loop to enter the grades 
	            System.out.print(i + " : "  );
	            int next  = console.nextInt();
	            grade = grade + next; 				// The variable grade sums all the values enter by the user
	    }
	        console.close();
	        System.out.println();
	        
	      //Prints the name and the sum of all the values enter by the user and divides by amount of grades the 
	      // the user entered, so the average of the grades can be printed.  
	        System.out.format(name + "'s " + "grade is : " + (double)grade / scores); 
	        
}
}
