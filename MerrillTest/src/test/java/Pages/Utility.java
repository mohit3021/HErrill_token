package Pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility
{
	
	public static void takeScreenShot(WebDriver driver, String screenshotname) throws Exception{
		 
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=(File) ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshot/"+screenshotname+".png"));
		System.out.println(screenshotname+" screenshot taken");
		} catch (WebDriverException e) {
		 
		System.out.println("Exception has occurred during taking screenshot "+ e.getMessage());
		 
		}


	}
}
