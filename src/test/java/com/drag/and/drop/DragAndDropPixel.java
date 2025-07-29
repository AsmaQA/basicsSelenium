package com.drag.and.drop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropPixel {

	static WebDriver driver;

	public static void main(String[] args) {

		// Maximize the browser.
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		// Element(BANK) which need to drag.
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));

		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

		int fromX = From.getLocation().getX();
		int fromY = From.getLocation().getY();
		int toX = To.getLocation().getX();
		int toY = To.getLocation().getY();
		int offsetX = toX - fromX;
		int offsetY = toY - fromY;

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", To);

		Actions act = new Actions(driver);
		act.dragAndDropBy(From, offsetX, offsetY).build().perform();

	}

}
