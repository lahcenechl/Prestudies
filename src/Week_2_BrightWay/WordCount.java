package Week_2_BrightWay;
public class WordCount {
    public static void main(String[] args) {
        String text = "Far out in the unexplored wastelands of something totally out of fashion extension of the galaxy's western spiral arm, a little yellow sun glows unnoticed. Orbiting them, also about ninety-one million miles away, is an absolutely insignificant little blue-green planet whose ape bioforms are so amazingly primitive that they still think digital clocks are an incredibly wonderful invention.";

        // Split the text into words based on whitespace
        
        String[] words = text.split("\\s+"); // the split method will also work fine without  "\\s+"  in our method
                                              // because we have hier only one white space and "\\s+" is only to ensure if there is more than 1 space
        
        //  String[] words = text.split(" ");  // will work fine and get same result
        
        // Count the number of words
        int wordCount = words.length;

        // Print the result
        System.out.println("Number of words: " + wordCount);
    }
}