package Appium01;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class UiSelector {

    @Test

    public void test02() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        // desiredCapabilities.setCapability( "platformName","Android" );key ve value olarak da yazilabilir
        // desiredCapabilities.setCapability( CapabilityType.PLATFORM_NAME,"Android" ); diye de yazilabilir
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_NAME, "Android" );
        desiredCapabilities.setCapability( MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2" );
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_VERSION, "10.0" );
        desiredCapabilities.setCapability( MobileCapabilityType.DEVICE_NAME, "emulator-5554" );//isim adb den al
        desiredCapabilities.setCapability( MobileCapabilityType.APP, "/Users/bayram/IdeaProjects/ApiumKurulum/src/test/Apps/gestureTool.apk" );
        desiredCapabilities.setCapability( "appPackage", "com.davemac327.gesture.tool" );
        desiredCapabilities.setCapability( "appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity" );
        desiredCapabilities.setCapability( "noReset", true );
        // URL url=new URL("http://17.0.0.1:4723/wd/hub");
        // AndroidDriver<MobileElement>driver=new AndroidDriver<MobileElement>( url,desiredCapabilities );//webelelemnmt ya da android element de yazilabilir
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>( new URL( "http://127.0.0.1:4723/wd/hub" ), desiredCapabilities );
      //  driver.findElementByAndroidUIAutomator( "UiSelector().resourceId(\"android:id/title\")" ).click();

        //with index
     //   driver.findElementByAndroidUIAutomator( "UiSelector().className(\"android.widget.Button\").index(0)" ).click();

        //with text
      //  driver.findElementByAndroidUIAutomator( "UiSelector().className(\"android.widget.Button\").text(\"Test\")" ).click();
        //textStartsWith
       // driver.findElementByAndroidUIAutomator( "UiSelector().className(\"android.widget.Button\").textStartsWith(\"Te\")" ).click();

        //When user click add button, done button must be unable
        driver.findElementByAndroidUIAutomator( "UiSelector().className(\"android.widget.Button\").textStartsWith(\"Ad\")" ).click();
        System.out.println(driver.findElementByAndroidUIAutomator( "UiSelector().resourceId(\"com.davemac327.gesture.tool:id/done\").enabled(false)" ).getAttribute( "enabled" ));
        driver.findElementByAndroidUIAutomator( "UiSelector().resourceId(\"com.davemac327.gesture.tool:id/gesture_name\")" ).click();


    }
}