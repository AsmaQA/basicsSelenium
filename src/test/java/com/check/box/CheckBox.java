package com.check.box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		// Declare WebDriver reference and assign an object of FirefoxDriver class.
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		   
		 // Create a string literal and assign the url to it.
		    String URL = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html"; 
		    driver.get(URL); 

		 // Locate checkboxes "Red", "Blue", "Orange". 
		    WebElement red = driver.findElement(By.xpath("//input[@value='red']")); 
		    red.click(); 
		    System.out.println("Red Checkbox is selected"); 
		   
		    WebElement blue = driver.findElement(By.xpath("//input[@value='blue']")); 
		    blue.click(); 
		    System.out.println("Blue Checkbox is selected"); 

		    WebElement orange = driver.findElement(By.xpath("//input[@value='orange']")); 
		    orange.click(); 
		    System.out.println("Orange Checkbox is selected"); 
		   
		  //  driver.close(); // Closing the driver.

	}

}
