package com.my6.utility;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class propertiesfile
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
}