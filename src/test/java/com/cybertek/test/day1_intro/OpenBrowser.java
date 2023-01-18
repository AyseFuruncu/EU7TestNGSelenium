package com.cybertek.test.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://cybertekschool.com");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();

        driver.get("https://www.google.com");

    }


}
