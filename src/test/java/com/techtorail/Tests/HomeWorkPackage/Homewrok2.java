package com.techtorail.Tests.HomeWorkPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.driverUtility;

public class Homewrok2 {
    static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = driverUtility.driversetup("CHROME");
    }

    public static void slider(int num) throws Exception {

        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com");
        WebElement slider1 = driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        slider1.click();
        Thread.sleep(1000);
        WebElement cll = driver.findElement(By.xpath("//input[@type='range']"));

        if (num == 1) {
            actions.clickAndHold(cll).moveByOffset(1, 0).perform();

        } else if (num == 2) {

            actions.clickAndHold(cll).moveByOffset(5, 0).perform();

        } else if (num == 3) {

            actions.clickAndHold(cll).moveByOffset(15, 0).perform();


        } else if (num == 4) {

            actions.clickAndHold(cll).moveByOffset(25, 0).perform();

        } else if (num == 5) {

            actions.clickAndHold(cll).moveByOffset(35, 0).perform();

        } else {
            throw new Exception("Incorrect value");

        }
//     Assert.assertFalse(slider1.equals(cll));
//        //Assert.assertEquals("http://the-internet.herokuapp.com/horizontal_slider",driver.getCurrentUrl());
//       Integer.toString(num);
//            Assert.assertEquals(num,cll.getText());
}


        @Test
        public void Horizonslider() throws Exception {
        slider(3);




    }

}

