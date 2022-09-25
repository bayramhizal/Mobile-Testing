package Appium01;

import Appium.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;
import java.net.MalformedURLException;

public class AppiumScrool extends BaseClass {
    @Test
    public void test() throws MalformedURLException {
        AndroidDriver driver=getAndroidDriver();
        driver.findElementByXPath( "//android.widget.TextView[@text='API Demos']" ).click();
        //preference tikla
        driver.findElementByXPath( "//android.widget.TextView[@text='Views']" ).click();
        //   preference dependencies tikla
        Dimension dimension=driver.manage().window().getSize();
        int start_x=(int)(dimension.width*0.5);
        int start_y=(int)(dimension.height*0.8);
        int end_x=(int)(dimension.width*0.5);
        int end_y=(int)(dimension.height*0.2);
        for (int i=0;i<4;i++){
            TouchAction touchAction=new TouchAction( driver );
            touchAction.press( PointOption.point( start_x,start_y ) ).moveTo( PointOption.point( end_x,end_y ) ).release().perform();

        }

    }
}
