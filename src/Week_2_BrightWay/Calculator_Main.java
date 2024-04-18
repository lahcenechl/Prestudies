package Week_2_BrightWay;

class Calculator{
	
	
	private int result;
	
	
	public Calculator(){
		
		this.result=0;
		
	}
	
	
	public int getResult() {
		
		return this.result;

	}
	
    // Method to perform addition

     public void plus (int a) {
    	 
    	 this.result = result+a;
    	
    	 
     }
     
     // Method to perform subtraction

     public void minus (int d) {

    	 this.result = result-d;
     }
     
     // Method to perform multiplication

     public void multiply(int b ) {
    	 
    	 this.result = result*b;

    	 
     }
     
     // Method to perform division

     public void divide(int c) {
    	 
    	    // avoiding Arithmatic Exception if there is a zero dividing by zero will throw an arithmatic exception
         if (c != 0) {
             this.result = result/c;
         } else {
             System.out.println("Error: Division by zero!");
         }
     }
	
     

}



public class Calculator_Main {
	
	
	public static void main(String[] args) {
		
		
		Calculator myCalculator = new Calculator();
		myCalculator.plus(8);
		myCalculator.multiply(2);
		myCalculator.divide(4);
		System.out.println(myCalculator.getResult()); //  4
		
	}
}