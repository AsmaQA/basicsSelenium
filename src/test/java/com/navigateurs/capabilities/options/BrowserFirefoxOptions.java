package com.navigateurs.capabilities.options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFirefoxOptions {
	
	static WebDriver driver; 

	public static void main(String[] args) {
	
		FirefoxOptions firefoxOptions = new FirefoxOptions();

		firefoxOptions.addArguments("-private"); // Ouvrir Firefox en mode priv�
		//firefoxOptions.addArguments("--headless"); // Ex�cuter Firefox en mode sans t�te (sans interface graphique)
		firefoxOptions.addArguments("--disable-extensions"); // D�sactiver les extensions de Firefox
		firefoxOptions.addArguments("--window-size=1920,1080"); // D�finir la taille de la fen�tre du navigateur
		firefoxOptions.addArguments("--lang=en"); // D�finir la langue du navigateur en fran�ais
		firefoxOptions.addArguments("--disable-popup-blocking"); // D�sactiver le blocage des pop-ups

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(firefoxOptions);

		// Cr�er une instance de WebDriver avec les options de Firefox

		// Ouvrir une page web
		driver.get("https://www.google.com");

		// V�rifier le titre de la page
		String pageTitle = driver.getTitle();
		System.out.println("Le titre de la page est : " + pageTitle);

		// Fermer le navigateur
		driver.quit();
	}

}
