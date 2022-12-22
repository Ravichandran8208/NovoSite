package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131134VerifyLayoutOfSec7 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = " TC_131134VerifyLayoutOfSec7";
		testDescription ="NV_HP_003_Verify the background, padding and layout present in section 1  of the Product page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131134";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyLayoutOfSec7 (String LayoutInSec7Size) {
		
		new NOVOHomepage()
		.VerifyLayoutInSec7( LayoutInSec7Size);

}
}
