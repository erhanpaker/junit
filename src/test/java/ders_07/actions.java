package ders_07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilits.TestBaseClass;

public class actions extends TestBaseClass {

    @Test

    public void test1() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement ciziliElement = driver.findElement(By.xpath("//*[@id='hot-spot']"));

        Actions actions = new Actions(driver);

        actions.contextClick(ciziliElement).perform();

        String ezpectedAlertYazisi = "You selected a context menu";
        String actualAleryazisi = driver.switchTo().alert().getText();
        Assert.assertEquals(ezpectedAlertYazisi,actualAleryazisi);

        driver.switchTo().alert().accept();

        Thread.sleep(5000);

        // 1:50 dk

    }

}
