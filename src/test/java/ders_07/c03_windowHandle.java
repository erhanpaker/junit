package ders_07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilits.TestBaseClass;

public class c03_windowHandle extends TestBaseClass {

    @Test

    public void test01(){
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement yaziElementi = driver.findElement(By.tagName("h3"));

        String expectedYazi = "Opening a new window";
        String actualYazi = yaziElementi.getText();

        Assert.assertEquals(expectedYazi,actualYazi);


    }

}
