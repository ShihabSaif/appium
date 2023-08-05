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

        WebElement mobileRecharge = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView"));
        mobileRecharge.click();

        Thread.sleep(2000);

        WebElement phoneNoInput = driver.findElement(By.id("com.progoti.tallykhata:id/etNumberInput"));
        phoneNoInput.sendKeys("01765841854");

        Thread.sleep(2000);

        WebElement nextButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnNextTW"));
        nextButton.click();

        WebElement thikAseButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnOk"));
        thikAseButton.click();

        WebElement amountField = driver.findElement(By.id("com.progoti.tallykhata:id/etTkInput"));
        amountField.sendKeys("23");

        WebElement porobortiButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnNext"));
        porobortiButton.click();

        Thread.sleep(2000);

        WebElement pinInput = driver.findElement(By.id("com.progoti.tallykhata:id/etPinInput"));
        pinInput.sendKeys("1590");

        WebElement nischitButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnNext"));
        nischitButton.click();

        Thread.sleep(5000);

        WebElement rechargeSuccess = driver.findElement(By.id("com.progoti.tallykhata:id/successTitle"));
        System.out.println("Recharge final screen : " + rechargeSuccess.getText());

        if (rechargeSuccess.getText().equals("মোবাইল রিচার্জ সফল হয়েছে।"))
        {
            System.out.println("Recharge Success");
        }
        else {
            System.out.println("Recharge Failed");
        }
    }
}
