package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\test.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);

       XSSFSheet sheet=workbook.getSheet("sheet1");
       
       int totalrows=sheet.getLastRowNum();
       int totalcolumn=sheet.getRow(1).getLastCellNum();
       
       System.out.println("total no of rows: "+totalrows);
       System.out.println("total no of columns: "+totalcolumn);
       
       for(int r=0;r<=totalrows;r++)
       {
    	   XSSFRow row=sheet.getRow(r);
    	   for(int c=0;c<totalcolumn;c++)
    	   {
    		   XSSFCell cell=row.getCell(c);
    		   System.out.print(cell.toString()+" ");
    		   
    	   }
    	   
    	   System.out.println();
       }
       
       workbook.close();
       file.close();
       

	}

}
