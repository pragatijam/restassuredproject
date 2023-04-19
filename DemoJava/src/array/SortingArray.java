package array;

import java.util.Arrays;

public class SortingArray {
	
	public static void main(String[]args) {
		int []a= {200,55,49,27,39,50,70,15,39,40,95,63,52,56,91,82};
		
		// ascending order
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		System.out.println(" ");
		
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+" ");
		}
		
	}


