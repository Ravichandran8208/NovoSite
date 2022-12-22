package com.novo.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131109_VerifyFooterProperties extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = " TC_131109_VerifyFooterProperties";
		testDescription ="NV_GF_003_Verify the font properties of the links, text and logo present in the Global Footer section of the NOVO3 Website";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131109";
		sheetName="Sheet1";
	}
	
		@org.testng.annotations.Test(dataProvider = "fetchData")
		public void runVerifyFooterProperties (String ParahFootertxt,String TextFontFamily,String TextSizeFooterParah,String FooterParahTextColor,String FooterParahTextWeight,String PolicyText1,String ContactUs,String BAUSCHLOMBlogoloclink,String ColiforniahrefLinktxt,String LegalNoticeText) {
		
		new NOVOHomepage()
		.VerifyTextProperties(ParahFootertxt,TextFontFamily,TextSizeFooterParah,FooterParahTextColor,FooterParahTextWeight)
		.VerifyLinkFontPropertiesInFooter( PolicyText1, ContactUs, BAUSCHLOMBlogoloclink, ColiforniahrefLinktxt, LegalNoticeText);
		

}
}