package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131129_VerifyContInThankSec extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131129_VerifyContInThankSec";
		testDescription ="NV_HP_015_Verify the copy  and heading present in Thankyou message section of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131129";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyContInThankSec (String TestName,String TestName2,String EmailAddFieldTest,String ThankHEADINGtxt,String Copytxt1InThank) {
		
		new NOVOHomepage()
		.VerifyContInThankSec6( TestName, TestName2, EmailAddFieldTest, ThankHEADINGtxt, Copytxt1InThank);
}
}
