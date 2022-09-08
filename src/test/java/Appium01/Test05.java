package Appium01;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Test05 {
    @Test

    public void test05() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        // desiredCapabilities.setCapability( "platformName","Android" );key ve value olarak da yazilabilir
        // desiredCapabilities.setCapability( CapabilityType.PLATFORM_NAME,"Android" ); diye de yazilabilir
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_NAME, "Android" );
        desiredCapabilities.setCapability( MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2" );
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_VERSION, "10.0" );
        desiredCapabilities.setCapability( MobileCapabilityType.DEVICE_NAME, "emulator-5554" );//isim adb den al
        desiredCapabilities.setCapability( MobileCapabilityType.APP, "/Users/bayram/IdeaProjects/ApiumKurulum/src/test/Apps/Calculator_Test.apk" );
    //    desiredCapabilities.setCapability( "appPackage", "com.davemac327.gesture.tool" );
      //  desiredCapabilities.setCapability( "appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity" );
        //eger applikasyonun sürekli zinleri sormasini istemiyorsak asagidaki yolu takip edebiliriz
        desiredCapabilities.setCapability( "noReset", true );
        AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities );
        if(driver.isDeviceLocked()){
            driver.unlockDevice();
        }
        MobileElement num5=driver.findElementById( "com.google.android.calculator:id/digit_5" );
        MobileElement num4=driver.findElementById( "com.google.android.calculator:id/digit_4" );
        MobileElement plus=driver.findElementById( "com.google.android.calculator:id/op_add" );
        MobileElement equal=driver.findElementById( "com.google.android.calculator:id/eq" );
        num4.click();
        plus.click();
        num5.click();
        Thread.sleep( 3000 );

        MobileElement sonuc=driver.findElementById("com.google.android.calculator:id/result_preview");
        String result="9";
        Assert.assertEquals(result,"9" );


        /*
        calculator acalim
mateamtik islemi yapalim
on sonuc ve final sonuc onayliyalim
         */

    }
}