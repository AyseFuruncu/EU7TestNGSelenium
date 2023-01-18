package com.cybertek.test.day7TypesOfElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locating radio buttons
        WebElement blueButton = driver.findElement(By.cssSelector("#blue"));
        WebElement redRadioButton = driver.findElement(By.cssSelector("#red"));

        //how to check radio button is selected
        System.out.println(blueButton.isSelected());
        System.out.println(redRadioButton.isSelected());

        //verify blue is selected red is not selected
        //blue
        //red
        Assert.assertTrue(blueButton.isSelected(),"verify blue is selected");
        Assert.assertFalse(redRadioButton.isSelected(),"verify red button is NOT selected");



        Thread.sleep(3000);
        driver.quit();

    }
}
