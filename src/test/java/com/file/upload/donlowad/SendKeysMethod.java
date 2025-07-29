package com.file.upload.donlowad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysMethod {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kitchen.applitools.com/ingredients/file-picker");
		
		String filePath = "C:/Users/sliti/OneDrive/Bureau/fond blanc.png";
        driver.findElement(By.id("photo-upload")).sendKeys(filePath);
        

	}

}
