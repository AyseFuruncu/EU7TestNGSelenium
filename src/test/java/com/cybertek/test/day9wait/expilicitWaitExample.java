package com.cybertek.test.day9wait;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class expilicitWaitExample {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        driver.findElement(By.tagName("button")).click();

        WebElement usernameInput=driver.findElement(By.id("username"));

        //how to wait expilicitly?
        //1create explicit wait object
        WebDriverWait wait=new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOf(usernameInput));
        usernameInput.sendKeys("mike smith");




    }
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.xpath("//*[.='Enable']")).click();


        //finding inputbox
        WebElement inputBox =driver.findElement(By.cssSelector("#input-example>input"));

        WebDriverWait wait =new WebDriverWait(driver,10);

       wait.until(ExpectedConditions.elementToBeClickable(inputBox));

        inputBox.sendKeys("mike smith");


    }

    }
