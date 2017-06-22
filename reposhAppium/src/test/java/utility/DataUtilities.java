package utility;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by orlov.n on 07.06.2017.
 */
public class DataUtilities {

    public AndroidDriver driver;
    public Dimension size;

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
