package com.techtorail;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework10element {
    public static void main(String[] args) {

          WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
   driver.get("https://www.target.com/");
       WebElement logo=driver.findElement(By.xpath("//a[contains(@id,'home')]"));
        logo.click();
        logo.sendKeys(" Target Logo");
        System.out.println(driver.getTitle());
        WebElement dealsbutton=driver.findElement(By.xpath("//a[contains(@id,'secondary')]"));
        dealsbutton.click();
        dealsbutton.sendKeys("Deals");
      System.out.println(driver.getTitle());

    WebElement categories=driver.findElement(By.xpath("//span[.='Categories']"));
       categories.click();
        categories.sendKeys("Categories");
        System.out.println(driver.getTitle());



        driver.get("https://www.google.com");
        driver.get("https://www.ebay.com/");
       WebElement myEbay=driver.findElement(By.xpath(" //*[contains(@class,'gh-eb-li-a')]"));
       myEbay.sendKeys("My Ebay");
       System.out.println(driver.getTitle());


        WebElement sell=driver.findElement(By.xpath("//*[text()=' Sell']"));
        sell.click();
        sell.sendKeys("Sell");
        System.out.println(driver.getTitle());


        WebElement logo1=driver.findElement(By.xpath("//img[@id='gh-logo']"));
        logo1.click();
        logo1.sendKeys("Ebay Logo");
        System.out.println(driver.getTitle());

        WebElement search=driver.findElement(By.xpath("//*[@id='gh-ac']"));
       search.click();
        search.sendKeys("Table");
        WebElement search2=driver.findElement(By.xpath("//input[@id='gh-ac']"));
       // search2.click();
        System.out.println(driver.getTitle());



        WebElement shopall=driver.findElement(By.xpath("//*[contains(@id,'gh-cat')]"));
       shopall.click();
        shopall.sendKeys("Select All categories");
        System.out.println(driver.getTitle());


        WebElement alert=driver.findElement(By.xpath("//i[text() ='Notification']"));
        alert.click();
        alert.sendKeys("Notification");
        System.out.println(driver.getTitle());


            //html/body/div/div/div/div/nav/div/form/input ==>search










    }
}
