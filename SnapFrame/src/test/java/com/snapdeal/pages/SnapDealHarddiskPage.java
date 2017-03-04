package com.snapdeal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SnapDealHarddiskPage extends SnapDealCommonPage
{

	public SnapDealHarddiskPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	
	public void filterPage(int req)
	{
		String xp = "Capacity_s-";
		String xn = xp+req+" TB";
		System.out.println(xn);
		WebElement checkboxes = driver.findElement(By.xpath("//label[@for='"+xn+"']"));
		super.click(checkboxes);
	}
	
	public void afterFilter(int req)
	{
		String xp = "Capacity_s-";
		String xn = xp+req+"%20GB";
		WebElement checkboxes = driver.findElement(By.xpath("//label[@for='"+xn+"']"));
		super.click(checkboxes);
	}
	
	public void validateResult()
	{
		WebElement ele1 = driver.findElement(By.id("1390527"));
		Assert.assertTrue(ele1.getText().contains("1 TB"), "Pass");
		System.out.println(ele1.getText());
		//System.out.println("hello");
		WebElement ele2 = driver.findElement(By.id("630237611185"));
		Assert.assertTrue(ele2.getText().contains("1 TB"), "Pass");
		System.out.println(ele2.getText());
		
	}
	public void removeFilterTB(int req)
	{
		WebElement ele1 = driver.findElement(By.xpath("//div[@class = 'navFiltersPill']/a[contains(text(),'"+req+" TB')]"));
		super.click(ele1);
	}
	public void validateResult1()
	{
		WebElement ele = driver.findElement(By.xpath("//a[@pogid='1926165264']/p[@class='product-title ']"));
		Assert.assertTrue(ele.getText().contains("500 GB"), "Pass");
	}
	public void removeFilterGB(int req)
	{
		WebElement ele1 = driver.findElement(By.xpath("//div[@class = 'navFiltersPill']/a[contains(text(),'"+req+" GB')]"));
		super.click(ele1);
	}
}
