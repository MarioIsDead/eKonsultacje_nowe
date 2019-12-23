package eKonsultacje.Strony;
import eKonsultacje.Strony.Bazowa;
import eKonsultacje.Strony.stronaLogowania;
import org.testng.annotations.Test;

public class logowanie extends Bazowa {


    @Test
    public void logowanieUsera() {
        driver.get("http://ekonsultacje.eboi.pl:5004");
        stronaLogowania logowanie = new stronaLogowania(driver);
        logowanie.zalogowanie();
        }
}
