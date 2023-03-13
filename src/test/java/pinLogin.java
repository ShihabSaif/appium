import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class pinLogin {

    static AppiumDriver driver;

    public static AppiumDriver initiate() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "realme XT");
        cap.setCapability("udid", "fc0c845e");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("appPackage", "com.progoti.tallykhata");
        cap.setCapability("appActivity", "com.progoti.tallykhata.v2.MainActivity");
        cap.setCapability("noReset",true);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url, cap);

        System.out.println("Application started...");

        return driver;
    }

    @Test
    public static AppiumDriver pinInput() throws MalformedURLException, InterruptedException {

        initiate();

        WebElement pin1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]"));
        pin1.click();
        Actions p1 = new Actions(driver);
        p1.sendKeys("1");
        p1.perform();

        WebElement pin2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]"));
        pin2.click();
        Actions p2 = new Actions(driver);
        p2.sendKeys("5");
        p2.perform();

        WebElement pin3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[3]"));
        pin3.click();
        Actions p3 = new Actions(driver);
        p3.sendKeys("9");
        p3.perform();

        WebElement pin4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[4]"));
        pin4.click();
        Actions p4 = new Actions(driver);
        p4.sendKeys("0");
        p4.perform();

        return driver;
    }
}
