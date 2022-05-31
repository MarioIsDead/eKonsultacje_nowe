package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SondaPublikacja extends Bazowa {

    @Test
    public void publikacja() {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage sondyMenu = new MainPage(driver);
        sondyMenu.sondy();
        Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'Roboczy')]")).getText(), "Roboczy");
        sondyMenu.statusSondy();
        MainPageNewSonda sondaPublikacja = new MainPageNewSonda(driver);
        assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Publikuj')]")).isEnabled());
        sondaPublikacja.publikuj();
        sondaPublikacja.potwierdzeniePublikuj();
    }
}