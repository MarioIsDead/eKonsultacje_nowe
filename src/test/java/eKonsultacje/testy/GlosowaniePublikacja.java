package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlosowaniePublikacja extends Bazowa {

    @Test
    public void publikacja() throws InterruptedException {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage budzetMenu = new MainPage(driver);
        budzetMenu.budzetObywatelski();
        budzetMenu.glosowanie();
        MainPageGlosowanie glosowanie = new MainPageGlosowanie (driver);
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("//tbody//tr[1]//td[7]")).getText(),"Roboczy");
        glosowanie.statusGlosowania();
        glosowanie.przewijanieStrony();
        glosowanie.dodajNowyObszar();
        glosowanie.obszar();
        glosowanie.punktyNaKategorie();
        glosowanie.punktyNaObszar();
        glosowanie.punktyNaProjekt();
        glosowanie.kategoria();
        glosowanie.projekt();
        glosowanie.zapisz();
        glosowanie.publikuj();
        glosowanie.potwierdzenie();
        }
}
