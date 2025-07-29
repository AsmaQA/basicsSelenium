package com.navigateurs.navigations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ManipulerNavigateur {

	public static void main(String[] args) {

		// Configurer le driver Chrome avec WebDriverManager pour gérer automatiquement la version correcte du driver
        WebDriverManager.chromedriver().setup();
        
        // Créez une instance de ChromeDriver
        WebDriver driver = new ChromeDriver(); 
        
        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();
        
        // Minimiser la fenêtre du navigateur
        driver.manage().window().minimize();
        
        // Naviguer vers l'URL spécifiée
        driver.get("https://www.google.com/");
        
        // Obtenir l'URL actuelle
        String url1 = driver.getCurrentUrl();
        System.out.println(url1);
        
        // Rafraîchir la page
        driver.navigate().refresh();
        
        // Naviguer vers une nouvelle URL
        driver.navigate().to("https://med.tn/");
        
        // Obtenir l'URL actuelle après la navigation
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        
        // Revenir à la page précédente
        driver.navigate().back();
        
        // Obtenir l'URL actuelle après être revenu en arrière
        String url3 = driver.getCurrentUrl();
        System.out.println(url3);
        
        // Obtenir le titre de la page actuelle
        String titre = driver.getTitle();
        
        
        
        
        
        // Avancer vers la page suivante
        driver.navigate().forward();
        
        // Obtenir l'URL actuelle après avoir avancé
        String url4 = driver.getCurrentUrl();
        System.out.println(url4);
        
      String actualTitle =  driver.getTitle();
        System.out.println(actualTitle);

        // Vérification entre le résultat prévu et le résultat trouvé
        if (titre.equals("Med.tn : Prenez rendez-vous en ligne avec un professionnel de santé - med.tn")) {
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
