package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.testng.annotations.Test;

public class Glosowanie extends Bazowa {

    @Test
    public void publikacja() {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage budzetMenu = new MainPage(driver);
        budzetMenu.budzetObywatelski();
        budzetMenu.budzet();
        budzetMenu.rokBudzetowyTabela("2053");
        budzetMenu.odswiez();
        MainPageBudzet budzet = new MainPageBudzet(driver);
        budzet.glosowanieNazwaBudzetu();
        MainPageGlosowanie glosowanie = new MainPageGlosowanie (driver);
        glosowanie.nazwaGlosowania();
        glosowanie.dataZakonczeniaGlosowania("2020-02-29");
        glosowanie.regulamin();
        glosowanie.pokazNaStronie();
        glosowanie.utworzGlosowanie();
        }
}
