package screen;

import io.appium.java_client.android.AndroidDriver;
import utility.AppiumDriverBuilder;

import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by orlov.n on 14.06.2017.
 */
public class TestScreen extends AppiumDriverBuilder {

    public TestScreen(AndroidDriver driver) {
        super(driver);
    }

    public TestScreen Screen() {
        try {
            appiumServer.startServer();
            Thread.sleep(60000);
            System.out.println("TEST FOR TEST");
            Thread.sleep(60000);
            appiumServer.stopServer();
        } catch (Exception e) {
            System.err.println("LOGS:");
            LOGGER.log(Level.INFO, e.getMessage(), e);
        }

        return new TestScreen(driver);
    }
}
