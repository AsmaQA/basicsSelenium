package javascriptExuctor;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickButtonJS {
	static WebDriver driver;

	public static void main(String[] args) {
		    WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
 		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        driver.get("https://demo.guru99.com/V4/");			
	        		
	        WebElement button =driver.findElement(By.name("btnLogin"));			
	        		
	        //Login to Guru99 		
	        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
	        driver.findElement(By.name("password")).sendKeys("amUpenu");					
	        		
	        //Perform Click on LOGIN button using JavascriptExecutor		
	        js.executeScript("arguments[0].click();", button);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));                        
	        //To generate Alert window using JavascriptExecutor. Display the alert message 	
            Alert newAlert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("New alert: " + newAlert.getText());
            newAlert.accept(); // Accept the new alert
	        js.executeScript("alert (' User or Password is not valid');");


	}

}
