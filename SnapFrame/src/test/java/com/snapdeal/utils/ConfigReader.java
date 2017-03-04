package com.snapdeal.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	public static String getPropertyValue(String propertyName) throws IOException
	{
		
		FileInputStream fis = new FileInputStream(".\\Config\\config.properties");
		Properties p = new Properties();
		p.load(fis);
		
		return p.getProperty(propertyName);
	}
	
	public static String getPropertyValue(String fileName, String propertyName) throws IOException
	{
		
		FileInputStream fis = new FileInputStream(".\\Config\\"+fileName+".properties");
		Properties p = new Properties();
		p.load(fis);
		
		return p.getProperty(propertyName);
	}
}
