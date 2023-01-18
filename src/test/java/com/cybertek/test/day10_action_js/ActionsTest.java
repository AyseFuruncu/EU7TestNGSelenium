package com.cybertek.test.day10_action_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionsTest {

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
    public void hoverovertest1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img =driver.findElement(By.tagName("img"));

        //actions class that contains all the user interactions
        //how to create actions object//1passing driver as connstructor
        Actions actions =new Actions(driver);
        //perform()-->perform the action,complete the action
        //move To element-->move you mouse to webelement (hover over)
        Thread.sleep(2000);
        actions.moveToElement(img).perform();

        WebElement viewLink=driver.findElement(By.linkText("View profile"));
        Assert.assertTrue(viewLink.isDisplayed(),"verify that view link is displayed");

    }
    @Test
    public void dragAndDprop () throws InterruptedException {
        driver.get("http://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        Actions actions=new Actions(driver);

        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(2000);


        actions.dragAndDrop(source,target).perform();
         //alttaki gibide yazabilirsin
        // actions.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().perform();
    }
    @Test
    public void dragAndDropChaning(){
        driver.get("http://practice.cybertekschool.com/");

        WebElement dropdownLink=driver.findElement(By.linkText("Dropdown"));
        JavascriptExecutor jse =(JavascriptExecutor) driver;

        jse.executeScript("arguments[0].click();",dropdownLink);
    }
    @Test
    public void typeWithJS(){
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));
        JavascriptExecutor jse =(JavascriptExecutor) driver;
        String text="olacak insallah bu is :)";
        jse.executeScript("arguments[0].setAttribute('value', '"+ text +  "')",inputBox);
    }
    @Test
    public void ScrollDownAndUp() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        driver.manage().window().maximize();
        JavascriptExecutor jse= (JavascriptExecutor) driver;

        for (int i = 0;i< 10;i++ ) {
            Thread.sleep(2000);
            jse.executeScript("window.scrollBy(0,250)");
        }

        for (int i=0;i <10; i++) {
            jse.executeScript("window.scrollBy(0,-250)");
        }

        }
        @Test
         public void scrollToElement() throws InterruptedException {
        driver.get("htpps://www.amazon.com/");
        //WebElement eng= driver.findElement(By.id("icp-touch-link-language"));
        Thread.sleep(2000);
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        //jse.executeScript("argument[0].scrollToElement(true);",);



        }


    }

