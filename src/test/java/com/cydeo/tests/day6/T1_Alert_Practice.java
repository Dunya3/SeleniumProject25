package com.cydeo.tests.day6;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {


    public class T1_Alert_Practices {
        WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            //1. Open browser
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //2. Go to website: https://practice.cydeo.com/javascript_alerts
            driver.get("https://practice.cydeo.com/javascript_alerts");
        }
    }}