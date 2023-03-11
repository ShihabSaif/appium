package org.example;

import io.appium.java_client.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

//    static AppiumDriver<MobileElement> drive;
    static AppiumDriver drive;
    public static void main(String[] args) throws MalformedURLException {
        openCalculator();
    }

    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "realme XT");
        cap.setCapability("udid", "fc0c845e");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("appPackage", "com.progoti.tallykhata");
        cap.setCapability("appActivity", "com.progoti.tallykhata.v2.MainActivity");
        cap.setCapability("noReset",true);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        drive = new AppiumDriver(url, cap);

        System.out.println("Application started...");
    }
}