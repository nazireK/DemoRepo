package com.techtorail;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;

import java.io.File;
import java.io.IOException;

public class ScreenshotTest {

        WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = driverUtility.driversetup("CHROME");

    }

    @Test
        public void screenshotTest(){
            driver.get("https://www.google.com");
            WebElement element = driver.findElement(By.id("bvxktclbob"));
            System.out.println(element.getText());
        }
        @AfterMethod
        public void tearDown(ITestResult result)throws IOException {
            if (result.getStatus()== ITestResult.FAILURE){
                long timestamp=System.currentTimeMillis();
                File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(src,new File("src/test/java/screenshots/" + timestamp + ".jpg"));
            }
            driver.close();
        }
    }

