package pages;

import io.appium.java_client.android.AndroidDriver;

import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by orlov.n on 31.05.2017.
 */
public class RegisterTestPage extends TestData {

    public RegisterTestPage(AndroidDriver driver) { super(driver); }

    public RegisterTestPage Register() {
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
            driver.findElement(userId).sendKeys("simbayx0@gmail.com");
            Thread.sleep(2000);
            driver.findElement(next_button).click();
            driver.findElement(password).sendKeys("newpassword");
            Thread.sleep(2000);
            driver.findElement(next_button).click();
            driver.findElement(positive_button).click();
            Thread.sleep(2000);
            swipingDownToUp();
            swipingDownToUp();
            Thread.sleep(2000);
            driver.findElement(name_button).sendKeys("Simbayx");
            driver.findElement(terms_check).click();
            driver.findElement(next_button).click();
            driver.findElement(positive_button).click();
            Thread.sleep(5000);
        }
        catch (Exception e) {
            System.err.println("LOGS:");
            LOGGER.log(Level.INFO,e.getMessage(),e);
        }
        return new RegisterTestPage(driver);
    }
}
