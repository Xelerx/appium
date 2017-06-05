package pages;

import io.appium.java_client.android.AndroidDriver;

import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by orlov.n on 01.06.2017.
 */
public class MenuTestPage extends TestData {

    public MenuTestPage(AndroidDriver driver) { super(driver); }

    public MenuTestPage Menu() {
        try {
            driver.findElement(open_menu).click();
            driver.findElement(promos_menu).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(cat_menu).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(orders_menu).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(balance_menu).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(brands_menu).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(fav_menu).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(invite_menu).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(pinfo_menu).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(mamsyplus_menu).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(settings_menu).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(close_menu_scroll).click();
            Thread.sleep(4000);
        }
        catch (Exception e) {
            System.err.println("LOGS:");
            LOGGER.log(Level.INFO,e.getMessage(),e);
        }
        return new MenuTestPage(driver);
    }

}
