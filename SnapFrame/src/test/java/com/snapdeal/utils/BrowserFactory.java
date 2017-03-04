package com.snapdeal.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import com.snapdeal.constants.BrowserConstants;


public class BrowserFactory 
{
	public static WebDriver driver = null;
	
	public static WebDriver getBrowser(String browserName)
	{
	
		if(browserName.equalsIgnoreCase(BrowserConstants.CHROME.toString()))
		{
			//To open browser in a single window. (But we need to use Sysetem.set.property than using exe files).
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("user-data-dir=C:/Users/Sharath/AppData/Local/Google/Chrome/User Data/Default");
			//options.addArguments("--start-maximized");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase(BrowserConstants.FIREFOX.toString()))
		{
			driver = new FirefoxDriver();
		}
		else 
		{
			driver = new PhantomJSDriver();
		}
		return driver;
	}
}
