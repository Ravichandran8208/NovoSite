package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131135VerifyTheTooltipInSec7 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131135VerifyTheTooltipInSec7";
		testDescription ="NV_TT_001_Verify the tooltip displayed for each hyperlink and logo/image present in the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131135";
		sheetName="Sheet1";
	}
		@Test(dataProvider = "fetchData")
		public void runVerifyTheTooltipInSec7 (String CTAInSec7_1link,String CTAInSec7_2link,String CTAInSec7_3link,String CTAInSec7_4link,String CTAInSec7_5link,String CTAInSec7_6link,String CTAInSec7_7link) {
		
		new NOVOHomepage()
		.VerifyTooltipInSec7( CTAInSec7_1link, CTAInSec7_2link, CTAInSec7_3link, CTAInSec7_4link, CTAInSec7_5link, CTAInSec7_6link, CTAInSec7_7link);

}
}
