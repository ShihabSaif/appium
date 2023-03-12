import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Registration {
    static AppiumDriver driver;

    @Test
    public static void doReg() throws MalformedURLException, InterruptedException {
        driver = pinLogin.initiate();

        Thread.sleep(5000);

        WebElement mobileNumber = driver.findElement(By.id("com.progoti.tallykhata:id/et_mobile_number"));
        mobileNumber.sendKeys("01765841948");

        WebElement porobortiButton = driver.findElement(By.id("com.progoti.tallykhata:id/btn_next"));
        porobortiButton.click();

        Thread.sleep(5000);

        WebElement otp1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]"));
        otp1.click();
        Actions p1 = new Actions(driver);
        p1.sendKeys("1");
        p1.perform();

        WebElement otp2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]"));
        otp2.click();
        Actions p2 = new Actions(driver);
        p2.sendKeys("2");
        p2.perform();

        WebElement otp3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[3]"));
        otp3.click();
        Actions p3 = new Actions(driver);
        p3.sendKeys("3");
        p3.perform();

        WebElement otp4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]"));
        otp4.click();
        Actions p4 = new Actions(driver);
        p4.sendKeys("4");
        p4.perform();

        WebElement nischitButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnNext"));
        nischitButton.click();

        Thread.sleep(5000);

        WebElement businessName = driver.findElement(By.id("com.progoti.tallykhata:id/et_shop_name"));
        businessName.sendKeys("shihab general store");

        WebElement beboharShuruKoriButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnNext"));
        beboharShuruKoriButton.click();

    }
}
