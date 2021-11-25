package com.framework.selenium.servicenowtestcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.selenium.api.pages.ServicenowLoginpage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class TC001_Servicenowlogintc extends ProjectSpecificMethods{
	
	
	
		@BeforeTest
		public void setFileName() {
			testcaseName ="Login";						
			testDescription ="Verifying the loginpage";
			authors ="vidya";
			excelFileName = "servicenowlogin";		
			
		}
		
		@Test(dataProvider = "fetchData")
		public void runLogin(String UN, String PW) {
			
			new ServicenowLoginpage().enterUName(UN).enterPwd(PW).clickLogin();
			
		}
	 }

