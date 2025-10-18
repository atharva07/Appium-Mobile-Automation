package mobileappium;

import com.beust.ah.A;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

// For finding app package and app activity of android device use below command
// adb shell dumpsys window | find "mCurrentFocus" - windows
// mCurrentFocus=Window{ddfef0d u0 io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies}
// From above output after hitting the command
// Anything before / is package name
// Anything after / is activity name

public class MisceallanousAppiumActions extends BaseTest {

    @Test
    public void Miscellanous() throws MalformedURLException {
        // This will the rotate the device by 90 degrees
        // DeviceRotation landScape = new DeviceRotation(0, 0, 90);
        // driver.rotate(landScape);
        Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
        ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of("intent","io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));
        //  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Preference']")).click();
        //  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.CheckBox[@resource-id='android:id/checkbox']")).click();
        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");

        // copy to clipboard and paste it
        driver.setClipboardText("Atharva123");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='android:id/edit']")).sendKeys(driver.getClipboardText());
        driver.findElement(AppiumBy.id("android:id/button1")).click();

        // pressing navigation buttons of Mobile
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }
}
