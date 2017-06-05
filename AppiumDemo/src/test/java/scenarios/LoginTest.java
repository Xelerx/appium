package scenarios;

import org.testng.annotations.Test;
import pages.LoginTestPage;

/**
 * Created by orlov.n on 31.05.2017.
 */

public class LoginTest extends AppiumSetup {

    @Test
    public void LoginTestPage() throws Exception {
        new LoginTestPage(driver).Login();
    }
}
