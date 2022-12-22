package com.novo.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131112_verifyOffsiteLinksContentIcon extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131112_verifyOffsiteLinksContentIcon";
		testDescription ="NV_OP_001_Verify the icon, content and links present in the offsite popup of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131112";
		sheetName="Sheet1";
	}
	
		@org.testng.annotations.Test(dataProvider = "fetchData")
		public void runverifyOffsiteLinksContentIcon(String offsiteHeadingTXT,String offsiteParah1TXT,String offsiteParah2TXT,String OffsiteokButtonUrl,String HomePageUrl) {
			new NOVOHomepage()
			.VerifyOffsitepopupcontentsIconLinks( offsiteHeadingTXT, offsiteParah1TXT, offsiteParah2TXT, OffsiteokButtonUrl, HomePageUrl);
		}

}
