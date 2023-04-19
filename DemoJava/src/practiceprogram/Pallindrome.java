package practiceprogram;

public class Pallindrome {
	
	public static void main (String[]args) {
		int n = 454;
		int temp=n;
		int remainder=0;
		int sum=0;
		
		while(n>0) {
			remainder=n%10;
			sum=(sum*10)+remainder;
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp +"  is a pallindrome number");
		else
			System.out.println(temp +"  is not a pallindrome number");
	}
}
