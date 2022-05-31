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
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
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
        roboczaKonsultacja.obszar();
        roboczaKonsultacja.kategoria();
        roboczaKonsultacja.krotkiOpis();
        roboczaKonsultacja.dataRozpoczeciaProjektu("2022-05-19","2022-05-29");
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
        js.executeScript("window.scrollBy(0,500)");
        roboczaKonsultacja.zapisz();
        Thread.sleep(1000);
        roboczaKonsultacja.sondaPublikuj();
        roboczaKonsultacja.utworz();
       }
}