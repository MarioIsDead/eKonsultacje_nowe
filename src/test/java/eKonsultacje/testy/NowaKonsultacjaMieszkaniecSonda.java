package eKonsultacje.testy;
import eKonsultacje.Strony.Bazowa;
import eKonsultacje.Strony.MainPage;
import eKonsultacje.Strony.MainPageNewKonsultacja;
import eKonsultacje.Strony.stronaLogowania;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class NowaKonsultacjaMieszkaniecSonda extends Bazowa {

    @Test
    public void logowanieUsera() throws InterruptedException{
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage konsultacjeMenu = new MainPage(driver);
        konsultacjeMenu.konsultacjeLink();
        konsultacjeMenu.konsultacjaLinkNew();
        MainPageNewKonsultacja roboczaKonsultacja = new MainPageNewKonsultacja(driver);
        roboczaKonsultacja.nowaKonsultacjaSonda();
        roboczaKonsultacja.tylkoDlaMieszkanca();
        roboczaKonsultacja.grupySpoleczne();
        roboczaKonsultacja.jednostka();
        roboczaKonsultacja.obszarTematyczny();
        roboczaKonsultacja.krotkiOpis();
        roboczaKonsultacja.dataRozpoczeciaProjektu("2019-08-09","2019-08-30");
        roboczaKonsultacja.regulamin();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        roboczaKonsultacja.nowaForma();
        roboczaKonsultacja.sonda();
        roboczaKonsultacja.sondaRobocza();
        roboczaKonsultacja.opisSondy();
        roboczaKonsultacja.pytaniePierwsze("Czy zgadzasz się na... ?");
        roboczaKonsultacja.pokazOdpowiedzi();
        roboczaKonsultacja.odpowiedz();
        roboczaKonsultacja.odpowiedz1Input("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz();
        roboczaKonsultacja.odpowiedz();
        roboczaKonsultacja.odpowiedz2Input2("Nie");
        roboczaKonsultacja.kolejnaOdpowiedz();
        roboczaKonsultacja.zapisz();
        roboczaKonsultacja.sondaPublikuj();
        js.executeScript("window.scrollBy(0,500)");
        roboczaKonsultacja.utworz();
       }
}