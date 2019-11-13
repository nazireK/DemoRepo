
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.driverUtility;

public class Tools {
    @Test
    public void selecttask(){
//       WebDriverManager.chromedriver().setup();
//       WebDriver driver = new ChromeDriver();

        WebDriver driver= driverUtility.driversetup("");
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        WebElement prac = driver.findElement(By.xpath("//input[@name='firstname']"));
        prac.sendKeys("Nazire");
        WebElement prac2 = driver.findElement(By.xpath("//input[@id='lastname']"));
        prac2.sendKeys("Kuplay");
        WebElement checkbbutton=driver.findElement(By.xpath("//input[@value='Female']"));
        checkbbutton.click();
       WebElement experience=driver.findElement(By.xpath("//*[@class='control-label']"));
       experience.click();
       WebElement exp=driver.findElement(By.xpath("//*[@id='exp-1']"));
       exp.click();
        WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("12/23/1991");
        driver.findElement(By.xpath("//*[@value='Manual Tester']")).click();
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();





    }
}
