package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131108_VerificationNavigationofFooterLinks extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131108_VerificationNavigationofFooterLinks";
		testDescription ="NV_GF_002_Verify the functionality of the links and logo present in the Global Footer section of the NOVO3 Website";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131108";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerificationNavigationofFooterLinks(String Policytxtlink,String ContactUstxtlink,String BAUSCHLOMBlogolink,String ColiforniahrefLink,String LegalNoticetxtlink) {
		
		new NOVOHomepage()
		.VerifyNavigationOfPrivacyPlcy(Policytxtlink)
		.VerifyNavigationOfContactUs(ContactUstxtlink)
		.VerifyNavigationOfLogo(BAUSCHLOMBlogolink)
		.VerifyNavigationOfColiforniaLink(ColiforniahrefLink)
		.VerifyNavigationOfLegalNotice(LegalNoticetxtlink);
		

}
}
