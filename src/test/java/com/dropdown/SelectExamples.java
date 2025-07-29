package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectExamples {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "https://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		System.out.println(drpCountry.getFirstSelectedOption().getText());
		
		drpCountry.selectByIndex(1);
		System.out.println("1 2 3 vive a l'" + drpCountry.getFirstSelectedOption().getText());

		drpCountry.selectByVisibleText("TUNISIA");
		System.out.println("1 2 3 vive a '" + drpCountry.getFirstSelectedOption().getText()); 
		
		drpCountry.selectByValue("ETHIOPIA");
		System.out.println(drpCountry.getFirstSelectedOption().getText());


	}

}
