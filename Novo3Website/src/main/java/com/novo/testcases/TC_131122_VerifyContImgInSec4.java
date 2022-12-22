package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131122_VerifyContImgInSec4 extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131122_VerifyContImgInSec4";
		testDescription ="NV_HP_008_Verify the content and image present in section 4 of the Home page page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
	}
		@Test
		public void runVerifyContImgInSec4() {
		
		new NOVOHomepage()
		.VerifyContent_ImginSec4()
		.VerifyFontPropertiesInSec4();

}
}