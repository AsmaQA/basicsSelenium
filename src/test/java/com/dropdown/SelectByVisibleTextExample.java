package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByVisibleTextExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		// Declare WebDriver reference and assign an object of FirefoxDriver class.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Maximize the browser.
		driver.manage().window().maximize();

		// Declare a variable URL of type String and store the URL.
		String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html";

		// Call get() method to open the web page URL and pass URL as a parameter.
		driver.get(URL);

		// Wait for some time to load the whole web page.

		// Locate dropdown element on web page by By.xpath.
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));

		// Verify the dropdown is enabled and visible.
		if (dropdown.isEnabled() && dropdown.isDisplayed()) {
			System.out.println("Dropdown is enabled and visible");
		} else {
			System.out.println("Dropdown is not visible");
		}
		// Create an object of Select class and pass the dropdown of type WebElement as
		// an argument.
		Select select = new Select(dropdown);

		// Verify that dropdown does not allow the multiple selections.
		if (select.isMultiple()) {
			System.out.println("Dropdown list accepts multiple choices");
		} else {
			System.out.println("Dropdown list does not accept multiple choices");
		}
		// Call getOptions() method to get all options of list. size() method is used to
		// get size of list.
		int listSize = select.getOptions().size();
		System.out.println("List size: " + listSize);

		// Select the option "India" by sending visible text.
		select.selectByVisibleText("India"); 
		// Check that "India" is selected as an option or not.
		// Use System.out.println method to display a message
		// to indicate whether the option is chosen and verification was successful or
		// not.
		String getText = select.getFirstSelectedOption().getText();
		System.out.println("Option chosen: " + getText);

		// Close the browser.
		//driver.close();

	}

}
