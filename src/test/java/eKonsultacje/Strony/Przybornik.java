package eKonsultacje.Strony;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
public class Przybornik {

    private WebDriver driver;

    public Przybornik (WebDriver newDriver) {
    this.driver = newDriver;

    }
    public void takeScreenShots(){
    try {
        TakesScreenshot screenshoter = (TakesScreenshot) driver;
        File screenshot = screenshoter.getScreenshotAs(OutputType.FILE);
        Files.copy(screenshot.toPath(), Paths.get("C:\\Selenium\\test"+ LocalTime.now().getNano()+".png"));
    }catch (IOException e){
        System.out.println("Nie znaleziono pliku");
    }
    }
}
