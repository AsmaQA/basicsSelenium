package com.boutton.radio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--search-engine-choice-country");
		driver = new ChromeDriver();
		String url ="https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
		driver.manage().window().maximize();
		driver.get(url);
				
		    Thread.sleep(3000);
	        WebElement radioButton  = driver.findElement(By.xpath("//input[@ value='Mozilla']"));

	        if (!radioButton.isSelected()) {
	            radioButton.click();
	            System.out.println("Button Mozilla est bien selectionné");
	        }
	        else {
	            System.out.println("Button Mozilla est deja selectionné.");
	        } 
	}
	}
