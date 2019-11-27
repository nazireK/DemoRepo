package com.techtorail.CookiesIntro;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;


public class Cookies1 {
    WebDriver driver;
    @BeforeClass
    public void setup() {

        driver = driverUtility.driversetup("CHROME");




    }
    @Test
    public void getCookies(){
        Cookie cookie=new Cookie("1P_JAR","2019-11-17-22");
        WebDriver driver=new ChromeDriver();
        driver.manage().addCookie(cookie);
    }
}
