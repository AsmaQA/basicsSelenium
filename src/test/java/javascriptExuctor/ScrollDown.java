package javascriptExuctor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
	public static WebDriver driver;
	public static void main(String[] args) {
		 	
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();		
		        		
		        //Creating the JavascriptExecutor interface object by Type casting		
		        JavascriptExecutor js = (JavascriptExecutor)driver;		
		        		
		        //Launching the Site.		
		        driver.get("http://moneyboats.com/");		
		        
		  
		        //Maximize window		
		        driver.manage().window().maximize();		
		        		
		        //Vertical scroll down by 600  pixels		
		        js.executeScript("window.scrollBy(0,600)");	

	}

}
