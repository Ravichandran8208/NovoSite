package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131139VerifyMetaTitleDesc extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131139VerifyMetaTitleDesc";
		testDescription ="NV_SEO_002_Verify the page Meta Description of each page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131139";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyMetaTitle(String TitleDescription) {
		
		new NOVOHomepage()
		.VerifyMetaTitleDesc( TitleDescription);

}
}
