package com.novo.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131116_VerifyHomePageContentFontProperties extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = " TC_131116_VerifyHomePageContentFontProperties";
		testDescription ="NV_HP_002_Verify the font properties of the content present on the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
	}
	
		@org.testng.annotations.Test
		public void runVerifyHomePageContentFontProperties() {
			new NOVOHomepage()
			.verifyBelowSignupButtonContentsProperties();
		}

}
