package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.testng.annotations.Test;

public class Glosowanie extends Bazowa {

    @Test
    public void publikacja() throws InterruptedException {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage budzetMenu = new MainPage(driver);
        budzetMenu.budzetObywatelski();
        budzetMenu.budzet();
        MainPageBudzet budzetPublikacja = new MainPageBudzet(driver);
        Thread.sleep(1000);
        budzetPublikacja.pobieranieNazwyBudzetu();
        //budzetMenu.glosowanie();
        //MainPageGlosowanie glosowanie = new MainPageGlosowanie(driver);
        //glosowanie.noweGlosowanie();
        //glosowanie.budzetName();

                //MainPageBudzet nazwaBudzetu = new MainPageBudzet (driver);
        //nazwaBudzetu.nazwaBudzetu();
       // nazwaBudzetu.pobieranieNazwyBudzetu();
    }
}
