package com.cybertek.test.day7_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
    @Test
    public void test1() {
        System.out.println("Webdriver,Opening Browser");
        System.out.println("First Test Case");
        System.out.println("Closing Browser,Quit");
    }


        @Test
                public void test3(){
            System.out.println("Third Test Case");

        }

        @BeforeMethod
                public void setUp(){
            System.out.println("WebDriver,Opening Browser");


    }
      @AfterMethod
    public void tearDown(){
          System.out.println("Closing Browser,Quit");
      }

}





