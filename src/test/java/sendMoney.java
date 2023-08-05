import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class sendMoney {
    AppiumDriver driver;

    @Test
    public void doSendMoney() throws MalformedURLException, InterruptedException {
        driver = pinLogin.pinInput();

        Thread.sleep(5000);

        WebElement walletTab = driver.findElement(By.id("com.progoti.tallykhata:id/item_wallet"));
        walletTab.click();

        Thread.sleep(3000);

        WebElement sendMoneyButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView"));
        sendMoneyButton.click();

        Thread.sleep(2000);

        WebElement numberInput = driver.findElement(By.id("com.progoti.tallykhata:id/etNumberInput"));
        numberInput.sendKeys("01943352936");

        WebElement nextButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnNextTW"));
        nextButton.click();

        Thread.sleep(2000);

        WebElement amountInput = driver.findElement(By.id("com.progoti.tallykhata:id/etAmountInput"));
        amountInput.sendKeys("20");

        WebElement porobortiButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnConfirm"));
        porobortiButton.click();

        Thread.sleep(2000);

        WebElement pinInput = driver.findElement(By.id("com.progoti.tallykhata:id/etPinInput"));
        pinInput.sendKeys("1590");

        WebElement nischitButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnConfirm"));
        nischitButton.click();

        Thread.sleep(5000);

        WebElement sendMoneySuccess = driver.findElement(By.id("com.progoti.tallykhata:id/successTitle"));
        System.out.println("Send Money final screen : " + sendMoneySuccess.getText());

        if (sendMoneySuccess.getText().equals("সেন্ড মানি সফল হয়েছে।"))
        {
            System.out.println("Send Money Success");
        }
        else {
            System.out.println("Send Money Failed");
        }
    }
}
