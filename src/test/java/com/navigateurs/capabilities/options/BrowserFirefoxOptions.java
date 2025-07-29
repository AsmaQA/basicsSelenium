package com.navigateurs.capabilities.options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFirefoxOptions {
	
	static WebDriver driver; 

	public static void main(String[] args) {
	
		FirefoxOptions firefoxOptions = new FirefoxOptions();

		firefoxOptions.addArguments("-private"); // Ouvrir Firefox en mode privé
		//firefoxOptions.addArguments("--headless"); // Exécuter Firefox en mode sans tête (sans interface graphique)
		firefoxOptions.addArguments("--disable-extensions"); // Désactiver les extensions de Firefox
		firefoxOptions.addArguments("--window-size=1920,1080"); // Définir la taille de la fenêtre du navigateur
		firefoxOptions.addArguments("--lang=en"); // Définir la langue du navigateur en français
		firefoxOptions.addArguments("--disable-popup-blocking"); // Désactiver le blocage des pop-ups

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(firefoxOptions);

		// Créer une instance de WebDriver avec les options de Firefox

		// Ouvrir une page web
		driver.get("https://www.google.com");

		// Vérifier le titre de la page
		String pageTitle = driver.getTitle();
		System.out.println("Le titre de la page est : " + pageTitle);

		// Fermer le navigateur
		driver.quit();
	}

}
