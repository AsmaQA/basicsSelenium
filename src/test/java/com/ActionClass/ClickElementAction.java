package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickElementAction {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// maximize the window
		driver.manage().window().maximize(); // create an object for the Actions class
		Actions action = new Actions(driver);
		WebElement elementToType = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		elementToType.sendKeys("Iphone14");
		WebElement elementToClick = driver.findElement(By.xpath("//input[@type='submit']"));
		
		action.click(elementToClick).build().perform();
		// verify the title of the website after searching for the product
		
		String actualTitle = driver.getTitle() ;
		
		System.out.println(actualTitle);
		String expectedString = "Amazon.in : Iphone14" ;
		
		
		 if(actualTitle.equals(expectedString)) { 
			 System.out.println("Test Done");			 
		 }
		 
		 
		 
		driver.close();
	}

}
