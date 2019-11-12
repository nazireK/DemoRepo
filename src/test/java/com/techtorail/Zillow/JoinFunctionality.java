package com.techtorail.Zillow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;

public class JoinFunctionality {
    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = driverUtility.driversetup("CHROME");
    }

    @Test
    public void joinfuctionality() throws InterruptedException {
        driver.get("https://www.zillow.com/");
        WebElement joinbutton = driver.findElement(By.xpath("//a[@title='Join']"));
        joinbutton.click();
        Thread.sleep(2000);
        WebElement join = driver.findElement(By.xpath("//h2[@class='auth-heading']"));
        Thread.sleep(2000);
        Assert.assertTrue(join.isDisplayed());
    }

    @Test
    public void newaccaountpage() throws InterruptedException {
        driver.get("https://www.zillow.com/");
        WebElement joinbutton = driver.findElement(By.xpath("//a[@title='Join']"));
        joinbutton.click();
        Thread.sleep(2000);
        WebElement join = driver.findElement(By.xpath("//h2[@class='auth-heading']"));
        Thread.sleep(2000);
        WebElement newaccountbutton = driver.findElement(By.xpath("//a[text()='New account']"));
        newaccountbutton.click();
        Thread.sleep(2000);
        Assert.assertTrue(newaccountbutton.isDisplayed());
    }

    @Test
    public void enteruserinfo() throws InterruptedException {

        driver.get("https://www.zillow.com/");
        WebElement joinbutton = driver.findElement(By.xpath("//a[@title='Join']"));
        joinbutton.click();
        Thread.sleep(2000);
        WebElement join = driver.findElement(By.xpath("//h2[@class='auth-heading']"));
        Thread.sleep(2000);
        WebElement newaccountbutton = driver.findElement(By.xpath("//a[text()='New account']"));
        newaccountbutton.click();
        Thread.sleep(2000);
        Assert.assertTrue(newaccountbutton.isDisplayed());
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("nancyer@gmail.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("jsd445845");
        Thread.sleep(2000);
        WebElement sumbitbutton = driver.findElement(By.xpath("//input[@type='submit']"));
        sumbitbutton.click();
    }

    @Test
    public void signin() throws InterruptedException {

        driver.get("https://www.zillow.com/");
        WebElement joinbutton = driver.findElement(By.xpath("//a[@title='Join']"));
        joinbutton.click();
        Thread.sleep(2000);
        WebElement join = driver.findElement(By.xpath("//h2[@class='auth-heading']"));
        Thread.sleep(2000);
        WebElement newaccountbutton = driver.findElement(By.xpath("//a[text()='New account']"));
        newaccountbutton.click();
        Thread.sleep(2000);
        Assert.assertTrue(newaccountbutton.isDisplayed());
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("nancyer@gmail.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("jsd445845");
        Thread.sleep(2000);
        WebElement sumbitbutton = driver.findElement(By.xpath("//input[@type='submit']"));
        sumbitbutton.click();
        WebElement signinbutton =driver.findElement(By.xpath("//a[text()='Sign in']"));
        signinbutton.click();
        Thread.sleep(1000);


        WebElement enterpass=driver.findElement(By.xpath("//input[@id='inputs-password']"));
        enterpass.click();
       enterpass.sendKeys("jsd445845");
       Thread.sleep(1000);
        WebElement signinclick=driver.findElement(By.xpath("//*[@id='login-anchor']/div/div/div[1]/div/div/div[2]/div/div[2]/form/div[4]/div[1]/input"));
        signinclick.click();
        Thread.sleep(3000);
        WebElement myzillow=driver.findElement(By.xpath("//span[.='My Zillow']/.."));
        Assert.assertTrue(myzillow.isDisplayed());

        Thread.sleep(5000);
    }
    @Test
    public void incorrect() throws InterruptedException {//negative test
        driver.get("https://www.zillow.com/");
        WebElement joinbutton = driver.findElement(By.xpath("//a[@title='Join']"));
        joinbutton.click();
        Thread.sleep(2000);
        WebElement join = driver.findElement(By.xpath("//h2[@class='auth-heading']"));
        Thread.sleep(2000);
        WebElement newaccountbutton = driver.findElement(By.xpath("//a[text()='New account']"));
        newaccountbutton.click();
        Thread.sleep(2000);
        Assert.assertTrue(newaccountbutton.isDisplayed());
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("nancyer@gmail.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("jsd445845");
        Thread.sleep(2000);
        WebElement sumbitbutton = driver.findElement(By.xpath("//input[@type='submit']"));
        sumbitbutton.click();
        WebElement signinbutton =driver.findElement(By.xpath("//a[text()='Sign in']"));
        signinbutton.click();
        Thread.sleep(1000);

        WebElement enteragainpassword=driver.findElement(By.xpath("//input[@id='inputs-password']"));
        enteragainpassword.click();
        enteragainpassword.sendKeys("jsd4458567");
        Thread.sleep(1000);
        WebElement signinclick1=driver.findElement(By.xpath("//*[@id='login-anchor']/div/div/div[1]/div/div/div[2]/div/div[2]/form/div[4]/div[1]/input"));
        signinclick1.click();
        Thread.sleep(2000);
      WebElement incorrecttext=driver.findElement(By.xpath("//strong[@class='zsg-form-error-text']/.."));
        String actual=incorrecttext.getText();
        String excepted="Incorrect email or password. Please try again or click 'Forgot your password?'.";
        Assert.assertEquals(actual,excepted);
    }

}
