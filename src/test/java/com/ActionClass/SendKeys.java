package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// maximize the window
		driver.manage().window().maximize();		
		// specify the locator of the search box 
		WebElement element = driver.findElement(By.xpath("//*[@role='combobox']"));		
		// create an object for the Actions class
		Actions action = new Actions(driver);
		// pass the product name that has to be searched on the website
		action.sendKeys(element, "Mouna Samet").build().perform();
		// Close the browser
	//	driver.quit();

	}

}
