package com.cybertek.test.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.practice.cybertekschool.com/");

        //getting title with selenium
        //shortcut for creating variable is option or alt + enter enter
        //getTittle () to get you title of the page
        String title = driver.getTitle();
        //soutv +enter print variable name and value
        System.out.println("title = " + title);

      //get currentUrl get Url from the browser
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


    }
}
