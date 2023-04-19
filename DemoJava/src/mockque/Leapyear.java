package mockque;
import java.util.Scanner;

public class Leapyear {
	public static void main(String[]args) {
	int year= 2020;
	
	
	//System.out.println("enter year:");
	// Scanner ob= new Scanner(System.in);
	//int z =ob.nextInt();

	 if(year%400==0)
	 
	 {
		System.out.println("leap year"); 
	 }
	
	 else if(year%4==0 && year%100!=0)
	 {
		 System.out.println("also leap year"); 
	 }
	 else
		 System.out.println("not leap year"); 
}
}