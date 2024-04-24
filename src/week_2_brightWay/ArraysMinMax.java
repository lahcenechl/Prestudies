package week_2_brightWay;

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
		Arrays.sort(numbers);    // arrays are mutable that means original array is changed

		// assign min and max values
		int min = numbers[0];
		int max = numbers[numbers.length - 1];

		System.out.println(" The min Array value is = " + min);
		System.out.println(" The max Array value is = " + max);

		int min1 = numbers[0]; // Initialize min with the first element of the array
		int max1 = numbers[0]; // Initialize max with the first element of the array

		for (int i = 1; i < numbers.length; i++) { // Start the loop from index 1 since index 0 is already considered
			if (numbers[i] > max1) {
				max1 = numbers[i]; // Update max if the current element is greater
			} else if (numbers[i] < min1) {
				min1 = numbers[i]; // Update min if the current element is smaller
			}
		}

		System.out.println("The min Array value is = " + min1);
		System.out.println("The max Array value is = " + max1);

	}
	
}
