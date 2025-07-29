package webelement.commandes;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementCommandes {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
//Set la version du navigateur 
		WebDriverManager.chromedriver().setup();
		// Instantiation de l'objet driver
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		// le titre de la page
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("le titre est " + title + " L'actuel URL est " + currentUrl);

		Thread.sleep(3000);
		WebElement champemail = driver.findElement(By.xpath("//*[@name='username']"));
		boolean status3 = champemail.isSelected();
		System.out.println(status3);
		champemail.sendKeys("Asma");
		Thread.sleep(3000);
		champemail.clear();

		WebElement linkText = driver.findElement(By.linkText("OrangeHRM, Inc"));
		boolean status = linkText.isDisplayed();
		boolean status2 = linkText.isEnabled();
		System.out.println("is displayed ? " + status);
		System.out.println("is enabled ? " + status2);

		WebElement boutton = driver.findElement(By.tagName("button"));
		String tagname = boutton.getTagName();
		System.out.println("valeur de tagName " + tagname);

		String cssValue = boutton.getCssValue("font-size");
		System.out.println("valeur CSS " + cssValue);

		String attValue = boutton.getAttribute("type");
		System.out.println("valeur attribut " + attValue);
		Dimension dimensions = boutton.getSize();
		System.out.println("Height :" + dimensions.height + " Width : " + dimensions.width);
		Point point = boutton.getLocation();
		System.out.println("X cordinate : " + point.x + " Y cordinate: " + point.y);
		String buttonText = boutton.getText();
		System.out.println(buttonText);

		boutton.submit();
		boutton.click();

	}

}
