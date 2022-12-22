package com.novo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.novo.pages.NOVOHomepage;

public class TC_131142VerifyMouseHoverFunctionality extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_131142VerifyMouseHoverFunctionality";
		testDescription ="NV_HO_001_Verify the mouse hover functionality on button/hyperlinks of the NOVO3 site";
		authors="Ravichandran";
		category ="Regression";
	}
		@Test
		public void runVerifyMouseHoverFunctionality() {
		
		new NOVOHomepage()
//		.VerifyMenuWhenMouseHover()
		.VerifyMouseHoverFunctionality();
}
}
