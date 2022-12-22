package com.novo.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131110_VerifyReferenceTextinFooter11 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = " TC_13110_VerifyReferenceSectionTextinFooter";
		testDescription ="NV_OP_001_Verify the reference section present in the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131110";
		sheetName="Sheet1";
	}
	
		@org.testng.annotations.Test(dataProvider = "fetchData")
		public void runVerifyReferenceTextinFooter(String ParahFootertxt,String TextFontFamily,String TextSizeFooterParah,String FooterParahTextColor,String FooterParahTextWeight) {
		
		new NOVOHomepage()
//		.VerifyReferenceTextinFooter( ReferenceTextInFooter, TextFontFamily1, TextSizeFooterParah1, FooterParahTextColor1, FooterParahTextWeight1) 
		.VerifyTextProperties(ParahFootertxt,TextFontFamily,TextSizeFooterParah,FooterParahTextColor,FooterParahTextWeight);

}
}
