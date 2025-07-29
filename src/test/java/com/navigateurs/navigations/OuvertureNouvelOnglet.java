package com.navigateurs.navigations;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OuvertureNouvelOnglet {
	static WebDriver driver;


	public static void main(String[] args) {
	      WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();

	        // Ouvrir le premier onglet avec Google
	        driver.get("https://www.google.com/");
	        
	        // Obtenir l'identifiant de l'onglet principal
	        String mainWindow = driver.getWindowHandle();

	        // Ouvrir un nouvel onglet avec Bing
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.navigate().to("https://www.bing.com/");
	        
	        // Ouvrir un troisième onglet avec Yahoo
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.navigate().to("https://www.yahoo.com/");
	        
	        // Obtenir tous les identifiants d'onglets
	        Set<String> allWindows = driver.getWindowHandles();

	        // Naviguer entre les onglets et afficher les titres
	        for (String windowHandle : allWindows) {
	            driver.switchTo().window(windowHandle);
	            System.out.println("Titre de l'onglet : " + driver.getTitle());
	        }

	        // Fermer tous les onglets sauf le dernier
	        for (String windowHandle : allWindows) {
	            if (!windowHandle.equals(mainWindow)) {
	                driver.switchTo().window(windowHandle);
	                driver.close();
	            }
	        }

	        // Basculer vers le dernier onglet
	        driver.switchTo().window(mainWindow);
	        System.out.println("Dernier onglet ouvert : " + driver.getTitle());

	        // Fermer le dernier onglet
	        driver.quit();
	    }
	}