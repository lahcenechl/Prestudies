package week_2_brightWay;





public class CompareStrings {
    public static void main(String[] args) {
        // Creating both strings with a literal
        String str1Literal = "Comparison";
        String str2Literal = "Comparison";
        
        // Using the equals method to compare
        boolean equalsWithLiteral = str1Literal.equals(str2Literal); // true
        
        /*
         * Using the equals method:

          When you use the equals method, it compares the contents of the strings, i.e., the actual characters within the strings.
          If the contents of two strings are the same, the equals method returns true, indicating that the strings are equal.
          This method is used to compare the values of two string objects.
   
         */
        
        // Using the == operator to compare
        boolean isEqualReferenceLiteral = (str1Literal == str2Literal); // true  
        
        /*
         * we have what's called in java String interning where all literal Strings with same value will land on the same memory location or same Object
         * cause java try to save up heap memory this concept or this place where all objects land is called String pool
         */
        
        
        // Creating both strings with the constructor
        String str1Constructor = new String("Comparison"); 
        String str2Constructor = new String("Comparison");
        /*
         *  java doesn't use the String pool but create a new object and thats because we used the constructor of a string or whats called a new key word
        
         * so result when comparing with == will be false 
         * 
         * 
         * */
         
        // Using the equals method to compare
        boolean equalsWithConstructor = str1Constructor.equals(str2Constructor); // true
        
        // Using the == operator to compare
        boolean isEqualReferenceConstructor = (str1Constructor == str2Constructor); // false
        
        // Print the results
        System.out.println("Using literal - Equals: " + equalsWithLiteral + ", ==: " + isEqualReferenceLiteral);
        System.out.println("Using constructor - Equals: " + equalsWithConstructor + ", ==: " + isEqualReferenceConstructor);
    }
}
