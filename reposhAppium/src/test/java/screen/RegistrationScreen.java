package screen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utility.AppiumDriverBuilder;

import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by orlov.n on 07.06.2017.
 */
public class RegistrationScreen extends AppiumDriverBuilder {

    //    Side menu: (Xpath can be used - By.xpath("//android.widget.TextView[@text='Text']");
    //    Side menu: (UIAutomator can be used - By promos_menu = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
    //            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_name\").text(\"Акции\")");


//    RegistrationScreen inputs and buttons:

    By singup_button = By.id("signup_button");
    By singin_button = By.id("signin_button");
    By login_input = By.id("et_login");
    By pass_input = By.id("et_password");
    By show_pass_btn = By.id("bt_show_password");
    By email_input = By.id("et_email");
    By first_name_input = By.id("et_first_name");
    By last_name_input = By.id("et_last_name");
    By photo_pick = By.id("pick_photo");
    By female_pick = By.id("radio_female");
    By male_pick = By.id("radio_male");
    By invite_code_input = By.id("et_invite");
    By done_btn = By.id("action_done");
    By conditions_btn = By.id("tv_conditions");
    By safety_rules_btn = By.id("tv_safety_rules");

//    RegistrationScreen test:

    public RegistrationScreen(AndroidDriver driver) { super(driver); }

    public RegistrationScreen Screen() {
        try {
            driver.resetApp();
            driver.findElement(singup_button).click();
            driver.findElement(login_input).click();
            driver.findElement(login_input).sendKeys("tst3");
            driver.findElement(pass_input).click();
            driver.findElement(pass_input).sendKeys("qwe123123");
            driver.findElement(email_input).click();
            driver.findElement(email_input).sendKeys("tst3#tst.com");
            driver.findElement(first_name_input).click();
            driver.findElement(first_name_input).sendKeys("Tst");
            driver.findElement(last_name_input).click();
            driver.findElement(last_name_input).sendKeys("Tst");
            driver.findElement(photo_pick).click();
//            how to pick photo with default photo picker???...
            driver.findElement(female_pick).click();
            driver.findElement(male_pick).click();
            driver.findElement(invite_code_input).click();
            driver.findElement(invite_code_input).sendKeys("TESTCODE");
            driver.findElement(invite_code_input).clear();
            driver.findElement(done_btn).click();

        } catch (Exception e) {
            System.err.println("LOGS:");
            LOGGER.log(Level.INFO, e.getMessage(), e);
        }
        return new RegistrationScreen(driver);
    }
}
