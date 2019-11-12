package test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class amazon {
    @Test
    public void iphoneSearchtest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
        searchfield.sendKeys("Iphone"+ Keys.ENTER);
//       WebElement searchtab=driver.findElement(By.xpath("//input[@class='nav-input']"));
//       searchtab.click();
       //searchtab.getText();
         WebElement producttitle=driver.findElement(By.xpath("//span[.='Simple Mobile Prepaid - Apple iPhone 6s (32GB) - Space Gray']"));
         String productName=producttitle.getText();
       // System.out.println(productName.toLowerCase().contains("iphone"));
        Assert.assertTrue(productName.toLowerCase().contains("iphone"));
    }
    @Test
    public void getprime(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
        searchfield.sendKeys("Iphone"+ Keys.ENTER);
        WebElement findPrime=driver.findElement(By.xpath("//*[@id='nav-link-prime']"));
        String prime=findPrime.getText();
        System.out.println("this is my "+prime);
        Assert.assertTrue(prime.toLowerCase().contains("prime"));

    }
    @Test
    public void getlaptopprice(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
        searchfield.sendKeys("Laptop"+ Keys.ENTER);
        List<WebElement> prices=driver.findElements(By.xpath("//span[@class='a-price']"));
        int sum=0;
        int price1=0;
       for(WebElement cprice:prices){
        String Prices=cprice.getText();
        Prices=Prices.replace(",","");
        if(Prices.length()>0){
            price1=Integer.parseInt(Prices);}
        sum+=price1;

        }
           System.out.println(sum+"="+prices.size());

       }


    }
