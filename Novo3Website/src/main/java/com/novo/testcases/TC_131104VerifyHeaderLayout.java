package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131104VerifyHeaderLayout extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131104VerifyHeaderLayout";
		testDescription ="NV_GH_003_Verify the layout design and background color of the Global header section of the NOVO3 UNBRANDED Website";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131104";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyHeaderLayout(String HeaderLayaout,String HeaderSizeWhenScroll,String HeaderClr) {
		
		new NOVOHomepage()
		.VerifyHeaderLayout(HeaderLayaout,HeaderSizeWhenScroll,HeaderClr);

}
}
