package com.techtorail.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import utility.driverUtility;

public class Clothingandshoes {
    WebDriver driver;
    @BeforeClass
    public void setup() {

        driver = driverUtility.driversetup("CHROME");
    }
}
