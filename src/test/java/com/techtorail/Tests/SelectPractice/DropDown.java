package com.techtorail;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {
    @Test
    public void dropD(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchDrownBox=driver.findElement(By.id("searchDropdownBox"));
        Select amazonselect=new Select(searchDrownBox);//you put only Web element
      //  amazonselect.selectByVisibleText("Electronics");
       // amazonselect.deselectByVisibleText("Electronics");// it is just multi select work
       // amazonselect.selectByIndex(3);
        amazonselect.selectByValue("search-alias=magazines");


    }
    @Test
    public void selectoption2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        WebElement Drownlink=driver.findElement(By.xpath("//a[.='Dropdown']"));
        Drownlink.click();
        WebElement optionDrownlink=driver.findElement(By.id("dropdown"));
        Select select=new Select(optionDrownlink);//you put only Web element
        //select.selectByVisibleText("Option 2");
       // select.selectByIndex(2);
        select.selectByValue("2");

    }
    @Test
    public void alloption(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchDrownBox=driver.findElement(By.id("searchDropdownBox"));
        Select amazonselect=new Select(searchDrownBox);

        List<WebElement>all=amazonselect.getOptions();
        int count=0;

        for (int i=0;i<all.size();i++) {
           String str=all.get(i).getText();

            System.out.println(++count+" "+str);
        }
}   }
