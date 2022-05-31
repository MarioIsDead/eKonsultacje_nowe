package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.testng.annotations.Test;

public class Glosowanie extends Bazowa {

    @Test
    public void Glosowanie() {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage budzetMenu = new MainPage(driver);
        budzetMenu.budzetObywatelski();
        budzetMenu.budzet();
        budzetMenu.rokBudzetowyTabela("2052");
        budzetMenu.odswiez();
        MainPageBudzet budzet = new MainPageBudzet(driver);
        budzet.glosowanieNazwaBudzetu();
        MainPageGlosowanie glosowanie = new MainPageGlosowanie (driver);
        glosowanie.nazwaGlosowania();
        glosowanie.dataZakonczeniaGlosowania("2022-05-30");
        glosowanie.regulamin();
        glosowanie.pokazNaStronie();
        glosowanie.utworzGlosowanie();
        }
}
