package com.techtorail.Tests.TestNGpractice;

import org.testng.annotations.*;

public class TestNgAnnotation {

//    WebDriver driver;
//    @BeforeClass
//    public void setup(){
//        driver= driverUtility.driversetup("CHROME");
//    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("This will execute before suite");
    }
    @AfterSuite
    public  void aftersuite(){
        System.out.println("This will execute after suite ");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute before test");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("This will execute after test");
    }
    @Test(priority = 1)
    public void test1(){
        System.out.println("This is test1");
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("This is test2");
    }
    @Test(priority = 3,enabled = true)
    public void test3(){
        System.out.println("This is test3");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This is after method");
    }
    @BeforeClass
    public void beforeCalss(){
        System.out.println("This is before class");
    }
    @AfterClass
    public void afterCalss() {
        System.out.println("This is after class");
    }
}
