package eKonsultacje.Strony;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class Bazowa {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {

        String driverPath = "C:\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        Dimension dimension = new Dimension(1900, 1000);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //WebDriverWait wait = new WebDriverWait(driver, (10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterTest
    public void zamykanie (){
       //driver.quit();
    }
}
