package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131144VerifyFavIcon extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131144VerifyFavIcon";
		testDescription ="NV_FL_001_Verify the Favicon Logo displayed on the address bar of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131144";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyFavIcon(String hrefforfavicon) {
		
		new NOVOHomepage()
		.VerifyFavIcon( hrefforfavicon);

}
}
