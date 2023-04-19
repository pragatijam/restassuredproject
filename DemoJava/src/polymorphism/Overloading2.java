package polymorphism;

public class Overloading2 extends Overloading1 {

	public void  m1(boolean c) {
		System.out.println("2st method ");
	}
	public static void main(String[]args) {
		
		Overloading2 obj =new Overloading2();
		obj.m1();
		obj.m1(10);
		obj.m1(true);
		
		Overloading1 obb =new Overloading1();
		obb.m1();
		obb.m1(10);
		//obb.m1(false); 
		
		Overloading1 obc =new Overloading2();
		obc.m1();
		obc.m1(10);
		//obc.m1(true);
		
	}

}
