package com.record.test;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ScreenShotElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	
		// Trouve l'élément cible (ici une image) par son ID "imagetrgt"
		WebElement element = driver.findElement(By.id("imagetrgt"));

		// Capture une capture d'écran de l'élément sélectionné
		File source = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);

		// Enregistre la capture d'écran dans un dossier local avec un nom de fichier spécifié
		FileHandler.copy(source, new File("./ScreenShot/element.png"));

		// Termine la session du navigateur et ferme toutes les fenêtres ouvertes
		// driver.quit(); // Le code `driver.quit()` est commenté pour garder le navigateur ouvert
	}

}
