package com.framework.testng.api.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {

	public static Properties prop;

//	public static String lrnNum, sinNum, regNo, quickRegNo, EmergencyRegNo,
//	BillNo,department,emergencyUHID,bedCode,epNumber,OPPNo,ahcNum,AppointmentID,
//	creditNoteBillNo,TransactionID;


	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName, sheetName);
	}

//	public static String s="UAT", username, password;

	@BeforeMethod
	public void preCondition() throws IOException {
		try {
			FileInputStream config = new FileInputStream("./src/main/resources/config.properties");
			prop = new Properties();
			prop.load(config);
			startApp(prop.getProperty("browser"), false, prop.getProperty("Uat"));
			setNode();
			//username = prop.getProperty("Uat_username");
			//password = prop.getProperty("Uat_password");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@AfterMethod
	public void postCondition() {
//		pause(8000);
		// close();
		quit();
	}

}
