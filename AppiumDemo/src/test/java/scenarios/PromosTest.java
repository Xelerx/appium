package scenarios;

import org.testng.annotations.Test;
import pages.PromosTestPage;

/**
 * Created by orlov.n on 01.06.2017.
 */
public class PromosTest extends AppiumSetup {

    @Test
    public void PromosTestPage() throws Exception {
        new PromosTestPage(driver).Promos();
    }
}
