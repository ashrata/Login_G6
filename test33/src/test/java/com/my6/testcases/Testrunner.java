package com.my6.testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import com.my6.baseclass.AppInitialize;
import com.my6.pages.guest1;	
import com.my6.pages.loginscreen;
import com.my6.utility.propertiesfile;

public class Testrunner extends AppInitialize
{
	@BeforeMethod
	public void setup() throws Exception  
	{
		System.out.println("Server started");
		launch();
		}
	@Test
	public void login() throws Throwable
	{
		loginscreen l1= new loginscreen();
		l1.validlogin(proReader("email"), proReader("passwd"));
		
	}
	/*@Test
	public void guest()
	{
		guest1 g1= new guest1(driver);
		//driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		g1.signup1().click();
		g1.emailidguest().sendKeys(propertiesfile.proReader("guestemail"));
		g1.passguest().sendKeys(propertiesfile.proReader("guestpwd"));
		g1.nxtbut1().click();
		g1.frst_name().sendKeys(propertiesfile.proReader("fstname"));
		g1.lst_name().sendKeys(propertiesfile.proReader("lstname"));
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		g1.phne().sendKeys(propertiesfile.proReader("phone"));
		g1.add().sendKeys(propertiesfile.proReader("add"));
		g1.nxtbut2().click();
		g1.creditno().sendKeys(propertiesfile.proReader("CC"));
		g1.month().click();
		g1.year().click();
		g1.signup().click();
	}*/
	
	
}

