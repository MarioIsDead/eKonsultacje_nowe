package eKonsultacje.Strony;
import eKonsultacje.Strony.Helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Bazowa {

    @FindBy(linkText = "Konsultacje")
    WebElement konsultacjeButton;

    @FindBy(xpath = "//a[contains(text(),'Ankiety')]")
    WebElement ankietaButton;

    @FindBy(xpath = "//a[contains(text(),'Sondy')]")
    WebElement sondyButton;

    @FindBy (xpath = "//tbody//tr[1]//td[7]")
    WebElement statusSondyButton;

    @FindBy(xpath = "//a[contains(text(),'et obywatelski')]")
    WebElement budzetObywatelskiButton;

    @FindBy(xpath = "//a[@href='/budzety'][text()='Budżet']")
    WebElement budzetButton;

    @FindBy(xpath = "//th[4]//div[1]//input[1]")
    WebElement lataBudzetoweTabelaInput;

    @FindBy (xpath = "//button[@class='mb-2 mr-2 btn-icon btn btn-info']")
    WebElement odswiezButton;

    @FindBy(xpath = "//button[@class='mb-2 mr-2 btn-icon btn btn-success']")
    WebElement konsultacjeButtonNew;

    @FindBy(xpath = "//tbody//tr[1]//td[5]")
    WebElement statusBudzetu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement slownikiMenu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[5]/a[1]")
    WebElement latabudzetoweMenu;

    @FindBy(xpath = "//a[contains(text(),'osowania')]")
    WebElement glosowaniaMenu;

    public SeleniumHelper helper;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.helper= new SeleniumHelper(driver);
    }

    public void konsultacjeLink() {
        konsultacjeButton.click();
    }

    public void konsultacjaLinkNew() {
        konsultacjeButtonNew.click();
    }

    public void ankietyLink() {
        ankietaButton.click();
    }

    public void sondy() {
        sondyButton.click();
    }
    public void statusSondy (){
        By latabudzetowe = By.xpath("//tbody//tr[1]//td[7]");
        helper.waitForElementToBeDisplayed(latabudzetowe);
        statusSondyButton.click();
    }

    public void budzetObywatelski () {
        budzetObywatelskiButton.click();
        By latabudzetowe = By.xpath("//a[@href='/budzety'][text()='Budżet']");
        helper.waitForElementToBeDisplayed(latabudzetowe);
        budzetButton.click();
    }

    public void budzet () {
    By latabudzetowe = By.xpath("//a[@href='/budzety'][text()='Budżet']");
      helper.waitForElementToBeDisplayed(latabudzetowe);
      budzetButton.click();
    }

    public void rokBudzetowyTabela (String dataLataBudzetowe) {
        lataBudzetoweTabelaInput.click();
        lataBudzetoweTabelaInput.sendKeys(dataLataBudzetowe);
    }

    public void odswiez () {
        odswiezButton.click();
    }

    public void statusBudzetu() {
        By latabudzetowe = By.xpath("//tbody//tr[1]//td[5]");
        helper.waitForElementToBeDisplayed(latabudzetowe);
        statusBudzetu.click();
    }

    public void slowniki() {
        slownikiMenu.click();
    }

    public void latabudzetowe() {
        By latabudzetowe = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[5]/a[1]");
        helper.waitForElementToBeDisplayed(latabudzetowe);
        latabudzetoweMenu.click();
        }

    public void glosowanie () {
        glosowaniaMenu.click();
    }
    }
