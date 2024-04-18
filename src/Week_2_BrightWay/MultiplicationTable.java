package Week_2_BrightWay;

public class MultiplicationTable{
	
	public static void main(String[] args) {
		
		
		multipication_Table();
		
		
		
		
		
		
	}
	
	public static void multipication_Table() {
		
		
		for (int i =1; i<=10 ; i++) {
			
			for ( int j = 1; j<=10;j++) {
				
				int result = i * j;
				System.out.printf("%-4d", result);  // %-4d Pad with spaces (width 4, left justified)

			}
			
			System.out.println();
			
		}
		
		
	}

	
}