package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131138VerifyMetaTitle extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131138VerifyMetaTitle";
		testDescription ="NV_SEO_001_Verify the page Meta Title of each page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131138";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyMetaTitle(String PageTitle) {
		
		new NOVOHomepage()
		.VerifyMetaTitle(PageTitle);

}
}
