package com.findelements.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindWebElements {
 
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		 List<WebElement> menus = driver.findElements(By.xpath("//*[@id='navbar-brand-centered']/ul/li"));
		 if (menus.isEmpty()) {
	            System.out.println("Aucun élément trouvé avec le tag <li>.");
	        } else {
	            // Parcourt la liste des éléments trouvés
	        	for (int i = 0; i < menus.size(); i++) {
	                WebElement menu = menus.get(i);
	                // Affiche l'index et le texte de chaque élément dans la console
	                System.out.println("Index: " + i + ", Texte: " + menu.getText());
	            }
	        }




	}

}
