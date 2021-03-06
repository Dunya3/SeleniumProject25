package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_State_dropdown {

    // TC #5: Selecting state from State dropdown and verifying result

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
   //1. Open Chrome browser
   //2. Go to http://practice.cybertekschool.com/dropdown

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    //3. Select Illinois
    //4. Select Virginia
@Test
    public  void stateDropDownTest(){

    Select stateDropDown = new
            Select(driver.findElement(By.xpath("//select[@id='state]")));
    stateDropDown.selectByVisibleText("Illinois");
    stateDropDown.deselectByValue("VA");
    stateDropDown.deselectByIndex(5);

    //5. Select California
    //6. Verify
    // final selected option is California.
    // Use all Select options. (visible text, value, index)

    String actualText = stateDropDown.getFirstSelectedOption().getText();
    Assert.assertEquals(actualText, "California", "Text is not the same");

    }




}
