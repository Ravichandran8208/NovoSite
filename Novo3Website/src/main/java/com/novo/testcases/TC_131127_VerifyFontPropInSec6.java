package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131127_VerifyFontPropInSec6 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131127_VerifyFontPropInSec6";
		testDescription ="NV_HP_013_Verify the font properties of the content present in Form section of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
	}
		@Test
		public void runVerifyFontPropInSec6 () {
		
		new NOVOHomepage()
		.VerifyFontPropInSec6();

}
}
