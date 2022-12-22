package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131101_VerifyHomepage extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131101_VerifyHomepage";
		testDescription = "NV_SM_001_Verify the Sitemap implementation for the NOVO3 website";
		authors = "Ravichandran";
		category = "Regression";
		excelFileName = "TC_131101";
		sheetName = "Sheet1";
		// excelFileName="OPBilling_Data_Sheet";
		// sheetName="TC_001";
	}

	@Test(dataProvider = "fetchData")

	public void runVerifyHomepage(String PageTitle, String evaporationurlUrl1, String survey_URLUrl2,
			String GetUpdatesurl, String ReviewLiteratureurl) {

		new NOVOHomepage().VerifyHomePage(PageTitle)
		.ClickandVerifyExamineEvaporationmenu(evaporationurlUrl1)
		  .ClickandVerifyTaketheSurveyMenu(survey_URLUrl2)
		  .ClickandVerifyGetUpdatesMenu(GetUpdatesurl)
		  .ClickandverifyReviewLiteratureMenu(ReviewLiteratureurl);
		 
		 

	}
}