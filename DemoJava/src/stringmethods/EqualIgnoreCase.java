package stringmethods;

public class EqualIgnoreCase {
	
	public static void main(String[]args) {
		String a = "velocity";
		String b = "VELOCITY";
		boolean z=a.equalsIgnoreCase(b);
		System.out.println(z);
	}

}
