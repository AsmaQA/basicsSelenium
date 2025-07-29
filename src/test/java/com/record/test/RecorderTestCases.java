package com.record.test;

// Importations nécessaires pour utiliser la bibliothèque ATU Test Recorder
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
// Importation pour la gestion automatique des WebDrivers avec WebDriverManager
import io.github.bonigarcia.wdm.WebDriverManager;
// Importations de Selenium pour contrôler le navigateur Web
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Importations pour gérer les fichiers et formater les dates
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecorderTestCases {

    public static void main(String[] args) throws ATUTestRecorderException {
        // Utilisation de WebDriverManager pour télécharger et configurer automatiquement ChromeDriver.
        WebDriverManager.chromedriver().setup();
        // Création d'une instance de ChromeDriver pour démarrer un navigateur Chrome.
        WebDriver driver = new ChromeDriver();

        // Utilisation de SimpleDateFormat pour formater la date dans un format spécifique (année, mois, jour, heure, minute, seconde).
        SimpleDateFormat d = new SimpleDateFormat("yy_MM_dd_HH_mm_ss");
        // Obtenir la date et l'heure actuelles.
        Date dt = new Date();

        // Chemin du répertoire où les vidéos d'enregistrement seront stockées.
        String videoDirectory = "C:\\Users\\sliti\\eclipse-workspace\\CoursSeleniumWebDriverBasics\\TestVideos";
        // Création d'un objet File représentant le répertoire où les vidéos seront sauvegardées.
        File dir = new File(videoDirectory);
        // Si le répertoire n'existe pas, il est créé.
        if (!dir.exists()) {
            dir.mkdirs(); // Créer le répertoire s'il n'existe pas.
        }

        // Génération du nom du fichier vidéo en utilisant la date formatée et ajout de l'extension ".mov".
        String videoFileName = "Video_" + d.format(dt) ;
      
        // Création d'une instance de ATUTestRecorder pour enregistrer les actions dans le navigateur.
        // Le premier paramètre est le répertoire, le deuxième est le nom du fichier vidéo, et le troisième (false) indique qu'il ne s'agit pas d'un enregistrement audio.
        ATUTestRecorder recorder = new ATUTestRecorder(videoDirectory, videoFileName, false);
        // Démarrage de l'enregistrement vidéo.
        recorder.start();

        // Ouverture du site web "https://www.de-en-ligne.fr/" dans le navigateur Chrome.
        driver.get("https://www.de-en-ligne.fr/");

        // Arrêt de l'enregistrement vidéo après avoir accédé au site web.
        recorder.stop();
        // Fermeture du navigateur après la fin de l'enregistrement.
        driver.close();
    }
}
