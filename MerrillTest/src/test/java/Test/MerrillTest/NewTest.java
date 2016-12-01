package Test.MerrillTest;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ReadDataFromexls;
import Pages.Utility;
import Pages.WriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void mtBet() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohitkumar.sharma\\Desktop\\Merrill_help\\chromedriver.exe");
		 driver=new ChromeDriver();
		  
		 driver.manage().window().maximize();
		  
		 driver.get("http://javelin-api-gateway-stage.apps.foundry.mrll.com/swagger-ui.html#!/metadata-composite-controller/getMetadataUsingGET");
		  
		 Thread.sleep(4000);	
	}
	
	
  @Test
  public void hiitingURL() throws InterruptedException, IOException
	{
	
	  Logger logger=Logger.getLogger("LogFile");
	  PropertyConfigurator.configure("Log4j.properties");
	   
	  
	  logger.info("Log 1");
	  
	  Select select=new Select(driver.findElement(By.id("select_baseUrl")));
	  
	  
	  select.selectByIndex(13);
	  
	  logger.info("Log 2");
	  
	  Thread.sleep(2000);
	  
	  WebElement token_controller =driver.findElement(By.xpath(".//*[text()='token-controller']"));
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("arguments[0].setAttribute('style','border: solid 2px red')", token_controller);
      token_controller.click();
	  
	  logger.info("Log 3");
	  Thread.sleep(2000);
	  WebElement createIamTokenUsingPOST=  driver.findElement(By.xpath(".//*[contains(@href,'createIamTokenUsingPOST')]"));
	  js.executeScript("arguments[0].setAttribute('style','border: solid 2px red')", createIamTokenUsingPOST);
	  createIamTokenUsingPOST.click();
	  
	  Thread.sleep(2000);
	  
	  JavascriptExecutor je = (JavascriptExecutor) driver;
	  
	  
	  WebElement element=driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//form/table[1]/tbody/tr/td[5]/span/div/div/div/div/div[2]/pre/code"));
	  
	  je.executeScript("arguments[0].scrollIntoView(true);",element);
	  
	  Thread.sleep(2000);
	  
	  //driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//form/table[1]/tbody/tr/td[5]/span/div/div/div/div/div[2]/pre/code")).click();
	  
	  
	  
	                              
	  ReadDataFromexls readdata=new ReadDataFromexls("C:\\Users\\mohitkumar.sharma\\Desktop\\Merrill_help\\File\\DATAUSE.xlsx");
	  
	  String Data1=readdata.getData(0, 0, 0);
	  String Data2=readdata.getData(0, 1, 0);
	  String Data3=readdata.getData(0, 1, 1);
	  String Data4=readdata.getData(0, 2, 0);
	  String Data5=readdata.getData(0, 2, 1);
	  String Data6=readdata.getData(0, 3, 0);
	 
	  System.out.println("Data1 "+Data1);
	  System.out.println("Data2 "+Data2);
	  System.out.println("Data3 "+Data3);
	  System.out.println("Data4 "+Data4);
	  System.out.println("Data5 "+Data5);
	  System.out.println("Data6 "+Data6);
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//form/table[1]/tbody[1]/tr[1]/td[2]/textarea[1]")).sendKeys(Data1);
	  
	  Thread.sleep(1000);
	  
	  WebElement webElement = driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//form/table[1]/tbody[1]/tr[1]/td[2]/textarea[1]"));
	  webElement.sendKeys(Keys.ENTER);
	 
	  
	  
	  driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//form/table[1]/tbody[1]/tr[1]/td[2]/textarea[1]")).sendKeys(Data2);
	  webElement.sendKeys(Keys.LEFT);
	  webElement.sendKeys(Keys.LEFT);
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//form/table[1]/tbody[1]/tr[1]/td[2]/textarea[1]")).sendKeys(Data3);
	  webElement.sendKeys(Keys.RIGHT);
	  webElement.sendKeys(Keys.RIGHT);
	  webElement.sendKeys(Keys.ENTER);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//form/table[1]/tbody[1]/tr[1]/td[2]/textarea[1]")).sendKeys(Data4);
	  webElement.sendKeys(Keys.LEFT);
	  driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//form/table[1]/tbody[1]/tr[1]/td[2]/textarea[1]")).sendKeys(Data5);
	  webElement.sendKeys(Keys.RIGHT);
	  webElement.sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//form/table[1]/tbody[1]/tr[1]/td[2]/textarea[1]")).sendKeys(Data6);
	  
	  driver.findElement(By.xpath(".//*[@id='token-controller_createIamTokenUsingPOST_content']/form/div[3]/input")).click();
	  Thread.sleep(5000);
	  
	  //JavascriptExecutor je2 = (JavascriptExecutor) driver;
      WebElement element1=driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//div[@class='response']//div[@class='block response_code']"));
	  
	  je.executeScript("arguments[0].scrollIntoView(true);",element1);
	  
	  Thread.sleep(2000);
	  
	  String response_code=driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//div[@class='response']//div[@class='block response_code']/pre")).getText();
		 
	  System.out.println("Respond code is "+response_code);
	  
	  logger.info("Responce code: "+response_code);
		 
		 //Assert.assertEquals(response_code, "200");
	  
	  WebElement res=driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//div[@class='response']//div[@class='block response_body json']/pre/code/span/span"));
	  js.executeScript("arguments[0].setAttribute('style','border: solid 2px red')", res); 
	  
	  Assert.assertEquals(response_code, "200", "Token is not generated.");
	  
	  String tokenId = driver.findElement(By.xpath(".//*[@id='token-controller_endpoint_list']/li[3]//div[@class='response']//div[@class='block response_body json']/pre/code/span/span")).getText();
	 
	  System.out.println("Token ID "+tokenId);
	  
	  logger.info("Token code: "+tokenId);
	  
	  WriteExcel we=new WriteExcel();
	  we.setdata(0, 2, tokenId);
	  
	}
  
  @AfterMethod
  public void tearDown(ITestResult result) throws Exception{
   
  if(ITestResult.FAILURE==result.getStatus())
  {
  Utility.takeScreenShot(driver, result.getName());
   
  }
  //driver.quit();
   
  }
}  
