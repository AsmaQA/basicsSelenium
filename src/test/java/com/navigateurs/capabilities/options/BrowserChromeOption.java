package com.navigateurs.capabilities.options; // D�clare le package pour l'organisation du code

import org.openqa.selenium.WebDriver; // Importation de l'interface WebDriver de Selenium
import org.openqa.selenium.chrome.ChromeDriver; // Importation de la classe ChromeDriver de Selenium
import org.openqa.selenium.chrome.ChromeOptions; // Importation de la classe ChromeOptions de Selenium

import io.github.bonigarcia.wdm.WebDriverManager; // Importation de WebDriverManager pour g�rer les pilotes de navigateur

public class BrowserChromeOption { // D�claration de la classe principale

	static WebDriver driver; // D�claration d'une variable statique de type WebDriver

	public static void main(String[] args) { // M�thode principale pour ex�cuter le programme

		ChromeOptions chromeOptions = new ChromeOptions(); // Cr�ation d'une instance de ChromeOptions pour d�finir des
															// options sp�cifiques pour le navigateur Chrome

		// Ajouter diff�rentes options pour le navigateur Chrome
		chromeOptions.addArguments("--incognito"); // Ouvrir Chrome en mode incognito
		chromeOptions.addArguments("--headless"); // Ex�cuter Chrome en mode sans t�te (sans interface graphique)
		chromeOptions.addArguments("--disable-extensions"); // D�sactiver les extensions de Chrome
		chromeOptions.addArguments("--window-size=1920,1080"); // D�finir la taille de la fen�tre du navigateur
		chromeOptions.addArguments("--user-agent=ASMA SLITI"); // D�finir un agent utilisateur personnalis�
		chromeOptions.addArguments("--lang=fr"); // D�finir la langue du navigateur en fran�ais
		chromeOptions.addArguments("--disable-popup-blocking"); // activer le blocage des pop-ups

		// Configurer WebDriverManager pour g�rer automatiquement le t�l�chargement et
		// la configuration du pilote Chrome
		WebDriverManager.chromedriver().setup();

		// Cr�er une instance de WebDriver avec les options de Chrome d�finies
		// pr�c�demment
		driver = new ChromeDriver(chromeOptions);

		// Ouvrir une page web
		driver.get("https://www.google.tn/?hl=fr");

		// V�rifier le titre de la page
		String pageTitle = driver.getTitle();
		System.out.println("Le titre de la page est : " + pageTitle); // Afficher le titre de la page

		// Fermer le navigateur
		driver.quit();
	}
}
