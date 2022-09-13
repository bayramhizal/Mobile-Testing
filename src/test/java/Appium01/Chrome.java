package Appium01;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class Chrome {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_NAME,"Android" );
        desiredCapabilities.setCapability( MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2" );
        desiredCapabilities.setCapability( MobileCapabilityType.PLATFORM_VERSION,"10.0" );
        desiredCapabilities.setCapability( MobileCapabilityType.DEVICE_NAME,"emulator-5554" );//isim adb den al

       desiredCapabilities.setCapability( MobileCapabilityType.BROWSER_NAME,"chrome" );
        desiredCapabilities.setCapability( MobileCapabilityType.NEW_COMMAND_TIMEOUT,"6000" );
        desiredCapabilities.setCapability( "chromeDriverExecutable","/Users/bayram/IdeaProjects/ApiumKurulum/src/test/Driver/chromedriver" );
     //   desiredCapabilities.setCapability("appPackage","com.android.chrome");
      // desiredCapabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        //amazon.com navigate
        //click Sign In button
        //verify welcome script

        driver.get("https://amazon.com");







        //burda aplikasyonun hangi turleri oldugunu gorem icin getContextHandles() kullaniyoruz.
  Set<String> butunturler = driver.getContextHandles();
       for (String tur: butunturler) {
            System.out.println(tur);
            if (tur.contains("WEBVIEW_chrome")) {
                driver.context(tur);
            }
        }

        System.out.println(driver.getContext());


      MobileElement signIn=driver.findElementByPartialLinkText( "Sign" );

      signIn.click();

      MobileElement signVerify=driver.findElementByXPath( "//*[contains(text(),'Sign in')]" );
      Assert.assertTrue( signVerify.isDisplayed() );






    }

}
