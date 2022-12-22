package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131120VerifyContentImgInSec3 extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131120VerifyContentImgInSec3";
		testDescription ="NV_HP_006_Verify the content and image present in section 3 of the home page  of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131120";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyContentImgInSec3(String img1inSec3alt1) {
		
		new NOVOHomepage()
		.VerifyContent_ImginSec3()
		.VerifyFontPropertiesSec3()
		.VerifyAltTagOfImageInSec3(img1inSec3alt1);

}
}
