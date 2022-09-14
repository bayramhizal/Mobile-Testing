package Appium01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackCalculator {
    @Test
    public void calculator() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        //enter your valid username and password mr.bayram

        // Set URL of the application under test
        caps.setCapability("app", "bs://f6bc96b69071f87a28df35fad3131e8c7d4fa2e2");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "Calculator_Project");
        caps.setCapability("build", "browserstack-new");
        caps.setCapability("name", "calculator");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        // Write your test case statements here
        driver.findElementById("com.google.android.calculator:id/digit_4").click();
        driver.findElementById( "com.google.android.calculator:id/op_mul" ).click();
        driver.findElementById( "com.google.android.calculator:id/digit_3" ).click();
        driver.findElementById( "com.google.android.calculator:id/eq" ).click();
        Assert.assertEquals( "12",driver.findElementById( "com.google.android.calculator:id/result" ) );
        driver.quit();

    }
    }

