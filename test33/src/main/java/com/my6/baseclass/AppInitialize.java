package com.my6.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.my6.utility.propertiesfile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppInitialize 
{
	public static String proReader (String PropertyName)
	{
	       String str =null;
	       try
	       {
	           // Load the properties File
	           Properties pro= new Properties();
	           File fl= new File ("C:/Users/dell/git/Login_G6/test33/constant.properties");
	           FileInputStream fis = new FileInputStream(fl);
	           pro.load(fis);
	           str = pro.getProperty(PropertyName);
	           //return str;
	       } catch (Exception e)
	       {
	           System.out.println("Expection is:  "+ e.getMessage());
	       }
	          return str;

	   }
	public static AppiumDriver<MobileElement>driver;
	
	public static void launch() throws Exception 
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability("deviceName", propertiesfile.proReader("deviceName"));
		cap.setCapability("udid", propertiesfile.proReader("udid"));
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", propertiesfile.proReader("platformVersion"));
		
		cap.setCapability("appPackage", "com.my6.android.debug");
		cap.setCapability("appActivity", "com.my6.android.ui.splashscreen.SplashScreenActivity");
		
		URL url=new URL("http://"+propertiesfile.proReader("ip")+".0.0.1:"+propertiesfile.proReader("port")+"/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("App started");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
	}
}
