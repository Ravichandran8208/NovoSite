package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131133VerifyFontPropInSec7 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131133VerifyFontPropInSec7";
		testDescription ="NV_HP_019_Verify the font properties of the content present in section 6 of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
	}
		@Test
		public void runVerifyFontPropInSec7 () {
		
		new NOVOHomepage()
		.VerifyFontPropInSec7();

}
}
