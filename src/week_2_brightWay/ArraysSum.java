package week_2_brightWay;

public class ArraysSum{
	
	
	
	public static void main(String[] args) {
		
		int[] numbers = new int[] {12, -22, 300, 43, 0};

		
		
		ArrSum(numbers);
				
	
		
	}
	
    // 1. Basic Sum
	
	public static void ArrSum (int[] numbers) {
		
		int Sum=0;
		
		for(int a : numbers) {
			
			Sum += a;
			
		}
		
		System.out.print(" The Sum of the Array = " + Sum);
		
		System.out.println();
		
	}

	
}
