package HeadlessDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DesiredCappacity {
//    WebDriver driver;
//    @BeforeClass
//    public  void setup() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
    @Test
    public void desiredcap(){
//        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();// it is setup class   key value format // mobile application
//        //mobile application platform version special all mobile application testing
//        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME,"mySpecialBrowser");
//        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
//        desiredCapabilities.setCapability(CapabilityType.VERSION,"5.7");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.BROWSER_NAME,"mySpecialBrowser");
        chromeOptions.setCapability(CapabilityType.PLATFORM_NAME,Platform.MAC);
        chromeOptions.setCapability(CapabilityType.VERSION,"5.7");
        WebDriver driver=new ChromeDriver(chromeOptions);


    }
}
