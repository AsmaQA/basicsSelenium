package com.navigateurs.navigations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ManipulerNavigateur {

	public static void main(String[] args) {

		// Configurer le driver Chrome avec WebDriverManager pour g�rer automatiquement la version correcte du driver
        WebDriverManager.chromedriver().setup();
        
        // Cr�ez une instance de ChromeDriver
        WebDriver driver = new ChromeDriver(); 
        
        // Maximiser la fen�tre du navigateur
        driver.manage().window().maximize();
        
        // Minimiser la fen�tre du navigateur
        driver.manage().window().minimize();
        
        // Naviguer vers l'URL sp�cifi�e
        driver.get("https://www.google.com/");
        
        // Obtenir l'URL actuelle
        String url1 = driver.getCurrentUrl();
        System.out.println(url1);
        
        // Rafra�chir la page
        driver.navigate().refresh();
        
        // Naviguer vers une nouvelle URL
        driver.navigate().to("https://med.tn/");
        
        // Obtenir l'URL actuelle apr�s la navigation
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        
        // Revenir � la page pr�c�dente
        driver.navigate().back();
        
        // Obtenir l'URL actuelle apr�s �tre revenu en arri�re
        String url3 = driver.getCurrentUrl();
        System.out.println(url3);
        
        // Obtenir le titre de la page actuelle
        String titre = driver.getTitle();
        
        
        
        
        
        // Avancer vers la page suivante
        driver.navigate().forward();
        
        // Obtenir l'URL actuelle apr�s avoir avanc�
        String url4 = driver.getCurrentUrl();
        System.out.println(url4);
        
      String actualTitle =  driver.getTitle();
        System.out.println(actualTitle);

        // V�rification entre le r�sultat pr�vu et le r�sultat trouv�
        if (titre.equals("Med.tn : Prenez rendez-vous en ligne avec un professionnel de sant� - med.tn")) {
            System.out.println("le titre de la page est correct");
        } else {
            System.out.println("le titre est incorrect");
        }
        
        // Afficher le titre de la page
        System.out.println("le titre est : " + titre);
        
        // Quitter tous les onglets
        driver.quit(); 
        // Pour fermer seulement l'onglet en cours, utilisez driver.close()
    }

}
