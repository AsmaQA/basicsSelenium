package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickAction {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://doubleclicktest.com/#google_vignette");
		Actions a = new Actions(driver);
		WebElement doubleClick = driver.findElement(By.id("count"));
		a.doubleClick(doubleClick).perform();
		
	}

}
