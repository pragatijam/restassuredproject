package array;

public class DupVal {
	
	public static void main(String[]args) {
		int []a= {200,55,49,27,39,50,70,15,39,40,95,63,52,56,91,82};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					System.out.println(a[i]+" ");
			}
		}
}
}