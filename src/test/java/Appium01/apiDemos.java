package Appium01;

import Appium.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class apiDemos extends BaseClass {
    @Test
    public void test01() throws MalformedURLException {
       /*
       api demos intall edildi
       ana sayfadayiz
       apidemos tikla
       preference tikla
       preference dependencies tikla
       wifi check box cehck yap
       wifi settings tikla
       text gonder
       ok tikla
        */
     //   DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
      //  desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_NAME, "Android" );
      //  desiredCapabilities.setCapability( MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2" );
      //  desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_VERSION, "10.0" );
      //  desiredCapabilities.setCapability( MobileCapabilityType.DEVICE_NAME, "emulator-5554" );
     //   desiredCapabilities.setCapability( MobileCapabilityType.APP, "/Users/bayram/IdeaProjects/ApiumKurulum/src/test/Apps/apiDemos.apk" );
      //  desiredCapabilities.setCapability( "appPackage", "com.touchboarder.android.api.demos" );
      //  desiredCapabilities.setCapability( "appActivity", "com.touchboarder.androidapidemos.MainActivity" );
     //   desiredCapabilities.setCapability( "noReset", true );
       // AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities );
        //apidemos tikla
        AndroidDriver driver=getAndroidDriver();
        driver.findElementByXPath( "//android.widget.TextView[@text='API Demos']" ).click();
        //preference tikla
        driver.findElementByXPath( "//android.widget.TextView[@text='Preference']" ).click();
        //   preference dependencies tikla
        driver.findElementByXPath( "//android.widget.TextView[@text='3. Preference dependencies']" ).click();
        //    wifi check box cehck yap
        driver.findElementById( "android:id/checkbox" ).click();
        //wifi settings tikla
       driver.findElementByXPath( "//android.widget.TextView[@text='WiFi settings']" ).click();
       //text gonder
       WebElement sendTex=driver.findElementById( "android:id/edit" );
        sendTex.sendKeys( "Der Versuch" );
       WebElement okButton=driver.findElementById( "android:id/button1" );
       okButton.click();

    }
}