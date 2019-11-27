package HeadlessDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class Headless {
    @Test
    public void setHtmlUnitDriver(){
        WebDriver driver=new HtmlUnitDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());

    }
    @Test
    public  void  setPhantomJSDRIVER(){
        WebDriverManager.phantomjs().setup();
        WebDriver driver=new PhantomJSDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}
