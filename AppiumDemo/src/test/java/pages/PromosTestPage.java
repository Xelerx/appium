package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by orlov.n on 01.06.2017.
 */
public class PromosTestPage extends TestData {

    public PromosTestPage(AndroidDriver driver) { super(driver); }

    public PromosTestPage Promos() {
        try {
            driver.findElement(today_promos_button).click();
            driver.findElement(promo_list_random).click();
            driver.findElement(promo_item_random).click();
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            driver.findElement(yesterday_promos_button).click();
            driver.findElement(promo_list_random).click();
            driver.findElement(promo_item_random).click();
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            driver.findElement(before_promos_button).click();
            driver.findElement(promo_list_random).click();
            driver.findElement(promo_item_random).click();
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(4000);
        } catch (Exception e) {
            System.err.println("LOGS:");
            LOGGER.log(Level.INFO,e.getMessage(),e);
        }
        return new PromosTestPage(driver);
    }
}
