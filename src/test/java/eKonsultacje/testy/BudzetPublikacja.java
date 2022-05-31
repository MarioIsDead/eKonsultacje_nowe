package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BudzetPublikacja extends Bazowa {

    @Test
    public void BudzetPublikacja() throws InterruptedException {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage budzetMenu = new MainPage(driver);
        budzetMenu.budzetObywatelski();
        Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'Roboczy')]")).getText(), "Roboczy");
        Thread.sleep(1000);
        budzetMenu.statusBudzetu();
        MainPageBudzet budzetPublikacja = new MainPageBudzet(driver);
        budzetPublikacja.status();
        budzetPublikacja.status();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        assertTrue(driver.findElement(By.xpath("//button[@class='btn-icon mr-2 btn btn-primary']")).isEnabled());
        budzetPublikacja.zapisz();
        }
}