package practiceprogram;

public class armstrong {
	
	public static void main(String[]args) {
		int n=153;
		int tem=n;
		int remainder=0;
		int result=0;
		
		while(tem!=0)
		{
			remainder=tem%10;
			result=result+(remainder*remainder*remainder);
			tem=tem/10;
		}
		
		if(result==n) 
			System.out.println(n +" is armstrong number");
		else
			System.out.println(n +" is not armstrong number");
	}

}
