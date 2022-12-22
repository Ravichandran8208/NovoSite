package com.novo.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131113VerifyFontPropInOffsite extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131113VerifyFontPropInOffsite ";
		testDescription ="NV_OP_002_Verify the font properties of the content present in the offsite popup of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
		excelFileName="TC_131113";
		sheetName="Sheet1";
	}
	
		@org.testng.annotations.Test(dataProvider = "fetchData")
		public void runVerifyFontPropInOffsite(String offsiteHeadingclr,String TextFontFamily,String offsiteHeadingSize,String offsiteHeadingWeight,String offsiteParah1Clr,String TextFontFamily1,String offsiteParah1Size,String offsiteParah1Weight,String offsiteParah2Clr,String TextFontFamily2,String offsiteParah2Size,String offsiteParah2Weight,String okButtonClr,String TextFontFamily3,String OffsiteOkBtnSize,String OffsiteOkBtnWeight,String cancelButtnclr,String TextFontFamily4,String OffsiteCancelBtnSize,String cancelButtnWeight) {
			new NOVOHomepage()
			.verifyFontPropoffsitepopup( offsiteHeadingclr, TextFontFamily, offsiteHeadingSize, offsiteHeadingWeight, offsiteParah1Clr, TextFontFamily1, offsiteParah1Size, offsiteParah1Weight, offsiteParah2Clr, TextFontFamily2, offsiteParah2Size, offsiteParah2Weight, okButtonClr, TextFontFamily3, OffsiteOkBtnSize, OffsiteOkBtnWeight, cancelButtnclr, TextFontFamily4, OffsiteCancelBtnSize, cancelButtnWeight);
}
}
