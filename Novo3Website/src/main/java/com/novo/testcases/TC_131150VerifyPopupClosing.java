package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131150VerifyPopupClosing extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131150VerifyPopupClosing";
		testDescription ="NV_PP_001_Verify that popup window is not getting closed when clicked outside of popup window area ";
		authors="Ravichandran";
		category ="Regression";
	}
		@Test
		public void runVerifyPopupClosing() {
		
		new NOVOHomepage()
		.VerifyPopupNotClosedWhenClickOutSide();

}
}
