package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;

public class GlosowaniePublikacja extends Bazowa {

    @Test
    public void publikacja() throws InterruptedException {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage budzetMenu = new MainPage(driver);
        budzetMenu.budzetObywatelski();
        budzetMenu.glosowanie();
        MainPageGlosowanie glosowanie = new MainPageGlosowanie (driver);
        Thread.sleep(1000);
        WebElement Roboczy = this.driver.findElement(By.xpath("//td[contains(text(),'Roboczy')]"));
        Roboczy.click();
        Thread.sleep(1000);
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
