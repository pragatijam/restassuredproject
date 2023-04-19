package checkloop;

public class ForLoop {

	public static void main(String[]args) {
		System.out.println("even number 100 to 0: ");
		for (int i=100;i>=0;i--) { 
			if(i%2==0)
			System.out.print(i + " ");
		}
		System.out.println("\nodd number 100 to 0: ");
		for (int i=100;i>=0;i--) { 
			if(i%2==1)
			System.out.print(i + " ");
		}
	}
}