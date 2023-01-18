package com.cybertek.test.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframetest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
       // driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");

        //how to switch frame
        //1 switch by using name or ID attribute of iframe
        driver.switchTo().frame("mce_0_ifr");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("Mike Smith");


        //if you want to go back to first frame (main html
        //if you want to back to first frame,useful when we have switched multiple frames
        driver.switchTo().defaultContent();

        //2switch with the index
       // driver.switchTo().frame("0");
        //Thread.sleep(1000);

        //clear before sendkeys
       // driver.findElement(By.cssSelector("#tinymce")).clear();
       // driver.findElement(By.cssSelector("#tinymce")).sendKeys("Mike Smith WITH INDEX");


        //3 using webelement
        WebElement iframeElement= driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframeElement);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("Mike Smith WITH WEB ELEMENT");
    }
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/nested_frames");

        driver.switchTo().frame("frame-top");
        //top has 3 frame under left middle and right
        //switch the frame middle

        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());
        driver.switchTo().parentFrame();

        //switch to right with index
        driver.switchTo().frame(2);
        System.out.println(driver.findElement(By.tagName("body")).getText());


        //go to main html switch bottom
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());

    }
}
