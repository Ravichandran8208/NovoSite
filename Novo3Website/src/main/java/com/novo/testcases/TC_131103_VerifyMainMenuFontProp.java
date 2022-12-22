package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131103_VerifyMainMenuFontProp extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131103_VerifyMainMenuFontProp";
		testDescription ="NV_GH_002_Verify the functionalities and font properties of the main menus present in the Global header section of the NOVO3 website";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131103";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyMenuFontProp(String ExamineEvaporationTextColor,String ExamineEvaporationTextWeight,String ExamineEvaporationmenuTextSize,String ExamineEvaporationTextFontFamily,String TaketheSurveyTextColor,String TaketheSurveyTextWeight,String TaketheSurveyTextSize,String TaketheSurveyTextFontFamily,String GetUpdatesTextColor,String GetUpdatesTextWeight,String GetUpdatesTextSize,String GetUpdatesTextFontFamily,String ReviewLiteratureTextColor,String ReviewLiteratureTextWeight,String ReviewLiteratureTextSize,String ReviewLiteratureTextFontFamily) {
		
		new NOVOHomepage()
		.VerifyPropertiesExamineEvaporationmenu( ExamineEvaporationTextColor, ExamineEvaporationTextWeight, ExamineEvaporationmenuTextSize, ExamineEvaporationTextFontFamily)
		.VerifyPropertiesTaketheSurveyMenu(ExamineEvaporationTextColor, ExamineEvaporationTextWeight, ExamineEvaporationmenuTextSize, ExamineEvaporationTextFontFamily)
		.VerifyPropertiesGetUpdatesMenu( GetUpdatesTextColor, GetUpdatesTextWeight, GetUpdatesTextSize, GetUpdatesTextFontFamily)
		.verifyPropertiesReviewLiteratureMenu( ReviewLiteratureTextColor, ReviewLiteratureTextWeight, ReviewLiteratureTextSize, ReviewLiteratureTextFontFamily);
		

}
}
