package scenarios;

import org.testng.annotations.Test;
import pages.RegisterTestPage;

/**
 * Created by orlov.n on 31.05.2017.
 */

public class RegisterTest extends AppiumSetup {

    @Test
    public void RegisterTestPage() throws Exception {
        new RegisterTestPage(driver).Register();
    }
}
