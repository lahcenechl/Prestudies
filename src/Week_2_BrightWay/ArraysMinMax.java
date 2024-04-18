package Week_2_BrightWay;

import java.util.Arrays;

public class ArraysMinMax{
	
	
	
	public static void main(String[] args) {
		
		int[] numbers = new int[] {12, -22, 300, 43, 0};

		
		
				
		arrMaxMin(numbers);
		
		for( int a: numbers) {
			
			System.out.println(a + " ");
		}
		
	}
	
	
	
	public static void arrMaxMin(int[] numbers) {
    
	   // sort the array
      Arrays.sort(numbers);	// arrays are mutable that means original array is changed 
      
       // assign min and max values 
      int min = numbers[0];
      int max =  numbers[numbers.length-1];
      
      System.out.println(" The min Array value is = " + min);
      System.out.println(" The max Array value is = " + max);

      
      
      
	}
	
}
