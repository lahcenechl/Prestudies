package Week_1_BrightWay;

import java.util.InputMismatchException;
import java.util.Scanner;

public class loops_Triangles{
	
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int size = 0;
	        int numTriangles = 0;
	        boolean validInput = false;
	        while (!validInput) {
	        	try {
	       
	        	
	        	   // Prompt the user to enter the size of the triangle
		        System.out.print("How large should the triangles be? ");
		        size = scanner.nextInt();

		        // Prompt the user to enter the number of triangles
		        System.out.print("How many triangles would you like? ");
		         numTriangles = scanner.nextInt();

		        // Draw the specified number of triangles
		        for (int i = 0; i < numTriangles; i++) { 
		            drawTriangle(size);
		            System.out.println(); // Print a new line after each triangle
		        }
	        	
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter integers only.");
	            scanner.nextLine(); // Consume the invalid input to avoid an infinite loop

	        } 

	        }

	        
	    }

	    // Method to draw a triangle of a given size
	    public static void drawTriangle(int size) {
	        for (int i = 1; i <= size; i++) {   
	            for (int j = 1; j <= i; j++) {  
	                System.out.print("*");
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	

	
	
	
}