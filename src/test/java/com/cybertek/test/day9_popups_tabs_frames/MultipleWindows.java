package com.cybertek.test.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {

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
         public void SwitchWindowtest1(){
            driver.get("http://practice.cybertekschool.com/windows");

            //get title
            System.out.println("Title before new window"+ driver.getTitle());
             driver.findElement(By.linkText("Click Here")).click();


            String currentWindowHandle=driver.getWindowHandle();
            Set<String>windowsHandle=driver.getWindowHandles();
            for (String s : windowsHandle) {
               if(!windowsHandle.equals(currentWindowHandle)){
                   driver.switchTo().window(currentWindowHandle);

                   //whenever your title equals to your expeted window title
                   if(driver.getTitle().equals("New Window")){
                       //stop on that window
                       break;

                   }
               }

            }
            System.out.println("title after switch new window:" + driver.getTitle());
        }
    }

