package com.novo.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131111_VerifyReferenceTextinFooter extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = " TC_131111_VerifyReferenceTextinFooter";
		testDescription ="NV_OP_001_Verify the reference section present in the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131111";
		sheetName="Sheet1";
	}
	
		@org.testng.annotations.Test(dataProvider = "fetchData")
		public void runVerifyReferenceTextinFooter(String ReferenceTextInFooter,String TextFontFamily1,String TextSizeFooterParah1,String FooterParahTextColor1,String FooterParahTextWeight1) {
		
		new NOVOHomepage()
		.VerifyReferenceTextinFooter( ReferenceTextInFooter, TextFontFamily1, TextSizeFooterParah1, FooterParahTextColor1, FooterParahTextWeight1);
		

}
}
