package eKonsultacje.Strony;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageSlowniki extends Bazowa {


    @FindBy(xpath = "//button[@class='mb-2 mr-2 btn-icon btn btn-success']")
    WebElement noweLataBudzetowe;

    @FindBy(xpath = "//input[@id='year']")
    WebElement nowyRokBudzetowyInput;

    @FindBy (xpath = "//button[@class='btn-icon btn btn-primary']")
    WebElement utworzNowyRokButton;

    public MainPageSlowniki(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void tworzenieSlownika() {
       noweLataBudzetowe.click();
    }

    public void nowyRokBudzetowy (String rokBudzetowy) {
        nowyRokBudzetowyInput.sendKeys(Keys.CONTROL + "a");
        nowyRokBudzetowyInput.sendKeys(Keys.DELETE);
        nowyRokBudzetowyInput.sendKeys(rokBudzetowy);
    }
    public void utworzNowyRokBudzetowy (){
        utworzNowyRokButton.click();
    }
}
