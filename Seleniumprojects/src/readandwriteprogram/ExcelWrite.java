package readandwriteprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		//get path for excel
				File path =new File("C:\\Users\\KING\\Documents\\book2.xlsx");
				
				//load excel file
				FileInputStream load =new FileInputStream(path);
				
				//workbook of excel
				XSSFWorkbook Workbook =new XSSFWorkbook(load);
				
				//get sheet from  workbook
				XSSFSheet sheet=Workbook.getSheetAt(0);
				
				FileOutputStream output=new FileOutputStream(path);
				sheet.createRow(1).createCell(1).setCellValue("automation");
				Workbook.write(output);
	}

}
