package scenarios;

import org.testng.annotations.Test;
import pages.MenuTestPage;

/**
 * Created by orlov.n on 01.06.2017.
 */

public class MenuTest extends AppiumSetup {

    @Test
    public void MenuTestPage() throws Exception {
        new MenuTestPage(driver).Menu();
    }
}
