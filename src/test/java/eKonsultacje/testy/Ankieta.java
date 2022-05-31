package eKonsultacje.testy;
import eKonsultacje.Strony.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.awt.*;

public class Ankieta extends Bazowa {

    @Test
    public void Ankieta () throws AWTException {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage stronaGlowna = new MainPage(driver);
        stronaGlowna.ankietyLink();
        MainPageNewAnkieta roboczaAnkieta = new MainPageNewAnkieta(driver);
        roboczaAnkieta.utworzenieAnkiety();
        roboczaAnkieta.nowaAnkieta();
        roboczaAnkieta.ankietaOtwarta();
        roboczaAnkieta.jednostka();
        roboczaAnkieta.kategoria();
        roboczaAnkieta.opis();
        roboczaAnkieta.dataZakonczenia("2019-09-30");
        roboczaAnkieta.regulamin();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        roboczaAnkieta.dodajPytanie();
        roboczaAnkieta.proste();
        roboczaAnkieta.pytanieTresc();
        roboczaAnkieta.pokazOdpowiedz();
        roboczaAnkieta.dodajOdpowiedz();
        roboczaAnkieta.trescOdpowiedzi();
        roboczaAnkieta.potwierdzOdpowiedz();
        roboczaAnkieta.dodajOdpowiedz();
        roboczaAnkieta.trescOdpowiedzi2();
        roboczaAnkieta.potwierdzOdpowiedz();
        js.executeScript("window.scrollBy(0,500)");
        Roboty dodawaniePliku = new Roboty(driver);
        dodawaniePliku.zalacznik("C:\\Selenium\\wniosek.pdf");
        js.executeScript("window.scrollBy(0,300)");
        roboczaAnkieta.utworz();
       }
}