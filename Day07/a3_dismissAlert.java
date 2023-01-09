package Day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class a3_dismissAlert extends TestBase {
    @Test
    public void dismissAlert(){
        //2. butona tıklayın,
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        // uyarıdaki Cancel butonuna tıklayın
        driver.switchTo().alert().dismiss();//cancel seçeneğine tıklıyoruz

        // ve result mesajının “You clicked: Cancel” oldugunu test edin.
        String sonuc = driver.findElement(By.xpath("//*[@id='result']")).getText();

        Assert.assertEquals(sonuc, "You clicked: Cancel");

        }
}
