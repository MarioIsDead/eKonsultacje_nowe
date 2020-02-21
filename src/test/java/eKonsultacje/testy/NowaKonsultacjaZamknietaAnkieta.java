package eKonsultacje.testy;
import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.assertTrue;

public class NowaKonsultacjaZamknietaAnkieta extends Bazowa {

    @Test
    public void logowanieUsera() throws AWTException {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage konsultacjeMenu = new MainPage(driver);
        konsultacjeMenu.konsultacjeLink();
        konsultacjeMenu.konsultacjaLinkNew();
        MainPageNewKonsultacja roboczaKonsultacja = new MainPageNewKonsultacja(driver);
        roboczaKonsultacja.nowaKonsultacjaAnkieta();
        roboczaKonsultacja.zamkniety();
        roboczaKonsultacja.grupySpoleczne();
        roboczaKonsultacja.jednostka();
        roboczaKonsultacja.kategoria();
        roboczaKonsultacja.krotkiOpis();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        roboczaKonsultacja.dataRozpoczeciaProjektu("2019-06-05","2019-06-30");
        roboczaKonsultacja.regulamin();
        Roboty dodawaniePliku = new Roboty(driver);
        dodawaniePliku.zalacznik("C:\\Selenium\\HelloWorld.jar");
        Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'HelloWorld.jar')]")).getText(),"HelloWorld.jar");
        roboczaKonsultacja.nowaForma();
        roboczaKonsultacja.ankieta();
        roboczaKonsultacja.ankietaRobocza();
        roboczaKonsultacja.opisAnkiety();
        roboczaKonsultacja.dataRozpoczeciaGlosowania("2019-06-05","2019-06-30");
        roboczaKonsultacja.pytanie();
        roboczaKonsultacja.prosteRadio();
        roboczaKonsultacja.pytaniePierwsze("Czy zgadzasz się na... ?");
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
        roboczaKonsultacja.odpowiedzButton4();
        roboczaKonsultacja.scrollDown();
        roboczaKonsultacja.odpowiedzInput4("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz4();
        js.executeScript("window.scrollBy(0,-500)");
        roboczaKonsultacja.pytanie();
        roboczaKonsultacja.dodaRankingowe();
        roboczaKonsultacja.pytaniePiate("Czy lubisz kolor czerwony?");
        roboczaKonsultacja.odpowiedzButton5();
        roboczaKonsultacja.odpowiedzInput5("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz5();
        js.executeScript("window.scrollBy(0,-1200)");
        roboczaKonsultacja.pytanie();
        roboczaKonsultacja.dodajMacierzowe();
        roboczaKonsultacja.pytanieSzoste("Czy...?");
        roboczaKonsultacja.odpowiedzButton6();
        js.executeScript("window.scrollBy(0,300)");
        roboczaKonsultacja.odpowiedzInput6("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz6();
        roboczaKonsultacja.odpowiedzButton6_a();
        roboczaKonsultacja.odpowiedzInput6_a("Tak");
        roboczaKonsultacja.kolejnaOdpowiedz6_a();
        roboczaKonsultacja.scrollUp();
        roboczaKonsultacja.ankietaPublikuj();
        roboczaKonsultacja.zapisz();
        assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/fieldset[4]/div[1]/button[1]")).isEnabled());
        roboczaKonsultacja.utworz();
       }
}