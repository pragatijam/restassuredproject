package checkloop;

public class DoWhile {
	public static void m1() {
		System.out.println("\neven number 100 to 0 : ");
	int a=100;
	do {
		if(a%2==0)
			System.out.print(a +" ");
		a--;
       	}
		while(a>=0);
	}
	
	
	
	
	
	
	
	
	
	
public static void m2() {
	System.out.println("\nodd number 100 to 0 : ");
	int b=100;
	do {
		if(b%2==1)
			System.out.print(b +" ");
		b--;
	}
		while(b>=0);
	}

	public static void main (String[]args) {
		m1();
		System.out.print("\n ");
		m2();
	}
}