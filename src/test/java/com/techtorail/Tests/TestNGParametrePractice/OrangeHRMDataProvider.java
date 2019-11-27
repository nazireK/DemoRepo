package com.techtorail.Tests.TestNGParametrePractice;

import com.techtorail.Tests.TestBase;
import com.techtorail.pages.OrangeHCRPAGEs;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMDataProvider extends TestBase {
@DataProvider(name="Credentials")
public static Object[] [] credential(){
    return new Object[][]{{"admin","admin123"},{"testUserName","testPassword"},{"UserName","testPassword"},{"testUserName","Password"}};
}

    @Test(dataProvider = "Credentials")
    public void LoginPageTest(String orangeUsername,String orangePassword) {
        OrangeHCRPAGEs orangeHCRPAGEs = new OrangeHCRPAGEs(driver);
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
        orangeHCRPAGEs.username.clear();
        orangeHCRPAGEs.username.sendKeys(orangeUsername);
        //Thread.sleep(2000);
        orangeHCRPAGEs.password.clear();
        orangeHCRPAGEs.password.sendKeys(orangePassword);
        orangeHCRPAGEs.login.click();
        if (orangeUsername.equals("admin") & orangePassword.equals("admin123")) {

            String actual = orangeHCRPAGEs.pageTitle.getText();
            String expected = "Dashboard";//Expected value is coming from the requirement
            Assert.assertEquals(expected, actual);
       orangeHCRPAGEs.dropDownButton.click();
       orangeHCRPAGEs.LogOutButton.click();
        }else{
            String actual=orangeHCRPAGEs.retryText.getText();
            String expected="Retry Login";
            Assert.assertEquals(expected,actual);
          driver.navigate().back();
        }
    }


}
