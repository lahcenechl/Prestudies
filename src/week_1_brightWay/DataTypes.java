package week_1_brightWay;

public class DataTypes {
    public static void main(String[] args) {
        // Declare and assign values to variables
        char initials = 'A'; // Assuming single character for initials 16 bits (2 bytes)
        int populationGermany = 83261128 ; // Population of Germany (int can handle) 32 bits (4 bytes)
        long populationEarth = 8118835999L; // Population of Earth (long for large numbers) int max value is 2147483647 so it cant be used no precision needed
        boolean isDaytime = true; // Boolean for true/false values    undefined
        float goalStrikeQuote = 1.53f; // Goals per game (float for decimal values) played 75 matches and goals 115   rate formula= 115 Goals/75=1.53 float occupies 4 bytes (32 bits) of memory.
        short programLengthWeeks = 12; // Length of Java program in weeks (short for small integers) 16 bits (2 bytes)
        double pi = 3.14159265359; // Mathematical number PI (double for precision) 64 bits (8 bytes)


        // Concatenate values with descriptive strings and print lines
        System.out.println("Initials: " + initials);
        System.out.println("Population in Germany: " + populationGermany);
        System.out.println("Population on Earth: " + populationEarth);
        System.out.println("Is currently daytime? " + isDaytime);
        System.out.println("Goal strike quote of Mario Gomez at Bayern München: " + goalStrikeQuote);
        System.out.println("Length of the Java program in weeks: " + programLengthWeeks);
        System.out.println("The mathematical number PI: " + pi);
        
        
    }
}
