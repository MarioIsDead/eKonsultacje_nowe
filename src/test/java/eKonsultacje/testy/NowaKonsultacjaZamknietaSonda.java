package eKonsultacje.testy;
import eKonsultacje.Strony.Bazowa;
import eKonsultacje.Strony.MainPage;
import eKonsultacje.Strony.MainPageNewKonsultacja;
import eKonsultacje.Strony.stronaLogowania;
import org.testng.annotations.Test;

public class NowaKonsultacjaZamknietaSonda extends Bazowa {

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
        roboczaKonsultacja.zamkniety();
        roboczaKonsultacja.grupySpoleczne();
        roboczaKonsultacja.jednostka();
        roboczaKonsultacja.obszarTematyczny();
        roboczaKonsultacja.krotkiOpis();
        roboczaKonsultacja.dataRozpoczeciaProjektu("2019-06-05","2019-06-30");
        roboczaKonsultacja.regulamin();
        roboczaKonsultacja.nowaForma();
        roboczaKonsultacja.sonda();
        roboczaKonsultacja.sondaRobocza();
        roboczaKonsultacja.opisSondy();
        roboczaKonsultacja.dataRozpoczeciaGlosowania("2019-06-05","2019-06-30");
        roboczaKonsultacja.publikacjaWynikow();
        roboczaKonsultacja.pytaniePierwsze("Czy zgadzasz się na... ?");
        roboczaKonsultacja.czyMoznaKomentowac();
        roboczaKonsultacja.odpowiedz();
        roboczaKonsultacja.odpowiedz1Input("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz();
        roboczaKonsultacja.odpowiedz();
        roboczaKonsultacja.odpowiedz2Input2("Nie");
        roboczaKonsultacja.kolejnaOdpowiedz();
        roboczaKonsultacja.scrollUp();
        roboczaKonsultacja.ankietaPublikuj();
        roboczaKonsultacja.zapisz();
        roboczaKonsultacja.utworz();
       }
}

