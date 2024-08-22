package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		  FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\test1.xlsx");
		  XSSFWorkbook workbook=new XSSFWorkbook();
		  XSSFSheet sheet=workbook.createSheet("sheet1");
		  
		XSSFRow row1=  sheet.createRow(0);
		row1.createCell(0).setCellValue("kiran");
		row1.createCell(1).setCellValue(2500);
		row1.createCell(2).setCellValue("java");
		
		
		XSSFRow row2=  sheet.createRow(1);
		row2.createCell(0).setCellValue("kiran");
		row2.createCell(1).setCellValue(2500);
		row2.createCell(2).setCellValue("java");
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		

	}

}
