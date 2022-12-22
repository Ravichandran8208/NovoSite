package com.novo.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131119_VerifyFontPropInSec2 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131119_VerifyFontPropInSec2";
		testDescription ="NV_HP_005_Verify the font properties of the content present on section 2 of  the Home page of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131119";
		sheetName="Sheet1";
	}
	
		@org.testng.annotations.Test(dataProvider = "fetchData")
		public void runVerifyFontPropInSec2(String HeadingSection2Clr,String HeadingSection2FontFam,String HeadingSection2Size,String HeadingSection2ClrWeight,String Heading2Section2Clr,String Heading2Section2FontFam,String Heading2Section2FontSize,String Heading2Section2FontWeight,String copytxtSec2Clr,String copytxtSec2FontFam,String copytxtSec2Size,String copytxtSec2Weight) {
			new NOVOHomepage()
			.VerifyContentFontPropinSec2( HeadingSection2Clr, HeadingSection2FontFam, HeadingSection2Size, HeadingSection2ClrWeight, Heading2Section2Clr, Heading2Section2FontFam, Heading2Section2FontSize, Heading2Section2FontWeight, copytxtSec2Clr, copytxtSec2FontFam, copytxtSec2Size, copytxtSec2Weight);

}
}
