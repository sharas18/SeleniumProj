package com.snapdeal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SnapDealHomePage extends SnapDealCommonPage
{

	public SnapDealHomePage(WebDriver driver)
	{
		super(driver);
	}
	
	public String getPageTitle()
	{
		return super.getPageTitle();
	}
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Computers & Gaming')]")
	private WebElement element_comp;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'External Hard Drives')]")
	private WebElement element_hard;
	public SnapDealHarddiskPage navigateComputer()
	{
		super.click(element_comp);
		super.click(element_hard);
		
		return PageFactory.initElements(driver, SnapDealHarddiskPage.class);
	}
}
