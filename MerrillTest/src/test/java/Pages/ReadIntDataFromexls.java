package Pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadIntDataFromexls {
	
	                                                                                          
	                                                                                           
	    XSSFWorkbook wb;                                                                       
	    XSSFSheet sheet;                                                                       
	                                                                                           
	    public ReadIntDataFromexls(String filepath)                                                  
	    {                                                                                      
	                                                                                           
	        try {                                                                              
	            File file=new File(filepath);                                                  
	                                                                                           
	            FileInputStream fis=new FileInputStream(file);                                 
	                                                                                           
	            wb=new XSSFWorkbook(fis);                                                      
	                                                                                           
	            }                                                                              
	        catch (Exception e)                                                                
	        {                                                                                  
	            System.out.println(e.getMessage());                                            
	                                                                                           
	                                                                                           
	        }                                                                                   
	                                                                                           
	    }                                                                                      
	                                                                                           
	    public int getData(int sheetno, int row, int col)                                   
	    {                                                                                      
	                                                                                           
	        sheet=wb.getSheetAt(sheetno);                                                      
	        int data=(int) sheet.getRow(row).getCell(col).getNumericCellValue();                  
	                                                                                           
	        return data;                                                                       
	                                                                                           
	                                                                                           
	    }                                                                                      
	                                                                                           
	    public int getRow(int sheetno)                                                         
	                                                                                           
	    {                                                                                      
	        int row=wb.getSheetAt(sheetno).getLastRowNum();                                    
	                                                                                           
	        return row;                                                                        
	                                                                                           
	                                                                                           
	    }                                                                                      
	                                                                                           
	}  

