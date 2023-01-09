package Day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class a1_TestBaseDemo extends TestBase {
/*
            UTILITIES:
         - Utilities tekrar tekrar kullanacağımız classları koyduğumuz paketin adıdır.
         - Gerektiği yerde kullanacağımız işlemleri methodları koyacağız.
         - Test case yazılmaz
         - Sadece destek sınıfları (support classlar) olusturulur
         - Bu support classlar test caselerin yazılmasını hızlandırır
        -TestBase
        -Driver
        -ExcelUtil
        -Config sınıfları
 */

    @Test
    public void Test01(){
        //techpronun anasayfasına git ve page titleın "Bootcamps" kelimesini icerdiğini test edelim
        driver.get("https://techproeducation.com");
        String title= driver.getTitle();
        Assert.assertTrue(title.contains("Bootcamps"));
    }

}
