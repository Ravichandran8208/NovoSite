package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131131VerifyLayoutThankSec extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131131VerifyLayoutThankSec";
		testDescription ="NV_HP_017_Verify the background, padding and layout present in Thankyou message section of the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131131";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyLayoutThankSec (String TestName,String TestName2,String EmailAddFieldTest,String layouthankSec) {
		
		new NOVOHomepage()
		.VerifyLayOutThankYouSec6( TestName, TestName2, EmailAddFieldTest, layouthankSec);

}
		
}
