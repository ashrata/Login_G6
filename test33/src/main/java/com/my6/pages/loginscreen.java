package com.my6.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.my6.baseclass.AppInitialize;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginscreen extends AppInitialize
{

	public loginscreen()
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.my6.android.debug:id/btn_login")
	WebElement lgnbut1;
	
	
	@AndroidFindBy(id="com.my6.android.debug:id/username")
	WebElement emailid;
	
	@AndroidFindBy(id="com.my6.android.debug:id/password")
	WebElement password;
	
	@AndroidFindBy(id="com.my6.android.debug:id/btn_login")
	WebElement lgnbut;
	
	
	public WebElement lgnbut1()
	{
		return lgnbut1;
		
	}
	public WebElement emailid()
	{
		return emailid;
		
	}
	public WebElement password()
	{
		return password;
		
	}
	public WebElement lgnbut()
	{
		return lgnbut;
		
	}
	
}

