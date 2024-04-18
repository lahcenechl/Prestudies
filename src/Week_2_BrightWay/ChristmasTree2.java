
package Week_2_BrightWay;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChristmasTree2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while(!validInput) {
        	
        try {
        	
        	
        
        System.out.print("Enter the height of the Christmas tree: ");
        int height = scanner.nextInt();
        
        drawChristmasTree(height);
        }catch(InputMismatchException e) {
        	System.out.println("Invalid input. Please enter integers only.");
            scanner.nextLine(); // Consume the invalid input to avoid an infinite loop
        	
        }
        
        }
    }
    
    public static void drawChristmasTree(int height) {
        // Draw the tree
        for (int i = 0; i < height; i++) {
            // Draw spaces to center the tree
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Draw asterisks for the tree
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
