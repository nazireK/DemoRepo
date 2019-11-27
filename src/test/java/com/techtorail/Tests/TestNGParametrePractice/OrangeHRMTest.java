package com.techtorail.Tests.TestNGParametrePractice;

import com.techtorail.Tests.TestBase;
import com.techtorail.pages.OrangeHCRPAGEs;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OrangeHRMTest extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {
        OrangeHCRPAGEs orangeHCRPAGEs=new OrangeHCRPAGEs(driver);
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
        Thread.sleep(1000);

 orangeHCRPAGEs.username.clear();
 Thread.sleep(2000);
 orangeHCRPAGEs.username.sendKeys("admin");
 orangeHCRPAGEs.password.clear();
 orangeHCRPAGEs.password.sendKeys("admin123");
 orangeHCRPAGEs.login.click();
 String actual=orangeHCRPAGEs.pageTitle.getText();
 String expected="Dashboard";//Expected value is coming from the requirement

        Assert.assertEquals(expected,actual);
    }

}
