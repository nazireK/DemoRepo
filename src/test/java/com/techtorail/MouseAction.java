package com.techtorail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;

public class MouseAction {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=driverUtility.driversetup("CHROME");
    }
    @Test
    public void mouseActionIntro(){
        Actions actions=new Actions(driver);
        WebElement webElement=driver.findElement(By.id(""));
        //for double click
        actions.doubleClick(webElement).perform();// overloading webelement
        //right click
      actions.contextClick(webElement).perform();
      //hover over
        actions.moveToElement(webElement).perform();
        WebElement sourceElement=driver.findElement(By.xpath(""));
        WebElement targetElement=driver.findElement(By.xpath(""));
        //drag and drop
        actions.dragAndDrop(sourceElement,targetElement);

        //*moveByOffset(x-offset, y-offset)	Moves the mouse from its current position (or 0,0) by the given offset.

      //  Parameters:

       // x-offset- horizontal offset. A negative value means moving the mouse left.

       // y-offset- vertical offset. A negative value means moving the mouse down.

    }
    @Test
    public void DragandDrop() {
        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com");
        WebElement dragD = driver.findElement(By.xpath("//a[@href='/drag_and_drop']"));
        dragD.click();
        WebElement sourceELement = driver.findElement(By.id("column-a"));
        WebElement targetElement = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(sourceELement, targetElement).perform();


    }
    @Test
    public void Hovers(){
        driver.get("http://the-internet.herokuapp.com");
        Actions actions = new Actions(driver);
        WebElement hoverbutton=driver.findElement(By.xpath("//a[@href='/hovers']"));
        hoverbutton.click();
        WebElement hovers=driver.findElement(By.xpath("//h3"));
        Assert.assertEquals("Hovers",hovers.getText());
        actions.moveToElement(driver.findElement(By.xpath("//a[@href='/users/2']/../../img"))).perform();
        WebElement username=driver.findElement(By.xpath("//a[@href='/users/2']//preceding-sibling::h5"));
        Assert.assertTrue(username.getText().contains("user2"));
    }


    }


