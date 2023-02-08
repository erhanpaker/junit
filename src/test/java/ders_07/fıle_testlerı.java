package ders_07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilits.TestBaseClass;

import java.time.Duration;
import java.util.Set;

public class fıle_testlerı extends TestBaseClass {

    @Test

    public void test() throws InterruptedException {

        driver.get("https://amazon.com");
        Set<Cookie> CookiesSeti = driver.manage().getCookies();
        System.out.println(CookiesSeti);

        int siraNo=1;

        for (Cookie eachCookie: CookiesSeti
        )
        {
            System.out.println(siraNo +" - ");

            siraNo ++;

        }

        Assert.assertTrue(CookiesSeti.size()>5);

        String expectedDeger="USD";
        String actualDeger = driver.manage().getCookieNamed("i18n-prefs").toString();



        Thread.sleep(3000);


        // 9 viedo 1 saat devam








    }


    @Test

    public void test1(){

        // 9 video



    }
}
