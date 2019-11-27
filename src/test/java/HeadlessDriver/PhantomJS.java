package HeadlessDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PhantomJS {
    WebDriver driver;

    @Test
    public void phantom() throws InterruptedException {
        WebDriverManager.phantomjs().setup();
        driver = new PhantomJSDriver();
        driver.get("https://www.amazon.com/");
        String actual = driver.getTitle();
        String expected = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(expected, actual);
        Assert.assertEquals("https://www.amazon.com/", driver.getCurrentUrl());
        WebElement searchfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchfield.sendKeys("Iphone" + Keys.ENTER);


        System.out.println("URL after search for an item: " + driver.getCurrentUrl());
        Thread.sleep(2000);
        List<WebElement> iphonelist = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement list : iphonelist) {
            String str = list.getText();
            System.out.println("Iphone" + str);
        }
        System.out.println("iphone list size is: " + iphonelist.size());
    }


    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            long timestamp = System.currentTimeMillis();
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(src, new File("src/test/java/screenshots/" + timestamp + ".jpg"));
        }
        //driver.close();

    }
}