package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.testng.annotations.Test;

public class Projekt extends Bazowa {

    @Test
    public void publikacja() throws InterruptedException {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage budzetMenu = new MainPage(driver);
        budzetMenu.budzetObywatelski();
        MainPageProjekty projekty = new MainPageProjekty(driver);
        projekty.projektyMenu();
        projekty.nowyProjekt();
        projekty.nazwaProjektu();
        projekty.opisProjektu();
        projekty.jednostka();
        projekty.obszar();
        projekty.kategoria();
        projekty.koszty();
        projekty.rokBudzetowy("2052");
        projekty.status();
        projekty.utworz();
        projekty.statusZatwierdzony();
        projekty.utworz();
        }
}
