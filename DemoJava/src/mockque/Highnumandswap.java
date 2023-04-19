package mockque;

public class Highnumandswap {
	
	static int a = 20;
	static int b = 10;
	static int c=30;
	
	
	public static void main(String[]args) {
		if(a<c||b<a)
			System.out.println(c);
		System.out.println( );
		
		System.out.println("before swap");
		System.out.println("a = "+ a  + " b ="+ b );
		
		a=a+b;   //a=10,b=20  so output is 30
		b=a-b;    //a=30,b=20  so output is 10
		a=a-b;    //a=30,b=10
		System.out.println("swap=" +   a );
		System.out.println("swap=" +   b );

	}
}
