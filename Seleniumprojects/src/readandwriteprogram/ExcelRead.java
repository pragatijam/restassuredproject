package readandwriteprogram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	String Value;
	public String excelReaddd(int sheetno, int rowvalue, int cellvalue) throws IOException {

		// load excel file
		FileInputStream load = new FileInputStream("C:\\Users\\KING\\Documents\\Book1.xlsx");

		// workbook of excel
		XSSFWorkbook Workbook = new XSSFWorkbook(load);

		// get sheet from workbook
		XSSFSheet sheet = Workbook.getSheetAt(sheetno);

		// read cell
		CellType type = sheet.getRow(rowvalue).getCell(cellvalue).getCellType();
	    if(type==CellType.NUMERIC) {
	    	double number=sheet.getRow(rowvalue).getCell(cellvalue).getNumericCellValue();
	    	int num=(int)number;
	    	Value=String.valueOf(num);
	    }
	    else
	    	Value=sheet.getRow(cellvalue).getCell(cellvalue).getStringCellValue();
	       return Value;
	}


}
