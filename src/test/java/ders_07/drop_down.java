package ders_07;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilits.TestBaseClass;

public class drop_down extends TestBaseClass {

    @Test

    public void test1() throws InterruptedException {

        driver.get("https://demoqa.com/droppable");

        WebElement dragMe = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dog = dragMe.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        Actions actions = new Actions(driver);

        actions.dragAndDrop(dog,dragMe).perform();

        Thread.sleep(5000);

    }


}
