package errors;

public class Teste1 {                         //stack overflow error
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m1();
	}
	
	public static void main(String[]args) {
		Teste1 ob = new Teste1();
		ob.m1();
			
	}

}
