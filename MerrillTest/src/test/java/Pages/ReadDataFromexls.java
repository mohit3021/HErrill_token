package Pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromexls {
	
	                                                                                          
	                                                                                           
	    XSSFWorkbook wb;                                                                      
	    XSSFSheet sheet;                                                                       
	                                                                                           
	    public ReadDataFromexls(String filepath)                                                  
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
	                                                                                           
	    public String getData(int sheetno, int row, int col)                                
	    {                                                                                      
	                                                                                           
	        sheet=wb.getSheetAt(sheetno);                                                      
	        String data=sheet.getRow(row).getCell(col).getStringCellValue();                   
	                                                                                           
	        return data;                                                                       
	                                                                                           
	                                                                                           
	    }                                                                                      
	                                                                                           
	    public int getRow(int sheetno)                                                         
	                                                                                           
	    {                                                                                      
	        int row=wb.getSheetAt(sheetno).getLastRowNum();                                    
	                                                                                           
	        return row;                                                                        
	                                                                                           
	                                                                                           
	    }                                                                                      
	                                                                                           
	}  

