package com.cybertek.test.day8_types_of_element;

import com.cybertek.utilities.WebDriverFactory;
import jdk.internal.jimage.ImageReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElement {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }

    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //save our web elements inside the list
        List<WebElement> buttons = driver.findElements(By.tagName("button"));//butun elemntleri ayni
        // anda almak icin TagName locater kullandik.

        System.out.println("buttons.size() = " + buttons.size());
        //verify button size
        Assert.assertEquals(buttons.size(),6,"verify buttons size");

        //iter + enter to get each loop with shortcut
        for (WebElement button : buttons) {
            System.out.println("button.getText()=" + button.getText());

            System.out.println( "button.isDisplayed() = " + button.isDisplayed());
            Assert.assertTrue(button.isDisplayed(),"verify buttons are displayed");
        }

        buttons.get(1).click();
    }
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("buttonueddgl"));//yanlis locater yazdim
        //bunu run ettigimizde hata almayiz ama emin olmak icin her zaman "buttons.size"almali checkemlyz
        System.out.println("button.size() = " + buttons.size());
    }
}
