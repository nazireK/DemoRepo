package IframeIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class Iframe1 {
    WebDriver driver;
    @BeforeClass
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public void amazonIframe() throws InterruptedException {
        driver.get("https://www.amazon.com");
        WebElement iframe=driver.findElement(By.xpath("//iframe[@id='ape_Gateway_desktop-ad-center-1_desktop_iframe']"));
        iframe.click();
        Set<String> setOfWindowHandles = driver.getWindowHandles();
        String originalWindowHandle= driver.getWindowHandle();
        String secondWindowHandle="";
        for (String dh:
                setOfWindowHandles) {
            if (!dh.equalsIgnoreCase(originalWindowHandle)){
                secondWindowHandle=dh;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        Thread.sleep(2000);

        Assert.assertEquals("https://www.amazon.com/b?node=2238192011&ref=houseads01-20",driver.getCurrentUrl());
        driver.close();
       // Assert.assertTrue();
    }
    @Test
    public void Iframe() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/iframe");
      // WebElement write=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
       driver.switchTo().frame("mce_0_ifr");
       WebElement txtfield=driver.findElement(By.id("tinymce"));
        String expectedTxt=("Hello from Techtorial class");
        txtfield.clear();
        txtfield.sendKeys(expectedTxt);
        System.out.println(txtfield.getText());
        Thread.sleep(2000);
       Assert.assertEquals(expectedTxt,txtfield.getText(),"Failed assert text in text box");
       //switch to frame using id
        //driver.switchTo.frame(""mce_0_ifr")
       // driver.switchTo.frame(0)// switch to frame using index
        // switch to frame using WebElement
        WebElement element=driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(element);
        // going out of the iframe(only 1 step out!!!)
        driver.switchTo().parentFrame();
        //bring to the very first Iframe
        driver.switchTo().defaultContent();



    }
}
