package com.cybertek.test.day4_basicLocaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDlocaterTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //click don't clic button
        WebElement dontClickButton= driver.findElement(By.id("disappearing_button"));
         dontClickButton.click();
         driver.quit();
    }
}
