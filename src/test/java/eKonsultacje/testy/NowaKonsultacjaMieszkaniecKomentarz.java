package eKonsultacje.testy;
import eKonsultacje.Strony.Bazowa;
import eKonsultacje.Strony.MainPage;
import eKonsultacje.Strony.MainPageNewKonsultacja;
import eKonsultacje.Strony.stronaLogowania;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class NowaKonsultacjaMieszkaniecKomentarz extends Bazowa {

    @Test
    public void logowanieUsera() throws InterruptedException{
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
        roboczaKonsultacja.obszar();
        roboczaKonsultacja.kategoria();
        roboczaKonsultacja.krotkiOpis();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
        roboczaKonsultacja.nowaForma();
        roboczaKonsultacja.komentarz();
        roboczaKonsultacja.sondaRobocza();
        roboczaKonsultacja.moderator();
        roboczaKonsultacja.trybKomentowania();
        roboczaKonsultacja.zapiszKomentarz();
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        roboczaKonsultacja.publikujKomentarz();
        roboczaKonsultacja.utworz();
       }
}

