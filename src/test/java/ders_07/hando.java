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

        driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));













    }

}
