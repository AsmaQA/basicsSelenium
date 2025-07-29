package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultiples {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Maximize window.
		driver.manage().window().maximize();
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		
		boolean selectionMultiple = fruits.isMultiple(); 
		System.out.println(selectionMultiple);
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		fruits.deselectByIndex(1);
		fruits.deselectAll();		
	}

}
