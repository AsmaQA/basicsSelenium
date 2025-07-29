package com.WebElementsLocactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CssLocators {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		
		String cssSelector = "input#email";
		
	
		
		WebElement champEmail = driver.findElement(By.cssSelector(cssSelector));
	
		champEmail.sendKeys("asma");
		
		// tag and class
		// HTML tag is “input” and its class is “inputtext.”
		
		String cssSelectorTagClass = "input.inputtext";
		// tag and attribute
		
		String cssSelectorTagAttribute = "css=tag[attribute=value]";
		String cssSelectorTagClassAttributePassword = "css=input.inputtext[tabindex=2]";
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		String cssSelectorattributValue = "input[name=lastName]";

		
		

	}

}
