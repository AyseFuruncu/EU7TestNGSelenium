package com.cybertek.test.day7TypesOfElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeTest {
    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueButton = driver.findElement(By.id("blue"));
        blueButton.getAttribute("value");
        //get the value of type attribute value
        System.out.println(blueButton.getAttribute("type"));
        System.out.println(blueButton.getAttribute("name"));


        //trying to get attribute that does not exist
        //when we use non exist attribute it will return null to us.
        System.out.println(blueButton.getAttribute("href"));

        System.out.println(blueButton.getAttribute("outerHTML"));

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.name("button2"));

        System.out.println(button2.getAttribute("outerHTML"));
        String outerHTML = button2.getAttribute("outerHTML");
        Assert.assertTrue(outerHTML.contains("Button 2"));

        System.out.println("Inner HTML: "+button2.getAttribute("innerHTML"));






        driver.quit();


    }
}
