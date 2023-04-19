package operator;

public class OperetorCheck {
	static int a = 10;
	static int b = 20;
	static int c=30;
	static int d;
	
	public static void main(String[]args) {
		if(a<c||b<a)
			System.out.println(c);
		System.out.println( );
		
		c=a+b;
		System.out.println(c);
		c++;
		System.out.println(c);
		System.out.println();
		
		c=b-a;
		System.out.println(c);
		--c;
		System.out.println(c);
		System.out.println();
		
		c=a*b;
		System.out.println(c);
		if(c>500)
		System.out.println("TRUE");
		else
		System.out.println("FALSE");
		
		c=b/a;
		System.out.println(c);
		if(c==a)
		System.out.println("TRUE");
		else
		System.out.println("FALSE");
		System.out.println();
			
	if((b==a)||(b==a))
		System.out.println("same");
	
	else if((b==20)||(b==10))
		System.out.println("also same");
		else
		System.out.println("not same");
	
	if (a!=b)
		System.out.println("yes");
	else
		System.out.println("no");
		
	}
	

}
