package com.snapdeal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class SnapDealCommonPage 
{
	protected WebDriver driver = null;
	
	protected SnapDealCommonPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	protected String getPageTitle()
	{
		return driver.getTitle();
	}
	
	protected void click(WebElement element)
	{
		element.click();
	}

}
