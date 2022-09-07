package Appium01;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class Test02 {

    @Test

    public void test02() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
      // desiredCapabilities.setCapability( "platformName","Android" );key ve value olarak da yazilabilir
       // desiredCapabilities.setCapability( CapabilityType.PLATFORM_NAME,"Android" ); diye de yazilabilir
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_NAME,"Android" );
        desiredCapabilities.setCapability( MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2" );
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_VERSION,"10.0" );
        desiredCapabilities.setCapability( MobileCapabilityType.DEVICE_NAME,"emulator-5554" );//isim adb den al
        desiredCapabilities.setCapability( MobileCapabilityType.APP,"/Users/bayram/IdeaProjects/ApiumKurulum/src/test/Apps/gestureTool.apk" );
       desiredCapabilities.setCapability( "appPackage","com.davemac327.gesture.tool" );
       desiredCapabilities.setCapability( "appActivity","com.davemac327.gesture.tool.GestureBuilderActivity" );
       // URL url=new URL("http://17.0.0.1:4723/wd/hub");
       // AndroidDriver<MobileElement>driver=new AndroidDriver<MobileElement>( url,desiredCapabilities );//webelelemnmt ya da android element de yazilabilir
        AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities );
        driver.findElementById( "com.android.permissioncontroller:id/continue_button" ).click();
        Thread.sleep( 3000 );
        MobileElement okButton=driver.findElementById( "android:id/button1" );
        Thread.sleep( 3000 );
        okButton.click();
        Thread.sleep( 3000 );
        MobileElement homescrenTitle=driver.findElementById( "android:id/title" );
        Thread.sleep( 3000 );
        Assert.assertTrue( homescrenTitle.isDisplayed() );
    }
}
