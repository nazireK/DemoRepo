package com.techtorail.Tests.ActionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;

public class HomeworkHoverover {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= driverUtility.driversetup("CHROME");
    }
    @Test
    public void hoverover() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/");
        WebElement hoverbutton=driver.findElement(By.xpath("//a[@href='/hovers']"));
        hoverbutton.click();
        Thread.sleep(3000);
      WebElement user1=driver.findElement(By.xpath("//a[@href='/users/1']"));
      WebElement user2=driver.findElement(By.xpath("//a[@href='/users/2']"));
      WebElement user3=driver.findElement(By.xpath("//a[@href='/users/3']"));
        WebElement avataruser1=driver.findElement(By.xpath("//a[@href='/users/1']/../../img"));
        WebElement avataruser2=driver.findElement(By.xpath("//a[@href='/users/2']/../../img"));
        WebElement avataruser3=driver.findElement(By.xpath("//a[@href='/users/3']/../../img"));
         Thread.sleep(3000);
        Assert.assertFalse(user1.isDisplayed());
        Assert.assertFalse(user2.isDisplayed());
        Assert.assertFalse(user3.isDisplayed());
      Thread.sleep(3000);
        actions.moveToElement(avataruser1).build().perform();
        Assert.assertTrue(user1.isDisplayed());
        Assert.assertFalse(user2.isDisplayed());
        Assert.assertFalse(user3.isDisplayed());
        Thread.sleep(3000);
        actions.moveToElement(avataruser2).build().perform();
       Assert.assertFalse(user1.isDisplayed());
       Assert.assertTrue(user2.isDisplayed());
        Assert.assertFalse(user3.isDisplayed());
        Thread.sleep(3000);
       actions.moveToElement(avataruser3).build().perform();
        Assert.assertFalse(user1.isDisplayed());
        Assert.assertFalse(user2.isDisplayed());
        Assert.assertTrue(user3.isDisplayed());
        Assert.assertEquals(user3.isDisplayed(),"ibrahim");



    }

}
