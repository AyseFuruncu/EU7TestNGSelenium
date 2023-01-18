package com.cybertek.test.day8_types_of_element;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class noSelectDropdown {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);



    }
    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));

        //click the dropdown to see avaliable options
        dropdownElement.click();


        List<WebElement> dropdownoptions=driver.findElements(By.className("dropdown-item"));
        System.out.println("dropdownoptions.size() = " + dropdownoptions.size());
        Assert.assertEquals(dropdownoptions.size(),5,"verify size of options");

        //print thrmone by one
        for (WebElement option : dropdownoptions) {
            System.out.println(option.getText());
        }
        //click yahoo
        dropdownoptions.get(2).click();

    }
}



