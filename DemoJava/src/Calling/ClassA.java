package Calling;

public class ClassA {
	
	 static int a = 200;
	
	public void m1 () {
		int a = 10;
		
	System.out.println(ClassA.a);
	System.out.println(a);
	
	
		
	}
	public static void main(String[]args) {
		ClassA ob1 = new ClassA();
		ob1.m1();
			
		
	}
	
	
}
