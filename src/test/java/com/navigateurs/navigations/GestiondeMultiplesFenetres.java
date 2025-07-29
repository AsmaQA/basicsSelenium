package com.navigateurs.navigations;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GestiondeMultiplesFenetres {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		// Ouvrir deux nouvelles fen�tres et naviguer vers des URL diff�rentes
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.wikipedia.org/");

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.stackoverflow.com/");

		// Obtenir tous les identifiants de fen�tres (Nan doublon)
		Set<String> allWindows = driver.getWindowHandles();

		// Imprimer les titres de chaque fen�tre
		for (String windowHandle : allWindows) {
			driver.switchTo().window(windowHandle);
			System.out.println("Titre de la fen�tre : " + driver.getTitle());
		}
		driver.quit();

	}

}
