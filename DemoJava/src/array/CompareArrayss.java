package array;

import java.util.Arrays;

public class CompareArrayss {
	
	public static void main(String[]args) {
		int[]a= {1,2,3,4,5};
		int[]b= {6,7,8,9,0};
		int[]c= {1,2,3,4,5};
		
		
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(b,c));
		System.out.println(Arrays.equals(a,c));
}

}
