package com.cybertek.test.day6_CSSLocater;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CSS_locater {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClick= driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println(dontClick.getText());
        //driver.quit();

    }
}
