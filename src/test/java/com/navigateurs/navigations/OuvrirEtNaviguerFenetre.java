package com.navigateurs.navigations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OuvrirEtNaviguerFenetre {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().driverVersion("127.0.6533.89").setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/?hl=fr");
        // Ouvrir une nouvelle fen�tre
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.wikipedia.org/");

        // V�rifier le titre de la nouvelle fen�tre
        String newWindowTitle = driver.getTitle();
        System.out.println("Titre de la nouvelle fen�tre : " + newWindowTitle);
        

        driver.quit();


	}

}
