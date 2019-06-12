package com.my6.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.my6.baseclass.AppInitialize;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class guest1 extends AppInitialize 
{
	public guest1(AppiumDriver<MobileElement> driver)
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.my6.android.debug:id/btn_sign_up")
	WebElement signup1;
	
	@AndroidFindBy(id="com.my6.android.debug:id/username")
	WebElement emailidguest;
	
	@AndroidFindBy(id="com.my6.android.debug:id/password")
	WebElement passguest;
	
	@AndroidFindBy(id="com.my6.android.debug:id/btn_next")
	WebElement nxtbut1;
	
	@AndroidFindBy(id="com.my6.android.debug:id/first_name")
	WebElement frst_name;
	
	@AndroidFindBy(id="com.my6.android.debug:id/last_name")
	WebElement lst_name;
	
	@AndroidFindBy(id="com.my6.android.debug:id/phone")
	WebElement phne;
	
	@AndroidFindBy(id="com.my6.android.debug:id/google_address")
	WebElement add;
	
	@AndroidFindBy(id="com.my6.android.debug:id/btn_next")
	WebElement nxtbut2;
	
	@AndroidFindBy(id="com.my6.android.debug:id/card_number")
	WebElement creditno;
	
	@AndroidFindBy(id="com.my6.android.debug:id/month")
	WebElement month;
	
	@AndroidFindBy(id="com.my6.android.debug:id/year")
	WebElement year;
	
	@AndroidFindBy(id="com.my6.android.debug:id/btn_sign_up")
	WebElement signup;
	
	public WebElement signup1()
	{
		return signup1;
	}
	
	public WebElement emailidguest()
	{
	return emailidguest;
	}
	
	public WebElement passguest()
	{
		return passguest;
	}
	public WebElement nxtbut1()
	{
		return nxtbut1;
	}
	public WebElement frst_name()
	{
		return frst_name;
	}
	public WebElement lst_name()
	{
		return lst_name;
	}
	public WebElement phne()
	{
		return phne;
	}
	public WebElement add()
	{
		return add;
	}
	public WebElement nxtbut2()
	{
		return nxtbut2;
	}
	public WebElement creditno()
	{
		return creditno;
	}
	public WebElement month()
	{
		return month;
	}
	public WebElement year()
	{
		return year;
	}
	public WebElement signup()
	{
		return signup;
	}
}
