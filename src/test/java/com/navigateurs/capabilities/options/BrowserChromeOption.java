package com.navigateurs.capabilities.options; // Déclare le package pour l'organisation du code

import org.openqa.selenium.WebDriver; // Importation de l'interface WebDriver de Selenium
import org.openqa.selenium.chrome.ChromeDriver; // Importation de la classe ChromeDriver de Selenium
import org.openqa.selenium.chrome.ChromeOptions; // Importation de la classe ChromeOptions de Selenium

import io.github.bonigarcia.wdm.WebDriverManager; // Importation de WebDriverManager pour gérer les pilotes de navigateur

public class BrowserChromeOption { // Déclaration de la classe principale

	static WebDriver driver; // Déclaration d'une variable statique de type WebDriver

	public static void main(String[] args) { // Méthode principale pour exécuter le programme

		ChromeOptions chromeOptions = new ChromeOptions(); // Création d'une instance de ChromeOptions pour définir des
															// options spécifiques pour le navigateur Chrome

		// Ajouter différentes options pour le navigateur Chrome
		chromeOptions.addArguments("--incognito"); // Ouvrir Chrome en mode incognito
		chromeOptions.addArguments("--headless"); // Exécuter Chrome en mode sans tête (sans interface graphique)
		chromeOptions.addArguments("--disable-extensions"); // Désactiver les extensions de Chrome
		chromeOptions.addArguments("--window-size=1920,1080"); // Définir la taille de la fenêtre du navigateur
		chromeOptions.addArguments("--user-agent=ASMA SLITI"); // Définir un agent utilisateur personnalisé
		chromeOptions.addArguments("--lang=fr"); // Définir la langue du navigateur en français
		chromeOptions.addArguments("--disable-popup-blocking"); // activer le blocage des pop-ups

		// Configurer WebDriverManager pour gérer automatiquement le téléchargement et
		// la configuration du pilote Chrome
		WebDriverManager.chromedriver().setup();

		// Créer une instance de WebDriver avec les options de Chrome définies
		// précédemment
		driver = new ChromeDriver(chromeOptions);

		// Ouvrir une page web
		driver.get("https://www.google.tn/?hl=fr");

		// Vérifier le titre de la page
		String pageTitle = driver.getTitle();
		System.out.println("Le titre de la page est : " + pageTitle); // Afficher le titre de la page

		// Fermer le navigateur
		driver.quit();
	}
}
