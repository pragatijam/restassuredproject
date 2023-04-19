package array;

public class MethodFindMax {
	
	public static void m1(int[]a) {
		int g=a[0];
		  for(int i =1;i<a.length;i++)
            if(g<a[i])
            	g=a[i];
		  System.out.println("maximum value in array="+ g);
		  
	}
	
	public static void main(String[]args) {
		int[]a= {45,255,6,566,78,50};
		m1(a);
	}

}
