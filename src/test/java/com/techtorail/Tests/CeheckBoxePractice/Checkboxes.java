package com.techtorail.Tests.CeheckBoxePractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Checkboxes {
    @Test
            public void chechboxe() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        WebElement checkboxeslink = driver.findElement(By.xpath("//a[@href='/checkboxes']"));
        checkboxeslink.click();
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'])[1]"));
        checkBox1.click();
        Assert.assertTrue(checkBox1.isSelected());
    }
    @Test
    public void chechboxe3() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        WebElement checkbox = driver.findElement(By.xpath("//a[@href=‘/checkboxes’]"));
                checkbox.click();
        //Select optionSelect = new Select(checkbox);
        // optionSelect.selectByVisibleText(“Checkbox 1
        WebElement checkbox1=driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
                checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected());
        List<WebElement> checkList=driver.findElements(By.xpath("//*[@id='checkboxes']/input[1]"));
      for (WebElement checkbox22:checkList){
          if(!checkbox22.isSelected()){
              checkbox22.click();
          }


       }
    }
}
