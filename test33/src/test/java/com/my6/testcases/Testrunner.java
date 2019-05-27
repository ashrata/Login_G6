package com.my6.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.my6.baseclass.AppInitialize;
import com.my6.pages.loginscreen;
import com.my6.utility.propertiesfile;

public class Testrunner extends AppInitialize
{
	@BeforeMethod
	public void setup() throws Exception  
	{
		System.out.println("Server started");
		launch();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	@Test
	public void login() throws Throwable
	{
		loginscreen l1= new loginscreen();
		//driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		l1.lgnbut1().click();
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		l1.emailid().sendKeys(propertiesfile.proReader("email"));
		l1.password().sendKeys(propertiesfile.proReader("pass"));
		l1.lgnbut().click();
		
	}
	/*@Test
	public void guest()
	{
		guest1 g1= new guest1(driver);
		g1.emailidguest().sendKeys("guestemail");
		g1.passguest().sendKeys("guestpwd");
		g1.nxtbut1().click();
		g1.frst_name().sendKeys("fstname");
		g1.lst_name().sendKeys("lstname");
		g1.phne().sendKeys("phone");
		g1.add().sendKeys("add");
		g1.nxtbut2().click();
		g1.creditno().sendKeys("CC");
		g1.month().click();
		g1.year().click();
		g1.signup().click();
	}*/
	
}

