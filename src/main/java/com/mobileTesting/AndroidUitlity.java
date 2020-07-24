package com.mobileTesting;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidUitlity {

	public void launchApp() throws Exception{
		// code to require to launch an app
		// 1. android/ ios 2. Device name = 3. Device Os 4.App package info 5.App activity
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");//"platformName"
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0915f9b52a5e0605");
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity",  "com.sec.android.app.popupcalculator.Calculator");
		//launch appium app --> Then get the appium IP and port --> Bind it to your driver 
		// Appium become an server - hub --> Selenium code will become an node -->
		TestBase.driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		System.out.println("App Launched");
		
	}
	
}
