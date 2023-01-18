package com.cybertek.test.day10FileAppload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.channels.AcceptPendingException;

public class FileApploadTest {
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
    public void test1(){
        driver.get("http://practice.cybertekschool.com/upload");
        //locating choose file button
        WebElement choosefile= driver.findElement(By.name("file"));
        //sending file
       choosefile.sendKeys("C:\\Users\\Ayse Furuncu\\Desktop\\project\"");

        //clicikng upload button

        driver.findElement(By.id("file-submit")).click();
        String actualFileName= String.valueOf(driver.findElement(By.id("uploaded-files")));
        //verify file name is .......
        Assert.assertEquals(actualFileName,"project");
    }
    @Test
    public void test2()throws InterruptedException{
        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img1 =driver.findElement(By.tagName("img"));

        Actions actions =new Actions(driver);

        Thread.sleep(2000);
        actions.moveToElement(img1).perform();

        WebElement text1 =driver.findElement(By.xpath("//h5[.='name:user1']"));
        Assert.assertTrue(text1.isDisplayed(),"verify text 1 is displayed");

    }
}
