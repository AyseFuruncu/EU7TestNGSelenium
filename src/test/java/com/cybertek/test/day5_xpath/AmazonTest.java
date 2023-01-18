package com.cybertek.test.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/** go to Amazo.com
 * search for selenium
 * click search button
 * verify 1-48 of 304 of results for "selenium"
 */

public class AmazonTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http:/www.amazon.com");

        WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result= driver.findElement(By.xpath("//span[contains[text(),'results for')]"));

        String resultTest= result.getText();

        System.out.println("resultText="+ resultTest);
        String expectedResult="1-48 of over 330 results for";
        if (expectedResult.equals(resultTest)){
            System.out.println("pass");
        }else{
            System.out.println("feil");
            System.out.println("expectedResult="+expectedResult);
            System.out.println("resultText="+resultTest);
            driver.close();



        }




    }

}
