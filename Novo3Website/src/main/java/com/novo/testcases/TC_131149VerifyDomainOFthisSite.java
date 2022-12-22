package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131149VerifyDomainOFthisSite extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131149VerifyDomainOFthisSite";
		testDescription ="NV_DN_001_Verify the domain name displayed in the address bar ";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131149";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyDomainOFthisSite(String Url) {
		
		new NOVOHomepage()
		.VerifyDomainNovoWebSite( Url)
		.VerifyBrokenLinkInNovoPage();
}
}
