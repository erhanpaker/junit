package ders_07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilits.TestBaseClass;

import java.util.Set;

public class c03_windowHandle extends TestBaseClass {

    @Test

    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement yaziElementi = driver.findElement(By.tagName("h3"));

        String expectedYazi = "Opening a new window";
        String actualYazi = yaziElementi.getText();

        Assert.assertEquals(expectedYazi,actualYazi);
        String ilksayfaWindowhandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();



        Thread.sleep(5000);
    }



}
