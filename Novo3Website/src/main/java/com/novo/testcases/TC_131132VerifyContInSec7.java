package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131132VerifyContInSec7 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131132VerifyContInSec7";
		testDescription ="NV_HP_018_Verify the image, copy, CTA and heading present in section 6 of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
	}
		@Test
		public void runVerifyContInSec7 () {
		
		new NOVOHomepage()
		.VerifyContInSec7();

}
}
