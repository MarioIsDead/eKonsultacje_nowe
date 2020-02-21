package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BudzetObywatelski extends Bazowa {
    @Test
    public void logowanieUsera() throws InterruptedException {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage stronaGlowna = new MainPage(driver);
        stronaGlowna.slowniki();
        Thread.sleep(1000);
        stronaGlowna.latabudzetowe();
        MainPageSlowniki nowySlownik = new MainPageSlowniki(driver);
        nowySlownik.tworzenieSlownika();
        nowySlownik.nowyRokBudzetowy("2053");
        nowySlownik.utworzNowyRokBudzetowy();
        stronaGlowna.latabudzetowe();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText(),"2053");
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

