package com.frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WitchFrameById {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/frames");

		//Switch by frame ID
		driver.switchTo().frame("frame1");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2"); 
		driver.quit();

	}

}
