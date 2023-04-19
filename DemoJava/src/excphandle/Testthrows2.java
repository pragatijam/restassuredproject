package excphandle;

public class Testthrows2 {
	
	public static void main(String[]args) throws ArithmeticException ,InterruptedException {
    System.out.println(1);	
	Thread.sleep(2000);
	System.out.println(2);
	System.out.println(3);
	System.out.println(100/0);
	System.out.println(4);    
	System.out.println(5);    

}
}