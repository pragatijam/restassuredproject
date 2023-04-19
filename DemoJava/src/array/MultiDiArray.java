package array;

public class MultiDiArray {
	
	public static void main(String[]args) {
		int b[]= {11,22,33,44};
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		
		System.out.println();
		
		int a[][]= {{11,22,33},{44,55,66},{77,88,99}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			System.out.print(a[i][j]+" ");
	        }
	     System.out.println();
         }
	}
}
