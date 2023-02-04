package ders_07;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilits.TestBaseClass;

public class drop_down extends TestBaseClass {

    @Test

    public void test1(){

        driver.get("https://demoqa.com/droppable");

        WebElement dragMe = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dog = dragMe.findElement(By.xpath("(//div[@id='droppable'])[1]"));

    }


}
