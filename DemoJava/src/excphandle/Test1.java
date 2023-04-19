package excphandle;

public class Test1 {
	
	public static void main(String[]args) {     //without finally
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
		System.out.println(4/0);
		}
		catch(ArithmeticException ref) {
			System.out.println("can not devide by 0");    	
		}
		System.out.println(5);    

}
}