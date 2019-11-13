package com.techtorail;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertIntro {
    @Test
    public void intro() {// To click on the 'OK' button of the alert.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        WebElement Alertlink = driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        Alertlink.click();
        WebElement Alertbutton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        Alertbutton.click();
        driver.switchTo().alert().accept();//handled alert it is method


    }

    @Test
    public void intro1() {// To click on the 'Cancel' button of the alert.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        WebElement Alertlink = driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        Alertlink.click();
        WebElement Alertbutton1 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        Alertbutton1.click();
        driver.switchTo().alert().dismiss();// cancel dismiss(); method//// To click on the 'Cancel' button of the alert.


    }

    @Test
    public void intro2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        WebElement Alertlink = driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        Alertlink.click();
        WebElement Alertbutton2 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        Alertbutton2.click();
        Thread.sleep(5000);
        driver.switchTo().alert().sendKeys("Nazire");
        driver.switchTo().alert().accept();

    }
}
