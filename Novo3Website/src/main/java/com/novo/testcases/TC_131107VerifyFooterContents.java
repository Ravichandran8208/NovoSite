package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131107VerifyFooterContents extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131107VerifyFooterContents";
		testDescription ="NV_GF_001_Verify the text, links, logo, California link and job code present in the Global Footer section of the NOVO3 Website";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131107";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyFooterContents(String BAUSCHLOMBlogolocation,String Policytxtlink,String LegalNoticetxtlink,String ContactUstxtlink,String ColiforniahrefLink,String ParahInFooter) {
		
		new NOVOHomepage()
		.VerifytheGlobalFooterSection()
		.VerifyBAUSCHLOMBlogo(BAUSCHLOMBlogolocation)
		.VerifyFotterurls( Policytxtlink, LegalNoticetxtlink, ContactUstxtlink, ColiforniahrefLink)
		.VerifyFooterText(ParahInFooter);

}
}
