package eKonsultacje.Strony;
import eKonsultacje.Strony.Helpers.SeleniumHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;
import java.util.Random;
public class MainPageNewKonsultacja extends Bazowa {


    @FindBy(xpath = "//input[@id='title']")
    WebElement nazwaProjektu;

    @FindBy(xpath = "//input[@value='0']")
    WebElement radioOtwarty;

    @FindBy(xpath = "//input[@value='1']")
    WebElement radioZamkniety;

    @FindBy(xpath = "//label[contains(text(),'Tylko dla mieszka')]")
    WebElement radioTylkoDlaM;

    @FindBy(xpath = "//input[@placeholder='Wybierz..']")
    WebElement grupySpoleczeButton;

    @FindBy(xpath = "//li[@id='rbt-menu-item-0']//span[contains(text(),'Grupa spo')]")
    WebElement grupaSpoleczna1;

    @FindBy(xpath = "//select[@id='officeId']")
    WebElement jednostkaInput;

    @FindBy(xpath = "//select[@id='thematicAreaId']")
    WebElement obszarTematycznybtn;

    @FindBy(id = "description")
    WebElement krotkiOpisButton;

    @FindBy(id = "dateFrom")
    WebElement dataRozpoczeciaProjektuBtn;

    @FindBy(id = "dateTo")
    WebElement datazakonczeniaProjektuBtn;

    @FindBy(xpath = "//button[@class='mb-2 mr-2 dropdown-toggle btn btn-primary']")
    WebElement dodajNowaForme;

    @FindBy(xpath = "//input[@id='act.filename']")
    WebElement actionName;

    @FindBy(xpath = "//button[@class='btn-icon-vertical btn-transition btn btn-outline-secondary']")
    WebElement dodajAnkiet;

    @FindBy(xpath = "//button[@class='btn-icon-vertical btn-transition btn btn-outline-primary']")
    WebElement dodajSonde;

    @FindBy(xpath = "//button[contains(text(),'Komentarz')]")
    WebElement dodajKomentarz;

    @FindBy(xpath = "//i[@class='lnr-pencil btn-icon-wrapper']")
    WebElement amkietaRoboczaEdycja;

    @FindBy(xpath = "//textarea[@id='shortDescription']")
    WebElement krotkiOpisAnkiety;

    @FindBy(id = "voteFrom")
    WebElement dataRozpoczeciaGlosowaniaBtn;

    @FindBy(id = "voteTo")
    WebElement dataZakonczeniaGlosowaniaBtn;

    @FindBy(id = "agreementHistoryId")
    WebElement dodajRegulamin;

    @FindBy(xpath = "//button[contains(text(),'Dodaj pytanie')]")
    WebElement dodajPytanieButton;

    @FindBy(xpath = "//button[contains(text(),'Proste (radio)')]")
    WebElement dodajProsteRadio;

    @FindBy(xpath = "//button[contains(text(),'Proste (otwarte)')]")
    WebElement dodajProsteOtwarte;

    @FindBy(xpath = "//button[contains(text(),'Proste (data)')]")
    WebElement dodajProsteData;

    @FindBy(xpath = "//button[contains(text(),'Wielokrotnego wyboru (checkbox)')]")
    WebElement dodajCheckbox;

    @FindBy(xpath = "//button[contains(text(),'Rankingowe')]")
    WebElement dodajRankingowe;

    @FindBy(xpath = "//button[contains(text(),'Macierzowe')]")
    WebElement dodajMacierzowe;

    @FindBy(xpath = "//input[@id='categories.0.questions.0.content']")
    WebElement dodajPytanie1;

    @FindBy(xpath = "//input[@id='categories.0.questions.1.content']")
    WebElement dodajPytanie2;

    @FindBy(xpath = "//input[@id='categories.0.questions.2.content']")
    WebElement dodajPytanie3;

    @FindBy(xpath = "//input[@id='categories.0.questions.3.content']")
    WebElement dodajPytanie4;

    @FindBy(xpath = "//input[@id='categories.0.questions.4.content']")
    WebElement dodajPytanie5;

    @FindBy(xpath = "//input[@id='categories.0.questions.5.content']")
    WebElement dodajPytanie6;

    @FindBy (id = "toggler-0")
    WebElement pokazOdpowiedziButton;

    @FindBy (id = "toggler-3")
    WebElement pokazOdpowiedziButton2;

    @FindBy (id = "toggler-4")
    WebElement pokazOdpowiedziButton3;

    @FindBy (id = "toggler-5")
    WebElement pokazOdpowiedziButton4;

    @FindBy(xpath = "//button[@class='mr-2 btn-icon btn btn-success']")
    WebElement dodajOdpowiedz;

    @FindBy(id = "content")
    WebElement dodajOdpowiedz1;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
    WebElement dodajKolejnaOdp;

    @FindBy(xpath = "//div[5]//div[1]//div[2]//div[1]//div[1]//div[1]//button[1]")
    WebElement dodajOdpowiedz4;

    @FindBy(xpath = "//input[@id='content']")
    WebElement dodajOdpowiedzInput4;

    @FindBy(xpath = "//button[@class='btn-icon mr-2 btn btn-primary'][contains(text(),'Dodaj')]")
    WebElement kolejnaOdpowiedzButton4;

    @FindBy(xpath = "//div[6]//div[1]//div[2]//div[1]//div[1]//div[1]//button[1]")
    WebElement dodajOdpowiedz5;

    @FindBy(xpath = "//input[@id='content']")
    WebElement dodajOdpowiedzInput5;

    @FindBy(xpath = "//button[@class='btn-icon mr-2 btn btn-primary'][contains(text(),'Dodaj')]")
    WebElement kolejnaOdpowiedzButton5;

    @FindBy(xpath = "//div[7]//div[1]//div[2]//div[1]//div[1]//div[1]//button[1]")
    WebElement dodajOdpowiedz6;

    @FindBy(xpath = "//input[@id='content']")
    WebElement dodajOdpowiedzInput6;

    @FindBy(xpath = "//button[@class='btn-icon mr-2 btn btn-primary'][contains(text(),'Dodaj')]")
    WebElement kolejnaOdpowiedzButton6;

    @FindBy(xpath = "//div[@class='collapse show']//div[2]//button[1]")
    WebElement dodajOdpowiedz6_a;

    @FindBy(xpath = "//input[@id='content']")
    WebElement dodajOdpowiedzInput6_a;

    @FindBy (xpath = "//button[@class='btn-icon mr-2 btn btn-primary'][contains(text(),'Dodaj')]")
    WebElement kolejnaOdpowiedzButton6_a;

    @FindBy(xpath = "//td[contains(text(),'Robocza')]")
    WebElement ankietaStatusRoboczyLink;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/button[2]")
    WebElement ankietaPublikujBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/button[2]")
    WebElement sondaPublikujBtn;

    @FindBy(css = "div.container-fluid div.row main.col-md-9.ml-sm-auto.col-lg-10 div.sublist.sublist-vertical:nth-child(2) div.form-row:nth-child(2) div.col:nth-child(2) div.btn-toolbar div.btn-group:nth-child(1) > button.btn.btn-primary.btn-sm")
    WebElement zapiszAnkietaBtn;

    @FindBy(xpath = "//div[@class='sublist sublist-vertical']//div//input[@value='0']")
    WebElement reczny;

    @FindBy(xpath = "//input[@id='categories.0.questions.0.canComment']")
    WebElement czyMoznaKomentowacCheckBx;

    @FindBy (id = "moderatorId")
    WebElement dodajModeratora;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]")
    WebElement trybKomentowaniaButton;

    @FindBy (xpath = "//button[contains(text(),'Zapisz')]")
    WebElement zapiszKomentarzButton;

    @FindBy (xpath = "//button[@class='btn btn-success btn-sm']")
    WebElement publikujKomentarzButton;

    @FindBy(xpath = "//span[@class='ladda-label']")
    WebElement publikujKonsultacjeBtn;

    @FindBy(xpath = "//div[@class='modal-footer']//button[@class='btn-icon mr-2 btn btn-primary'][contains(text(),'Zapisz')]")
    WebElement zapiszButton;

    @FindBy(xpath = "//button[@class='btn-icon mr-2 btn btn-primary']")
    WebElement utworzButton;

    @FindBy(xpath = "//span[contains(text(),'Tak')]")
    WebElement potwierdzKonsultacjeBtn;

    public MainPageNewKonsultacja(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public SeleniumHelper helper;

    public void nowaKonsultacjaAnkieta() {
        Random ran = new Random();
        int nxt = ran.nextInt(999999);
        nazwaProjektu.sendKeys("Konsultacja-Ankieta: " + nxt);
    }

    public void nowaKonsultacjaKomentarz() {
        Random ran = new Random();
        int nxt = ran.nextInt(999999);
        nazwaProjektu.sendKeys("Konsultacja-Komentarz: " + nxt);
    }

    public void nowaKonsultacjaSonda() {
        Random ran = new Random();
        int nxt = ran.nextInt(999999);
        nazwaProjektu.sendKeys("Konsultacja-Sonda: " + nxt);
    }


    public void otwarty() {
        radioOtwarty.click();
    }

    public void zamkniety() {
        radioZamkniety.click();
    }

    public void tylkoDlaMieszkanca() {
        radioTylkoDlaM.click();
    }

    public void grupySpoleczne() {
        grupySpoleczeButton.click();
        grupySpoleczeButton.sendKeys(Keys.DOWN);
        grupySpoleczeButton.sendKeys(Keys.ENTER);
    }

    public void jednostka() {
        jednostkaInput.click();
        jednostkaInput.sendKeys(Keys.ARROW_DOWN);
        jednostkaInput.sendKeys((Keys.ENTER));
    }

    public void obszarTematyczny() {
        obszarTematycznybtn.click();
        obszarTematycznybtn.sendKeys(Keys.ARROW_DOWN);
        obszarTematycznybtn.sendKeys((Keys.ENTER));
    }

    public void krotkiOpis() {
        krotkiOpisButton.sendKeys("krotki opis");
    }

    public void dataRozpoczeciaProjektu (String dataRozpoczecia, String dataZakonczenia) throws InterruptedException {
        dataRozpoczeciaProjektuBtn.click();
        dataRozpoczeciaProjektuBtn.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE));
        dataRozpoczeciaProjektuBtn.sendKeys(dataRozpoczecia);
        datazakonczeniaProjektuBtn.click();
        datazakonczeniaProjektuBtn.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE));
        datazakonczeniaProjektuBtn.sendKeys(dataZakonczenia);
        }

    public void nowaForma() {
        dodajNowaForme.click();
    }
    public void uploadAktPrawny(String actName) {
        actionName.sendKeys("C:\\Users\\m.zygmanowski\\Desktop\\Akt prawne e-konsultacje\\");
        actionName.sendKeys (actName);
    }

    public void ankieta() {
        dodajAnkiet.click();
    }

    public void opisAnkiety() {
        krotkiOpisAnkiety.sendKeys("krotki opis ankiety");
        //krotkiOpisAnkiety.sendKeys(Keys.PAGE_DOWN);
    }

    public void sonda() {
        dodajSonde.click();
    }

    public void sondaRobocza() {
        amkietaRoboczaEdycja.click();
    }

    public void opisSondy() {
        krotkiOpisAnkiety.sendKeys("krotki opis sondy");
        krotkiOpisAnkiety.sendKeys(Keys.PAGE_DOWN);
    }

    public void komentarz() {
        dodajKomentarz.click();
    }

    public void ankietaRobocza() throws InterruptedException {
        amkietaRoboczaEdycja.click();
    }

    public void dataRozpoczeciaGlosowania(String dataRozpoczecia, String dataZakonczenia) throws InterruptedException{
        dataRozpoczeciaGlosowaniaBtn.click();
        dataRozpoczeciaGlosowaniaBtn.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        dataRozpoczeciaGlosowaniaBtn.sendKeys(dataRozpoczecia);
        dataZakonczeniaGlosowaniaBtn.click();
        dataZakonczeniaGlosowaniaBtn.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        dataZakonczeniaGlosowaniaBtn.sendKeys(dataZakonczenia);
    }

    public void regulamin (){
        dodajRegulamin.click();
        dodajRegulamin.sendKeys(Keys.DOWN);
        dodajRegulamin.sendKeys((Keys.ENTER));
        }
    public void publikacjaWynikow() {
        reczny.click();
        reczny.sendKeys(Keys.PAGE_DOWN);
    }
    public void pytanie() {
        dodajPytanieButton.click();
    }
    public void czyMoznaKomentowac() {
        czyMoznaKomentowacCheckBx.click();
    }
    public void prosteRadio() {
        dodajProsteRadio.click();
    }
    public void pytaniePierwsze (String pytanieNr1) {
        dodajPytanie1.sendKeys(pytanieNr1);
    }
    public void prosteOtwarte() {
        dodajProsteOtwarte.click();
    }
    public void odpowiedz() {
        //dodajOdpowiedz.sendKeys(Keys.DOWN);
        dodajOdpowiedz.click();
    }
    public void odpowiedz1Input(String odpowiedzNr1) {
        dodajOdpowiedz1.sendKeys(odpowiedzNr1);
    }

    public void kolejnaOdpowiedz() {
        dodajKolejnaOdp.click();
    }

    public void odpowiedz2Input2(String odpowiedzNr2) {
        dodajOdpowiedz1.sendKeys(odpowiedzNr2);
    }
    public void pytanieDrugie (String pytanieNr2){
        dodajPytanie2.sendKeys(pytanieNr2);
    }
    public void prosteData() {
        dodajProsteData.click();
    }
    public void pytanieTrzecie (String pytanieNr3) {
        dodajPytanie3.sendKeys(pytanieNr3);
    }
    public void dodajCheckbox() {
        dodajCheckbox.click();
    }
    public void pytanieCzwarte (String pytanieNr4) throws InterruptedException{
        dodajPytanie4.sendKeys(pytanieNr4);
    }
    public void odpowiedzButton4 (){
        dodajOdpowiedz4.click();
    }
    public void odpowiedzInput4 (String odpowiedzNr4)throws InterruptedException{
        dodajOdpowiedzInput4.sendKeys(odpowiedzNr4);
    }
    public void kolejnaOdpowiedz4 () {
        kolejnaOdpowiedzButton4.click();
    }
    public void dodaRankingowe() {
        dodajRankingowe.click();
    }
    public void pytaniePiate (String pytanieNr5)throws InterruptedException {
        dodajPytanie5.sendKeys(pytanieNr5);
        //dodajPytanie5.sendKeys(Keys.PAGE_UP);
    }
    public void odpowiedzButton5 (){
        dodajOdpowiedz5.click();
    }
    public void odpowiedzInput5 (String odpowiedzNr5){
        dodajOdpowiedzInput5.sendKeys(odpowiedzNr5);
    }
    public void kolejnaOdpowiedz5 (){
        kolejnaOdpowiedzButton5.click();
    }

    public void dodajMacierzowe() {
        dodajMacierzowe.click();
    }

    public void pokazOdpowiedzi () {
        pokazOdpowiedziButton.click();
    }

    public void pokazOdpowiedzi2 () {
        pokazOdpowiedziButton2.click();
    }
    public void pokazOdpowiedzi3 () {
        pokazOdpowiedziButton3.click();
    }
    public void pokazOdpowiedzi4 () {
        pokazOdpowiedziButton4.click();
    }

    public void pytanieSzoste (String pytanieNr6) throws InterruptedException {
        dodajPytanie6.sendKeys(pytanieNr6);
    }
    public void odpowiedzButton6 (){
        dodajOdpowiedz6.click();
    }
    public void odpowiedzInput6 (String odpowiedzNr6){
        dodajOdpowiedzInput6.sendKeys(odpowiedzNr6);
    }
    public void kolejnaOdpowiedz6 () {
        kolejnaOdpowiedzButton6.click();
    }
    public void odpowiedzButton6_a (){
        dodajOdpowiedz6_a.click();
    }
    public void odpowiedzInput6_a (String odpowiedzNr6_a) {
        dodajOdpowiedzInput6_a.sendKeys(odpowiedzNr6_a);
    }
    public void kolejnaOdpowiedz6_a () {
        kolejnaOdpowiedzButton6_a.click();
    }
        public void ankietaStatusRoboczy() {
            ankietaStatusRoboczyLink.click();
        }
        public void ankietaPublikuj () {
            //By publikacjaAnkiety = By.xpath("//button[@type='button'][text()='Publikuj']");
            //helper.waitForElementToBeDisplayed(publikacjaAnkiety);
            ankietaPublikujBtn.click();
        }
        public void sondaPublikuj () throws InterruptedException{
            sondaPublikujBtn.click();
    }
        public void zapiszAnkieta () throws InterruptedException {
            zapiszAnkietaBtn.click();
        }
        public void publikujKonsultacje () {
            publikujKonsultacjeBtn.click();
        }
        public void potwiertdzKonsultacje() {
            potwierdzKonsultacjeBtn.click();
        }

        public void moderator  (){
            dodajModeratora.click();
            dodajModeratora.sendKeys(Keys.PAGE_DOWN);
            dodajModeratora.sendKeys(Keys.ENTER);
        }
        public void trybKomentowania () {
            trybKomentowaniaButton.click();
        }
        public void zapiszKomentarz (){
            zapiszKomentarzButton.click();
        }

        public void publikujKomentarz () {
            By publikacjaKomentarz = By.xpath("//button[@class='btn btn-success btn-sm']");
            helper.waitForElementToBeDisplayed(publikacjaKomentarz);
            publikujKomentarzButton.click();
        }

        public void ByPixel() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-500)");
        }

        public void scrollUp () {
            dodajOdpowiedz.sendKeys((Keys.PAGE_UP));
        }
        public void scrollDown () {
            dodajOdpowiedz.sendKeys((Keys.PAGE_DOWN));
        }
        public void zapisz () {
            zapiszButton.click();
        }
        public void utworz () {
            utworzButton.click();
        }
    }

