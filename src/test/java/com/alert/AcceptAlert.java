package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcceptAlert {
	static WebDriver driver ; 

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("Mouna");
		driver.findElement(By.name("submit")).click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}

}
