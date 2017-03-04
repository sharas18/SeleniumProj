package com.snapdeal.SnapFrame;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.snapdeal.pages.SnapDealHarddiskPage;
import com.snapdeal.pages.SnapDealHomePage;
import com.snapdeal.utils.AppUtils;
import com.snapdeal.utils.BrowserFactory;
import com.snapdeal.utils.ConfigReader;

public class SnapDealRunner 
{
	WebDriver driver = null;
	SnapDealHomePage homePage = null;
	SnapDealHarddiskPage hardPage = null;
	
	@Parameters({"browsername","url"})
	
	@BeforeMethod
	public void openBrowser(@Optional("chrome") String browsername,@Optional("https://www.snapdeal.com/") String url) throws IOException
	{
		
		driver = BrowserFactory.getBrowser(browsername);
		homePage = AppUtils.openAppUrl(url, driver);
	}
	
	@Test
	public void verifyHomePage() throws IOException
	{
		String actualTitle = homePage.getPageTitle();
		//System.out.println(actualTitle);
		String expectedTile = ConfigReader.getPropertyValue("homepage","page_title");
		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTile));
	}
	@Test
	public void verifyHarddiskpage() throws InterruptedException
	{
		hardPage = homePage.navigateComputer();
		hardPage.filterPage(1);
		TimeUnit.SECONDS.sleep(5);
		hardPage.afterFilter(500);
		TimeUnit.SECONDS.sleep(5);
		hardPage.validateResult();
		hardPage.removeFilterTB(1);
		TimeUnit.SECONDS.sleep(5);
		hardPage.validateResult1();
		TimeUnit.SECONDS.sleep(5);
		hardPage.removeFilterGB(500);
	}
	
}
