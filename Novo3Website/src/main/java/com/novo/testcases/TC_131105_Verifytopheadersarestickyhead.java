package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131105_Verifytopheadersarestickyhead extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131105_Verifytopheadersarestickyhead";
		testDescription ="NV_GH_004_Verify that top headers and menu headers are sticky header for the NOVO3 Website";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131105";
		sheetName="Sheet1";
	}
		@Test(dataProvider = ("fetchData"))
		public void runVerifytopheadersarestickyheadp(String headerClr) {
		
		new NOVOHomepage()
		.VerifyHeader(headerClr);

}
}
