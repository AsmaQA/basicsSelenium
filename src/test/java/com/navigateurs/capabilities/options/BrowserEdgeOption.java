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
		edgeOptions.addArguments("--inprivate"); // Ouvrir Edge en mode privé
		edgeOptions.addArguments("--headless"); // Exécuter Edge en mode sans tête (sans interface graphique)
		edgeOptions.addArguments("--disable-extensions"); // Désactiver les extensions de Edge
		edgeOptions.addArguments("--disable-gpu"); // Désactiver l'accélération GPU (utile en mode sans tête)
		edgeOptions.addArguments("--window-size=1920,1080"); // Définir la taille de la fenêtre du navigateur
		edgeOptions.addArguments("--lang=fr"); // Définir la langue du navigateur en français
		edgeOptions.addArguments("--disable-popup-blocking"); // Désactiver le blocage des pop-ups

		// Configurer le driver Edge avec WebDriverManager pour gérer automatiquement la
		// version correcte du driver
		WebDriverManager.edgedriver().setup();
		// Initialiser l'instance de WebDriver avec les options configurées
		driver = new EdgeDriver(edgeOptions);

		// Ouvrir une page web
		driver.get("https://www.google.tn/?hl=fr");

		// Vérifier le titre de la page
		String pageTitle = driver.getTitle();
		System.out.println("Le titre de la page est : " + pageTitle);

		// Fermer le navigateur
		driver.quit();

	}

}
