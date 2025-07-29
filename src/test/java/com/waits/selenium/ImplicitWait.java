package com.waits.selenium;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/");
		// Maximizes the browser window
		driver.manage().window().maximize();
		// get the actual value of the title
		aTitle = driver.getTitle();
		// compare the actual title with the expected title
		if (aTitle.equals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		
	}

}
