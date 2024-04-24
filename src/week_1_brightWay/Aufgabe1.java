package week_1_brightWay;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Please enter your name: ");

        // Read the input provided by the user
        String name = scanner.nextLine();

        // Print a welcome message with the provided name
        System.out.println("Hello " + name + ", Welcome to the training!");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
