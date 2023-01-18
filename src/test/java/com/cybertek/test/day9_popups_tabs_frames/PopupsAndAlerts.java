package com.cybertek.test.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

     WebDriver driver;
    @Test
    public void test1() {
        //click confrim button
        driver.get("http://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();

    }
    @Test
    public void test2() throws InterruptedException {
        //click click for alert button
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[1]")).click();

        Alert alert =driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        //click for JS confirm
        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(2000);
        alert.dismiss();


        //click for JS Promt
        driver.findElement(By.xpath("//button[3]")).click();
        Thread.sleep(2000);
        alert.sendKeys("Mike Smith");
        alert.accept();

    }
}
