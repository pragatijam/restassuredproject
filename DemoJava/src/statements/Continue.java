package statements;

public class Continue {
	public static void main(String[]args) {
		System.out.println("odd number 0 to 100: ");
		for (int i=0;i<=100;i++) { 
			if(i%2==0)
		      continue;
			System.out.print(i + " ");
		}
		
		System.out.println("\neven number  0 to 100: ");
		for (int i=0;i<=100;i++) { 
			if(i%2!=0)
		      continue;
			System.out.print(i + " ");
		}
}
}