package TestNGpractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utility.driverUtility;

public class TestNgAnnotation {

//    WebDriver driver;
//    @BeforeClass
//    public void setup(){
//        driver= driverUtility.driversetup("CHROME");
//    }
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
