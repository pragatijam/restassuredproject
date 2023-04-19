package excphandle;

public class Testthrows1 {
	
	public static void main(String[]args) throws InterruptedException {
		int a=10;
		int b=20;
		int c=a+b;
		Thread.sleep(2000);
		System.out.println(c);
		int d= c+10;
		Thread.sleep(2000);
		System.out.println(d);
		
		
	}
}
