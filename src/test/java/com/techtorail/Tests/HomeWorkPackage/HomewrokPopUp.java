package com.techtorail.Tests.HomeWorkPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;

public class HomewrokPopUp {
    WebDriver driver;
    @BeforeClass
    public void setup(){

        driver= driverUtility.driversetup("CHROME");
    }

    @Test
    public void mouseActionsIntro() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Actions actions = new Actions(driver);
        WebElement webElement = driver.findElement(By.xpath("//*[@id='authentication']/button"));
//        //for double click
        actions.doubleClick(webElement).perform();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        WebElement webElement1 = driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
        Thread.sleep(2000);
        actions.contextClick(webElement1).perform();
        Thread.sleep(2000);
        WebElement Edit=driver.findElement(By.xpath("//*[@id='authentication']/ul/li[1]"));
        Edit.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        actions.contextClick(webElement1).perform();

        WebElement Cut=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']"));
        Cut.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        actions.contextClick(webElement1).perform();

        WebElement Copy=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
        Copy.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        actions.contextClick(webElement1).perform();

        WebElement Paste=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']"));
        Paste.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        actions.contextClick(webElement1).perform();
        WebElement delete=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-delete']"));
        delete.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        actions.contextClick(webElement1).perform();


        WebElement webElement2 = driver.findElement(By.xpath("//span[text()='Quit']"));
        webElement2.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.quit();


    }
    @Test
    public void dropanddrag() throws InterruptedException {

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.findElement(By.xpath("//*[@id='credit2']/a")).click();
        WebElement dragme = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        WebElement dropme = driver.findElement(By.xpath("//*[@id='bank']/li"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragme,dropme).perform();


    }
    @Test
    public void Horizonside() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com");
        WebElement slider = driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        slider.click();
        Thread.sleep(1000);
        WebElement cll=driver.findElement(By.xpath("//input[@type='range']"));

        actions.clickAndHold(cll).moveByOffset(40, 0).perform();

        Thread.sleep(1000);


    }
    @Test
    public void slider(){


    }

}
