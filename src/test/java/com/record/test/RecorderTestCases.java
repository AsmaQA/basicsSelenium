package com.record.test;

// Importations n�cessaires pour utiliser la biblioth�que ATU Test Recorder
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
// Importation pour la gestion automatique des WebDrivers avec WebDriverManager
import io.github.bonigarcia.wdm.WebDriverManager;
// Importations de Selenium pour contr�ler le navigateur Web
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Importations pour g�rer les fichiers et formater les dates
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecorderTestCases {

    public static void main(String[] args) throws ATUTestRecorderException {
        // Utilisation de WebDriverManager pour t�l�charger et configurer automatiquement ChromeDriver.
        WebDriverManager.chromedriver().setup();
        // Cr�ation d'une instance de ChromeDriver pour d�marrer un navigateur Chrome.
        WebDriver driver = new ChromeDriver();

        // Utilisation de SimpleDateFormat pour formater la date dans un format sp�cifique (ann�e, mois, jour, heure, minute, seconde).
        SimpleDateFormat d = new SimpleDateFormat("yy_MM_dd_HH_mm_ss");
        // Obtenir la date et l'heure actuelles.
        Date dt = new Date();

        // Chemin du r�pertoire o� les vid�os d'enregistrement seront stock�es.
        String videoDirectory = "C:\\Users\\sliti\\eclipse-workspace\\CoursSeleniumWebDriverBasics\\TestVideos";
        // Cr�ation d'un objet File repr�sentant le r�pertoire o� les vid�os seront sauvegard�es.
        File dir = new File(videoDirectory);
        // Si le r�pertoire n'existe pas, il est cr��.
        if (!dir.exists()) {
            dir.mkdirs(); // Cr�er le r�pertoire s'il n'existe pas.
        }

        // G�n�ration du nom du fichier vid�o en utilisant la date format�e et ajout de l'extension ".mov".
        String videoFileName = "Video_" + d.format(dt) ;
      
        // Cr�ation d'une instance de ATUTestRecorder pour enregistrer les actions dans le navigateur.
        // Le premier param�tre est le r�pertoire, le deuxi�me est le nom du fichier vid�o, et le troisi�me (false) indique qu'il ne s'agit pas d'un enregistrement audio.
        ATUTestRecorder recorder = new ATUTestRecorder(videoDirectory, videoFileName, false);
        // D�marrage de l'enregistrement vid�o.
        recorder.start();

        // Ouverture du site web "https://www.de-en-ligne.fr/" dans le navigateur Chrome.
        driver.get("https://www.de-en-ligne.fr/");

        // Arr�t de l'enregistrement vid�o apr�s avoir acc�d� au site web.
        recorder.stop();
        // Fermeture du navigateur apr�s la fin de l'enregistrement.
        driver.close();
    }
}
