package HeadlessDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HTMLUnitDriver {
    //    WebDriver driver;
//    @BeforeClass
//    public void setup() {
//        driver = driverUtility.driversetup("CHROME");
//    }
    @Test
    public void website() throws InterruptedException {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("https://www.amazon.com/");
        String actual = driver.getTitle();
        String expected = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        System.out.println("Asserting title");
        Assert.assertEquals(expected, actual);

        Thread.sleep(2000);
        System.out.println("Asserting URL");
        Assert.assertEquals("https://www.amazon.com/", driver.getCurrentUrl());
        Thread.sleep(2000);
        WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
        searchfield.sendKeys("Iphone");
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/span")).click();

        Thread.sleep(2000);

        System.out.println("URL after search for an item: " + driver.getCurrentUrl());
        List<WebElement> iphonelist = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement list : iphonelist) {
            String str = list.getText();
            System.out.println("Iphone" + str);
        }
        System.out.println("iphone list size is: " + iphonelist.size());
    }


    @Test
    public void website1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String actual = driver.getTitle();
        String expected = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(expected, actual);
        Assert.assertEquals("https://www.amazon.com/", driver.getCurrentUrl());
        WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
        searchfield.sendKeys("Iphone" + Keys.ENTER);


        Thread.sleep(2000);
        System.out.println("URL after search for an item: " + driver.getCurrentUrl());
        List<WebElement> iphonelist = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement list : iphonelist) {
            String str = list.getText();
            System.out.println("Iphone" + str);
        }
        System.out.println("iphone list size is: " + iphonelist.size());
    }
}



