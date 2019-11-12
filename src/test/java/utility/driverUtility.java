package utility;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class driverUtility {
    //WebDriver driver = driversetup();// I do not want to every method inside one object so I inzilation instance variable
   public static WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=driverUtility.driversetup("chrome");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    public static WebDriver driversetup(String browser) {//utility class and utility method  every framework has utility class

       if(driver !=null){// if we driver not null use everytime same driver
           return driver;
       }
        switch (browser){
        case"chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
        case "ff":
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            break;
        case "ie":
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();
            break;
        case "opera":
            WebDriverManager.operadriver().setup();
            driver=new OperaDriver();
            break;
        case "edge":
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            break;
        default:
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
    }

        driver.manage().window().fullscreen();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//
        return driver;
}
public static void closeDriver(){
        if(driver !=null){
            driver.quit();
            driver=null;
        }
}
}

