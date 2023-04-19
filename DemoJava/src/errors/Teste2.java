package errors;

public class Teste2 {
	
	public static void main(String[]args) {               // assertion error after enabling vm argument -ea
		int input = 40;
		assert input>=50:"failed";
		System.out.println("mark is:" + input);
		
	}

}
