package eKonsultacje.Strony;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class MainPageNewAnkieta extends Bazowa {


    @FindBy(xpath = "//input[@id='title']")
    WebElement nazwaProjektu;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement nowaAnkietaButton;

    @FindBy(xpath = "//label[contains(text(),'Otwarty')]")
    WebElement radioOtwarta;

    @FindBy(xpath = "//select[@id='officeId']")
    WebElement jednostkaLista;

    @FindBy(xpath = "//select[@id='thematicAreaId']")
    WebElement kategoriaLista;

    @FindBy(xpath = "//textarea[@id='description']")
    WebElement opisInput;

    @FindBy(xpath = "//div[5]//div[2]//div[1]//div[1]//input[1]")
    WebElement dataZakonczeniaInput;

    @FindBy(xpath = "//select[@id='agreementHistoryId']")
    WebElement regulaminLista;

    @FindBy(xpath = "//button[@class='mb-2 mr-2 dropdown-toggle btn btn-primary']")
    WebElement dodajPytanieButton;

    @FindBy(xpath = "//button[contains(text(),'Proste (radio)')]")
    WebElement dodajProsteButton;

    @FindBy(xpath = "//input[@id='consultationForms.0.categories.0.questions.0.content']")
    WebElement pytanieTrescInput;

    @FindBy(xpath = "//button[@id='toggler-0']")
    WebElement pokazOdpowiedzButton;

    @FindBy(xpath = "//button[@class='mr-2 btn-icon btn btn-success']")
    WebElement dodajOdpowiedzButton;

    @FindBy(xpath = "//button[@class='btn-icon mr-2 btn btn-primary'][contains(text(),'Dodaj')]")
    WebElement potwierdzOdpowiedzButton;

    @FindBy(xpath = "//input[@id='content']")
    WebElement dodajOdpowiedzInput1;

    @FindBy(xpath = "//button[@class='btn-icon mr-2 btn btn-primary']")
    WebElement utworzButton;

    @FindBy(xpath = "//span[@class='ladda-label']")
    WebElement publikujButton;

    @FindBy(xpath = "//span[contains(text(),'Tak')]")
    WebElement potwierdzeniePublikacjiButton;

    public MainPageNewAnkieta(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void utworzenieAnkiety() {
        nowaAnkietaButton.click();
    }

    public void nowaAnkieta() {
        Random ran = new Random();
        int nxt = ran.nextInt(999999);
        nazwaProjektu.sendKeys("Ankieta: " + nxt);
    }

    public void ankietaOtwarta() {
        radioOtwarta.click();
    }

    public void jednostka() {
        jednostkaLista.click();
        jednostkaLista.sendKeys(Keys.ARROW_DOWN);
        jednostkaLista.sendKeys(Keys.ENTER);
    }

    public void kategoria() {
        kategoriaLista.click();
        kategoriaLista.sendKeys(Keys.ARROW_DOWN);
        kategoriaLista.sendKeys(Keys.ENTER);
    }

    public void opis() {
        opisInput.click();
        opisInput.sendKeys("Opis");
    }

    public void dataZakonczenia(String dataZakonczenia) {
        dataZakonczeniaInput.clear();
        dataZakonczeniaInput.sendKeys(dataZakonczenia);
    }

    public void regulamin() {
        regulaminLista.click();
        regulaminLista.sendKeys(Keys.ARROW_DOWN);
        regulaminLista.sendKeys(Keys.ENTER);
    }

    public void dodajPytanie() {
        dodajPytanieButton.click();
    }

    public void proste() {
        dodajProsteButton.click();
    }

    public void pytanieTresc() {
        pytanieTrescInput.sendKeys("Czy uwazasz ze...?");
    }

    public void pokazOdpowiedz() {
        pokazOdpowiedzButton.click();
    }

    public void dodajOdpowiedz() {
        dodajOdpowiedzButton.click();
    }

    public void trescOdpowiedzi() {
        dodajOdpowiedzInput1.sendKeys("Tak");
    }

    public void trescOdpowiedzi2() {
        dodajOdpowiedzInput1.sendKeys("Nie");
    }

    public void potwierdzOdpowiedz() {
        potwierdzOdpowiedzButton.click();
    }

    public void utworz() {
        utworzButton.click();
    }

    public void publikuj() {
        publikujButton.click();
    }

    public void potwierdzeniePublikuj() {
        potwierdzeniePublikacjiButton.click();
    }
}