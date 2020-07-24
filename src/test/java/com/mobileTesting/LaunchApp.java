package com.mobileTesting;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class LaunchApp extends TestBase{
	
	@Test
	public void TC_01_Sum() throws Exception{
		System.out.println("");
		driver.findElement(By.id("bt_07")).click();
		driver.findElement(By.id("bt_05")).click();
		driver.findElement(By.id("bt_mul")).click();
		driver.findElement(By.id("bt_05")).click();
		driver.findElement(By.id("bt_equal")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("txtCalc")).getText());
		Thread.sleep(10000);
		
	}

}
