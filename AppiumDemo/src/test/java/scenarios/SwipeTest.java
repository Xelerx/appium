package scenarios;

import org.testng.annotations.*;
import pages.SwipeTestPage;

/**
 * Created by orlov.n on 26.05.2017.
 */

public class SwipeTest extends AppiumSetup {

    @Test
    public void SwipeTestPage() throws Exception {
        new SwipeTestPage(driver).Swiping();
    }

}