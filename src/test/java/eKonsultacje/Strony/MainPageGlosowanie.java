package eKonsultacje.Strony;

import eKonsultacje.Strony.Helpers.SeleniumHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Random;

public class MainPageGlosowanie extends Bazowa{

    @FindBy(xpath = "//input[@id='title']")
    WebElement nazwaGlosowaniaInput;

    @FindBy(xpath = "//input[@id='dateTo']")
    WebElement dataZakonczeniaGlosowaniaButton;

    @FindBy (id = "agreementHistoryId")
    WebElement regulaminLista;

    @FindBy (xpath = "//label[contains(text(),'na stronie g')]")
    WebElement pokazNaStronieCheckbox;

    @FindBy (xpath = "//button[@class='btn-icon mr-2 btn btn-primary']")
    WebElement utworzGlosowanieButton;

    @FindBy (xpath = "//tbody//tr[1]//td[7]")
    WebElement statusGlosowaniaTabela;

    @FindBy (xpath = "//textarea[@id='description']")
    WebElement przewijanieStronyButton;

    @FindBy (xpath = "//button[@class='mb-2 mr-2 dropdown-toggle btn btn-primary']")
    WebElement dodajNowyObszarButton;

    @FindBy (xpath = "//button[@class='btn-icon-vertical btn-transition btn btn-outline-primary']")
    WebElement obszarButton;

    @FindBy (xpath = "//i[@class='lnr-pencil btn-icon-wrapper']")
    WebElement edycjaObszaru;

    @FindBy (xpath = "//select[@id='districtId']")
    WebElement obszarLista;

    @FindBy (xpath = "//input[@id='maxPoint']")
    WebElement punktyNaObszarInput;

    @FindBy (xpath = "//input[@id='categoryMaxPoint']")
    WebElement punktyNaKategorieInput;

    @FindBy (xpath = "//input[@id='questionMaxPoint']")
    WebElement punktyNaProjektInput;

    @FindBy (xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/button[1]/h5[1]")
    WebElement kategoriaLista;

    @FindBy (xpath = "//li[1]//div[2]//div[1]//div[1]//div[1]")
    WebElement projektCheckbox;

    @FindBy (xpath = "//div[@class='modal-footer']/button[@type='submit']")
    WebElement zapiszButton;

    @FindBy (xpath = "//button[@class='ladda-button btn btn-shadow btn-success mr-1']")
    WebElement publikujButton;

    @FindBy (xpath = "//button[@class='ladda-button btn btn-success']")
    WebElement potwierdzenieButton;

    public SeleniumHelper helper;

    public MainPageGlosowanie (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.helper= new SeleniumHelper(driver);
    }

    public void nazwaGlosowania () {
        Random ran = new Random();
        int nxt = ran.nextInt(999999);
        nazwaGlosowaniaInput.sendKeys("Głosowanie" + nxt);
        nazwaGlosowaniaInput.sendKeys(Keys.PAGE_DOWN);
    }

    public void dataZakonczeniaGlosowania (String dataZakonczenaGlosowania) {
        dataZakonczeniaGlosowaniaButton.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        dataZakonczeniaGlosowaniaButton.sendKeys(dataZakonczenaGlosowania);
        dataZakonczeniaGlosowaniaButton.sendKeys(Keys.ENTER);
    }

    public void regulamin () {
        regulaminLista.click();
        regulaminLista.sendKeys(Keys.ARROW_DOWN);
        regulaminLista.sendKeys(Keys.ENTER);
    }
    public void pokazNaStronie () {
        pokazNaStronieCheckbox.click();
    }

    public void utworzGlosowanie (){
        utworzGlosowanieButton.click();
    }

    public void statusGlosowania (){
        WebElement Roboczy = this.driver.findElement(By.xpath("Roboczy"));
        Roboczy.click();
        //statusGlosowaniaTabela.click();
    }

    public void przewijanieStrony (){
        przewijanieStronyButton.click();
        przewijanieStronyButton.sendKeys(Keys.PAGE_DOWN);
    }

    public void dodajNowyObszar () throws InterruptedException {
        Thread.sleep(1000);
        dodajNowyObszarButton.click();
        obszarButton.click();
        edycjaObszaru.click();
    }

    public void obszar () {
        obszarLista.sendKeys("Dębiec");
        obszarLista.sendKeys(Keys.ENTER);
        obszarLista.sendKeys(Keys.ESCAPE);
    }

    public void punktyNaObszar () {
        punktyNaObszarInput.sendKeys("100");
    }

    public void punktyNaKategorie () {
        punktyNaKategorieInput.sendKeys("100");
    }

    public void punktyNaProjekt () {
        punktyNaProjektInput.sendKeys("100");
    }

    public void kategoria () {
        kategoriaLista.click();
    }

    public void projekt () throws InterruptedException{
        projektCheckbox.click();
        Thread.sleep(2000);
    }

    public void zapisz () {
        zapiszButton.click();
    }

    public void publikuj () throws InterruptedException {
        Thread.sleep(1000);
        przewijanieStronyButton.click();
        przewijanieStronyButton.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP);
        Thread.sleep(1000);
        publikujButton.click();
    }

    public void potwierdzenie () {
        potwierdzenieButton.click();
    }
    }
