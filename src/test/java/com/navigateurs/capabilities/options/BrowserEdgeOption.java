package com.navigateurs.capabilities.options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserEdgeOption {

	static WebDriver driver;

	public static void main(String[] args) {

		EdgeOptions edgeOptions = new EdgeOptions();

		// Ajouter des arguments pour configurer le navigateur
		edgeOptions.addArguments("--inprivate"); // Ouvrir Edge en mode priv�
		edgeOptions.addArguments("--headless"); // Ex�cuter Edge en mode sans t�te (sans interface graphique)
		edgeOptions.addArguments("--disable-extensions"); // D�sactiver les extensions de Edge
		edgeOptions.addArguments("--disable-gpu"); // D�sactiver l'acc�l�ration GPU (utile en mode sans t�te)
		edgeOptions.addArguments("--window-size=1920,1080"); // D�finir la taille de la fen�tre du navigateur
		edgeOptions.addArguments("--lang=fr"); // D�finir la langue du navigateur en fran�ais
		edgeOptions.addArguments("--disable-popup-blocking"); // D�sactiver le blocage des pop-ups

		// Configurer le driver Edge avec WebDriverManager pour g�rer automatiquement la
		// version correcte du driver
		WebDriverManager.edgedriver().setup();
		// Initialiser l'instance de WebDriver avec les options configur�es
		driver = new EdgeDriver(edgeOptions);

		// Ouvrir une page web
		driver.get("https://www.google.tn/?hl=fr");

		// V�rifier le titre de la page
		String pageTitle = driver.getTitle();
		System.out.println("Le titre de la page est : " + pageTitle);

		// Fermer le navigateur
		driver.quit();

	}

}
