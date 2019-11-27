package JScriptexecutrointro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JSPractice {
    WebDriver driver;
    @BeforeClass
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public void etsywebsite() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.location ='https://www.etsy.com/'");
        String title=js.executeScript("return document.title").toString();
        System.out.println("My page's title is:"+title);
        WebElement searchfield=driver.findElement(By.cssSelector("input[name='search_query']"));
        js.executeScript("arguments[0].click()",searchfield);
        Thread.sleep(2000);
        WebElement registerbutton=driver.findElement(By.cssSelector("#register"));
        js.executeScript("arguments[0].click()",registerbutton);
        WebElement signIn=driver.findElement(By.cssSelector("#sign-in"));
        js.executeScript("arguments[0].click()",signIn);
        Thread.sleep(3000);
        WebElement cart=driver.findElement(By.cssSelector(".nav-link "));
        js.executeScript("arguments[0].click()",cart);
        WebElement sell=driver.findElement(By.cssSelector("#sell-on-etsy"));
        js.executeScript("arguments[0].click()",sell);
        String title1=js.executeScript("return document.title").toString();
        System.out.println("My page's title is:"+title1);
        WebElement subcribeemail=driver.findElement(By.cssSelector("input[name=email_address"));
        js.executeScript("arguments[0].click()",subcribeemail);
        Thread.sleep(2000);
       // WebElement email=driver.findElement(By.cssSelector("#email-list-signup-email-input"));
        js.executeScript("document.getElementById('email-list-signup-email-input').value='nancykuplay@gmail.com';");
    }
    @Test
    public void targetwebsite() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location ='https://www.target.com/'");
        String title3=js.executeScript("return document.title").toString();
        System.out.println("My page's title is:"+title3);
        //driver.getCurrentUrl();
        //String url=js.executeScript("return document.URl").toString();
        //System.out.println("My page's url is:" + url);
        WebElement logo=driver.findElement(By.cssSelector("#home"));
        js.executeScript("arguments[0].click()",logo);
        String title2=js.executeScript("return document.title").toString();
        System.out.println("My page's title is:"+title2);
        Thread.sleep(2000);
        WebElement dealsbutton=driver.findElement(By.cssSelector("#secondary"));
        js.executeScript("arguments[0].click()",dealsbutton);
        Thread.sleep(2000);
        WebElement search=driver.findElement(By.cssSelector("input[name='searchTerm']"));
        js.executeScript("arguments[0].click()",search);
        Thread.sleep(2000);
        //js.executeScript("document.getElementById('input[name='searchTerm']').value='iphone';");
        WebElement gifting=driver.findElement(By.cssSelector("#trending"));
        js.executeScript("arguments[0].click()",gifting);
    }
    @Test
    public void Cars() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location ='https://www.cars.com/'");
        String title4=js.executeScript("return document.title").toString();
        System.out.println("My page's title is:"+title4);
        WebElement shoopintealer=driver.findElement(By.cssSelector("#trending"));
        js.executeScript("arguments[0].click()",shoopintealer);
        Thread.sleep(2000);
        WebElement locater=driver.findElement(By.cssSelector("#shopping-dealer-locator"));
        js.executeScript("argument[0].click()",locater);

    }

}
