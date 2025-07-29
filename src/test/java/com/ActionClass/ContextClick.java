package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html"); 		
		Actions action = new Actions(driver); 
		WebElement element1 = driver.findElement(By.xpath("//*[contains(text(),'right']")); 
		action.contextClick(element1).build().perform();
		System.out.println("asma");
		driver.close();

	}

}
