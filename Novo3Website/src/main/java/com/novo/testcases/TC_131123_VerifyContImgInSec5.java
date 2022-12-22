package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131123_VerifyContImgInSec5 extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131123_VerifyContImgInSec5";
		testDescription ="NV_HP_009_Verify the image, copy, CTA, heading and sub heading present in section 5 of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131123";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyContImgInSec4(String imgInSec5AltTag,String img1InSec5Align,String Heading1InSec5,String SubHeading1InSec5,String CopyTxt1InSec5,String CTA1InSec5,String Popup1OkUrl) {
		
		new NOVOHomepage()
		.VerifyContent_ImginSec5( imgInSec5AltTag, img1InSec5Align, Heading1InSec5, SubHeading1InSec5, CopyTxt1InSec5, CTA1InSec5, Popup1OkUrl);
		

}
}
