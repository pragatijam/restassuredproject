package practiceprogram;

public class ReverseString {
	
	public static void main(String[]args)
	{
	   String a= "my name is pragati";

	   char [] rev = a.toCharArray();
	   for(int i=a.length()-1;i>=0;i--)
	   { 
	    System.out.print(rev[i]);
	    }
	}

}
