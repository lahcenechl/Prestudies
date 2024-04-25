package udemy_course_excercises;

import java.util.Scanner;
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        String password = "shark50";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String userPassword = sc.nextLine();
        boolean isTrue = false;
        while (!isTrue) {
            if (password.equals(userPassword)) {
                System.out.println("Password is correct. You are allowed to login.");
                isTrue = true; // Set isTrue to true to exit the loop
            } else {
                System.out.println("Incorrect password. Please enter your password again: ");
                userPassword = sc.nextLine();
            }
        }

    }
}
