package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131130_VerifyFontPropInThankSec extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131130_VerifyFontPropInThankSec";
		testDescription ="NV_HP_016_Verify the font properties of the content present in Thankyou message section of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
	}
		@Test
		public void runVerifyFontPropInThankSec () {
		
		new NOVOHomepage()
		.VerifyFontPropInThankSec6();

}
}
