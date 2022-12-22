package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131126_Negative_1 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131126_VerifyContInSec6";
		testDescription ="NV_HP_012_Verify the copy, CTA and heading present in Form section of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
	}
		@Test
		public void runVerifyContImgInSec4() {
		
		new NOVOHomepage()
		.VerifyContLayoutInSec6NegativeWithFillingUWC();

}
}
