package practiceprogram;

public class FactorialNumber {
	
	public static void main(String[]args)
	{
		int a=3;
		int fact=1;
		
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.print(fact);
	}

}
