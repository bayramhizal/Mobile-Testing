package Appium01;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Test01 {

    @Test

    public void test01() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
      // desiredCapabilities.setCapability( "platformName","Android" );key ve value olarak da yazilabilir
       // desiredCapabilities.setCapability( CapabilityType.PLATFORM_NAME,"Android" ); diye de yazilabilir
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_NAME,"Android" );
        desiredCapabilities.setCapability( MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2" );
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_VERSION,"10.0" );
        desiredCapabilities.setCapability( MobileCapabilityType.DEVICE_NAME,"emulator-5554" );//isim adb den al
        desiredCapabilities.setCapability( MobileCapabilityType.APP,"/Users/bayram/IdeaProjects/ApiumKurulum/src/test/Apps/gestureTool.apk" );
        desiredCapabilities.setCapability( "appPackage","com.google.android.apps.nexuslauncher" );
        desiredCapabilities.setCapability( "appActivity","com.google.android.apps.nexuslauncher.NexusLauncherActivity" );
       // URL url=new URL("http://17.0.0.1:4723/wd/hub");
       // AndroidDriver<MobileElement>driver=new AndroidDriver<MobileElement>( url,desiredCapabilities );//webelelemnmt ya da android element de yazilabilir
        AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities );
    }
}
