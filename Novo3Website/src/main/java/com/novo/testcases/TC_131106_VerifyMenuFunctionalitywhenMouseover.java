package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131106_VerifyMenuFunctionalitywhenMouseover extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131106_VerifyMenuFunctionalitywhenMouseover";
		testDescription ="NV_GH_005_Verify the mouse hover functionality of the main navigation menus available in the header section of the NOVO3 Website";
		authors="Ravichandran";
		category ="Regression";
	}
		@Test
		public void runVerifyMenuFunctionalitywhenMouseover() {
		
		new NOVOHomepage()
		.VerifyMenuWhenMouseHover();
		
}
}
