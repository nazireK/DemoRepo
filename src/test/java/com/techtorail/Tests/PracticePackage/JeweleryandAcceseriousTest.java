package com.techtorail;

import com.techtorail.pages.EtsyHomePage;
import com.techtorail.pages.JeweleryandAcceserious;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utility.driverUtility;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class JeweleryandAcceseriousTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = driverUtility.driversetup("CHROME");

    }

    @Test
    public void nagivate() throws InterruptedException, MalformedURLException {
        //Navigate to etsy.com home page
        driver.get("https://www.etsy.com/");
        URL url=new URL("httsp://google.com");
        driver.navigate().to(url);
        driver.navigate().to("");//what kind diferrent nagivate url
        driver.navigate().refresh();//refresh the page
        driver.navigate().back();//go back
        driver.navigate().forward();//go forward

        //2 Verify you are on etsy home page
        Assert.assertEquals("https://www.etsy.com/", driver.getCurrentUrl());
        EtsyHomePage etsyHomePage=new EtsyHomePage();
        WebDriverWait wait=new WebDriverWait(driver,4);
        wait.until(ExpectedConditions.elementToBeClickable(etsyHomePage.jeweleryAndAccesoriesLInk));
              etsyHomePage.jeweleryAndAccesoriesLInk.click();

        // 3 Navigate to Jewelery and Accessories page
        JeweleryandAcceserious page = new JeweleryandAcceserious(driver);
        page.jeweleryAndAccesoriesLInk.click();
        Wait<WebDriver>fluentWait = new FluentWait<>(driver)//FluentWait
                .withTimeout(Duration.ofSeconds(30))//max wait time
                .pollingEvery(Duration.ofSeconds(2))//frequency
                .ignoring(NoSuchElementException.class);//Which exception to ignore
        fluentWait.until(new Function<WebDriver, Object>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath(""));
            }
        });
        Thread.sleep(2000);
        page.over100.click();
        Assert.assertFalse(page.over100.isSelected());

        Thread.sleep(2000);
        Select selects = new Select(page.shipsto);

        selects.selectByVisibleText("Germany");


        List<WebElement> checkList = selects.getAllSelectedOptions();
        for (WebElement list : checkList) {
            if (list.isSelected()) {
                System.out.println(list.getText()+" -> is our test in dropdown");
                Assert.assertTrue(list.getText().trim().equalsIgnoreCase("Germany"));
            }

        }
//        Select selects =new Select(jAp.shipTo);
//        selects.selectByVisibleText(“Germany”);
//        String selectedCountry = selects.getFirstSelectedOption().getText();
//        Assert.assertTrue(selectedCountry.contains(“Germany”));

    }
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.FAILURE){
            long timetamp=System.currentTimeMillis();
            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("src/screenshots/"+timetamp+ ".jpg"));

        }
        driver.close();
    }
}
