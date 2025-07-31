package com.waits.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/");
		wait.until(ExpectedConditions.urlContains("guru99home"));
		
		WebElement champsEmail = driver.findElement(By.xpath("//*[@placeholder='Enter Emailasma']")) ;
		wait.until(ExpectedConditions.visibilityOf(champsEmail));
		// Maximizes the browser window
		driver.manage().window().maximize();
		// get the actual value of the title
		aTitle = driver.getTitle();
		// compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		WebElement guru99seleniumlink;
		guru99seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//tr/td[2]/a[2]")));
		guru99seleniumlink.click();
	}

}
