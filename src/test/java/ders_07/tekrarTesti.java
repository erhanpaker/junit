package ders_07;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilits.TestBaseClass;

public class tekrarTesti extends TestBaseClass {

    /* 1- C01_TekrarTesti isimli bir class olusturun






        8- Sayfayi kapatin*/

    @Test

     public void test01(){

        //-2 www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

        //-3  cookies uyarisini kabul ederek kapatin

        // 4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String actualbaslik = driver.getTitle();
        String excpetedBaslik = "Google";

        if (actualbaslik.contains(excpetedBaslik)){
            System.out.println("başlık doğru, Test passed");
        }else {
            System.out.println("başık yanlış Test Faild");
        }

        // 5- Arama cubuguna “Nutella” yazip aratin

        WebElement aramaCubuğu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramaCubuğu.sendKeys("NuTella" + Keys.ENTER);

        //6- Bulunan sonuc sayisini yazdirin
        System.out.println(driver.findElement(By.xpath("//div[@id='result-stats']")).getText());

        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        WebElement result = driver.findElement(By.xpath("//div[@id='result-stats']"));
        int baslangic =result.getText().indexOf(" ", result.getText().indexOf("Yaklaşık") + 1);
        int bitis = result.getText().indexOf(" sonuç");
        String sonuc = result.getText().substring(baslangic+1, bitis);
        int intSonuc = Integer.parseInt(sonuc.replace(".", ""));
        if (intSonuc > 10000000) {
            System.out.println("10Milyondan fazla, Test PASSED");

        } else {

            System.out.println("10 Milyondan az, Test FAILED");

           // 8- Sayfayi kapatin*

            driver.close();

            // erhan de



        }






    }
}
