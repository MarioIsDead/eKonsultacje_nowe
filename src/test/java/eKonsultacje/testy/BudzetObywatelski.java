package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BudzetObywatelski extends Bazowa {
    @Test
    public void Budzet() throws InterruptedException {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage stronaGlowna = new MainPage(driver);
        stronaGlowna.slowniki();
        Thread.sleep(1000);
        stronaGlowna.latabudzetowe();
        MainPageSlowniki nowySlownik = new MainPageSlowniki(driver);
        nowySlownik.tworzenieSlownika();
        nowySlownik.nowyRokBudzetowy("2052");
        nowySlownik.utworzNowyRokBudzetowy();
        Thread.sleep(1000);
        stronaGlowna.latabudzetowe();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'2052')]")).getText(),"2052");
        MainPageBudzet nowyBudzet = new MainPageBudzet(driver);
        stronaGlowna.budzetObywatelski();
        stronaGlowna.budzet();
        nowyBudzet.roboczyBudzet();
        nowyBudzet.nazwaBudzetu();
        nowyBudzet.jednostka();
        nowyBudzet.rokBudzetowy();
        nowyBudzet.opis("przykładowy opis");
        nowyBudzet.status();
        nowyBudzet.zapisz();
        stronaGlowna.budzet();
    }
}

