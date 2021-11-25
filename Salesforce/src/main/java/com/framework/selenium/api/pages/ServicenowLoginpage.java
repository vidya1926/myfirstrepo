package com.framework.selenium.api.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ServicenowLoginpage extends ProjectSpecificMethods{
	
		
		public ServicenowLoginpage enterUName(String data) 
    {
	clearAndType(locateElement(Locators.ID,"username"),data);
	reportStep(data+ "entered successfully", "pass");
	return this;	
    }
		
		
		public ServicenowLoginpage enterPwd(String data) 
    {
	clearAndType(locateElement(Locators.ID,"password"),data);
	reportStep(data+ "entered successfully", "pass");
	return this;	
    }
	
		public Servicenowhomepage clickLogin()
		{
			click(locateElement(Locators.ID,"sysverb_login"));
			reportStep( "Login successfully", "pass");
			return new Servicenowhomepage();
			
		}
		
		
		
		
		

}