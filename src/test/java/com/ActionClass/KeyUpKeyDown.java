package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyUpKeyDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");		
	    driver.manage().window().maximize();
	    WebElement element = driver.findElement(By.xpath("//*[@role='combobox']"));
	    Actions action = new Actions(driver);
	
	    action.keyDown(element,Keys.SHIFT).sendKeys("a").build().perform();
	    Thread.sleep(3000);

	    action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    Thread.sleep(3000);
	    action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    Thread.sleep(3000);

		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	    Thread.sleep(3000);

	    action.sendKeys(Keys.ENTER).build().perform();
	 

		System.out.println("asma");
	    
	    
	    
	    
	}

}
