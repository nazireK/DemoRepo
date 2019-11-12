package com.techtorail.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class JeweleryandAcceserious {
    WebDriver driver;

    public JeweleryandAcceserious(WebDriver driver) {

       this.driver =driver;
        PageFactory.initElements(driver,this);
    }
   @FindBy(xpath = "//input[@aria-label='Any price']")
   public WebElement anyprice;
    @FindBy(xpath ="//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=&max=25&price_bucket=1']")
   public  WebElement radio1;
    @FindBy(xpath ="//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=25&max=50&price_bucket=1']")
    public WebElement radio2;
    @FindBy(xpath ="//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=50&max=100&price_bucket=1']")
   public  WebElement priceover50100;
    @FindBy(xpath="//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=100&max=&price_bucket=1']")
    public    WebElement over100;

    @FindBy(id ="ship_to_select")
   public  WebElement shipsto;
    @FindBy(id="catnav-primary-link-10855")
    public WebElement jeweleryAndAccesoriesLInk;
//
//    @FindBy(id="a")
//    public List<WebElement>elementList;



}
