package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131124_VerifyFontPropinSec5 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131124_VerifyFontPropinSec5";
		testDescription ="NV_HP_010_Verify the font properties of the content present in section 5 of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
	}
		@Test
		public void runVerifyContImgInSec4() {
		
		new NOVOHomepage()
		.VerifyFontPropertiesInSec5();

}
}
