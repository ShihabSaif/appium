import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class moneyOutNagad {

    static AppiumDriver driver;

    @Test
    public void nagadMoneyOut() throws MalformedURLException, InterruptedException {
        driver = pinLogin.pinInput();

        Thread.sleep(5000);

        WebElement walletTab = driver.findElement(By.id("com.progoti.tallykhata:id/item_wallet"));
        walletTab.click();

        Thread.sleep(3000);

        WebElement moneyOut = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.ImageView"));
        moneyOut.click();

        Thread.sleep(2500);

        WebElement selectMoneyOutByNagad = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"));
        selectMoneyOutByNagad.click();

        Thread.sleep(2500);

        WebElement nagadNoInput = driver.findElement(By.id("com.progoti.tallykhata:id/etNumberInput"));
        nagadNoInput.sendKeys("01621215877");

        WebElement nextButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnNextTW"));
        nextButton.click();

        Thread.sleep(2000);

        WebElement amountInput = driver.findElement(By.id("com.progoti.tallykhata:id/etAmountInput"));
        amountInput.sendKeys("21");

        Thread.sleep(1500);

        WebElement porobortiButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnConfirm"));
        porobortiButton.click();

        Thread.sleep(2500);

        WebElement pinInput = driver.findElement(By.id("com.progoti.tallykhata:id/etPinInput"));
        pinInput.sendKeys("1590");

        WebElement nischitButton = driver.findElement(By.id("com.progoti.tallykhata:id/btn_confirm"));
        nischitButton.click();

        Thread.sleep(5000);

        WebElement nagadMoneyOutSuccess = driver.findElement(By.id("com.progoti.tallykhata:id/successTitle"));
        System.out.println("Nagad Money Out final screen : " + nagadMoneyOutSuccess.getText());

        if (nagadMoneyOutSuccess.getText().equals("মানি আউট সফল হয়েছে।"))
        {
            System.out.println("Nagad Money Out Success");
        }
        else {
            System.out.println("Nagad Money Out Failed");
        }

    }
}
