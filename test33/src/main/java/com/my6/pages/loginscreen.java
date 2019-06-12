package com.my6.pages;

import org.openqa.selenium.support.PageFactory;

import com.my6.baseclass.AppInitialize;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginscreen extends AppInitialize
{

	public loginscreen()
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.my6.android.debug:id/btn_login")
	private static AndroidElement lgnbut1;
		
	@AndroidFindBy(id="com.my6.android.debug:id/username")
	private static AndroidElement emailid;
	
	@AndroidFindBy(id="com.my6.android.debug:id/password")
	private static AndroidElement password;
	
	@AndroidFindBy(id="com.my6.android.debug:id/btn_login")
	private static AndroidElement lgnbut;
	
	public mapscreen validlogin(String email,String passwd)
	{
		loginscreen.emailid.sendKeys(email);
		loginscreen.password.sendKeys(passwd);
		loginscreen.lgnbut1.click();
		return new mapscreen();
		
	}
	
}

