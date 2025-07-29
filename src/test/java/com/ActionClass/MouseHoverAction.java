package com.ActionClass;

// Importation des classes nécessaires pour la gestion du WebDriver, les interactions avec les éléments, et l'exécution de scripts JavaScript.
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

    static WebDriver driver;  // Déclaration du WebDriver comme variable statique pour être accessible dans toute la classe.

    public static void main(String[] args)  {

        // Configuration du WebDriver pour utiliser Chrome avec WebDriverManager.
        WebDriverManager.chromedriver().setup();

        // Initialisation du WebDriver avec une instance de Chrome.
        driver = new ChromeDriver();

        // Accès à l'URL du site web BrowserStack.
        driver.get("https://www.browserstack.com/");
     // Maximisation de la fenêtre du navigateur.
        driver.manage().window().maximize();
        // Utilisation de JavascriptExecutor pour scroller de 300 pixels vers le bas de la page.
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");

        // Initialisation d'un objet Actions pour effectuer des actions complexes comme le hover (passer la souris).
        Actions ac = new Actions(driver);

        // Identification de l'élément correspondant à la première option "Live" sur la page via un XPath complexe.
        WebElement live = driver.findElement(By.xpath("//section/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/a[1]/span/h4"));

//        // Mouvement de la souris vers l'élément "Live" pour déclencher le survol (hover).
          ac.moveToElement(live).build().perform();
//
//         Impression du texte de l'élément "Live" dans la console.
        System.out.println(live.getText());

//        // Pause de 3 secondes pour laisser le temps d'observer l'effet du survol (optionnel).
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Gestion de l'exception si l'interruption du Thread est capturée.
            e.printStackTrace();
        }

//         Identification de l'élément correspondant à la deuxième option "Automate" via un autre XPath complexe.
        WebElement automate = driver.findElement(By.xpath("//section/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/a[2]/span/h4"));

//        // Mouvement de la souris vers l'élément "Automate".
        ac.moveToElement(automate).build().perform();
//
        // Impression du texte de l'élément "Automate" dans la console.
        System.out.println(automate.getText());
    }
}
