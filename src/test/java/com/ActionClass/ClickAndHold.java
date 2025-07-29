package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
		driver.get(url);

		// Locate the element C by By.xpath.
		WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));

		// Create an object of actions class and pass the reference of WebDriver as a
		// parameter to its constructor.
		Actions actions = new Actions(driver);

		// Call clickAndHold() method to perform click and hold operation on element C.
		actions.clickAndHold(titleC).perform();
	}

}
