package ders_07;

import org.junit.Assert;
import org.junit.Test;
import utilits.TestBaseClass;

public class testBase extends TestBaseClass {

    @Test

    public void test01(){
        // amazon gidelim

        driver.get("https://www.amazon.com");
        String expectedIcerik = "amazon";
        String  actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));



    }
}
