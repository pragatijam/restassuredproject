package excphandle;

public class Testtrs1 {
	
	public static void main(String[]args) throws ArithmeticException, InterruptedException {
	
	 System.out.println(1);	
		Thread.sleep(2000);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(100/0);
		}
	catch(ArithmeticException ref) {          //ArithmeticException ke jgh only exception bhi chalega bt us time memory jyada lagega
		System.out.println(ref.getMessage());
	}
		
		System.out.println(4);    
		System.out.println(5);    
	}
	

}
