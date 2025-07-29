package com.waits.selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.util.function.Function;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExFluentWait {
    public static WebDriver driver;

    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        String eTitle = "Demo Guru99 Page";
        String aTitle = "";
        // launch Chrome and redirect it to the Base URL
        driver.get("https://demo.guru99.com/test/guru99home/");
        // Maximizes the browser window
        driver.manage().window().maximize();
        // get the actual value of the title
        aTitle = driver.getTitle();
        // compare the actual title with the expected title
        if (aTitle.contentEquals(eTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        // Implement FluentWait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        // Wait and find the element using FluentWait
        WebElement seleniumLink = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//tr/td[2]/a[2]"));
            }
        });

        // Click on the selenium link
        seleniumLink.click();

        // Close the browser
        driver.close();
    }
}
