package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SondaPublikacja extends Bazowa {

    @Test
    public void publikacja() {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage sondyMenu = new MainPage(driver);
        sondyMenu.sondy();
        Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'Roboczy')]")).getText(), "Roboczy");
        sondyMenu.statusSondy();
        MainPageNewSonda sondaPublikacja = new MainPageNewSonda(driver);
        assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")).isEnabled());
        sondaPublikacja.publikuj();
        sondaPublikacja.potwierdzeniePublikuj();
    }
}