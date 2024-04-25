package udemy_course_excercises;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);

        boolean flag = false;
        int count = 0;
        while (!flag) {
            Random random= new Random();
            int rangeNumbers = random.nextInt(100)+1;
            System.out.println("please enter a number between 1 and 100");
            int number = sc.nextInt();
            count++;
            if (rangeNumbers > number) {
                System.out.println("number is greater than range number");
            } else if (rangeNumbers < number) {
                System.out.println("number is smaller than range number");
            } else {
                System.out.println("you won the game");
                flag = true;
            }
        }


        }
}

