//package scenarios;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.*;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
///**
// * Created by orlov.n on 31.05.2017.
// */
//public class ParallelRun {
//
//    protected AndroidDriver driver;
//    protected String applicationName;
//
//    @Factory(dataProvider = "parallelDp")
//    public ParallelRun(String applicationName) {
//        this.applicationName = applicationName;
//    }
//
//    public ParallelRun() {
//    }
//
//    @DataProvider(name = "parallelDp")
//    public static Object[][] parallelDp() {
//        return new Object[][] {
//                {"Honor8"},
//                {"Yotaphone2"}
//        };
//    }
//
//    @BeforeClass
//    public void setup() throws MalformedURLException {
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ANDROID");
//        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
//        cap.setCapability("applicationName", this.applicationName);
//        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\orlov.n\\Downloads\\Mamsy_0.9.965_debug.apk");
//        cap.setCapability("appPackage", "ru.mamsy.mamsyshop.dev");
//        cap.setCapability("appActivity", "ru.mamsy.mamsyshop.SplashScreen");
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4444/wd/hub"), cap);
//    }
//
//    @AfterClass
//    public void teardown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
