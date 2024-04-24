package week_1_brightWay;
import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values a and b
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        // Calculate area and perimeter of a rectangle
        double rectangleArea = a * b;  // area of a Rectangle = length *width
        double rectanglePerimeter = 2 * (a + b);// perimiter = adding all sides

        // Calculate area and perimeter of a right triangle
        double triangleArea = (a * b) / 2;  // area of a right triangle = height * base /2
        double hypotenuse = Math.sqrt(a * a + b * b);// to find perimiter we need the hypotenuse to find the longest side of right triangle 
        double trianglePerimeter = a + b + hypotenuse;// hier we need to add all sides to get the perimiter area

        // Output the results
        System.out.println("Area and Perimeter of Rectangle:");
        System.out.println("Area: " + rectangleArea);
        System.out.println("Perimeter: " + rectanglePerimeter);

        System.out.println("\nArea and Perimeter of Right Triangle:");
        System.out.println("Area: " + triangleArea);
        System.out.println("Perimeter: " + trianglePerimeter);

        scanner.close();
    }
}
