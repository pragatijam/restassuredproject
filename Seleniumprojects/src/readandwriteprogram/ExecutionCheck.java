package readandwriteprogram;

import java.io.IOException;

public class ExecutionCheck  {
	
	public static void main(String[] args) throws IOException {
		ExcelRadWriteUtility utwrt = new ExcelRadWriteUtility();		
	
		System.out.print(utwrt.excelReaddd(0, 1, 0));
	
	}

}
