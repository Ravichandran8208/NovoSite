package com.novo.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131115_VerifyHomePageContents extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = " TC_131115_VerifyHomePageContents";
		testDescription ="NV_HP_001_Verify the image, copy, CTA heading and sub heading displayed on the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131115";
		sheetName="Sheet1";
	}
	
		@org.testng.annotations.Test(dataProvider = "fetchData")
		public void runVerifyHomePageContents(String EyeIconClr,String EyeImgLoc,String examineEvaHeading,String SubHeading1,String CpyTxt1) {
		
		new NOVOHomepage()
		.VerifyEyeIconStyle(EyeIconClr,EyeImgLoc)
		.VerifyCTAandHeadingsubHeadingCopyandCTA(examineEvaHeading,SubHeading1,CpyTxt1);
//		.verifyBelowSignupButtonContents();
		


}
}
