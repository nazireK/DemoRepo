package com.techtorail;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
//


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();// webDriver is interface  and  chromeDriver regular class
        driver.get("https://www.google.com");
        driver.get("https://www.expedia.com");// get method
        WebElement hoteltab = driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']"));
        hoteltab.click();
        WebElement cartab = driver.findElement(By.xpath("//button[@id='tab-car-tab-hp']"));
        cartab.click();
        WebElement package1 = driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']"));
        package1.click();
        WebElement flightTab = driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")); //findElement mean Web element object
        flightTab.click();
        WebElement flyingForm = driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));

        WebElement flyingTo = driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
        flyingForm.click();
        flyingForm.sendKeys("Chicago");
        flyingTo.click();
        flyingTo.sendKeys("Istanbul");
        //input[@id=‘flight-departing-hp-flight’]"
        //input[@id=‘flight-returning-hp-flight’]”

        WebElement returning = driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
        returning.sendKeys("05-24-2020");
        WebElement departing = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
        departing.sendKeys("12-23-2019");
        returning.click();
        WebElement search=driver.findElement(By.xpath("//button[@class='btn-primary btn-action gcw-submit']"));
        search.click();
//        System.out.println(driver.getTitle());
//

        driver.quit();
        driver.close();





    }
}
