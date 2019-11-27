package com.techtorail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.driverUtility;

public class EtsyHomePage {
   static WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = driverUtility.driversetup("CHROME");
        PageFactory.initElements(driver,this);// this initialize this all page instance current class never you forgot this method
    }
    @FindBy(xpath= "global-enhancements-search-query")
   public WebElement searchfield;
    @FindBy(id = "register")
    public WebElement register;
    @FindBy(xpath = "//a[@class='nav-link']")
   public  WebElement cart;
    @FindBy(id="catnav-primary-link-10855")
    public WebElement jeweleryAndAccesoriesLInk;

}
