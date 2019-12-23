package eKonsultacje.testy;
import eKonsultacje.Strony.Bazowa;
import eKonsultacje.Strony.MainPage;
import eKonsultacje.Strony.MainPageNewKonsultacja;
import eKonsultacje.Strony.stronaLogowania;
import org.testng.annotations.Test;

public class NowaKonsultacjaZamknietaKomentarz extends Bazowa {

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
        roboczaKonsultacja.otwarty();
        roboczaKonsultacja.grupySpoleczne();
        roboczaKonsultacja.jednostka();
        roboczaKonsultacja.obszarTematyczny();
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