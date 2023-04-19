package stringmethods;

public class BlankEmpty {
	
	public static void main(String[]args) {
		String a= "   ";
		
		boolean z= a.isBlank();
		System.out.println(z);
		
		boolean x= a.isEmpty();
		System.out.println(x);
	}

}
