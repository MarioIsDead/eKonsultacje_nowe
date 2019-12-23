package eKonsultacje.Strony;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Toolkit;


public class Roboty extends Bazowa {

    @FindBy (xpath = "//div[@class='form-group']//div[@class='row']//div[@class='col-md-3']//div[@class='dropzone-wrapper dropzone-wrapper-sm']//div//button[@class='btn btn-primary'][contains(text(),'Wybierz plik')]")
    WebElement aktPrawnyButton;

    @FindBy (xpath = "//body/div[@id='root']/div/div[@class='app-container app-theme-white fixed-header fixed-sidebar fixed-footer']/div[@class='app-main']/div[@class='app-main__outer']/div[@class='app-main__inner']/form/div[@class='mb-3 card']/div[@class='card-body']/div[@class='row']/div[@class='col-md-3']/div[@class='dropzone-wrapper dropzone-wrapper-sm']/div/div[@class='dropzone-content']/div[@class='dropzone-content__button mb-3']/button[1]")
    WebElement adZalacznik;

    public Roboty (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void aktPrawny (String path) throws AWTException {
        aktPrawnyButton.click();

        Robot robot = new Robot ();
        robot.delay(2000);

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(path);
        clipboard.setContents(stringSelection,stringSelection);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
}
    public void zalacznik (String path) throws AWTException {
        adZalacznik.click();

        Robot robot = new Robot();
        robot.delay(2000);

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(path);
        clipboard.setContents(stringSelection, stringSelection);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        }
}


