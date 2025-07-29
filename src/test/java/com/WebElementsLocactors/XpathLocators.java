package com.WebElementsLocactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocators {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		
	
		String absolutXpath = "/html/body/div/div[1]/div/h4[1]/b";
		WebElement tableText1 = driver.findElement(By.xpath(absolutXpath));
		String tableTextAffiche1 = tableText1.getText();
		System.out.println(tableTextAffiche1);
		String relativeXpath = "//div[@class='featured-box cloumnsize1']//h4[1]//b[1]";
		WebElement tableText2 = driver.findElement(By.xpath(relativeXpath));
		String tableTextAffiche2 = tableText2.getText();
		System.out.println(tableTextAffiche2);

		// Basic XPath
		String basicXpath = "//input[@name='uid']";
		String exempleXpath1 = "//input[@type='text'] ";
		String exempleXpath2 = "//label[@id='message23']";
		String exempleXpath3 = "//input[@value='RESET']";
		//* i don't care qlq soit le tagname
		String exempleXpath4 = "//*[@class='barone']";
		String exempleXpath5 = "//a[@href='http://demo.guru99.com/']";
		String exempleXpath6 = "//img[@src='//guru99.com/images/home/java.png']";
		
		
		// Contains()

		String xpathContains1 = "//*[contains(@type,'sub')]";
		String xpathContains2 = "//*[contains(@name,'btn')]";
		String xpathcontains3 = "//*[contains(@id,'message')]"; 
		//$$ a revoir
		String xpathcontainsText = "//*[contains(text(),'Tutorials Library')]";

		// Using OR & AND

		String xpathOR_AND1 = "//*[@type='submit' or @name='btnReset']";
		String xpathOR_AND2 = "//input[@type='submit' and @name='btnLogin']";

		// Xpath Starts-with

		String xpathStartWith = "//label[starts-with(@id,'message')]";

		// XPath Text() Function

		String xpathFunction = "//td[text()='UserID']";

		// XPath axes methods

		String xpathFollowing1 = "//*[@type='text']//following::input";
		String xpathFollowing2 = "//*[@type='text']//following::input[1]";

		// Ancestor

		String xpathAncestor1 = "//*[text()='Enterprise Testing']//ancestor::div";
		String xpathhAncetor2 = "Xpath=//*[text()='Enterprise Testing']//ancestor::div";

		// Child

		String xpathChild1 = "//*[@id='java_technologies']//child::li";
		String xpathChild2 = "//*[@id='java_technologies']//child::li[1]";

		// Preceding

		String xpathPreceding1 = "//*[@type='submit']//preceding::input";
		String xpathPreceding2 = "//*[@type='submit']//preceding::input[1]";

		// Following-sibling

		String xpathFollowingSibling = "//*[@type='submit']//following-sibling::input";

		// Parent

		String xpathParent = "//*[@type='password']//parent::td";

		// Self

		String xpathSelf = "//*[@type='password']//self::input";

		// Descendant

		String xpathDescendant1 = "//*[@width='20%']//descendant::a";
		String xpathDescendant2 = "//*[@width='20%']//descendant::a[1]";


		
		

	}

}
