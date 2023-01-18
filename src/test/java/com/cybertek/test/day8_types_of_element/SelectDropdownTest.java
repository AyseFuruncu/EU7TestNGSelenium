package com.cybertek.test.day8_types_of_element;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dropdown");
        //1.dropdown test ederken once bakman gereken <select>tag var mi olmali
        //2.select i locate et.Id yada diger locaterlar ile
        WebElement dropdownElement = driver.findElement(By.id("state"));
        //3.create objectt by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        List<WebElement> options = stateDropdown.getOptions();
        System.out.println(options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
      }
    }

