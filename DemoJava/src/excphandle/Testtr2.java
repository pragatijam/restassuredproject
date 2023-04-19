package excphandle;

public class Testtr2 {
	
	public void totalMarks(int marks) {           //throw for both pass and fail using try and catch
		if(marks<=35)
			throw new IllegalArgumentException ("fail");
		else
			System.out.println("pass");
		}
	
	public static void main(String[]args) {
		Testtr1 ref = new Testtr1();
		try {
			ref.totalMarks(35);
		}
        catch(IllegalArgumentException ref1) {
        	System.out.println(ref1.getMessage());
        }
		ref.totalMarks(40);
}
}