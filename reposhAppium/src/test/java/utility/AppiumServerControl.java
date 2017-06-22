package utility;

import java.io.IOException;

/**
 * Created by orlov.n on 08.06.2017.
 */
public class AppiumServerControl {

    //  Need to change path for Mac and Linux systems:
    public void startServer() {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("cmd.exe /c start cmd.exe /k \"appium --nodeconfig " +
                    "C:\\Users\\orlov.n\\Downloads\\node_honor8.json -p 4733 -bp 4734 -U P6LDU16B12000559 " +
                    "--session-override\""); // for linux: bin/env for max: bin/sh
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopServer() {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("taskkill /F /IM node.exe"); //killall node (for max and linux)
            runtime.exec("taskkill /F /IM cmd.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//    public static void main(String[] args) throws InterruptedException {
//        AppiumServerControl appiumServer = new AppiumServerControl();
//        appiumServer.startServer();
//        Thread.sleep(180000);
//  Insert any code after server start here, then you can stopserver with
//        appiumServer.stopServer();
//    }



