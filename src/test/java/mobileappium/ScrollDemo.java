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
        Object result = ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100,
                "top", 100,
                "width", 200,
                "height", 200,
                "direction", "down",
                "percent", 3.0
        ));

        boolean canScrollMore = result != null && (boolean) result;

        Thread.sleep(2000);
    }
}
