package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrame {

	public static void main(String[] args) {
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		 int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
         System.out.println("Number of Frames on a Page:" + countIframesInPage);
         WebElement frame1 = driver.findElement(By.id("frame1"));
         driver.switchTo().frame(frame1);
         WebElement frame1Element= driver.findElement(By.tagName("body"));  
         String frame1Text=frame1Element.getText();
         System.out.println("Frame1 is :"+frame1Text);
         int countIframesInFrame1 =driver.findElements(By.tagName("iframe")).size();
         System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);
         driver.switchTo().frame(0);
         int countIframesInFrame2 =driver.findElements(By.tagName("iframe")).size();
         System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
//         Locate the Element inside the Frame1
        WebElement frameChildElement= driver.findElement(By.tagName("body"));
        
//         //Get the text for frame1 element
         String frameChildElemenText =frameChildElement.getText();
//         
//         //Try to Print the text present inside parent frame
        System.out.println("Frame1 is :"+frameChildElemenText);
//         //Switch to Parent iFrame
         driver.switchTo().parentFrame();
//         
//         //Locate the Element inside the Frame1
         WebElement frameParentElement= driver.findElement(By.tagName("body"));
        
//         //Get the text for frame1 element
         String frameParentElementText =frameParentElement.getText();
         
//         //Try to Print the text present inside parent frame
         System.out.println("Frame1 is :"+frameParentElementText);
        
//       //Switch to default content
         driver.switchTo().defaultContent();

//         //Try to print the heading of the main page without swithcing
         WebElement mainPageText=driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));
         System.out.println(mainPageText.getText());
	
		
	}

}
