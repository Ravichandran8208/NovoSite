package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131102_VerifyMenuandLogoPresenseinHeader extends ProjectSpecificMethods  {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131102_VerifyMenuandLogoPresenseinHeader";
		testDescription ="NV_GH_001_Verify the main menus, and logo are displayed in the Global Header section of the NOVO3 website";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131102";
		sheetName="Sheet1";
	}
	@Test(dataProvider = "fetchData")
	public void runVerifyMenuandLogoPresence(String LogoLocation,String LogoAlign,String ExamineEvaporationlocation,String TaketheSurveylocation,String GetUpdateslocation,String ReviewLiteraturelocation) {
		new NOVOHomepage()
		.verifyLogo(LogoLocation,LogoAlign)
		
		.verifymainMenuPresence( ExamineEvaporationlocation, TaketheSurveylocation, GetUpdateslocation, ReviewLiteraturelocation);
	}

}
