package week_2_brightWay;


public class Usingmethods{
	
	public static void main(String[] args) {
		

		// Step 1: Call the method
        int[] numbers = new int[] {2, 2, 10, 11, 10};
        int multiplier = 2;
        
        System.out.println("Array unchanged:");
        printArr(numbers);
        
        // Print multiplied array by 2
        printMultipliedArray(numbers, multiplier); // Output: 4 4 100 121 100
        
        printArr(numbers);   //  // Output: 4 4 100 121 100    explanation check below  1.1

         
        // Print incremented and multiplied array by 3
        printIncrementedMultipliedArray(numbers, multiplier); 
        
        // Print out 'multiplier'
        System.out.println("Multiplier after method call: " + multiplier); // 2   // explanation check below 1.2
		
	}
	
	// Method to print the original array
    public static void printArr(int[] numbers) {
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Method to print the modified array multiplied by 2
    public static void printMultipliedArray(int[] numbers, int multiplier) {
        // Multiply each element of the array by itself
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i]; 
        }
        
        // Print the modified array
        System.out.println("Modified array multiplied by 2:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Method to print the modified array after incrementing the multiplier by 1 and multiplying the array by the new multiplier
    public static void printIncrementedMultipliedArray(int[] numbers, int multiplier) {
        // Increment the multiplier by 1
        multiplier++;
        
        // Multiply each element of the array by itself
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i]; 
        }
        
        // Print the modified array
        System.out.println("Modified array multiplied by 3:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	
	
	
}



/* 1.1

 Explanation of the observed behavior:
 When we call the printMultipliedArray method and pass the numbers array along with a multiplier,
 the method modifies the elements of the numbers array by multiplying each of them by the multiplier.
 Since arrays are objects in Java and are passed by reference, changes made to the array elements
 inside the method are reflected in the original numbers array outside the method.
 Therefore, after calling the printMultipliedArray method,the values of the numbers array are changed,
  and they will be printed as modified.


/* 1.2
 * 
 * When you pass an argument to a method in Java, you're passing a copy of the value stored in the variable.
 * In the case of primitive types like int, this means that the method receives a copy of the actual value stored in the variable.
 * 
 * In the main method, when you pass the multiplier variable to printIncrementedMultipliedArray, 
 * a copy of the value stored in multiplier is passed. Therefore, when you increment the multiplier variable inside printIncrementedMultipliedArray, 
 * it only affects the local copy of the variable within the method. The original multiplier variable in the main method remains unchanged.

 * 
 */




