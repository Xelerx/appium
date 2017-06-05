package scenarios;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by orlov.n on 26.05.2017.
 */
public class AppiumSetup {

    AndroidDriver driver;

    @Parameters({"UDID_", "PORT_", "APPRESET_"})
    @BeforeClass
    public void prepareForTest(String UDID_, String PORT_, String APPRESET_) throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ANDROID");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        cap.setCapability("udid", UDID_);
        cap.setCapability("app", "C:\\Users\\orlov.n\\Downloads\\Mamsy_0.9.965_debug.apk");
        cap.setCapability("appPackage", "ru.mamsy.mamsyshop.dev");
        cap.setCapability("appActivity", "ru.mamsy.mamsyshop.SplashScreen");
        cap.setCapability("noReset", APPRESET_);
        driver = new AndroidDriver(new URL("http://127.0.0.1:" + PORT_ + "/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

}

//Maybe appium node start from code
//    protected void serverStartOne() {
//        ServerArguments serverArguments = new ServerArguments();
//        serverArguments.setArgument("--address", "127.0.0.1");
//        serverArguments.setArgument("--bootstrap-port", "4734");
//        serverArguments.setArgument("--port", "4733");
//    }

