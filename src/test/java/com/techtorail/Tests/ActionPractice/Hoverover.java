package com.techtorail.Tests.ActionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;

public class Hoverover {
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
        WebElement hovers=driver.findElement(By.xpath("//h3"));
        Assert.assertEquals("Hovers",hovers.getText());
        Thread.sleep(3000);
//view user
     WebElement user2=driver.findElement(By.xpath("//a[@href='/users/2']/../../img"));
        actions.moveToElement(user2).build().perform();
Thread.sleep(3000);
        WebElement username=driver.findElement(By.xpath("//a[@href='/users/2']//preceding-sibling::h5"));
        Assert.assertTrue(username.getText().contains("user2"));

        // view profile
        WebElement viewprofile= driver.findElement(By.xpath("//a[@href='/users/2']/../../img"));
        Thread.sleep(2000);
        actions.moveToElement(viewprofile).build().perform();

        WebElement profille=driver.findElement(By.xpath("//a[@href='/users/2']"));

       // Assert.assertTrue(profille.getText().contains("View profile"));
        Assert.assertTrue(profille.isDisplayed());


    }

}
