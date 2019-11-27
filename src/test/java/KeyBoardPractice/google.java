package KeyBoardPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;



public class google {

    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= driverUtility.driversetup("Chrome");
    }
    @Test
    public void search() {
        driver.get("https://www.google.com");

        WebElement searchfield = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchfield.click();
        searchfield.sendKeys("Selenium");

        WebElement search = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
        search.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).perform();//perform execuition part

        WebElement clickcommand = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/a/h3"));
        clickcommand.click();

    }
    @Test
    public void selectAll(){
        driver.get("https://www.google.com");

        WebElement searchfield = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchfield.click();
        searchfield.sendKeys("Selenium");

        WebElement search = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
        search.click();
        //Actions actions=new Actions(driver);


        //  actions.keyDown(Keys.COMMAND).sendKeys("A").perform();;

    }
}
