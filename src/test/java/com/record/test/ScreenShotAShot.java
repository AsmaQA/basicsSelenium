package com.record.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScreenShotAShot {
	static WebDriver driver;
	public static void main(String[] args)  {
		 WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        
			
	      //Convert web driver object to TakeScreenshot
	        TakesScreenshot scrShot =((TakesScreenshot)driver);
	        //Call getScreenshotAs method to create image file
	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	        //Move image file to new destination
	        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileWithPath = "./ScreenShot/" + timeStamp + ".png";
	      
	        try {
				FileHandler.copy(SrcFile, new File("./ScreenShot/" + fileWithPath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        System.out.println("Screenshot saved successfully at: " + fileWithPath);
	}

}
