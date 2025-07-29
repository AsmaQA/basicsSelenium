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
	
		// Trouve l'�l�ment cible (ici une image) par son ID "imagetrgt"
		WebElement element = driver.findElement(By.id("imagetrgt"));

		// Capture une capture d'�cran de l'�l�ment s�lectionn�
		File source = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);

		// Enregistre la capture d'�cran dans un dossier local avec un nom de fichier sp�cifi�
		FileHandler.copy(source, new File("./ScreenShot/element.png"));

		// Termine la session du navigateur et ferme toutes les fen�tres ouvertes
		// driver.quit(); // Le code `driver.quit()` est comment� pour garder le navigateur ouvert
	}

}
