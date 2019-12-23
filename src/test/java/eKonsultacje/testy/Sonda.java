package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Sonda extends Bazowa {

    @Test
    public void logowanieUsera() throws InterruptedException {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage stronaGlowna = new MainPage(driver);
        stronaGlowna.sondy();
        MainPageNewSonda roboczaSonda = new MainPageNewSonda(driver);
        roboczaSonda.utworzenieSondy();
        roboczaSonda.nowaSonda();
        roboczaSonda.ankietaOtwarta();
        roboczaSonda.jednostka();
        roboczaSonda.kategoria();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        roboczaSonda.pytanieTresc();
        roboczaSonda.pokazOdpowiedzi();
        roboczaSonda.dodajOdpowiedz();
        roboczaSonda.trescOdpowiedzi1();
        roboczaSonda.kolejnaOdpowiedz();
        roboczaSonda.dodajOdpowiedz();
        roboczaSonda.trescOdpowiedzi2();
        roboczaSonda.kolejnaOdpowiedz();
        js.executeScript("window.scrollBy(0,200)");
        roboczaSonda.utworz();
       }
}