package com.framework.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}

	@BeforeMethod
	public void beforeMethod() {
		
		startApp("chrome",true, "http://dev111627.service-now.com");
		setNode();
				
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("successful");
		close();
	}

	

	
	  

	
	
}
