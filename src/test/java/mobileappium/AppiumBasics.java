package mobileappium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics {

    @Test
    public void appiumTest() throws MalformedURLException {

        // we need the code to start the server, then it will perform all the operations and stop the server.
        File appiumJS = new File("C:Users//ATHAR//AppData//Roaming//npm//node_modules//appium//build//lib//main.js");

        // Configure and start the Appium service
        AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(appiumJS)
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();

        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("MobileAutomationMachine");
        options.setApp("D://Appium//resources//ApiDemos-debug.apk");
        // Initialize the Appium driver
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        // Actual Automation
        // Appium supports Xpath, ID, accessibilityID, classname, androidUIAutomator
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Preference']")).click();


        driver.quit();
        service.stop();

    }
}