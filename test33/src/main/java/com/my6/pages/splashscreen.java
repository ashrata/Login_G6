package com.my6.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.my6.baseclass.AppInitialize;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class splashscreen extends AppInitialize
{
	
	public splashscreen()
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.my6.android.debug:id/btn_login")
	WebElement Home;
	
	public WebElement Home()
	{
		return Home;
		
	}
}
