package week_1_brightWay;

import java.util.Scanner;



public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the circumference and height of the can
        System.out.print("Circumference: ");
        double c = scanner.nextDouble();
        System.out.print("Height: ");
        double h = scanner.nextDouble();

        // Calculate the diameter of the lid
        double d = c / Math.PI; // because c= pi*d that mens d = c/pi
        
     
         
        // Calculate the area of the lid
        double al = Math.PI * Math.pow(d / 2, 2); // Math.pow(base, exponent);    radius = d / 2;    we go for the Base formula or area of a circle or the lid
        
        
        // Calculate the area of the casing
        double ac = c * h;  // surface Area of a cylinder  ac= circumference * height    hier we will find The lateral surface area, also known as the curved surface area
        
        // Calculate the total required sheet area
        double at = 2 * al + ac;  // 2 times al because we have two bases or two circles top and bottom + the are of the casing the formula of total surface area of cylinder = lateral surface area +2 *al

        // Calculate the volume of the can
        double volume = Math.PI * Math.pow(d / 2, 2) * h;  // V = p1* (r*r)*h    it represents the amount of space enclosed by the cylinder  we can also go for V = al * h  

        // Print the results
        System.out.println("Sheet metal area: " + at);
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}


/*

Relationship between Diameter and Circumference: There is a relationship between the diameter 
�
d and the circumference 
�
c of a circle. Specifically, the circumference of a circle is equal to the diameter multiplied by π 
 Mathematically, this relationship is expressed as 

c=pi* d.that menas d = c/pi  */