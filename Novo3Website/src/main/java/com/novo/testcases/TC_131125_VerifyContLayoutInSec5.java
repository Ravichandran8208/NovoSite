package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131125_VerifyContLayoutInSec5 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131125_VerifyContLayoutInSec6";
		testDescription ="NV_HP_011_Verify the background, padding and layout present in section 5 of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131125";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyContLayoutInSec5(String imgInSec5Layout) {
		
		new NOVOHomepage()
		.VerifyimgandLayoutInSec5(imgInSec5Layout);

}
}
