package eKonsultacje.testy;
import eKonsultacje.Strony.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.awt.*;

public class NowaKonsultacjaOtwartaKomentarz extends Bazowa {

    @Test
    public void logowanieUsera() throws InterruptedException, AWTException {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage konsultacjeMenu = new MainPage(driver);
        konsultacjeMenu.konsultacjeLink();
        konsultacjeMenu.konsultacjaLinkNew();
        MainPageNewKonsultacja roboczaKonsultacja = new MainPageNewKonsultacja(driver);
        roboczaKonsultacja.nowaKonsultacjaKomentarz();
        roboczaKonsultacja.tylkoDlaMieszkanca();
        roboczaKonsultacja.grupySpoleczne();
        roboczaKonsultacja.jednostka();
        roboczaKonsultacja.obszarTematyczny();
        roboczaKonsultacja.krotkiOpis();
        roboczaKonsultacja.dataRozpoczeciaProjektu("2019-07-26","2019-07-30");
        roboczaKonsultacja.regulamin();
        Roboty dodawaniePliku = new Roboty(driver);
        //dodawaniePliku.uploadFile("C:\\Users\\m.zygmanowski\\Desktop\\Akt prawne e-konsultacje\\01 - LegalAct.zipx");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        roboczaKonsultacja.sondaRobocza();
        roboczaKonsultacja.moderator();
        roboczaKonsultacja.trybKomentowania();
        roboczaKonsultacja.publikujKomentarz();
        roboczaKonsultacja.zapisz();
        js.executeScript("window.scrollBy(0,500)");
        roboczaKonsultacja.utworz();
       }
}

