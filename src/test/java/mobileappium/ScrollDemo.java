package mobileappium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ScrollDemo extends BaseTest {

    @Test
    public void ScrollDemoTest() throws InterruptedException, MalformedURLException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        // Where to scroll is known prior
        // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));

        // No Idea If the item exists or not
        scrollToEnd();

        Thread.sleep(2000);
    }
}
