package com.cybertek.test.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchange {
    public static void main(String[] args) throws InterruptedException {

       /* Verify URL changed
        open browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        click on Retrieve password
        verify that url changed to http://practice.cybertekschool.com/email_sent
      */
       //open browser

        WebDriver driver= WebDriverFactory.getDriver("cHromE");

        //go to   http://practice.cybertekschool.com/email_sent
        driver.get(" http://practice.cybertekschool.com/forgot_password");

        //enter any e mail
        WebElement emailInputBox = driver.findElement(By.name("email"));

        //send keyboard action to the webElemet
        emailInputBox.sendKeys("mike@cybertek.com");
         //click retrive password button
        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        Thread.sleep(300);

        //TASK
        //verify that url changed to http://practice.cybertekschool.com/email_sent
        //create expectedUrl
        String expectedUrl="http://practice.cybertekschool.com/email_sent";
        //saving actual url from browser we enter any email and click retrieve password button
        String actualUrl=driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("fail");//short hand "fail".sout
            System.out.println("expectedUrl=" + expectedUrl);//if test fails see the differences in the
            // consol
            System.out.println("actualUrl="+ actualUrl);
        }
        //close browser
        driver.quit();




    }
}
