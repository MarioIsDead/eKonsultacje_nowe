package eKonsultacje.testy;

import eKonsultacje.Strony.Bazowa;
import eKonsultacje.Strony.MainPage;
import eKonsultacje.Strony.MainPageNewKonsultacja;
import eKonsultacje.Strony.stronaLogowania;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NowaKonsultacjaPublikacja extends Bazowa {

    @Test
    public void publikacja() throws InterruptedException {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage konsultacjeMenu = new MainPage(driver);
        konsultacjeMenu.konsultacjeLink();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//tbody//tr[1]//td[7]")).getText(), "Roboczy");
        konsultacjeMenu.statusSondy();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1200)");
        Assert.assertEquals(driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm active disabled']")).getText(), "Opublikowana");
        MainPageNewKonsultacja ankietaPublikacja = new MainPageNewKonsultacja(driver);
        js.executeScript("window.scrollBy(0,-1500)");
        ankietaPublikacja.publikujKonsultacje();
        ankietaPublikacja.potwiertdzKonsultacje();
    }
}