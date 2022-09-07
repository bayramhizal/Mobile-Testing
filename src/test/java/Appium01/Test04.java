package Appium01;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class Test04 {

    @Test

    public void test04() throws MalformedURLException, InterruptedException {
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
       //eger applikasyonun sürekli zinleri sormasini istemiyorsak asagidaki yolu takip edebiliriz
        desiredCapabilities.setCapability( "noReset",true );
       // URL url=new URL("http://17.0.0.1:4723/wd/hub");
       // AndroidDriver<MobileElement>driver=new AndroidDriver<MobileElement>( url,desiredCapabilities );//webelelemnmt ya da android element de yazilabilir
        AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities );
         /*
//    lunch GestureTool app
//    click addGesture button
//    send text to name box "testing"
//    click done
//    verify testing gesture is created
     */
        MobileElement addButton=driver.findElementById( "com.davemac327.gesture.tool:id/addButton" );
        addButton.click();
        MobileElement sendGesture=driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText" );
        sendGesture.click();
        Thread.sleep( 3000 );
        sendGesture.sendKeys( "mattech" );
        Thread.sleep( 3000 );
        driver.hideKeyboard();
        MobileElement enter=driver.findElementById( "com.davemac327.gesture.tool:id/gestures_overlay" );

        enter.click();
        MobileElement done=driver.findElementById( "com.davemac327.gesture.tool:id/done" );
        done.click();
        driver.closeApp();
    }
}
