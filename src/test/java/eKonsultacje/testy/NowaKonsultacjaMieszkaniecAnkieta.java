package eKonsultacje.testy;
import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;

public class NowaKonsultacjaMieszkaniecAnkieta extends Bazowa {

    @Test
    public void KonsultacjaMieszkaniecAnkieta() throws InterruptedException, AWTException {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage konsultacjeMenu = new MainPage(driver);
        konsultacjeMenu.konsultacjeLink();
        konsultacjeMenu.konsultacjaLinkNew();
        MainPageNewKonsultacja roboczaKonsultacja = new MainPageNewKonsultacja(driver);
        roboczaKonsultacja.nowaKonsultacjaAnkieta();
        roboczaKonsultacja.tylkoDlaMieszkanca();
        roboczaKonsultacja.jednostka();
        roboczaKonsultacja.obszar();
        roboczaKonsultacja.kategoria();
        roboczaKonsultacja.krotkiOpis();
        roboczaKonsultacja.dataRozpoczeciaProjektu("2022-05-19","2022-05-29");
        roboczaKonsultacja.regulamin();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Roboty dodawaniePliku = new Roboty(driver);
        roboczaKonsultacja.nowaForma();
        roboczaKonsultacja.ankieta();
        roboczaKonsultacja.ankietaRobocza();
        roboczaKonsultacja.opisAnkiety();
        roboczaKonsultacja.dataRozpoczeciaGlosowania("2022-05-19","2022-05-29");
        roboczaKonsultacja.pytanie();
        roboczaKonsultacja.prosteRadio();
        roboczaKonsultacja.pytaniePierwsze("Czy zgadzasz się na... ?");
        roboczaKonsultacja.pokazOdpowiedzi();
        roboczaKonsultacja.odpowiedz();
        roboczaKonsultacja.odpowiedz1Input("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz();
        roboczaKonsultacja.odpowiedz();
        roboczaKonsultacja.odpowiedz2Input2("Nie");
        roboczaKonsultacja.kolejnaOdpowiedz();
        roboczaKonsultacja.pytanie();
        roboczaKonsultacja.prosteOtwarte();
        roboczaKonsultacja.pytanieDrugie("Jaka powinna być wg Ciebie... ?");
        roboczaKonsultacja.pytanie();
        roboczaKonsultacja.prosteData();
        roboczaKonsultacja.pytanieTrzecie("Czy...?");
        roboczaKonsultacja.pytanie();
        roboczaKonsultacja.dodajCheckbox();
        roboczaKonsultacja.pytanieCzwarte("Czy lubisz kolor bialy?");
        roboczaKonsultacja.scrollDown();
        Thread.sleep(1000);
        roboczaKonsultacja.pokazOdpowiedzi2();
        roboczaKonsultacja.odpowiedzButton4();
        roboczaKonsultacja.odpowiedzInput4("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz4();
        js.executeScript("window.scrollBy(0,-500)");
        roboczaKonsultacja.pytanie();
        roboczaKonsultacja.dodaRankingowe();
        roboczaKonsultacja.pytaniePiate("Czy lubisz kolor czerwony?");
        roboczaKonsultacja.pokazOdpowiedzi3();
        roboczaKonsultacja.odpowiedzButton5();
        roboczaKonsultacja.odpowiedzInput5("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz5();
        js.executeScript("window.scrollBy(0,-1200)");
        roboczaKonsultacja.pytanie();
        roboczaKonsultacja.dodajMacierzowe();
        roboczaKonsultacja.pytanieSzoste("Czy...?");
        roboczaKonsultacja.pokazOdpowiedzi4();
        roboczaKonsultacja.odpowiedzButton6();
        js.executeScript("window.scrollBy(0,300)");
        roboczaKonsultacja.odpowiedzInput6("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz6();
        roboczaKonsultacja.odpowiedzButton6_a();
        roboczaKonsultacja.odpowiedzInput6_a("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz6_a();
        js.executeScript("window.scrollBy(0,800)");
        roboczaKonsultacja.zapisz();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,900)");
        roboczaKonsultacja.ankietaPublikuj();
        Assert.assertEquals(driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm active disabled']")).getText(),"Opublikowana");
        dodawaniePliku.zalacznik("C:\\Selenium\\apache-maven-3.6.0\\readme.txt");
        Assert.assertEquals(driver.findElement(By.xpath("//small[contains(text(),'README.txt')]")).getText(),"README.txt");
        js.executeScript("window.scrollTo(0, Math.max(document.documentElement.scrollHeight, document.body.scrollHeight, document.documentElement.clientHeight));");
        roboczaKonsultacja.utworz();
        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(5000);
        dodawaniePliku.aktPrawny("C:\\Users\\m.zygmanowski\\Desktop\\Akt prawne e-konsultacje\\01 - LegalAct.zipx");
        
       }
}