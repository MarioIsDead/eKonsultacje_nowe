package eKonsultacje.Strony;

import eKonsultacje.Strony.Helpers.SeleniumHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Random;

public class MainPageProjekty extends Bazowa {

    @FindBy(xpath = "//a[contains(text(),'Projekty')]")
    WebElement projektyButton;

    @FindBy(xpath = "//button[@class='mb-2 mr-2 btn-icon btn btn-success']")
    WebElement nowyProjektButton;

    @FindBy(xpath = "//input[@id='title']")
    WebElement nazwaProjektuInput;

    @FindBy(id = "description")
    WebElement opisProjektuInput;

    @FindBy(id = "officeId")
    WebElement jednostkaLista;

    @FindBy(xpath = "//option[contains(text(),'biec')]")
    WebElement obszarDebiecLista;

    @FindBy(xpath = "//option[contains(text(),'Kultura')]")
    WebElement kategoriaLista;

    @FindBy(xpath = "//input[@id='cost']")
    WebElement kosztInput;

    @FindBy(xpath = "//select[@id='budgetYearId']")
    WebElement rokBudzetowyLista;

    @FindBy(xpath = "//option[contains(text(),'Roboczy')]")
    WebElement statusLista;

    @FindBy(xpath = "//button[@class='btn-icon mr-2 btn btn-primary']")
    WebElement utworzButtom;

    @FindBy(xpath = "//option[contains(text(),'Zatwierdzony')]")
    WebElement statusZatwierdzonyLista;

    public SeleniumHelper helper;

    public MainPageProjekty(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.helper = new SeleniumHelper(driver);
    }

    public void projektyMenu() {
        projektyButton.click();
    }

    public void nowyProjekt() {
        nowyProjektButton.click();
    }

    public void nazwaProjektu() {
        Random ran = new Random();
        int nxt = ran.nextInt(999999);
        nazwaProjektuInput.sendKeys("Projekt" + nxt);
    }

    public void opisProjektu() throws InterruptedException {
        opisProjektuInput.sendKeys("opis projektu");
        opisProjektuInput.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
    }

    public void jednostka() {
        jednostkaLista.click();
        jednostkaLista.sendKeys("U");
        jednostkaLista.sendKeys(Keys.ENTER);
    }

    public void obszar() {
        obszarDebiecLista.click();
    }

    public void kategoria() {
        kategoriaLista.click();
    }

    public void koszty() {
        kosztInput.sendKeys("1000");
    }

    public void rokBudzetowy(String rokBudzetowy) {
        rokBudzetowyLista.sendKeys(rokBudzetowy);
        rokBudzetowyLista.sendKeys(Keys.ENTER);
    }

    public void status() {
        statusLista.click();
    }

    public void utworz() {
        utworzButtom.click();
    }

    public void statusZatwierdzony() {
        statusZatwierdzonyLista.click();
    }
}