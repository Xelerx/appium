package pages;

import io.appium.java_client.android.AndroidDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by orlov.n on 26.05.2017.
 */
public class LoginTestPage extends TestData {

    public LoginTestPage(AndroidDriver driver) {
        super(driver);
    }

    public LoginTestPage Login() {
        try {
            driver.resetApp();
            swipingRightToLeft();
            swipingRightToLeft();
            swipingRightToLeft();
            Thread.sleep(2000);
            driver.findElement(checkPromos_button).click();
            waitForVisibilityOf(userId);
            Thread.sleep(2000);
            driver.findElement(userId).click();
            driver.findElement(userId).sendKeys("test@gmail.com");
            Thread.sleep(2000);
            driver.findElement(next_button).click();
            driver.findElement(password).sendKeys("errpassword");
            Thread.sleep(2000);
            driver.findElement(next_button).click();
            waitForVisibilityOf(positive_button);
            Thread.sleep(2000);
            driver.findElement(positive_button).click();
            Thread.sleep(5000);
            driver.findElement(userId).clear();
            driver.findElement(userId).sendKeys("test@gmail.com");
            driver.findElement(next_button).click();
            //Password not cleared after re-enter login??? Such as a bug, need to fix it
            driver.findElement(password).clear();
            driver.findElement(password).sendKeys("okpassword");
            driver.findElement(next_button).click();
            Thread.sleep(5000);
        }
        catch (Exception e) {
            System.err.println("LOGS:");
            LOGGER.log(Level.INFO,e.getMessage(),e);
        }
        return new LoginTestPage(driver);
    }
}
