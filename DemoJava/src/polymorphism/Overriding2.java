package polymorphism;

public class Overriding2 extends Overriding1 {
	
	public void m1() {
		System.out.println("m1 is child");
}
	
	public static void m1(int a) {
		System.out.println("m1 ");
	}
	
	public static void main(String[]args) {
		Overriding1 ob1= new Overriding2();
		ob1.m1();
		m1(10);
		ob1.m1(10);
		
		
		
	}
}