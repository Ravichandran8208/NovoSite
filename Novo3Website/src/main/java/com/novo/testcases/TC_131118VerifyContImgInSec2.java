package com.novo.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131118VerifyContImgInSec2 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131118VerifyContImgInSec2";
		testDescription ="NV_HP_004_Verify the content and image present in section 2of the home page  of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131118";
		sheetName="Sheet1";
	}
	
		@org.testng.annotations.Test(dataProvider = "fetchData")
		public void runVerifyContImgInSec2(String LogoAlign1,String LogoAlign2,String Heading1Section2,String Heading2Section21,String copytxtSec21,String callouttxt1) {
			new NOVOHomepage()
			.verifyContentSection2(LogoAlign1,LogoAlign2,Heading1Section2,Heading2Section21,copytxtSec21,callouttxt1);

}
}
