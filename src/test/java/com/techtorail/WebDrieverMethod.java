package com.techtorail;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDrieverMethod {
    //WebDriver driver = driversetup();// I do not want to every method inside one object so I inzilation instance variable
  WebDriver driver;
    public static WebDriver driversetup() {//utility class and utility method  every framework has utility class

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        return driver;
    }
    @BeforeClass
    public void setup(){
        driver=driversetup();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
