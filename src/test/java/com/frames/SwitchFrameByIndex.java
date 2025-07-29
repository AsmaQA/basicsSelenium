package com.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchFrameByIndex {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		 List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	        frames.addAll(driver.findElements(By.tagName("frame")));

	        // Parcourir chaque frame pour récupérer son index
	        for (int i = 0; i < frames.size(); i++) {
	            WebElement frame = frames.get(i);
	     //       System.out.println("Frame index: " + i + ", Frame ID: " + frame.getAttribute("id"));
	            System.out.println("Frame index: " + i );
	        }
	        
		// Switch by Index
		driver.switchTo().frame(0);
		WebElement frame0 = driver.findElement(By.tagName("form"));		
		String textframe0 = frame0.getText();
		System.out.println(textframe0);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement frame1 = driver.findElement(By.tagName("form"));		
		String textframe1 = frame1.getText();
		System.out.println(textframe1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		WebElement frame2 = driver.findElement(By.tagName("form"));		
		String textframe2 = frame2.getText();
		System.out.println(textframe2);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		WebElement frame3 = driver.findElement(By.tagName("form"));		
		String textframe3 = frame3.getText();
		System.out.println(textframe3);		
//		driver.quit();
//		
		
		
		
	}

}
