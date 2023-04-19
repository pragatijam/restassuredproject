package excphandle;

public class Testtr1 {

	public void totalMarks(int marks) {           //throw-only pass or fail execute
		if(marks<=35)
			throw new IllegalArgumentException ("fail");
		else
			System.out.println("pass");
		}
	
	public static void main(String[]args) {
		Testtr1 ref = new Testtr1();
		ref.totalMarks(40);
		ref.totalMarks(35);
		
	}

}
