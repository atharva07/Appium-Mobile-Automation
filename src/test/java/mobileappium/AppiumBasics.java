package mobileappium;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class AppiumBasics extends BaseTest {

    @Test
    public void appiumTest() throws MalformedURLException {
        // Appium supports Xpath, ID, accessibilityID, classname, androidUIAutomator
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Preference']")).click();
        tearDown();
    }
}