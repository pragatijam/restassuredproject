package array;

public class AnonymousArray {
	
	public static void m1(int []a) {
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	public static void main(String[]args) {
		m1(new int[] {1,2,3,4,5});    //array passing without declaration
		
	}

}
