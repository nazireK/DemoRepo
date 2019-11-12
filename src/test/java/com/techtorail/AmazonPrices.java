package com.techtorail;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonPrices {
    @Test
    public void getAmazonPrices(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
        searchfield.sendKeys("Laptop"+ Keys.ENTER);
        List<WebElement> prices=driver.findElements(By.xpath("//span[@class='a-price']"));

//        for (WebElement currentprice : prices) {
//            //String strPrice=currentprice.getText();
//            System.out.println("laptop" + currentprice.getText());
//        }
        double totalprice=0;
        // to eleminate $ sign
        for(int i=0;i<prices.size();i++){
            String strPrices=prices.get(i).getText().substring(1).replace("\n",".");
            System.out.println(strPrices);
            totalprice+=Double.parseDouble(strPrices);
        }
        System.out.println("total price of products on the page is "+ totalprice);
        // Assert.assertEquals(27,price.size());
        // if l have stringindexoutofboudexception
//        for(int i=0;i<prices.size();i++)(
//                try{
//                    System.out.println(prices.get(i).getText().substring(1).replace("\n","."));
//                    totalprice+=Double.parseDouble(strPrices);
//                )catch (StringIndexOutOfBoundsException | NumberFormatException e)
//                    System.out.println("Some expection was throw");
//                }
    }
}
