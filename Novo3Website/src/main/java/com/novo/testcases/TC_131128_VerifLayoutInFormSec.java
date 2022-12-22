package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131128_VerifLayoutInFormSec extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131128_VerifLayoutInFormSec";
		testDescription ="NV_HP_014_Verify the background, padding and layout present in Form section of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131128";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifLayoutInFormSec (String FormLayoutSize) {
		
		new NOVOHomepage()
		.VerifyLayoutInFormSec6(FormLayoutSize);

}
}
