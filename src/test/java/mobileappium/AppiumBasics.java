package mobileappium;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class AppiumBasics extends BaseTest {

    @Test
    public void appiumTest() throws MalformedURLException {
        // Appium supports Xpath, ID, accessibilityID, classname, androidUIAutomator
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Preference']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.CheckBox[@resource-id='android:id/checkbox']")).click();
        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='android:id/edit']")).sendKeys("Atharva123");
        driver.findElement(AppiumBy.id("android:id/button1")).click();

        tearDown();
    }
}