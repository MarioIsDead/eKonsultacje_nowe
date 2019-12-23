package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class AnkietaPublikacja extends Bazowa {

    @Test
    public void publikacja() throws InterruptedException {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage ankietaMenu = new MainPage(driver);
        ankietaMenu.ankietyLink();
        Assert.assertEquals(driver.findElement(By.xpath("//tbody//tr[1]//td[7]")).getText(), "Roboczy");
        Thread.sleep(1000);
        ankietaMenu.statusSondy();
        MainPageNewAnkieta ankietaPublikacja = new MainPageNewAnkieta(driver);
        assertTrue(driver.findElement(By.xpath("//span[@class='ladda-label']")).isEnabled());
        ankietaPublikacja.publikuj();
        ankietaPublikacja.potwierdzeniePublikuj();
    }
}