import org.testng.annotations.Test;
import screen.TestScreen;
import utility.DataUtilities;

/**
 * Created by orlov.n on 14.06.2017.
 */
public class TestTest extends DataUtilities {

    @Test
    public void TestTest() throws Exception {
        new TestScreen(driver).Screen();
    }
}
