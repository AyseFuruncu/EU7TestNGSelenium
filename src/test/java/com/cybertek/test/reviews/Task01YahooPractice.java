package com.cybertek.test.reviews;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01YahooPractice {

    //open the webpage go to yahoo.com and verify the title

    //expectedTitle="Yahoo"
    // ActualTitle=
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");
        String expectedTitle = "yahoo";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);


    }
}