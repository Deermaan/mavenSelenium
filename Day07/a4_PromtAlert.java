package Day07;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class a4_PromtAlert extends TestBase {
    //    3. butona tıklayın,
//    uyarıdaki metin kutusuna isminizi yazin,
//    OK butonuna tıklayın
//    ve result mesajında isminizin görüntülendiğini doğrulayın.

    @Test
    public void sendkeysMethod(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("der");

    }
}
