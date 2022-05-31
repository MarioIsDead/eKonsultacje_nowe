package eKonsultacje.Strony;
import org.testng.annotations.Test;

public class logowanie extends Bazowa {


    @Test
    public void logowanieUsera() {
        driver.get("https://test-ekonsultacje-old-bo.eboi.pl:7443");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        }
}
