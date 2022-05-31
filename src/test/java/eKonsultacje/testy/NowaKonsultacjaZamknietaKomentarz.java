package eKonsultacje.testy;
import eKonsultacje.Strony.Bazowa;
import eKonsultacje.Strony.MainPage;
import eKonsultacje.Strony.MainPageNewKonsultacja;
import eKonsultacje.Strony.stronaLogowania;
import org.testng.annotations.Test;

public class NowaKonsultacjaZamknietaKomentarz extends Bazowa {

    @Test
    public void logowanieUsera() {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage konsultacjeMenu = new MainPage(driver);
        konsultacjeMenu.konsultacjeLink();
        konsultacjeMenu.konsultacjaLinkNew();
        MainPageNewKonsultacja roboczaKonsultacja = new MainPageNewKonsultacja(driver);
        roboczaKonsultacja.nowaKonsultacjaKomentarz();
        roboczaKonsultacja.otwarty();
        roboczaKonsultacja.grupySpoleczne();
        roboczaKonsultacja.jednostka();
        roboczaKonsultacja.kategoria();
        roboczaKonsultacja.krotkiOpis();
        roboczaKonsultacja.dataRozpoczeciaProjektu("2019-05-09","2019-05-30");
        roboczaKonsultacja.nowaForma();
        roboczaKonsultacja.komentarz();
        roboczaKonsultacja.sondaRobocza();
        roboczaKonsultacja.moderator();
        roboczaKonsultacja.trybKomentowania();
        roboczaKonsultacja.publikujKomentarz();
        roboczaKonsultacja.zapisz();
        roboczaKonsultacja.utworz();
       }
}