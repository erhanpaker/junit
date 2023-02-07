package ders_07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
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

        Thread.sleep(3000);








    }


    @Test

    public void test1(){

        // 9 video



    }
}
