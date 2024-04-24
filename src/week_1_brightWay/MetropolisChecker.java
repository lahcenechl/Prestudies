package week_1_brightWay;

import java.util.Scanner;

public class MetropolisChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter city details
        System.out.println("Enter city details:");
        System.out.print("Name of the city: ");
        String name = scanner.nextLine();
        System.out.print("Is " + name + " a capital ('true' or 'false')? ");
        boolean isCapital = scanner.nextBoolean();
        System.out.print("What is the population of " + name + "? ");
        int population = scanner.nextInt();
        System.out.print("Tax income per inhabitant: ");
        double taxPerPerson = scanner.nextDouble();

        // Check if the city is a metropolis
        boolean isMetropolis = false;

        if (isCapital && population > 100000) {
            isMetropolis = true;
        } else if (population > 200000 && taxPerPerson * population >= 1000000000) {
            isMetropolis = true;
        }

        // Print the result
        if (isMetropolis) {
            System.out.println(name + " is a metropolis.");
        } else {
            System.out.println(name + " is not a metropolis.");
        }

        scanner.close();
    }
}
