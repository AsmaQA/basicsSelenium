package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeTextAlerte {
	static WebDriver driver ; 


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("Hatem");
		driver.findElement(By.name("submit")).click();
		
		String textAlert= driver.switchTo().alert().getText();
		
		System.out.println(textAlert);
		
	}

}
