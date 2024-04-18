package Week_2_BrightWay;
public class StringManipulation {
    public static void main(String[] args) {
        // Create a String variable and assign the text
        String text = "Everybody said, it can’t be done. Then came one who did not know that and just made it.";

       // 1. Retrieve the two uppercase letters from the text (charAt)
        char firstUppercase = text.charAt(0); // RetTrieves 'E'
        int index = text.indexOf('T');  // We retrieve the index 
        char secondUppercase = text.charAt(index); // Retrieves '' // we use the index to retrieve the T
        System.out.println("1. First uppercase letter: " + firstUppercase);
        System.out.println("   Second uppercase letter: " + secondUppercase);
        
        
        
        
        // 2. Compare the text with my name and interpret the result (compareTo)
                String myName = "Lahcene"; 
                int comparison = text.compareTo(myName);
                String interpretation = (comparison == 0) ? "The text is the same as my name." :
                                        (comparison < 0) ? "The text comes before my name." :
                                        "The text comes after my name.";
                System.out.println("2. Comparison with my name: " + interpretation);
   
   

        // 3. Concatenate your first and last name (concat or +)
        String firstName = "lahcene"; 
        String lastName = "chellali"; 
        String fullName = firstName +" " + lastName;

        System.out.println("3. Full name: " + fullName);

        // 4. Check if the words "made" and "Java" are present (contains)
        boolean containsMade = text.contains("made");
        boolean containsJava = text.contains("Java");
        System.out.println("4. Contains 'made': " + containsMade);
        System.out.println("   Contains 'Java': " + containsJava);

        // 5. Compare two strings for equality (equals)
        String anotherText = "Everybody said, it can’t be done. Then came one who did not know that and just made it.";
        boolean isEqual = text.equals(anotherText); 
        System.out.println("5. Equality check: " + isEqual); 

        // 6. Output the index of the first occurrence of "d" (indexOf)
        int indexOfD = text.indexOf('d');  // from zero to 7 inclusive 
        System.out.println("6. Index of first 'd': " + indexOfD);

        // 7. Check for an empty string (isEmpty)
        boolean isEmpty = text.isEmpty();
        System.out.println("7. Is the text empty? " + isEmpty);

        // 8. Check a declared string for null
        String nullString = null;
        
        boolean isNull = (nullString == null); // true
        System.out.println("8. Is the string null? " + isNull); // true

        // 9. Output the length of the text (length)
        int textLength = text.length();
        System.out.println("9. Length of the text: " + textLength);

        // 10. Extract the words "said" and "made" (substring)
        
        // index of "said"
        int indexSaid = text.indexOf("said");
        System.out.println("Index of 'said': " + indexSaid); // 10 
        
        //  index of "made"
        int indexMade = text.indexOf("made");
        System.out.println("Index of 'made': " + indexMade);
        String wordSaid = text.substring(10, 14); // Extracts "said"
        String wordMade = text.substring(78, 82); // Extracts "made"
        System.out.println("10. Extracted word 'said': " + wordSaid);
        System.out.println("    Extracted word 'made': " + wordMade);
    }
}



       /*  2  testing and explanation 

		the compareto method check the first char of the first string compared with second string
		 and if the first one comes after the second one the result is positive,
		  if it does come before result is negative  and the result will be the unicode of that char
		  
		String myName="calemero";
		String myFirstname=   "micky";
		
		int comparison = myName.compareTo(myFirstname);
		System.out.println("comparison "+ comparison);   //  -10 cause c come before m and the unicode of c is 10   
		********************************************************
		*
		*String myName="calemero";
		String myFirstname=  "calemero";
		int comparison = myName.compareTo(myFirstname);
		System.out.println("comparison "+ comparison);   //  hier result is Zero cause is the same char
		
		
		 *String myName="calemero";                                                                                 
		 String myFirstname=  "celemero";                                                                           
		 int comparison = myName.compareTo(myFirstname);                                                            
		 System.out.println("comparison "+ comparison);   //  hier result -4 cause because the first char is same so the compareto method
		                                                      move to the next character c==e and result is -4 cause unicode of c is 4           
		
		*/