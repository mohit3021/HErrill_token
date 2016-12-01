package Pages;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel
{
	public void setdata(int row, int col, String data111) throws IOException
    {                                                                                      
                                                                                                                                                                         
    	File file=new File("C:\\Users\\mohitkumar.sharma\\Desktop\\Merrill_help\\File\\DATAUSE.xlsx");                                                  
                                                                                           
            FileInputStream fis=new FileInputStream(file);                                 
                                                                                           
            XSSFWorkbook wb=new XSSFWorkbook(fis);                                                      
                                                                                           
            XSSFSheet sheet=wb.getSheetAt(0);                                                      
	        sheet.getRow(row).createCell(col).setCellValue(data111); 

	        FileOutputStream fout=new FileOutputStream(file);
	         wb.write(fout);
	         wb.close();                                                                                  
                                                                                           
                                                                                          
                                                                                           
}
		
		
		}
		
	
	



		

