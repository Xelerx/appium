package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by orlov.n on 26.05.2017.
 */
public class TestData  {

    AndroidDriver driver;
    Dimension size;

//    Buttons:
    By userId = By.id("email_et");
    By password = By.id("password_et");
    By next_button = By.id("btn_forward");
    By skip_button = By.id("skip_btn");
    By positive_button = By.id("positive_btn");
    By checkPromos_button = By.id("next_btn");
    By name_button = By.id("name_et");
    By terms_check = By.id("terms_cb");
    By today_promos_button = By.id("todayBtn");
    By yesterday_promos_button = By.id("yesterdayBtn");
    By before_promos_button = By.id("dayBeforeYesterdayBtn");

//    Side menu: (Xpath can be used too - By.xpath("//android.widget.TextView[@text='Text']");)
    By open_menu = new MobileBy.ByAccessibilityId("Open");
    By close_menu = By.id("drawer_header_close_btn");
    By promos_menu = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_name\").text(\"Акции\")");
    By cat_menu = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_name\").text(\"Категории\")");
    By orders_menu = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_name\").text(\"Мои заказы\")");
    By balance_menu = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_name\").text(\"Мой Баланс\")");
    By brands_menu = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_name\").text(\"Бренды\")");
    By fav_menu = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_name\").text(\"Избранное\")");
    By invite_menu = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_name\").text(\"Пригласить\")");
    By pinfo_menu = new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_recycler_view\"))" +
            ".scrollIntoView(new UiSelector().text(\"Личные данные\"))");
    By mamsyplus_menu = new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_recycler_view\"))" +
            ".scrollIntoView(new UiSelector().text(\"Mamsy plus\"))");
    By settings_menu = new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_recycler_view\"))" +
            ".scrollIntoView(new UiSelector().text(\"Настройка приложения\"))");
    By close_menu_scroll = new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/material_drawer_recycler_view\"))" +
            ".scrollIntoView(new UiSelector().resourceId(\"ru.mamsy.mamsyshop.dev:id/drawer_header_close_btn\"))");

//    Promos menu:
    By promo_list_random = new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
        ".resourceId(\"ru.mamsy.mamsyshop.dev:id/promoRecyclerView\"))" +
        ".scrollIntoView(new UiSelector().resourceId(\"ru.mamsy.mamsyshop.dev:id/promo_item_list_image\"))");
    By promo_item_random = By.id("image_item_table");

//    Category menu:
    By child_list = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
        ".resourceId(\"ru.mamsy.mamsyshop.dev:id/message_tv\").text(\"Малышам\")");
    By girls_list = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/message_tv\").text(\"Девочкам\")");
    By boys_list = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/message_tv\").text(\"Мальчикам\")");
    By womens_list = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/message_tv\").text(\"Женщинам\")");
    By for_home_list = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/message_tv\").text(\"Для дома\")");
    By all_promos_list = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/message_tv\").text(\"Все акции\")");
    By all_brands_list = new MobileBy.ByAndroidUIAutomator("new UiSelector()" +
            ".resourceId(\"ru.mamsy.mamsyshop.dev:id/message_tv\").text(\"Бренды\")");

    public TestData(AndroidDriver driver) {
        this.driver = driver;
    }

    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void waitForClickabilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void swipingRightToLeft() throws InterruptedException {
        size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.8);
        int endx = (int) (size.width * 0.1);
        int starty = size.height / 2;
        int endy = size.height / 2;
        driver.swipe(startx, starty, endx, endy, 1000);
        Thread.sleep(2000);
    }

    public void swipingLeftToRight() throws InterruptedException {
        size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.1);
        int endx = (int) (size.width * 0.8);
        int starty = size.height / 2;
        int endy = size.height / 2;
        driver.swipe(startx, starty, endx, endy, 1000);
        Thread.sleep(2000);
    }

    public void swipingDownToUp() throws InterruptedException {
        size = driver.manage().window().getSize();
        int startx = size.width / 2;
        int starty = (int) (size.height * 0.45);
        int endy = (int) (size.height * 0.25);
        int endx = size.width / 2;
        driver.swipe(startx, starty, endx, endy, 1000);
        Thread.sleep(2000);
    }

    public void swipingUpToDown() throws InterruptedException {
        size = driver.manage().window().getSize();
        int startx = size.width / 2;
        int starty = (int) (size.height * 0.25);
        int endy = (int) (size.height * 0.45);
        int endx = size.width / 2;
        driver.swipe(startx, starty, endx, endy, 1000);
        Thread.sleep(2000);
    }

}
//  System.out.println("Display size: width is " + size.width + " and height is " + size.height);