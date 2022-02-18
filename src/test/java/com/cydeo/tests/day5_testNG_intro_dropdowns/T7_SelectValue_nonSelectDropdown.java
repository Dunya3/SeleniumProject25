package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_SelectValue_nonSelectDropdown {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void Test(){

        WebElement dropDown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        dropDown.click();

        WebElement facebookDropdown = driver.findElement(By.xpath("//a[text()='Facebook']"));
        facebookDropdown.click();

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "Facebook - Log In or Sign Up", "Doesn't match");


    }
}
