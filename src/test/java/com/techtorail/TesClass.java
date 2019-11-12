package com.techtorail;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TesClass {


    @Test
    public void test(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://stackoverflow.com/questions/52110521/org-openqa-selenium-webdriverexception-timed-out-waiting-for-driver-server-to-s");
    }
}
