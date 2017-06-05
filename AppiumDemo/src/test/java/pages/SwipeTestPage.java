package pages;

import io.appium.java_client.android.AndroidDriver;

import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by orlov.n on 30.05.2017.
 */
public class SwipeTestPage extends TestData {

    public SwipeTestPage(AndroidDriver driver) { super(driver); }

    public SwipeTestPage Swiping() {
        try {
            driver.resetApp();
            swipingRightToLeft();
            swipingRightToLeft();
            swipingRightToLeft();
            Thread.sleep(2000);
            driver.findElement(checkPromos_button).click();
            Thread.sleep(5000);
            waitForVisibilityOf(userId);
            Thread.sleep(2000);
            driver.findElement(userId).click();
            swipingUpToDown();
            Thread.sleep(4000);
            swipingDownToUp();
            Thread.sleep(4000);
        }
        catch (Exception e) {
            System.err.println("LOGS:");
            LOGGER.log(Level.INFO,e.getMessage(),e);
        }
        return new SwipeTestPage(driver);

    }

}
