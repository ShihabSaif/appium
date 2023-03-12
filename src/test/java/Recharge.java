import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Recharge {
    static AppiumDriver driver;

    @Test
    public static void doTopup() throws MalformedURLException, InterruptedException {
        driver = pinLogin.pinInput();

        Thread.sleep(5000);

        WebElement walletTab = driver.findElement(By.id("com.progoti.tallykhata:id/item_wallet"));
        walletTab.click();

        Thread.sleep(2000);

        WebElement mobileRecharge = driver.findElement(By.id("com.progoti.tallykhata:id/cl_mobile_recharge"));
        mobileRecharge.click();

        Thread.sleep(2000);

        WebElement selectPhoneNo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.LinearLayout"));
        selectPhoneNo.click();

        Thread.sleep(2000);

        WebElement thikAseButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button"));
        thikAseButton.click();

        WebElement amountField = driver.findElement(By.id("com.progoti.tallykhata:id/etTkInput"));
        amountField.sendKeys("23");

        WebElement porobortiButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnNext"));
        porobortiButton.click();

        Thread.sleep(2000);

        WebElement pinInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
        pinInput.sendKeys("1590");

        WebElement nischitButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnNext"));
        nischitButton.click();
    }
}
