package specifier1 ;

	
	 public class Test1Parent{
	 int a=10;
	final static int b= 20;
	
public static void m1() {
		Test1Parent obj = new Test1Parent();
		System.out.println(obj.a);
		System.out.println(b);
   }	
		public static void main(String[]args) {
			 Test1Parent.m1();

  }	
	}


