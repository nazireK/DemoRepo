package com.techtorail.Tests.WindowHandlePractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class multiwindowhandle {
    @Test
    public void windowIntro() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            // Navigate to a web page

            driver.get("http://the-internet.herokuapp.com");
            //click on window link
            WebElement newwindow = driver.findElement(By.xpath("//a[@href='/windows']"));
            newwindow.click();
            // get the orginal windowhandle
            String originalWindowhandle=  driver.getWindowHandle();
            //click o a new page link
        WebElement newwindow1= driver.findElement(By.xpath("//a[@href='/windows/new']"));
        newwindow1.click();

        // get all windowhandles
       Set<String>setofWindowhandles= driver.getWindowHandles();

        String secondWindowsHandle="";
        for (String dh:setofWindowhandles){
            if(!dh.equalsIgnoreCase(originalWindowhandle)){
                secondWindowsHandle=dh;
            }
        }
        driver.switchTo().window(secondWindowsHandle);
        WebElement newwindow2= driver.findElement(By.xpath("//h3[.='New Window']"));
        System.out.println("New window text is : "+newwindow2.getText());

        driver.switchTo().window(originalWindowhandle);
        WebElement newwindow3= driver.findElement(By.xpath("//a[@href='/windows/new']"));
        newwindow3.click();
        Set<String>threeofWindowhandles= driver.getWindowHandles();
          String thirdwindow="";
          for (String thirdtab:threeofWindowhandles){
              if (!thirdtab.equalsIgnoreCase(originalWindowhandle) && thirdtab.equalsIgnoreCase(secondWindowsHandle)) {
                  thirdwindow=thirdtab;
              }
          }
          driver.switchTo().window(thirdwindow);
          Thread.sleep(5000);
          driver.quit();








    }
}
