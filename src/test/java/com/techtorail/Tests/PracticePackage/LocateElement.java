package com.techtorail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;

public class LocateElement {


    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = driverUtility.driversetup("Chrome");
    }

    @Test
    public void search() throws InterruptedException {

        Actions actions = new Actions(driver);

    }
}
