package eKonsultacje.testy;

import eKonsultacje.Strony.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BudzetPublikacja extends Bazowa {

    @Test
    public void publikacja() throws InterruptedException {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        MainPage budzetMenu = new MainPage(driver);
        budzetMenu.budzetObywatelski();
        Assert.assertEquals(driver.findElement(By.cssSelector("div.app-container.app-theme-white.fixed-header.fixed-sidebar.fixed-footer:nth-child(2) div.app-main div.app-main__outer div.app-main__inner div.mb-3.card:nth-child(3) div.card-body div.d-flex.flex-column div.table-responsive.dx-g-bs4-table-container div:nth-child(1) table.table.dx-g-bs4-table tbody:nth-child(3) tr:nth-child(1) > td.dx-g-bs4-table-cell.text-nowrap:nth-child(5)")).getText(), "Roboczy");
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