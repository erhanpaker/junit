package ders_07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilits.TestBaseClass;

public class handleWindows extends TestBaseClass {
    @Test
    public void test01() throws InterruptedException {
        // amazoon git

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // arama sonuçlarının nutella olduğunu test edelim

        WebElement aramasonuc = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        
        String expectedIcerik = "Nutella";
        String acualSonucYazisi = aramasonuc.getText();

        Assert.assertTrue(acualSonucYazisi.contains(expectedIcerik));

            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://www.amazon.com");

            Thread.sleep(500);

         aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Samsung" + Keys.ENTER);

        Thread.sleep(500);

         aramasonuc = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));

         expectedIcerik = "Samsung";
        acualSonucYazisi = aramasonuc.getText();

        Thread.sleep(5000);

        Assert.assertTrue(acualSonucYazisi.contains(expectedIcerik));

        // 1:30 dk

        String ilksayfaWindowhandle = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");







    }
}
