package scenarios;

import org.testng.annotations.Test;
import pages.CategoryTestPage;

/**
 * Created by orlov.n on 01.06.2017.
 */
public class CategoryTest extends AppiumSetup {

    @Test
    public void CategoryTestPage() throws Exception {
        new CategoryTestPage(driver).Category();
    }
}
