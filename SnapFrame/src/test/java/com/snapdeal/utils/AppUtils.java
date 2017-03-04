package com.snapdeal.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.snapdeal.pages.SnapDealHomePage;

public class AppUtils
{
	public static SnapDealHomePage openAppUrl(String url,WebDriver driver)
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(url);
		
		return PageFactory.initElements(driver, SnapDealHomePage.class);
	}
}
