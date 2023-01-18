package com.cybertek.test.day7TypesOfElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement CheckBox1 = driver.findElement(By.id("box1"));
        WebElement Checkbox2 = driver.findElement(By.id("box2"));

        //how to verify checkbox is selected or not ?
        System.out.println(CheckBox1.isSelected());
        System.out.println(CheckBox1.isSelected());

        Assert.assertFalse(CheckBox1.isSelected(),"verify ckeckbox1 is Not selected");
        Assert.assertTrue(Checkbox2.isSelected(),"verify checkbox2 is  selected");

        //how to check checbox
        CheckBox1.click();

        //verify after click
        Assert.assertTrue(CheckBox1.isSelected(),"verify checkbox 1 is selected");
        Assert.assertTrue(Checkbox2.isSelected(),"verify checkbox 2 is selected");

        Thread.sleep(2000);
        driver.quit();



    }
}
