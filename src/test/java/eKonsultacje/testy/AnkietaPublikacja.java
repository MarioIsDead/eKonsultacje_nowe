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
    public void AnkietaPub() throws InterruptedException {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        //WebDriverWait wait = new WebDriverWait(driver, 100);
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage ankietaMenu = new MainPage(driver);
        ankietaMenu.ankietyLink();
        //driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'Roboczy')]")).getText(), "Roboczy");
        Thread.sleep(1000);
        ankietaMenu.statusSondy();
        MainPageNewAnkieta ankietaPublikacja = new MainPageNewAnkieta(driver);
        assertTrue(driver.findElement(By.xpath("//span[@class='ladda-label']")).isEnabled());
        ankietaPublikacja.publikuj();
        ankietaPublikacja.potwierdzeniePublikuj();
    }
}