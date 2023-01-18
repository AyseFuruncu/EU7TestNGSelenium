package com.cybertek.test.day7TypesOfElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement userNameInput = driver.findElement(By.id("username"));
        System.out.println(userNameInput.isDisplayed());

        //TASK
        //verify username inputbox is not displayed on the screen
        Assert.assertFalse(userNameInput.isDisplayed(),"verify userNameInput is NOT displayed");

        //click start button
        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        Thread.sleep(6000);

        Assert.assertTrue(userNameInput.isDisplayed(),"verify user name is displayed");






    }
}
