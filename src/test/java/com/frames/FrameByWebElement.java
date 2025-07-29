package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameByWebElement {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		// First find the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.id("frame1"));

		// now use the switch command
		driver.switchTo().frame(iframeElement);
		String textFrame1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(textFrame1);
		driver.quit();
	}

}
