package com.techtorail.Tests.CeheckBoxePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;

import java.util.Set;

public class Practice {
    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = driverUtility.driversetup("CHROME");
    }

    @Test
    public void RadioBUtton() {
        driver.get("https://learn.letskodeit.com/p/practice");
        // WebElement bmw= driver.findElement(By.id(“radio-btn-example”));
        WebElement bmw = driver.findElement(By.id("bmwradio"));
        bmw.click();
    }

    @Test
    public void Checkboxes() {
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement checkboxes = driver.findElement(By.xpath("//*[@id='bmwcheck']"));
        checkboxes.click();
        Assert.assertTrue(checkboxes.isSelected());
    }


    @Test
    public void MultipleEX() {
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement orange = driver.findElement(By.id("multiple-select-example"));
        Select MultiSelect = new Select(orange); // you must provide the WebElement
        MultiSelect.selectByVisibleText("Apple");
        MultiSelect.selectByVisibleText("Orange");
        MultiSelect.selectByVisibleText("Peach");
        MultiSelect.deselectByIndex(2);

    }

    @Test
    public void verifynewpage() throws InterruptedException {
        driver.get("https://learn.letskodeit.com/p/practice");

        WebElement newwindow = driver.findElement(By.xpath("//button[@id='openwindow']"));
        newwindow.click();
        String firstWindowtitle = driver.getTitle();
        System.out.println(firstWindowtitle + " First window title is ");
        String firstwindowhandle = driver.getWindowHandle();
        newwindow.click();
        String secondHandle = "";
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equalsIgnoreCase(firstwindowhandle)) {
                secondHandle = handle;
            }
        }

        driver.switchTo().window(secondHandle);
        String secondWindowTitle = driver.getTitle();
       Assert.assertFalse(firstwindowhandle.equalsIgnoreCase(secondWindowTitle));
       Assert.assertFalse(firstWindowtitle.equalsIgnoreCase(secondWindowTitle));
       Assert.assertEquals("https://letskodeit.teachable.com/courses",driver.getCurrentUrl());

    }


}