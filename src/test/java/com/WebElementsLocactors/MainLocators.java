package com.WebElementsLocactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainLocators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// id =
		String url_id = "https://www.google.com/";
		driver.get(url_id);		
		WebElement champsDeRechercheGoogle;		
		champsDeRechercheGoogle = driver.findElement(By.id("APjFqb"));
		champsDeRechercheGoogle.sendKeys("Asma Sliti");
		// name
		String url_name = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url_name);
		Thread.sleep(3000);
		WebElement champsDeSaisieUerName1;
		champsDeSaisieUerName1 = driver.findElement(By.name("username"));
		champsDeSaisieUerName1.sendKeys("Admin");
		// className 
//		WebElement champsDeSaisieUerName2;
//		champsDeSaisieUerName2 = driver.findElement(By.className("oxd-input"));
//		champsDeSaisieUerName2.getText();
		// tagName
		WebElement champsDeSaisieUerName3;
		champsDeSaisieUerName3 = driver.findElement(By.tagName("button"));
		champsDeSaisieUerName3.click();
		
		// LinkText
		WebElement linkOrangeHRM1;
		linkOrangeHRM1 = driver.findElement(By.linkText("OrangeHRM, Inc"));
		linkOrangeHRM1.click();
	
	
		// PartialLinkText
		
		driver.get(url_name);
		Thread.sleep(3000);
		WebElement partialOrangeHRM2;
		partialOrangeHRM2 = driver.findElement(By.partialLinkText("Inc"));
		partialOrangeHRM2.click();
		
		WebElement partialLinklanguage ;
		partialLinklanguage = driver.findElement(By.partialLinkText("E"));
		System.out.println(partialLinklanguage.getText());
		partialLinklanguage.click();

	}
}
