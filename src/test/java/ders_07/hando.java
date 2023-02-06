package ders_07;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilits.TestBaseClass;

import javax.swing.*;

public class hando extends TestBaseClass {

    @Test

    public  void test11() throws InterruptedException {

        Faker faker = new Faker();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();

       WebElement isimKutusu = driver.findElement(By.xpath("//input[@name='firstname']"));
       Actions actions = new Actions( driver);
       String mail=faker.internet().emailAddress();



       actions.click(isimKutusu)
               .sendKeys(faker.name().firstName())
               .sendKeys(Keys.TAB)
               .sendKeys(faker.name().lastName())
                       .sendKeys(Keys.TAB)
               .sendKeys(mail)
               .sendKeys(Keys.TAB)
               .sendKeys(mail)
               .sendKeys(Keys.TAB)
               .sendKeys(faker.internet().password())
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys("12")
               .sendKeys(Keys.TAB)
               .sendKeys("feb")
               .sendKeys(Keys.TAB)
               .sendKeys("1999")
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.ARROW_RIGHT)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.ENTER).perform();

       // 50 dk















    }

}
