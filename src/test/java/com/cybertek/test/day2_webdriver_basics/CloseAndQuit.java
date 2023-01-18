package com.cybertek.test.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(300);
        //close current tab
        driver.close();//bundan snra yeni sayfa istiyorsak yeniden yazmaliyiz
        driver=new ChromeDriver();//bu sana yeni new sayfa veriyor.

        driver.get("http://practice.cybertekschool.com/open_new_tab");
        //quit close all tabs
        Thread.sleep(500);
        driver.quit();

    }
}
