package week_1_brightWay;

public class TextConverter {
    public static void main(String[] args) {
        String text = "Everybody _said_, it can't be done. Then came one who did not #KNOW# that and just made it.";
        
        // Split the text into words based on spaces
        String[] words = text.split("\\s+"); // split is a method that will split the text in substrings based on one space or more
     // Print each word in the array
   
        // Iterate through each word and apply the desired formatting
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            // Check if the word starts with '#' or '_'
            if (word.startsWith("#")) {
                // Convert to lowercase
                result.append(word.toLowerCase());
            } else if (word.startsWith("_")) {
                // Convert to uppercase
                result.append(word.toUpperCase());
            } else {
                // Preserve unchanged
                result.append(word);
            }
            result.append(" "); // Add space between words

        }
        
        // Print the result and delete # _
        System.out.println(result.toString().replaceAll("#", "").replaceAll("_", ""));
    }
}
