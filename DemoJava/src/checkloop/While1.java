package checkloop;

public class While1 {
	 public static void m2() {
		 System.out.println("\neven number 0 to 100:");
         int b= 100;
		while(b>=0) {
				if(b%2==0) {
					
				System.out.print(b +" ");
			}
				b--;
	    }
	 }
	 public static void m1() {
		 System.out.println("odd number 100 to 0:");
         int a= 100;
		while(a>=0) {
				if(a%2==1) {
					
				System.out.print(a +" ");
			}
				a--;
	    }
	 }
	 public static void m3() {
		 System.out.println("\neven number 0 to 100:");
         int c= 0;
		while(c<=100) {
				if(c%2==0) {	
				System.out.print(c +" ");
			}
				c++;
	    }
	 }
	 public static void m4() {
		 System.out.println("\nodd number 0 to 100:");
         int d= 0;
		while(d<=100) {
				if(d%2==1) {	
				System.out.print(d +" ");
			}
				d++;
	    }
	 }
	public static void main(String[]args) {
	    m1();
		 System.out.println(" ");
		m2();
		 System.out.println(" ");
		m3();
		 System.out.println(" ");
		 m4();
    }
}