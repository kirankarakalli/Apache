package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataDynamically {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\test2dynamic.xlsx");
		  XSSFWorkbook workbook=new XSSFWorkbook();
		  XSSFSheet sheet=workbook.createSheet("sheet1");
		  
		  Scanner sc=new Scanner(System.in);
		   
		  for(int r=0;r<4;r++)
		  {
			  XSSFRow row=sheet.createRow(r);
			  for(int c=0;c<3;c++)
			  {
				  XSSFCell cell=row.createCell(c);
				  cell.setCellValue(sc.next());
			  }
		  }
		  
		  System.out.print("file created");
		  

			workbook.write(file);
			workbook.close();
			file.close();

	}

}
