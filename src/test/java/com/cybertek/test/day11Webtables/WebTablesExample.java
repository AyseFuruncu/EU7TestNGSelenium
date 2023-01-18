package com.cybertek.test.day11Webtables;

import com.cybertek.utilities.WebDriverFactory;
import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesExample {
    WebDriver driver;
;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }

    @Test
    public void printTable() {
        WebElement table = driver.findElement(By.id("table1"));
        System.out.println(table.getText());
        Assert.assertTrue(table.getText().contains("jdoe@hotmail.com"));


    }

    @Test
    public void getAllHeaders() {
        //how many columns we have
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());
        for (WebElement header : headers) {
            System.out.println(header.getText());

        }
    }

    @Test
    public void printTableSize() {

        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());
        //number of rows
        List<WebElement> allRowWithheaders = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println(allRowWithheaders.size());

        //number of rows without header(we prefer this)
        List<WebElement> allRowsWithoutHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println(allRowsWithoutHeaders.size());
    }

    @Test
    public void getRow() {
        //print the second row information
        WebElement row2 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]"));
        System.out.println(row2.getText());

        //get all rows dynamically
        List<WebElement> numrows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        for (int i = 1; i < numrows.size(); i++) {
            WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]"));
            System.out.println(i + "-" + row2.getText());
        }

    }

    @Test
    public void getAllCellOneRow() {
        List<WebElement> allcellsInOneRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));

        for (WebElement element : allcellsInOneRow) {
            System.out.println(element.getText());

        }

    }

    @Test
    public void getAsingleCellByIndex() {
        WebElement singleCell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[3]/td[5]"));
        System.out.println(singleCell.getText());

    }

    @Test
    public void printAllCellByIndex() {


    }
}





