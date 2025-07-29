package com.tool.tip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTable {

	public static void main(String[] args) {
   
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/tool-tips/");

		WebElement toolsTipBtn = driver.findElement(By.id("toolTipButton"));

		Actions action = new Actions(driver);

		action.moveToElement(toolsTipBtn).perform();

		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));

		action.moveToElement(placeHolder).perform();

	}

}
