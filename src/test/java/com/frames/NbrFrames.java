package com.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NbrFrames {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/"); 
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("frame"));
		System.out.println("Total number of frames are " + iframeElements.size());

//		//By executing a java script
//		JavascriptExecutor exe = (JavascriptExecutor) driver;
//		Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
//		System.out.println("No. of iframes on the page are " + noOfFrames);

	}

}
