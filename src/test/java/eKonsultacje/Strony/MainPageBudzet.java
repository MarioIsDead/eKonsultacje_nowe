package eKonsultacje.Strony;

import eKonsultacje.Strony.Helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.Random;

public class MainPageBudzet extends Bazowa {


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement nowyBudzetButton;

    @FindBy(id = "title")
    WebElement nazwaBudzetuInput;

    @FindBy(id = "officeId")
    WebElement jednostkaList;

    @FindBy(xpath = "//select[@id='budgetYearId']")
    WebElement rokBudzetowyInput;

    @FindBy(xpath = "//textarea[@id='description']")
    WebElement opisInput;

    @FindBy(id = "status")
    WebElement statusList;

    @FindBy(xpath = "//button[@class='btn-icon mr-2 btn btn-primary']")
    WebElement zapiszButton;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    WebElement nazwaBudzetuTabela;

    @FindBy(xpath = "//a[contains(text(),'osowania')]")
    WebElement glosowaniaMenu;

    @FindBy (xpath = "//button[@class='mb-2 mr-2 btn-icon btn btn-success']")
    WebElement noweGlosowanietButton;

    @FindBy (xpath = "//select[@id='budgetId']")
    WebElement budzetLista;

    public SeleniumHelper helper;

    public MainPageBudzet(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.helper = new SeleniumHelper(driver);
    }

    public void roboczyBudzet() {
        nowyBudzetButton.click();
    }

    public void nazwaBudzetu() {
        Random ran = new Random();
        int nxt = ran.nextInt(999999);
        nazwaBudzetuInput.sendKeys("budzet" + nxt);
    }

    public void jednostka() {
        jednostkaList.click();
        jednostkaList.sendKeys(Keys.PAGE_DOWN);
        jednostkaList.sendKeys(Keys.ENTER);
    }

    public void rokBudzetowy() {
        rokBudzetowyInput.click();
        rokBudzetowyInput.sendKeys("2050");
        rokBudzetowyInput.sendKeys(Keys.ENTER);
    }

    public void opis(String opis1) {
        opisInput.click();
        opisInput.sendKeys(opis1);
    }

    public void status() {
        statusList.click();
        statusList.sendKeys(Keys.DOWN);
        statusList.sendKeys(Keys.ENTER);
    }

    public void zapisz() {
        zapiszButton.click();
    }

    public void glosowanieNazwaBudzetu() {
        String nazwaBudzetu = nazwaBudzetuTabela.getText();
        glosowaniaMenu.click();
        noweGlosowanietButton.click();
        new Select(budzetLista).selectByVisibleText(nazwaBudzetu);
    }

    public void sprawdzanieStatusuBudzet (){
        Assert.assertEquals(driver.findElement(By.xpath("//tbody//tr[1]//td[5]")).getText(), "Roboczy");
    }
    }

