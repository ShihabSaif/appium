import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class rocketAddMoney {

    AppiumDriver driver;

    @Test
    public void doAddMoneyRocket() throws MalformedURLException, InterruptedException {
        driver = pinLogin.pinInput();

        Thread.sleep(5000);

        WebElement walletTab = driver.findElement(By.id("com.progoti.tallykhata:id/item_wallet"));
        walletTab.click();

        Thread.sleep(3000);

        WebElement addMoneyButton = driver.findElement(By.id("com.progoti.tallykhata:id/img_taka_ani"));
        addMoneyButton.click();

        Thread.sleep(3000);

        WebElement rocketOption = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
        rocketOption.click();

        Thread.sleep(2000);

        WebElement amountInput = driver.findElement(By.id("com.progoti.tallykhata:id/etCashboxInput"));
        amountInput.sendKeys("20");

        WebElement porobortiButton = driver.findElement(By.id("com.progoti.tallykhata:id/btnNext"));
        porobortiButton.click();

        Thread.sleep(10000);

        WebElement rocketAccount = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.GridView/android.view.View[1]/android.view.View[2]/android.widget.EditText"));
        rocketAccount.sendKeys("019800016669");

        WebElement rocketPin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.GridView/android.view.View[2]/android.view.View[2]/android.widget.EditText"));
        rocketPin.sendKeys("1234");

        WebElement rocketSubmit = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.GridView/android.view.View[7]/android.view.View/android.widget.GridView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button"));
        rocketSubmit.click();
    }
}
