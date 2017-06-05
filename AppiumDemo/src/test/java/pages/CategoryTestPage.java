package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import sun.rmi.runtime.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by orlov.n on 01.06.2017.
 */
public class CategoryTestPage extends TestData {

    public CategoryTestPage(AndroidDriver driver) { super(driver); }

    public CategoryTestPage Category() {
        try {
            driver.findElement(open_menu).click();
            driver.findElement(cat_menu).click();
            Thread.sleep(4000);
            driver.findElement(child_list).click();
            driver.findElement(promo_item_random).click();
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            driver.findElement(girls_list).click();
            driver.findElement(promo_item_random).click();
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            driver.findElement(boys_list).click();
            driver.findElement(promo_item_random).click();
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            driver.findElement(womens_list).click();
            driver.findElement(promo_item_random).click();
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            driver.findElement(for_home_list).click();
            driver.findElement(promo_item_random).click();
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            driver.findElement(all_promos_list).click();
            driver.findElement(promo_list_random).click();
            driver.findElement(promo_item_random).click();
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(4000);
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(2000);
            driver.findElement(open_menu).click();
            driver.findElement(cat_menu).click();
            driver.findElement(all_brands_list).click();
            Thread.sleep(4000);
            driver.findElement(open_menu).click();
            driver.findElement(cat_menu).click();
            Thread.sleep(4000);
        }
        catch (Exception e) {
            System.err.println("LOGS:");
            LOGGER.log(Level.INFO,e.getMessage(),e);
        }
        return new CategoryTestPage(driver);
    }
}
