package com.cybertek.test.day14_extend_report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtendDemoTest {

    //this claas is used for starting and building reports
    ExtentReports report;

    //this class is used to create HTML repport file
    ExtentHtmlReporter htmlReporter;

    //this will be define a test,enables adding logd,outhors,test shapes
    ExtentTest extentLogger;


    @BeforeMethod
    public void setup(){
        //initialize the class
        report= new ExtentReports();

        //create a report path
        String projectPath= System.getProperty("user.dir");
        String path = projectPath + "/test-output/report.html";

        //initialize the html reporter with the report path
        htmlReporter = new ExtentHtmlReporter(path);

        //attach the html report to report object
        report.attachReporter(htmlReporter);

        //title in report
        htmlReporter.config().setReportName("Vytrack Smoke Test");

        //set environment information
        report.setSystemInfo("Environment","QA");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS",System.getProperty("os.name"));

    }

    @Test
    public void test1(){
        //give name to current test
        extentLogger= report.createTest("TC123 Login as Driver Test");

        //test steps
        extentLogger.info("Open Chrome Browser");

        extentLogger.info("Go to this URL");

        extentLogger.info("Enter driver username password");

        extentLogger.info("Click Login");

        extentLogger.info("Verify logged in");

        //pass()--> marks the test case as passed
        extentLogger.pass("TC123 is passed");

    }


    @AfterMethod
    public void teardown(){
        //this is when the report is actually created
        report.flush();

    }




}



