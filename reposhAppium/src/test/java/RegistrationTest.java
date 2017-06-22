import org.testng.annotations.Test;
import screen.RegistrationScreen;
import utility.DataUtilities;

/**
 * Created by orlov.n on 07.06.2017.
 */
public class RegistrationTest extends DataUtilities {

    @Test
    public void RegistrationTest() throws Exception {
        new RegistrationScreen(driver).Screen();
    }
}
