package eKonsultacje.Strony;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class stronaLogowania {

    @FindBy(id = "login")
    private WebElement login;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//span[@class='ladda-label']")
    private WebElement zaloguj;

    public stronaLogowania(WebDriver driver){
    PageFactory.initElements(driver,this);
    }

    public void zalogowanie() {
        login.click();
        login.sendKeys("administrator@sputnik.pl");
        password.click();
        password.sendKeys("*************");
        zaloguj.click();
    }
}