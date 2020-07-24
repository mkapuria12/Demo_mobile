package com.mobileTesting;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;


public class TestBase {
	
	public static AndroidDriver<WebElement> driver=null;
	AndroidUitlity oU_Android = new AndroidUitlity();
	
	@BeforeSuite
	public void TriggerinBeforeSuiteDependency() throws Exception{
		oU_Android.launchApp();
	}
	@AfterSuite
	public void closeApp() throws Exception{
		driver.quit();
	}

}
