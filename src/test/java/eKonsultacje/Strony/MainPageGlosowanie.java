package eKonsultacje.Strony;

import eKonsultacje.Strony.Helpers.SeleniumHelper;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MainPageGlosowanie extends Bazowa{

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/button[1]")
    WebElement noweGlosowanietButton;

    @FindBy(xpath = "//select[@id='budgetId']")
    WebElement budzetNameInput;

    public SeleniumHelper helper;

    public MainPageGlosowanie (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.helper= new SeleniumHelper(driver);
    }

    public void noweGlosowanie () {
        noweGlosowanietButton.click();
    }

    public void budzetName () {
        budzetNameInput.click();
    }
    public void pobieranieNazwyBudzetu () {
        Select nazwaBudzetu = new Select(driver.findElement(By.xpath("//select[@id='budgetId']")));
        nazwaBudzetu.selectByIndex(0);
    }
   }
