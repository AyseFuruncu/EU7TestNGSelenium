package com.cybertek.test.day4_basicLocaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocater {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
         //sendkeys to e mail
        WebElement fullNameInput=driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith with tagName");

        WebElement emailInput = driver.findElement(By.tagName("email"));
        emailInput.sendKeys("mike@smith.com");
      //lazy way to click button
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
