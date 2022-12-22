package com.novo.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NOVOHomepage extends ProjectSpecificMethods{
	public static 	WebElement text1,text2,text3,text4 ;

	WebElement Policytxt,LegalNoticetxt,ContactUstxt;

	public NOVOHomepage VerifyHomePage(String PageTitle) {
		verifyTitle(PageTitle);
		getAllUrl();


		//		WebElement	textMenu1 = locateElement(Locators.XPATH, "//a[text()='Examine Evaporation ']");
		//
		//		verifyExactText1(textMenu1, "Examine Evap");

		return this;
	}
	public NOVOHomepage ClickandVerifyExamineEvaporationmenu(String evaporationurlUrl1) {
		pause(2000);
		WebElement ele = locateElement(Locators.XPATH, "//a[text()='Examine Evaporation ']");
		//		verifytextLocation(ele, "(280, 26)");
		//		reportStep("Examine Evaporation Location Checked Sucessfully", "info");
		pause(2000);
		click(Locators.XPATH, "//a[text()='Examine Evaporation ']");
		reportStep("Examine Evaporation clicked sucessfully", "pass");
		pause(2000);
		verifyUrl(evaporationurlUrl1);
		return this;
	}
	public NOVOHomepage ClickandVerifyTaketheSurveyMenu(String survey_URLUrl2) {
		pause(2000);
		click(Locators.XPATH, "//a[text()='Take the Survey']");
		reportStep("Take the Survey clicked sucessfully", "pass");
		pause(2000);
		verifyUrl(survey_URLUrl2);
		return this;
	}
	public NOVOHomepage ClickandVerifyGetUpdatesMenu(String GetUpdatesurl) {
		pause(2000);
		click(Locators.XPATH, "//a[text()='Get Updates']");
		reportStep("Get Updates clicked sucessfully", "pass");
		pause(2000);
		verifyUrl(GetUpdatesurl);

		return this;
	}
	public NOVOHomepage ClickandverifyReviewLiteratureMenu(String ReviewLiteratureurl) {
		pause(2000);
		click(Locators.XPATH, "//a[text()='Review Literature']");
		reportStep("Review Literature clicked sucessfully", "pass");
		pause(2000);
		verifyUrl(ReviewLiteratureurl);

		return this;
	}

	public NOVOHomepage VerifyPropertiesExamineEvaporationmenu(String ExamineEvaporationTextColor,String ExamineEvaporationTextWeight,String ExamineEvaporationmenuTextSize,String ExamineEvaporationTextFontFamily) {
		pause(2000);
		text1 = locateElement(Locators.XPATH, "//a[text()='Examine Evaporation ']");
		//		verifytextLocation(text1, "(280, 26)");
		pause(2000);
		verifytextBackgroundColor(text1,ExamineEvaporationTextColor);
		pause(2000);
		verifytextWeight(text1,ExamineEvaporationTextWeight);
		pause(2000);
		verifytextSize(text1,ExamineEvaporationmenuTextSize);
		pause(2000);
		verifytextFamily(text1,ExamineEvaporationTextFontFamily);
		reportStep("Examine Evaporation Menu Properties Checked succesfully", "info");
		return this;
	}

	public NOVOHomepage VerifyPropertiesTaketheSurveyMenu(String TaketheSurveyTextColor,String TaketheSurveyTextWeight,String TaketheSurveyTextSize,String TaketheSurveyTextFontFamily) {
		pause(2000);
		text2 = locateElement(Locators.XPATH, "//a[text()='Take the Survey']");
		pause(2000);
		verifytextBackgroundColor(text1,TaketheSurveyTextColor);
		pause(2000);
		verifytextWeight(text2,TaketheSurveyTextWeight);
		pause(2000);
		verifytextSize(text2,TaketheSurveyTextSize);
		pause(2000);
		verifytextFamily(text2,TaketheSurveyTextFontFamily);
		reportStep("Take the Survey Menu Properties Checked succesfully", "info");

		return this;
	}

	public NOVOHomepage VerifyPropertiesGetUpdatesMenu(String GetUpdatesTextColor,String GetUpdatesTextWeight,String GetUpdatesTextSize,String GetUpdatesTextFontFamily) {
		pause(2000);
		text3 = locateElement(Locators.XPATH, "//a[text()='Get Updates']");

		pause(2000);
		verifytextBackgroundColor(text1,GetUpdatesTextColor);
		pause(2000);
		verifytextWeight(text3,GetUpdatesTextWeight);
		pause(2000);
		verifytextSize(text3,GetUpdatesTextSize);
		pause(2000);
		verifytextFamily(text3,GetUpdatesTextFontFamily);
		reportStep("Get Updates Menu Properties Checked succesfully", "info");
		return this;
	}

	public NOVOHomepage verifyPropertiesReviewLiteratureMenu(String ReviewLiteratureTextColor,String ReviewLiteratureTextWeight,String ReviewLiteratureTextSize,String ReviewLiteratureTextFontFamily) {
		pause(2000);
		text4 = locateElement(Locators.XPATH, "//a[text()='Review Literature']");

		pause(2000);
		verifytextBackgroundColor(text1,ReviewLiteratureTextColor);
		pause(2000);
		verifytextWeight(text4,ReviewLiteratureTextWeight);
		pause(2000);
		verifytextSize(text4,ReviewLiteratureTextSize);
		pause(2000);
		verifytextFamily(text4,ReviewLiteratureTextFontFamily);
		reportStep("Review Literature Menu Properties Checked succesfully", "info");
		return this;
	}
	public NOVOHomepage verifyLogo(String LogoLocation,String LogoAlign  ) {
		pause(2000);
		//		WebElement logo = locateElement(Locators.XPATH ,"//a[text()='POVonDED']");
		//		verifyExactText(logo, "POVonDED");
		//		reportStep("Logo text Matched sucessfully", "pass");
		WebElement Logo = locateElement(Locators.CLASS_NAME, "banner-icon");
		verifytextLocation(Logo,LogoLocation);
		verifytextAlign(Logo,LogoAlign);
		reportStep("Logo  displayed in center Sucessfully","info");

		return this;
	}
	public NOVOHomepage verifymainMenuPresence(String ExamineEvaporationlocation,String TaketheSurveylocation,String GetUpdateslocation,String ReviewLiteraturelocation) {
		pause(2000);
		//VerifyPropertiesExamineEvaporationmenu();
		//System.out.println("dfdgdfgdf  "+text1);
		WebElement	textMenu1 = locateElement(Locators.XPATH, "//a[text()='Examine Evaporation ']");
		WebElement textMenu2 = locateElement(Locators.XPATH, "//a[text()='Take the Survey']");
		WebElement textMenu3 = locateElement(Locators.XPATH, "//a[text()='Get Updates']");
		WebElement textMenu4 = locateElement(Locators.XPATH, "//a[text()='Review Literature']");


		pause(2000);
		verifyExactText1(textMenu1, "Examine Evaporation");
		verifytextLocation(textMenu1,ExamineEvaporationlocation );
		pause(2000); 
		//		verifyExactText(textMenu2, "Take the Survey"); 
		verifytextLocation(textMenu2, TaketheSurveylocation);
		pause(2000);
		//		verifyExactText(textMenu3, "Get Updates"); 
		verifytextLocation(textMenu3, GetUpdateslocation);
		pause(2000);
		//		verifyExactText(textMenu4,"Review Literature");
		verifytextLocation(textMenu4, ReviewLiteraturelocation);

		reportStep("Menu texts are Matched sucessfully in Global Header", "pass");


		return this;
	}
	public  NOVOHomepage VerifyHeader(String headerClr) {
		WebElement header = locateElement(Locators.XPATH, "//header[@id='header-nav']");
		System.out.println(header.getLocation());
		verifytextBackgroundColor(header,headerClr);
		WebElement img = locateElement(Locators.XPATH, "//img[@class='multifactor-icon lazy']");
		scrollToElement(img);
		reportStep("When Scroll down the page menu headers are sticky header for the NOVO3 Website Displayed sucessfully" , "pass");
		return this;

	}
	public  NOVOHomepage VerifyMenuWhenMouseHover() {
		WebElement	textMenu1 = locateElement(Locators.XPATH, "//a[text()='Examine Evaporation ']");
		WebElement textMenu2 = locateElement(Locators.XPATH, "//a[text()='Take the Survey']");
		WebElement textMenu3 = locateElement(Locators.XPATH, "//a[text()='Get Updates']");
		WebElement textMenu4 = locateElement(Locators.XPATH, "//a[text()='Review Literature']");
		moveToElement(textMenu1);
		reportStep("Examine Evaporation menu is higlighted when Mouse Hover Successfully", "pass");
		moveToElement(textMenu2);
		reportStep("Take the Survey menu is higlighted when Mouse Hover Successfully", "pass");
		moveToElement(textMenu3);
		reportStep("Get Updates menu is higlighted when Mouse Hover Successfully", "pass");
		moveToElement(textMenu4);
		reportStep("Review Literature menu is higlighted when Mouse Hover Successfully", "pass");
		return this;

	}
	public  NOVOHomepage VerifytheGlobalFooterSection() {
		pause(2000);

		Policytxt = locateElement(Locators.XPATH, "//a[text()='Privacy Policy']");
		pause(2000);
		LegalNoticetxt = locateElement(Locators.XPATH, "//a[text()='Legal Notice']");
		pause(2000);

		ContactUstxt = locateElement(Locators.XPATH, "//a[text()='Contact Us ']");
		pause(2000);
		scrollToElement(Policytxt);
		reportStep("Policytxt is Displayed in left side Successfully", "info");
		pause(2000);
		//		Policytxt.getLocation();
		pause(2000);
		scrollToElement(LegalNoticetxt);
		reportStep("LegalNoticetxt is Displayed in left side Successfully", "info");
		pause(2000);
		scrollToElement(ContactUstxt);
		reportStep("ContactUstxt is Displayed in left side Successfully", "pass");

		//		verifytextAlign(Policytxt, prop.getProperty("policytxtAlign"));
		//		reportStep("Policytxt is Displayed in left side Successfully", "pass");
		//		verifytextAlign(LegalNoticetxt, prop.getProperty("policytxtAlign"));
		//		reportStep("LegalNoticetxt is Displayed in left side Successfully", "info");
		//		verifytextAlign(ContactUstxt, prop.getProperty("policytxtAlign"));
		//		reportStep("ContactUstxt is Displayed in left side Successfully", "info");
		return this;
	}
	public  NOVOHomepage VerifyBAUSCHLOMBlogo(String BAUSCHLOMBlogolocation) {
		pause(2000);

		WebElement BAUSCHLOMBlogo = locateElement(Locators.XPATH, "//img[@alt='Bausch + Lomb Logo']");
		pause(2000);
		scrollToElement(BAUSCHLOMBlogo);
		verifytextLocation(BAUSCHLOMBlogo,BAUSCHLOMBlogolocation);
		reportStep("LogoLocation Matched Successfully", "pass");
		//		scrollToElement(BAUSCHLOMBlogo);

		//		verifyExactAttribute(BAUSCHLOMBlogo,"href"," /siteassets/img/img-325x25-bh-logo.png"); 
		//		verifytextLocation(BAUSCHLOMBlogo, "(536, 26)");
		return this;

	}
	public  NOVOHomepage VerifyFotterurls(String Policytxtlink,String LegalNoticetxtlink,String ContactUstxtlink,String ColiforniahrefLink ) {
		WebElement ColiforniaLink = locateElement(Locators.XPATH, "//a[text()='DO NOT SELL MY PERSONAL INFORMATION']");
		Policytxt = locateElement(Locators.XPATH, "//a[text()='Privacy Policy']");
		verifyExactAttribute(Policytxt,"href",Policytxtlink);
		reportStep("Policytxt has one link is matched sucessfully", "info");
		verifyExactAttribute(LegalNoticetxt,"href",LegalNoticetxtlink);
		reportStep("LegalNoticetxt has one link is matched sucessfully", "info");
		verifyExactAttribute(ContactUstxt,"href",ContactUstxtlink);
		reportStep("ContactUstxt has one link is matched sucessfully", "info");
		verifyExactAttribute(ColiforniaLink,"href",ColiforniahrefLink);
		reportStep("ColiforniaLink has one link is matched sucessfully", "info");
		return this;


	}
	public  NOVOHomepage VerifyFooterText(String ParahInFooter) {

		WebElement parah = locateElement(Locators.XPATH, "//div[@class='refrence-text']//p[1]");

		System.out.println("test : "+parah.getText());
		verifyExactText(parah,ParahInFooter);
		reportStep("Footer Text are Mathed Succesfully", "info");
		return this;
	}
	public  NOVOHomepage VerifyNavigationOfPrivacyPlcy(String Policytxtlink) {
		Policytxt = locateElement(Locators.XPATH, "//a[text()='Privacy Policy']");
		//		pause(2000);
		//        LegalNoticetxt = locateElement(Locators.XPATH, "//a[text()='Legal Notice']");
		//        pause(2000);
		//		ContactUstxt = locateElement(Locators.XPATH, "//a[text()='Contact Us ']");
		////		pause(2000);
		//		WebElement BAUSCHLOMBlogo = locateElement(Locators.XPATH, "//body[@id='body']/div[1]/footer/div/div[2]/div/div/div/div/div[1]/div/div[1]/a/img");
		scrollToElement(Policytxt);
		pause(2000);
		click(Policytxt);
		switchToWindow("Bausch + Lomb Privacy Policy");


		//		click(Locators.XPATH,"//a[text()='Privacy Policy']");
		verifyUrl(Policytxtlink);
		close();
		switchToWindow(0);


		return this;





	}

	public  NOVOHomepage VerifyNavigationOfContactUs(String ContactUstxtlink) {

		ContactUstxt = locateElement(Locators.XPATH, "//a[text()='Contact Us ']");
		pause(2000);
		scrollToElement(ContactUstxt);
		pause(2000);
		click(ContactUstxt);
		switchToWindow("Contact Us: Bausch + Lomb");
		verifyUrl(ContactUstxtlink);
		close();
		switchToWindow(0);
		return this;

	}
	public  NOVOHomepage VerifyNavigationOfLogo(String BAUSCHLOMBlogolink) {

		WebElement BAUSCHLOMBlogo = locateElement(Locators.XPATH, "//img[@alt='Bausch + Lomb Logo']");
		pause(2000);
		scrollToElement(BAUSCHLOMBlogo);
		pause(2000);
		click(BAUSCHLOMBlogo);
		switchToWindow("Bausch + Lomb Official Home Page");
		verifyUrl(BAUSCHLOMBlogolink);
		close();
		switchToWindow(0);
		return this;

	}
	public  NOVOHomepage VerifyNavigationOfColiforniaLink(String ColiforniahrefLink) {

		WebElement ColiforniaLink = locateElement(Locators.XPATH, "//a[text()='DO NOT SELL MY PERSONAL INFORMATION']");
		pause(2000);
		scrollToElement(ColiforniaLink);
		pause(2000);
		click(ColiforniaLink);
		switchToWindow("Communication Preferences");
		verifyUrl(ColiforniahrefLink);
		close();
		switchToWindow(0);
		return this;

	}
	public  NOVOHomepage VerifyNavigationOfLegalNotice(String LegalNoticetxtlink) {

		LegalNoticetxt = locateElement(Locators.XPATH, "(//a[@href='https://www.bausch.com/terms/'])[2]");

		scrollToElement(LegalNoticetxt);
		pause(2000);
		click(LegalNoticetxt);
		switchToWindow("Legal Notice: Bausch + Lomb ");
		verifyUrl(LegalNoticetxtlink);
		close();
		switchToWindow(0);
		return this;

	}
	public  NOVOHomepage VerifyTextProperties(String ParahFootertxt,String TextFontFamily,String TextSizeFooterParah,String FooterParahTextColor,String FooterParahTextWeight ) {
		WebElement parah = locateElement(Locators.XPATH, "//body[@id='body']/div[1]/footer/div/div[1]/div/div/div/div/div/p");
		scrollToElement(parah);
		verifyPartialText(parah,ParahFootertxt);
		reportStep("Footer Text are Mathed Succesfully", "info");
		verifytextFamily(parah,TextFontFamily);
		verifytextSize(parah, TextSizeFooterParah);
		verifytextBackgroundColor(parah, FooterParahTextColor);
		verifytextWeight(parah,FooterParahTextWeight);
		return this;
	}
	public  NOVOHomepage VerifyLinkFontPropertiesInFooter(String PolicyText1,String ContactUs,String BAUSCHLOMBlogoloclink,String ColiforniahrefLinktxt,String LegalNoticeText) {
		Policytxt = locateElement(Locators.XPATH, "//a[text()='Privacy Policy']");
		verifyExactText(Policytxt, PolicyText1);
		ContactUstxt = locateElement(Locators.XPATH, "//a[text()='Contact Us ']");
		verifyExactText(ContactUstxt,ContactUs);
		WebElement BAUSCHLOMBlogo = locateElement(Locators.XPATH, "//body[@id='body']/div[1]/footer/div/div[2]/div/div/div/div/div[1]/div/div[1]/a/img");
		verifyExactAttribute(BAUSCHLOMBlogo,"src",BAUSCHLOMBlogoloclink);
		WebElement ColiforniaLink = locateElement(Locators.XPATH, "//a[text()='DO NOT SELL MY PERSONAL INFORMATION']");
		verifyExactText(ColiforniaLink,ColiforniahrefLinktxt);
		LegalNoticetxt = locateElement(Locators.XPATH, "//body[@id='body']/div[1]/footer/div/div[2]/div/div/div/div/div[2]/div/a[2]");
		verifyExactText(LegalNoticetxt,LegalNoticeText);






		return this;

	}
	public  NOVOHomepage VerifyReferenceTextinFooter(String ReferenceTextInFooter,String TextFontFamily1,String TextSizeFooterParah1,String FooterParahTextColor1,String FooterParahTextWeight1) {
		WebElement parah = locateElement(Locators.XPATH, "//body[@id='body']/div[1]/footer/div/div[1]/div/div/div/div/div/p");
		scrollToElement(parah);
		verifyExactText(parah, ReferenceTextInFooter);
		System.out.println(parah.getText());
		verifytextFamily(parah,TextFontFamily1);
		verifytextSize(parah, TextSizeFooterParah1);
		verifytextBackgroundColor(parah, FooterParahTextColor1);
		verifytextWeight(parah, FooterParahTextWeight1);



		return this;

	}
	public NOVOHomepage VerifyOffsitepopupcontentsIconLinks(String offsiteHeadingTXT,String offsiteParah1TXT,String offsiteParah2TXT,String OffsiteokButtonUrl,String HomePageUrl) {
		WebElement imgClipboard = locateElement(Locators.XPATH, "//img[@alt='Icon of a clipboard and pencil']");
		scrollToElement(imgClipboard);
		WebElement ShareOnPovButtn = locateElement(Locators.XPATH, "//a[@data-href='https://fuelinsights.com/ecp']");

		pause(2000);
		click(ShareOnPovButtn);
		WebElement offsiteHeading = locateElement(Locators.XPATH, "//h2[text()='You are now leaving POVonDED.com']");
		verifyPartialText(offsiteHeading, offsiteHeadingTXT);
		System.out.println(offsiteHeading.getText());
		WebElement offsiteParah1 = locateElement(Locators.XPATH,"//p[@class='medium-font m-b-25']");
		verifyExactText(offsiteParah1, offsiteParah1TXT);
		WebElement offsiteParah2 = locateElement(Locators.XPATH, "(//p[@class='medium-font m-b-25'])[2]");
		verifyExactText(offsiteParah2, offsiteParah2TXT);
		WebElement okButton = locateElement(Locators.XPATH, "//a[text()='Cancel']/following-sibling::a");
		pause(2000);
		click(okButton);
		pause(2000);
		switchToWindow("Dry Eye Disease ECP Perspective Survey | Fuel Insights");
		System.out.println(getDriver().getCurrentUrl());
		verifyUrl(OffsiteokButtonUrl);
		pause(2000);
		close();
		switchToWindow(0);
		click(ShareOnPovButtn);
		WebElement cancelButtn = locateElement(Locators.XPATH, "//a[text()='Cancel']");
		pause(2000);
		click(cancelButtn);
		switchToWindow("Home | POVonDED");
		verifyUrl(HomePageUrl);


		return this;
	}
	public  NOVOHomepage VerifyEyeIconStyle(String EyeIconClr,String EyeImgLoc) {
		WebElement img = locateElement(Locators.XPATH,"//img[@alt='Icon of an evaporative eye']");
		verifytextBackgroundColor(img, EyeIconClr);
		verifytextLocation(img,EyeImgLoc);
		verifyDisplayed(img);
		reportStep("img is displayed in HomePage", "pass");


		return this;
	}
	public NOVOHomepage VerifyCTAandHeadingsubHeadingCopyandCTA(String examineEvaHeading,String SubHeading1,String CpyTxt1) {
		WebElement Heading = locateElement(Locators.XPATH,"//h1[text()='Examining Evaporation']");
		verifyExactText1(Heading, examineEvaHeading);
		WebElement SubHeading = locateElement(Locators.XPATH,"//h2[text()='THE ENGINE THAT POWERS DED']");
		verifyExactText(SubHeading, SubHeading1);
		WebElement copytxt = locateElement(Locators.XPATH,"(//p[@class='parafont'])[1]");
		System.out.println("Txt::"+copytxt.getText());
		verifyExactText(copytxt, CpyTxt1);
		WebElement signupButton = locateElement(Locators.XPATH,"//a[@class='btn signup-btn']");
		verifyDisplayed(signupButton);



		return this;


	}
	public  NOVOHomepage verifyBelowSignupButtonContents() {
		WebElement Attendtxt = locateElement(Locators.XPATH,"//body[@id='body']/div[1]/section[1]/div/div[2]/div/div/div[2]/div[1]/div/h2");
		scrollToElement(Attendtxt);
		verifyExactText(Attendtxt, prop.getProperty("Attendtxt"));
		WebElement parah = locateElement(Locators.XPATH,"//body[@id='body']/div[1]/section[1]/div/div[2]/div/div/div[2]/div[2]/div[1]/p");
		verifyExactText1(parah, prop.getProperty("Belowsgnupbtnphara"));
		WebElement datetxt = locateElement(Locators.XPATH,"//body[@id='body']/div[1]/section[1]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/p[1]/strong");
		verifyExactText1(datetxt,prop.getProperty("Belowsgnupdatebtntxt"));
		WebElement timetxt = locateElement(Locators.XPATH,"//body[@id='body']/div[1]/section[1]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/p[2]/strong");
		verifyExactText(timetxt, prop.getProperty("BelowsgnupTimebtntxt"));
		WebElement Prsenttxt = locateElement(Locators.XPATH,"//body[@id='body']/div[1]/section[1]/div/div[2]/div/div/div[2]/div[2]/div[2]/p/strong");
		verifyExactText(Prsenttxt, prop.getProperty("BelowsgnupPresenttxt"));
		return this;

	}
	public NOVOHomepage verifyBelowSignupButtonContentsProperties() {

		WebElement Attendtxt = locateElement(Locators.XPATH,"//body[@id='body']/div[1]/section[1]/div/div[2]/div/div/div[2]/div[1]/div/h2");
		scrollToElement(Attendtxt);
		verifytextFamily(Attendtxt, prop.getProperty("TextFontFamily"));
		verifytextWeight(Attendtxt, prop.getProperty("Attendtxtweight"));
		verifytextBackgroundColor(Attendtxt, prop.getProperty("Attendtxtclr"));
		verifytextSize(Attendtxt, prop.getProperty("AttendtxtSize"));
		WebElement Heading = locateElement(Locators.XPATH,"//body[@id='body']/div[1]/section[1]/div/div[2]/div/div/div[1]/div/h1");
		verifytextFamily(Heading, prop.getProperty("TextFontFamily"));
		verifytextWeight(Heading, prop.getProperty("BelowsgnupbtnHeadingWeight"));
		verifytextBackgroundColor(Heading, prop.getProperty("BelowsgnupbtnHeadingClr"));
		verifytextSize(Heading, prop.getProperty("BelowsgnupbtnHeadingSize"));
		WebElement SubHeading = locateElement(Locators.XPATH,"//body[@id='body']/div[1]/section[1]/div/div[2]/div/div/div[1]/div/h2");
		verifytextFamily(SubHeading, prop.getProperty("TextFontFamily"));
		verifytextWeight(SubHeading, prop.getProperty("BelowsgnupbtnSubHeadingWeight"));
		verifytextBackgroundColor(SubHeading, prop.getProperty("BelowsgnupbtnSubHeadingClr"));
		verifytextSize(SubHeading, prop.getProperty("BelowsgnupbtnSubHeadingSize"));
		WebElement copytxt = locateElement(Locators.XPATH,"//body[@id='body']/div[1]/section[1]/div/div[2]/div/div/div[1]/div/p");
		verifytextFamily(copytxt, prop.getProperty("TextFontFamily"));
		verifytextWeight(copytxt, prop.getProperty("BelowsgnupbtnCopytxtWeight"));
		verifytextBackgroundColor(copytxt, prop.getProperty("BelowsgnupbtnCopytxtClr"));
		verifytextSize(copytxt, prop.getProperty("BelowsgnupbtnCopyTxtSize"));





		return this;

	}
	public  NOVOHomepage verifyoffsitepopup() {
		WebElement shareonpov = locateElement(Locators.XPATH,"//a[@data-href='https://fuelinsights.com/ecp']");
		pause(2000);
		scrollToElement(shareonpov);
		pause(2000);
		click(shareonpov);




		return this;

	}
	public  NOVOHomepage verifyFontPropoffsitepopup(String offsiteHeadingclr,String TextFontFamily,String offsiteHeadingSize,String offsiteHeadingWeight,String offsiteParah1Clr,String TextFontFamily1,String offsiteParah1Size,String offsiteParah1Weight,String offsiteParah2Clr,String TextFontFamily2,String offsiteParah2Size,String offsiteParah2Weight,String okButtonClr,String TextFontFamily3,String OffsiteOkBtnSize,String OffsiteOkBtnWeight,String cancelButtnclr,String TextFontFamily4,String OffsiteCancelBtnSize,String cancelButtnWeight) {
		WebElement imgClipboard = locateElement(Locators.XPATH, "//img[@alt='Icon of a clipboard and pencil']");
		scrollToElement(imgClipboard);
		WebElement ShareOnPovButtn = locateElement(Locators.XPATH, "//a[@data-href='https://fuelinsights.com/ecp']");

		pause(2000);
		click(ShareOnPovButtn);
		WebElement offsiteHeading = locateElement(Locators.XPATH, "//h2[text()='You are now leaving POVonDED.com']");
		verifytextBackgroundColor(offsiteHeading, offsiteHeadingclr);
		verifytextFamily(offsiteHeading, TextFontFamily);
		verifytextSize(offsiteHeading, offsiteHeadingSize);
		verifytextWeight(offsiteHeading, offsiteHeadingWeight);
		WebElement offsiteParah1 = locateElement(Locators.XPATH,"//p[text()='You are now leaving the POVonDED.com website and are going to a website that ']");
		verifytextBackgroundColor(offsiteParah1, offsiteParah1Clr);
		verifytextFamily(offsiteParah1, TextFontFamily1);
		verifytextSize(offsiteParah1, offsiteParah1Size);
		verifytextWeight(offsiteParah1, offsiteParah1Weight);
		WebElement offsiteParah2 = locateElement(Locators.XPATH, "//p[text()='Bausch + Lomb is not responsible for the content, format, maintenance, or policies of the website you are about to visit and does not endorse or monitor any content on such website.']");
		verifytextBackgroundColor(offsiteParah2, offsiteParah2Clr);
		verifytextFamily(offsiteParah2, TextFontFamily2);
		verifytextSize(offsiteParah2, offsiteParah2Size);
		verifytextWeight(offsiteParah2, offsiteParah2Weight);
		WebElement okButton = locateElement(Locators.XPATH, "//a[text()='Cancel']/following-sibling::a");
		verifytextBackgroundColor(okButton, okButtonClr);
		verifytextFamily(okButton,TextFontFamily3);
		verifytextSize(okButton,OffsiteOkBtnSize);
		verifytextWeight(okButton, OffsiteOkBtnWeight);
		WebElement cancelButtn = locateElement(Locators.XPATH, "//a[text()='Cancel']");
		verifytextBackgroundColor(cancelButtn, cancelButtnclr);
		verifytextFamily(cancelButtn, TextFontFamily4);
		verifytextSize(cancelButtn, OffsiteCancelBtnSize);
		verifytextWeight(cancelButtn, cancelButtnWeight);





		return this;


	}
	public  NOVOHomepage verifyContentSection2(String LogoAlign1,String LogoAlign2,String Heading1Section2,String Heading2Section21,String copytxtSec21,String callouttxt1) {
		WebElement imgmultiComp = locateElement(Locators.XPATH, "//img[@alt='Icon representing multiple components']");
		scrollToElement(imgmultiComp);
		verifytextAlign(imgmultiComp, LogoAlign1);
		WebElement HeadingSection2 = locateElement(Locators.XPATH, "//h4[text()='Although DED is a multifactorial disorder,']");
		verifytextAlign(HeadingSection2, LogoAlign2);
		verifyExactText(HeadingSection2, Heading1Section2);
		WebElement Heading2Section2 = locateElement(Locators.XPATH, "//h2[text()='Addressing evaporation is a key factor in achieving treatment success']");
		verifyExactText(Heading2Section2, Heading2Section21);
		WebElement copytxtSec2 = locateElement(Locators.XPATH, "//p[text()='Excessive evaporation due to meibomian gland dysfunction (MGD) is a key driver in up to 90% of the >30 million Americans experiencing DED.']");
		verifyExactText(copytxtSec2, copytxtSec21);
		WebElement im2sec2 = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/img-818x552-evaporation-circle-chart.png']");
		verifyDisplayed(im2sec2);
		WebElement callouttxt = locateElement(Locators.XPATH, "//h4[text()='Since tear osmolarity is a function of tear evaporation in either aqueous deficient dry eye or evaporative dry eye, tear hyperosmolarity arises due to evaporation from the ocular surface and, in that sense, all forms of DED are evaporative.']");
		verifyExactText(callouttxt, callouttxt1);
		return this;

	}
	public  NOVOHomepage VerifyContentFontPropinSec2(String HeadingSection2Clr,String HeadingSection2FontFam,String HeadingSection2Size,String HeadingSection2ClrWeight,String Heading2Section2Clr,String Heading2Section2FontFam,String Heading2Section2FontSize,String Heading2Section2FontWeight,String copytxtSec2Clr,String copytxtSec2FontFam,String copytxtSec2Size,String copytxtSec2Weight) {
		WebElement imgmultiComp = locateElement(Locators.XPATH, "//img[@alt='Icon representing multiple components']");
		scrollToElement(imgmultiComp);
		WebElement HeadingSection2 = locateElement(Locators.XPATH, "//h4[text()='Although DED is a multifactorial disorder,']");
		verifytextBackgroundColor(HeadingSection2, HeadingSection2Clr);
		verifytextFamily(HeadingSection2, HeadingSection2FontFam);
		verifytextSize(HeadingSection2, HeadingSection2Size);
		verifytextWeight(HeadingSection2, HeadingSection2ClrWeight);
		WebElement Heading2Section2 = locateElement(Locators.XPATH, "//h2[text()='Addressing evaporation is a key factor in achieving treatment success']");
		verifytextBackgroundColor(Heading2Section2, Heading2Section2Clr);
		verifytextFamily(Heading2Section2, Heading2Section2FontFam);
		verifytextSize(Heading2Section2,Heading2Section2FontSize);
		verifytextWeight(Heading2Section2, Heading2Section2FontWeight);
		WebElement copytxtSec2 = locateElement(Locators.XPATH, "//p[text()='Excessive evaporation due to meibomian gland dysfunction (MGD) is a key driver in up to 90% of the >30 million Americans experiencing DED.']");
		verifytextBackgroundColor(copytxtSec2, copytxtSec2Clr);
		verifytextFamily(copytxtSec2, copytxtSec2FontFam);
		verifytextSize(copytxtSec2, copytxtSec2Size);
		verifytextWeight(copytxtSec2, copytxtSec2Weight);


		return this;
	}
	public  NOVOHomepage VerifyContent_ImginSec3() {
		WebElement Sec3img = locateElement(Locators.XPATH, "//img[@alt='Icon representing evaporation']");
		scrollToElement(Sec3img);
		verifytextAlign(Sec3img, prop.getProperty("LogoAlign"));
		WebElement Sec3Heading1 = locateElement(Locators.XPATH, "//h2[text()='Excessive tear evaporation is a ']");
		verifyExactText(Sec3Heading1, prop.getProperty("Sec3Heading1"));
		WebElement Sec3copytxt1 = locateElement(Locators.XPATH, "//h4[text()='the leading cause of DED']");
		verifyExactText(Sec3copytxt1, prop.getProperty("Sec3copytxt1"));
		WebElement  Sec3copytxt2 = locateElement(Locators.XPATH, "(//p[@class='parafont'])[3]");
		verifyExactText(Sec3copytxt2, prop.getProperty("Sec3copytxt2"));
		WebElement Sec3copytxt3 = locateElement(Locators.XPATH, "//li[text()='Changes in meibum composition']");
		verifyExactText(Sec3copytxt3, prop.getProperty("Sec3copytxt3"));
		WebElement Sec3copytxt4 = locateElement(Locators.XPATH, "//li[text()='Reduced meibum on the ocular surface']");
		verifyExactText(Sec3copytxt4, prop.getProperty("Sec3copytxt4"));
		WebElement Sec3copytxt5 = locateElement(Locators.XPATH, "//li[text()='Breakdown of the tear film lipid layer']");
		verifyExactText(Sec3copytxt5, prop.getProperty("Sec3copytxt5"));
		WebElement Sec3copytxt6 = locateElement(Locators.XPATH, "//p[text()='These changes result in unchecked evaporation and tear film instability, triggering a persistent cycle that ultimately causes the symptoms of DED.']");
		verifyExactText(Sec3copytxt6, prop.getProperty("Sec3copytxt6"));
		WebElement SubHeadingSec3 = locateElement(Locators.XPATH, "//h2[text()='The cycle of DED is self-fueling']");
		verifyExactText(SubHeadingSec3, prop.getProperty("SubHeadingSec3"));
		WebElement SubStringInHeadingSec3 = locateElement(Locators.XPATH, "(//sup[text()='1'])[3]");
		verifyExactText(SubStringInHeadingSec3, prop.getProperty("SubStringInHeadingSec3"));
		WebElement Sec3Parah = locateElement(Locators.XPATH, "//p[text()='The disruption of tear film homeostasis leads to increased evaporation and decreased tear production, thereby triggering inflammation and ocular surface damage.']");
		verifyExactText(Sec3Parah, prop.getProperty("Sec3Parah"));
		return this;

	}
	public  NOVOHomepage VerifyFontPropertiesSec3() {
		WebElement Sec3Heading1 = locateElement(Locators.XPATH, "//h2[text()='Excessive tear evaporation is a ']");
		verifytextFamily(Sec3Heading1, prop.getProperty("TextFontFamily"));
		verifytextBackgroundColor(Sec3Heading1, prop.getProperty("Attendtxtclr"));
		verifytextSize(Sec3Heading1, prop.getProperty("offsiteHeadingSize"));
		verifytextWeight(Sec3Heading1, prop.getProperty("offsiteHeadingWeight"));
		WebElement SubHeadingSec3 = locateElement(Locators.XPATH, "//h2[text()='The cycle of DED is self-fueling']");
		verifytextFamily(SubHeadingSec3, prop.getProperty("TextFontFamily"));
		verifytextBackgroundColor(SubHeadingSec3, prop.getProperty("offsiteHeadingclr"));
		verifytextSize(SubHeadingSec3, prop.getProperty("offsiteHeadingSize"));
		verifytextWeight(SubHeadingSec3, prop.getProperty("offsiteHeadingWeight"));
		WebElement Sec3Parah = locateElement(Locators.XPATH, "//p[text()='The disruption of tear film homeostasis leads to increased evaporation and decreased tear production, thereby triggering inflammation and ocular surface damage.']");
		verifytextFamily(Sec3Parah, prop.getProperty("TextFontFamily"));
		verifytextBackgroundColor(Sec3Parah, prop.getProperty("offsiteHeadingclr"));
		verifytextSize(Sec3Parah, prop.getProperty("BelowsgnupbtnCopyTxtSize"));
		verifytextWeight(Sec3Parah, prop.getProperty("offsiteParah1Weight"));
		WebElement Sec3copytxt1 = locateElement(Locators.XPATH, "//h4[text()='the leading cause of DED']");
		verifytextFamily(Sec3copytxt1, prop.getProperty("TextFontFamily"));
		verifytextBackgroundColor(Sec3copytxt1, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(Sec3copytxt1, prop.getProperty("offsiteParah1Size"));
		verifytextWeight(Sec3copytxt1, prop.getProperty("offsiteParah1Weight"));
		WebElement  Sec3copytxt2 = locateElement(Locators.XPATH, "//p[text()='MGD causes a loss of tear film homeostasis and is characterized by']");
		verifytextFamily(Sec3copytxt2, prop.getProperty("TextFontFamily"));
		verifytextBackgroundColor(Sec3copytxt2, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(Sec3copytxt2, prop.getProperty("BelowsgnupbtnCopyTxtSize"));
		verifytextWeight(Sec3copytxt2, prop.getProperty("offsiteParah1Weight"));
		WebElement Sec3copytxt3 = locateElement(Locators.XPATH, "//li[text()='Changes in meibum composition']");
		verifytextFamily(Sec3copytxt3, prop.getProperty("TextFontFamily"));
		verifytextBackgroundColor(Sec3copytxt3, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(Sec3copytxt3, prop.getProperty("BelowsgnupbtnCopyTxtSize"));
		verifytextWeight(Sec3copytxt3, prop.getProperty("offsiteParah1Weight"));
		WebElement Sec3copytxt4 = locateElement(Locators.XPATH, "//li[text()='Reduced meibum on the ocular surface']");
		verifytextFamily(Sec3copytxt4, prop.getProperty("TextFontFamily"));
		verifytextBackgroundColor(Sec3copytxt4, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(Sec3copytxt4, prop.getProperty("BelowsgnupbtnCopyTxtSize"));
		verifytextWeight(Sec3copytxt4, prop.getProperty("offsiteParah1Weight"));
		WebElement Sec3copytxt5 = locateElement(Locators.XPATH, "//li[text()='Breakdown of the tear film lipid layer']");
		verifytextFamily(Sec3copytxt5, prop.getProperty("TextFontFamily"));
		verifytextBackgroundColor(Sec3copytxt5, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(Sec3copytxt5, prop.getProperty("BelowsgnupbtnCopyTxtSize"));
		verifytextWeight(Sec3copytxt5, prop.getProperty("offsiteParah1Weight"));
		WebElement Sec3copytxt6 = locateElement(Locators.XPATH, "//p[text()='These changes result in unchecked evaporation and tear film instability, triggering a persistent cycle that ultimately causes the symptoms of DED.']");
		verifytextFamily(Sec3copytxt6, prop.getProperty("TextFontFamily"));
		verifytextBackgroundColor(Sec3copytxt6, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(Sec3copytxt6, prop.getProperty("BelowsgnupbtnCopyTxtSize"));
		verifytextWeight(Sec3copytxt6, prop.getProperty("offsiteParah1Weight"));
		return this;

	}

	public NOVOHomepage VerifyAltTagOfImageInSec3(String img1inSec3alt1/* ,String img2inSec3alt2,String img3inSec3alt3,String img4inSec3alt4 */) {
		WebElement img1inSec3 = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/icon-157x156-cycle-disruption-icon.png']");
		verifyExactAttribute(img1inSec3, "alt", img1inSec3alt1);
		WebElement img2inSec3 = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/icon-184x184-cycle-evap-icon.png']");
		verifyExactAttribute(img2inSec3, "alt", img1inSec3alt1);
		WebElement img3inSec3 = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/icon-177x140-icycle-tear-icon.png']");
		verifyExactAttribute(img3inSec3, "alt", img1inSec3alt1);
		WebElement img4inSec3 = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/icon-174x106-cycle-inflammation-icon.svg']");
		verifyExactAttribute(img4inSec3, "alt", img1inSec3alt1);
		return this;
	}
	public  NOVOHomepage VerifyContent_ImginSec4() {
		WebElement imgInSec4 = locateElement(Locators.XPATH, "//img[@alt='Icon of a magnifying glass with a question mark inside']");
		scrollToElement(imgInSec4);
		verifytextAlign(imgInSec4, prop.getProperty("LogoAlign"));
		WebElement HeadingInSec4 = locateElement(Locators.XPATH, "//h2[text()='Evaporation in DED is largely unaddressed']");
		verifyExactText(HeadingInSec4, prop.getProperty("HeadingInSec4"));
		WebElement Copytxt0InSec4 = locateElement(Locators.XPATH, "//h2[text()='Evaporation in DED is largely unaddressed']/following-sibling::h4");
		verifyExactText(Copytxt0InSec4, prop.getProperty("Copytxt0InSec4"));
		WebElement Copytxt1InSec4 = locateElement(Locators.XPATH, "//span[text()='eye drop designed to target evaporation']");
		verifyExactText(Copytxt1InSec4, prop.getProperty("Copytxt1InSec4"));
		WebElement Copytxt2InSec4 = locateElement(Locators.XPATH, "//p[text()='Three main contributors to the cycle of DED are aqueous deficiency, inflammation, and excessive evaporation.']");
		verifyExactText(Copytxt2InSec4, prop.getProperty("Copytxt1InSec4"));
		WebElement Copytxt3InSec4 = locateElement(Locators.XPATH, "//p[text()='Over-the-counter products (OTCs) that offer short-term relief often lack robust, rigorous studies or FDA approval. They have utility but may not be ideal therapy for all patients with chronic and potentially severe DED.']");
		verifyExactText(Copytxt3InSec4, prop.getProperty("Copytxt3InSec4"));
		WebElement Copytxt4InSec4 = locateElement(Locators.XPATH, "//p[text()='Low adherence and high rates of discontinuation suggest that ']");
		verifyExactText(Copytxt4InSec4, prop.getProperty("Copytxt4InSec4"));
		WebElement Copytxt5InSec4 = locateElement(Locators.XPATH, "//span[text()='there may be significant unmet needs among patients with DED that [are] not being addressed by the currently available immunomodulatory agents.']");
		verifyExactText(Copytxt5InSec4, prop.getProperty("Copytxt5InSec4"));
		WebElement Copytxt6InSec4 = locateElement(Locators.XPATH, "//sup[text()='14']");
		verifyExactText(Copytxt6InSec4, prop.getProperty("Copytxt6InSec4"));
		WebElement Copytxt7InSec4 = locateElement(Locators.XPATH, "//span[text()='—White DE et al.']");
		verifyExactText(Copytxt7InSec4, prop.getProperty("Copytxt7InSec4"));
		WebElement Copytxt8InSec4 = locateElement(Locators.XPATH, "//span[text()='Clin Ophthalmol.']");
		verifyExactText(Copytxt8InSec4, prop.getProperty("Copytxt8InSec4"));
		WebElement Copytxt9InSec4 = locateElement(Locators.XPATH, "//p[text()=' 2019']");
		verifyExactText(Copytxt9InSec4, prop.getProperty("Copytxt9InSec4"));

		return this;


	}
	public  NOVOHomepage VerifyFontPropertiesInSec4() {
		WebElement imgInSec4 = locateElement(Locators.XPATH, "//img[@alt='Icon of a magnifying glass with a question mark inside']");
		scrollToElement(imgInSec4);
		WebElement HeadingInSec4 = locateElement(Locators.XPATH, "//h2[text()='Evaporation in DED is largely unaddressed']");
		verifytextBackgroundColor(HeadingInSec4, prop.getProperty("Attendtxtclr"));
		verifytextFamily(HeadingInSec4, prop.getProperty("TextFontFamily"));
		verifytextSize(HeadingInSec4, prop.getProperty("offsiteHeadingSize"));
		verifytextWeight(HeadingInSec4, prop.getProperty("offsiteHeadingWeight"));
		WebElement Copytxt0InSec4 = locateElement(Locators.XPATH, "//h2[text()='Evaporation in DED is largely unaddressed']/following-sibling::h4");
		verifytextBackgroundColor(Copytxt0InSec4, prop.getProperty("BlackColor"));
		verifytextFamily(Copytxt0InSec4, prop.getProperty("TextFontFamily"));
		verifytextSize(Copytxt0InSec4, prop.getProperty("copytxtSec4Size"));
		verifytextWeight(Copytxt0InSec4, prop.getProperty("offsiteParah1Weight"));
		WebElement Copytxt2InSec4 = locateElement(Locators.XPATH, "//p[text()='Three main contributors to the cycle of DED are aqueous deficiency, inflammation, and excessive evaporation.']");
		verifytextBackgroundColor(Copytxt0InSec4, prop.getProperty("BlackColor"));
		verifytextFamily(Copytxt0InSec4, prop.getProperty("TextFontFamily"));
		verifytextSize(Copytxt0InSec4, prop.getProperty("copytxtSec4Size"));
		verifytextWeight(Copytxt0InSec4, prop.getProperty("offsiteParah1Weight"));
		WebElement Copytxt4InSec4 = locateElement(Locators.XPATH, "//p[text()='Low adherence and high rates of discontinuation suggest that ']");
		verifytextBackgroundColor(Copytxt0InSec4, prop.getProperty("BlackColor"));
		verifytextFamily(Copytxt0InSec4, prop.getProperty("TextFontFamily"));
		verifytextSize(Copytxt0InSec4, prop.getProperty("copytxtSec4Size"));
		verifytextWeight(Copytxt0InSec4, prop.getProperty("BelowsgnupbtnCopytxtWeight"));
		return this;
	}
	public  NOVOHomepage VerifyContent_ImginSec5(String imgInSec5AltTag,String img1InSec5Align,String Heading1InSec5,String SubHeading1InSec5,String CopyTxt1InSec5,String CTA1InSec5,String Popup1OkUrl) {
		WebElement imgInSec5 = locateElement(Locators.XPATH, "//img[@alt='Icon of a clipboard and pencil']");
		scrollToElement(imgInSec5);
		verifyExactAttribute(imgInSec5, "alt", imgInSec5AltTag);
		verifytextAlign(imgInSec5, img1InSec5Align);
		WebElement HeadingInSec5 = locateElement(Locators.XPATH, "//img[@alt='Icon of a clipboard and pencil']/following-sibling::h2[1]");
		verifyExactText(HeadingInSec5, Heading1InSec5);
		WebElement SubHeadingInSec5 = locateElement(Locators.XPATH, "//h4[text()='on the management of DED, including any challenges and unmet needs']");
		verifyExactText(SubHeadingInSec5, SubHeading1InSec5);
		WebElement CopyTxtInSec5 = locateElement(Locators.XPATH, "//p[text()='Take this short survey to give your perspective and find out how ']");
		verifyExactText(CopyTxtInSec5, CopyTxt1InSec5);
		WebElement CTAInSec5 = locateElement(Locators.XPATH, "//a[@data-href='https://fuelinsights.com/ecp']");
		verifyExactText(CTAInSec5,CTA1InSec5);
		click(CTAInSec5);
		WebElement PopupOk = locateElement(Locators.XPATH, "//a[@href='https://fuelinsights.com/ecp']");
		click(PopupOk);
		switchToWindow(prop.getProperty("ShareOnPov"));
		verifyUrl(Popup1OkUrl);



		return this;

	}
	public  NOVOHomepage VerifyFontPropertiesInSec5() {
		WebElement imgInSec5 = locateElement(Locators.XPATH, "//img[@alt='Icon of a clipboard and pencil']");
		scrollToElement(imgInSec5);

		WebElement HeadingInSec5 = locateElement(Locators.XPATH, "//h2[text()='We are interested in learning your perspective']");
		verifytextBackgroundColor(HeadingInSec5, prop.getProperty("Attendtxtclr"));
		verifytextFamily(HeadingInSec5, prop.getProperty("TextFontFamily"));
		verifytextSize(HeadingInSec5, prop.getProperty("offsiteHeadingSize"));
		verifytextWeight(HeadingInSec5, prop.getProperty("offsiteHeadingWeight"));
		WebElement SubHeadingInSec5 = locateElement(Locators.XPATH, "//h4[text()='on the management of DED, including any challenges and unmet needs']");
		verifytextBackgroundColor(SubHeadingInSec5, prop.getProperty("OffsiteOkBtnClr"));
		verifytextFamily(SubHeadingInSec5, prop.getProperty("TextFontFamily"));
		verifytextSize(SubHeadingInSec5, prop.getProperty("copytxtSec4Size"));
		verifytextWeight(SubHeadingInSec5, prop.getProperty("offsiteParah1Weight"));
		WebElement CopyTxtInSec5 = locateElement(Locators.XPATH, "//p[text()='Take this short survey to give your perspective and find out how ']");
		verifytextBackgroundColor(CopyTxtInSec5, prop.getProperty("OffsiteOkBtnClr"));
		verifytextFamily(CopyTxtInSec5, prop.getProperty("TextFontFamily"));
		verifytextSize(CopyTxtInSec5, prop.getProperty("BelowsgnupbtnCopyTxtSize"));
		verifytextWeight(CopyTxtInSec5, prop.getProperty("offsiteParah1Weight"));
		WebElement CTAInSec5Bclr = locateElement(Locators.XPATH, "//a[@data-href='https://fuelinsights.com/ecp']");
		verifyBackgroundColor(CTAInSec5Bclr,prop.getProperty("CTAInSec5Bclr"));




		return this;

	}
	public  NOVOHomepage VerifyimgandLayoutInSec5(String imgInSec5Layout) {
		WebElement imgInSec5 = locateElement(Locators.XPATH, "//img[@alt='Icon of a clipboard and pencil']");
		scrollToElement(imgInSec5);
		verifyImgSize(imgInSec5, imgInSec5Layout);
		return this;
	}
	public  NOVOHomepage VerifyContLayoutInSec6() {
		WebElement CTAInSec5Bclr = locateElement(Locators.XPATH, "//a[@data-href='https://fuelinsights.com/ecp']");
		scrollToElement(CTAInSec5Bclr);
		pause(1000);
		WebElement HeadingInSec6 = locateElement(Locators.XPATH, "//h2[text()='Get updates']");
		//		scrollToElement(HeadingInSec6);
		verifyExactText(HeadingInSec6, prop.getProperty("HeadingInSec6"));
		WebElement CopytxtInSec6 = locateElement(Locators.XPATH, "//h4[text()='Sign up to stay informed about DED and view survey results collected from hundreds of certified eye care professionals.']");
		verifyExactText(CopytxtInSec6, prop.getProperty("CopytxtInSec6"));
		WebElement Fname = locateElement(Locators.XPATH, "//label[text()='First Name*']");
		verifyDisplayed(Fname);
		verifyExactText(Fname, prop.getProperty("Fname"));
		WebElement FnameField = locateElement(Locators.XPATH, "//input[@class='txtLenth FormTextbox__Input']");
		verifyDisplayed(FnameField);
		append(FnameField, prop.getProperty("TestName"));
		//      verifyExactText(FnameField,  prop.getProperty("TestName"));
		reportStep("its  allows to enter Firstname.", "pass");
		WebElement Lname = locateElement(Locators.XPATH, "//label[text()='Last Name*']");
		verifyDisplayed(Lname);
		verifyExactText(Lname, prop.getProperty("Lname"));
		WebElement LnameField = locateElement(Locators.XPATH, "(//input[@class='txtLenth FormTextbox__Input'])[2]");
		append(LnameField, prop.getProperty("TestName"));
		//        verifyExactText(LnameField,  prop.getProperty("TestName"));
		reportStep("its  allows to enter Lastname.", "pass");
		WebElement EmailAdd = locateElement(Locators.XPATH, "//label[text()='Email Address*']");
		verifyDisplayed(EmailAdd);
		verifyExactText(EmailAdd, prop.getProperty("EmailAdd"));
		WebElement EmailAddField = locateElement(Locators.XPATH, "//input[@class='emailLenth FormTextbox__Input']");
		append(EmailAddField, prop.getProperty("EmailAddFieldTest"));
		//	    verifyExactText(EmailAddField,  prop.getProperty("EmailAddFieldTest"));
		reportStep("its  allows to enter EmailAddress.", "pass");

		WebElement SpeacilityTxt = locateElement(Locators.XPATH, "//label[text()='Specialty*']");
		verifyDisplayed(SpeacilityTxt);
		WebElement SpecalityDD = locateElement(Locators.XPATH, "//select[@class='s-hidden']/following-sibling::div[1]");
		click(SpecalityDD);
		WebElement DDOptions = locateElement(Locators.XPATH, "//section[@id='__field_']/div[5]/div[1]/div[1]/ul[1]/li[3]");
		click(DDOptions);
		verifyExactText(SpeacilityTxt, prop.getProperty("SpeacilityTxtOption2"));
		//		WebElement SpeacilityDD = locateElement(Locators.XPATH, "//select[@class='s-hidden']");
		//		click(SpeacilityDD);
		////		selectDropDownUsingIndex(SpeacilityDD, 2);
		//		selectDropDownUsingText(EmailAddField, folderName)
		WebElement RequiredfieldsTxt = locateElement(Locators.XPATH, "//span[text()='*Required fields']");
		verifyDisplayed(RequiredfieldsTxt);
		verifyExactText(RequiredfieldsTxt, prop.getProperty("RequiredfieldsTxt"));
		WebElement SubmitButn = locateElement(Locators.XPATH, "//button[contains(@class,'btn Form__Element')]");
		verifyDisplayed(SubmitButn);
		verifyEnabled(SubmitButn);
		verifyPartialText(SubmitButn, prop.getProperty("SubmitButnTxt"));
		WebElement CopyTxtSec6 = locateElement(Locators.XPATH, "//div[@id='f2e22e7b-1a57-4bcc-96ed-8800b02018e9']/p[1]");
		verifyExactText(CopyTxtSec6, prop.getProperty("CopyTxtSec6"));





		return this;

	}
	public  NOVOHomepage VerifyContLayoutInSec6NegativeWithoutFilling() {
		WebElement CTAInSec5Bclr = locateElement(Locators.XPATH, "//a[@data-href='https://fuelinsights.com/ecp']");
		scrollToElement(CTAInSec5Bclr);
		WebElement SubmitButn = locateElement(Locators.XPATH, "//button[contains(@class,'btn Form__Element')]");
		//		scrollToElement(SubmitButn);
		click(SubmitButn);
		pause(500);
		WebElement FnameNegTxt = locateElement(Locators.XPATH, "//span[@class='Form__Element__ValidationError']");
		verifyExactText(FnameNegTxt, prop.getProperty("FnameNegTxt"));
		WebElement LnameNegTxt = locateElement(Locators.XPATH, "(//span[@class='Form__Element__ValidationError'])[2]");
		verifyExactText(LnameNegTxt, prop.getProperty("LnameNegTxt"));
		WebElement EmailAddNegTxt = locateElement(Locators.XPATH, "//span[text()='Please enter a valid email address.']");
		verifyExactText(EmailAddNegTxt, prop.getProperty("EmailAddNegTxt"));









		return this;

	}
	public  NOVOHomepage VerifyContLayoutInSec6NegativeWithFillingUWC() {
		WebElement CTAInSec5Bclr = locateElement(Locators.XPATH, "//a[@data-href='https://fuelinsights.com/ecp']");
		scrollToElement(CTAInSec5Bclr);
		WebElement FnameField = locateElement(Locators.XPATH, "//input[@class='txtLenth FormTextbox__Input']");
		verifyDisplayed(FnameField);
		append(FnameField, prop.getProperty("namewithSpecialChar"));
		WebElement LnameField = locateElement(Locators.XPATH, "(//input[@class='txtLenth FormTextbox__Input'])[2]");
		append(LnameField, prop.getProperty("namewithSpecialChar"));
		WebElement EmailAddField = locateElement(Locators.XPATH, "//input[@class='emailLenth FormTextbox__Input']");
		append(EmailAddField, prop.getProperty("EmailAddFieldTestWithUnvalidAdd"));
		WebElement SubmitButn = locateElement(Locators.XPATH, "//button[contains(@class,'btn Form__Element')]");
		click(SubmitButn);
		WebElement ErrorTxtForSpCharFname = locateElement(Locators.XPATH, "(//span[text()='This field should be in a-z, A-z format.'])[1]");
		verifyExactText(ErrorTxtForSpCharFname, prop.getProperty("ErrorTxtForSpChar"));
		WebElement ErrorTxtForSpCharLname = locateElement(Locators.XPATH, "(//span[text()='This field should be in a-z, A-z format.'])[2]");
		verifyExactText(ErrorTxtForSpCharLname, prop.getProperty("ErrorTxtForSpChar"));
		WebElement ErrorTxtForSpCharEmailAdd = locateElement(Locators.XPATH, "//span[text()='Enter a valid email address.']");
		verifyExactText(ErrorTxtForSpCharEmailAdd, prop.getProperty("ErrorTxtForSpCharEmailAdd"));
		//		WebElement SpecalityDD = locateElement(Locators.XPATH, "//select[@class='s-hidden']/following-sibling::div[1]");
		//		click(SpecalityDD);
		pause(1000);

		return this;






	}
	public  NOVOHomepage VerifyFontPropInSec6() {

		WebElement CTAInSec5Bclr = locateElement(Locators.XPATH, "//a[@data-href='https://fuelinsights.com/ecp']");
		scrollToElement(CTAInSec5Bclr);
		WebElement HeadingInSec6 = locateElement(Locators.XPATH, "//h2[text()='Get updates']");
		verifytextBackgroundColor(HeadingInSec6, prop.getProperty("BelowsgnupbtnSubHeadingClr"));
		verifytextSize(HeadingInSec6, prop.getProperty("offsiteHeadingSize"));
		verifytextWeight(HeadingInSec6, prop.getProperty("offsiteHeadingWeight"));
		verifytextFamily(HeadingInSec6, prop.getProperty("TextFontFamily"));
		WebElement CopytxtInSec6 = locateElement(Locators.XPATH, "//h4[text()='Sign up to stay informed about DED and view survey results collected from hundreds of certified eye care professionals.']");
		verifytextBackgroundColor(CopytxtInSec6, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(CopytxtInSec6, prop.getProperty("copytxtSec4Size"));
		verifytextWeight(CopytxtInSec6, prop.getProperty("offsiteParah1Weight"));
		verifytextFamily(CopytxtInSec6, prop.getProperty("TextFontFamily"));
		WebElement Fname = locateElement(Locators.XPATH, "//label[text()='First Name*']");
		verifytextBackgroundColor(Fname, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(Fname, prop.getProperty("copytxtSec2Size"));
		verifytextWeight(Fname, prop.getProperty("offsiteHeadingWeight"));
		verifytextFamily(Fname, prop.getProperty("TextFontFamily"));
		WebElement Lname = locateElement(Locators.XPATH, "//label[text()='Last Name*']");
		verifytextBackgroundColor(Lname, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(Lname, prop.getProperty("copytxtSec2Size"));
		verifytextWeight(Lname, prop.getProperty("offsiteHeadingWeight"));
		verifytextFamily(Lname, prop.getProperty("TextFontFamily"));
		WebElement EmailAdd = locateElement(Locators.XPATH, "//label[text()='Email Address*']");
		verifytextBackgroundColor(EmailAdd, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(EmailAdd, prop.getProperty("copytxtSec2Size"));
		verifytextWeight(EmailAdd, prop.getProperty("offsiteHeadingWeight"));
		verifytextFamily(EmailAdd, prop.getProperty("TextFontFamily"));
		WebElement SpeacilityTxt = locateElement(Locators.XPATH, "//label[text()='Specialty*']");
		verifytextBackgroundColor(SpeacilityTxt, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(SpeacilityTxt, prop.getProperty("copytxtSec2Size"));
		verifytextWeight(SpeacilityTxt, prop.getProperty("offsiteHeadingWeight"));
		verifytextFamily(SpeacilityTxt, prop.getProperty("TextFontFamily"));
		WebElement RequiredfieldsTxt = locateElement(Locators.XPATH, "//span[text()='*Required fields']");
		verifytextBackgroundColor(RequiredfieldsTxt, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(RequiredfieldsTxt, prop.getProperty("FontSize16"));
		verifytextWeight(RequiredfieldsTxt, prop.getProperty("offsiteHeadingWeight"));
		verifytextFamily(RequiredfieldsTxt, prop.getProperty("TextFontFamily"));
		WebElement SubmitButn = locateElement(Locators.XPATH, "//button[contains(@class,'btn Form__Element')]");
		verifytextBackgroundColor(SubmitButn, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(SubmitButn, prop.getProperty("OffsiteOkBtnSize"));
		verifytextWeight(SubmitButn, prop.getProperty("OffsiteOkBtnWeight"));
		verifytextFamily(SubmitButn, prop.getProperty("TextFontFamily"));
		verifyImgSize(SubmitButn, prop.getProperty("SubmitButnSizeWH"));
		verifyBackgroundColor(SubmitButn, prop.getProperty("CTAInSec5Bclr"));


		return this;

	}
	public  NOVOHomepage VerifyLayoutInFormSec6(String FormLayoutSize) {
		WebElement HeadingInSec6 = locateElement(Locators.XPATH, "//h2[text()='Get updates']");
		scrollToElement(HeadingInSec6);
		WebElement FormLayout = locateElement(Locators.XPATH, "//section[contains(@class,'Form__Element FormStep')]");
		verifyImgSize(FormLayout, FormLayoutSize);
//		WebElement FormLayoutWithPadding = locateElement(Locators.XPATH, "//div[@class='Form__MainBody container']");
//		verifyImgSize(FormLayoutWithPadding, prop.getProperty("FormLayoutWithPadding"));

		return this;


	}
	public  NOVOHomepage VerifyContInThankSec6(String TestName,String TestName2,String EmailAddFieldTest,String ThankHEADINGtxt,String Copytxt1InThank) {
		WebElement HeadingInSec6 = locateElement(Locators.XPATH, "//h2[text()='Get updates']");
		scrollToElement(HeadingInSec6);
		WebElement FnameField = locateElement(Locators.XPATH, "//input[@class='txtLenth FormTextbox__Input']");
		append(FnameField, TestName);
		WebElement LnameField = locateElement(Locators.XPATH, "(//input[@class='txtLenth FormTextbox__Input'])[2]");
		append(LnameField,TestName2);
		WebElement EmailAddField = locateElement(Locators.XPATH, "//input[@class='emailLenth FormTextbox__Input']");
		append(EmailAddField, EmailAddFieldTest);
		WebElement SpecalityDD = locateElement(Locators.XPATH, "//select[@class='s-hidden']/following-sibling::div[1]");
		click(SpecalityDD);
		WebElement DDOptions = locateElement(Locators.XPATH, "//section[@id='__field_']/div[5]/div[1]/div[1]/ul[1]/li[3]");
		click(DDOptions);
		WebElement SubmitButn = locateElement(Locators.XPATH, "//button[contains(@class,'btn Form__Element')]");
		click(SubmitButn);
		WebElement ThankHEADING = locateElement(Locators.XPATH, "//h2[text()='Thank you!']");
		verifyExactText(ThankHEADING, ThankHEADINGtxt);
		WebElement CopytxtInThank = locateElement(Locators.XPATH, "//p[text()='We’ll share the results of the survey taken by hundreds of your peers ']");
		verifyPartialText(CopytxtInThank, Copytxt1InThank);


		return this;

	}
	public  NOVOHomepage VerifyFontPropInThankSec6() {
		WebElement HeadingInSec6 = locateElement(Locators.XPATH, "//h2[text()='Get updates']");
		scrollToElement(HeadingInSec6);
		WebElement FnameField = locateElement(Locators.XPATH, "//input[@class='txtLenth FormTextbox__Input']");
		append(FnameField, prop.getProperty("TestName"));
		WebElement LnameField = locateElement(Locators.XPATH, "(//input[@class='txtLenth FormTextbox__Input'])[2]");
		append(LnameField, prop.getProperty("TestName"));
		WebElement EmailAddField = locateElement(Locators.XPATH, "//input[@class='emailLenth FormTextbox__Input']");
		append(EmailAddField, prop.getProperty("EmailAddFieldTest"));
		WebElement SpecalityDD = locateElement(Locators.XPATH, "//select[@class='s-hidden']/following-sibling::div[1]");
		click(SpecalityDD);
		WebElement DDOptions = locateElement(Locators.XPATH, "//section[@id='__field_']/div[5]/div[1]/div[1]/ul[1]/li[3]");
		click(DDOptions);
		WebElement SubmitButn = locateElement(Locators.XPATH, "//button[contains(@class,'btn Form__Element')]");
		click(SubmitButn);
		WebElement ThankHEADING = locateElement(Locators.XPATH, "//h2[text()='Thank you!']");
		verifytextBackgroundColor(ThankHEADING, prop.getProperty("BelowsgnupbtnSubHeadingClr"));
		verifytextSize(ThankHEADING, prop.getProperty("offsiteHeadingSize"));
		verifytextWeight(ThankHEADING, prop.getProperty("offsiteHeadingWeight"));
		verifytextFamily(ThankHEADING, prop.getProperty("TextFontFamily"));
		WebElement CopytxtInThank = locateElement(Locators.XPATH, "//p[text()='We’ll share the results of the survey taken by hundreds of your peers ']");
		verifytextBackgroundColor(CopytxtInThank, prop.getProperty("OffsiteOkBtnClr"));
		verifytextSize(CopytxtInThank, prop.getProperty("copytxtSec4Size"));
		verifytextWeight(CopytxtInThank, prop.getProperty("offsiteParah1Weight"));
		verifytextFamily(CopytxtInThank, prop.getProperty("TextFontFamily"));




		return this;

	}
	public  NOVOHomepage VerifyLayOutThankYouSec6(String TestName,String TestName2,String EmailAddFieldTest,String layouthankSec) {
		WebElement HeadingInSec6 = locateElement(Locators.XPATH, "//h2[text()='Get updates']");
		scrollToElement(HeadingInSec6);
		WebElement FnameField = locateElement(Locators.XPATH, "//input[@class='txtLenth FormTextbox__Input']");
		append(FnameField,TestName);
		WebElement LnameField = locateElement(Locators.XPATH, "(//input[@class='txtLenth FormTextbox__Input'])[2]");
		append(LnameField, TestName2);
		WebElement EmailAddField = locateElement(Locators.XPATH, "//input[@class='emailLenth FormTextbox__Input']");
		append(EmailAddField, EmailAddFieldTest);
		WebElement SpecalityDD = locateElement(Locators.XPATH, "//select[@class='s-hidden']/following-sibling::div[1]");
		click(SpecalityDD);
		WebElement DDOptions = locateElement(Locators.XPATH, "//section[@id='__field_']/div[5]/div[1]/div[1]/ul[1]/li[3]");
		click(DDOptions);
		WebElement SubmitButn = locateElement(Locators.XPATH, "//button[contains(@class,'btn Form__Element')]");
		click(SubmitButn);
		WebElement layoutofThankyouSec = locateElement(Locators.CLASS_NAME, "Thankyou-container");
		verifyImgSize(layoutofThankyouSec,layouthankSec);
		//		WebElement paddinglayoutofThankyouSec= locateElement(Locators.XPATH, "//div[@class='Form__Status__Message Form__Success__Message']");
		//		verifyImgSize(paddinglayoutofThankyouSec, prop.getProperty("paddinglayoutofThankyouSec"));

		return this;


	}
	public  NOVOHomepage VerifyContInSec7() {
		WebElement HeadingInSec7 = locateElement(Locators.XPATH, "//section[@id='literature']/div[1]/div[1]/div[1]/h4[1]");
		System.out.println("heading:"+HeadingInSec7.getText());
		scrollToElement(HeadingInSec7);
		verifyExactText(HeadingInSec7, prop.getProperty("HeadingInSec7"));
		WebElement CruasolImg = locateElement(Locators.XPATH, "//div[@data-slick-index='0']//div[1]");
		verifyDisplayed(CruasolImg);
		verifytextAlign(CruasolImg, prop.getProperty("LogoAlign"));
		WebElement CruasolImgText1 = locateElement(Locators.XPATH, "//p[text()='Patient-reported burden of dry eye disease in the United States: results of an online cross-sectional survey']");
		verifyExactText(CruasolImgText1, prop.getProperty("CruasolImgText"));

		String txt ="Dana R, et al.";
		String text="Am J Ophthalmol. 2020";

		WebElement CruasolImgText2 = locateElement(Locators.XPATH, "//p[text()='Patient-reported burden of dry eye disease in the United States: results of an online cross-sectional survey']/following-sibling::p");
		System.out.println("string:"+CruasolImgText2.getText());

		verifyPartialText(CruasolImgText2, txt);

		if(CruasolImgText2.getText().contains(txt)&&CruasolImgText2.getText().contains(text)) {
			reportStep("Working fine", "pass");
		}

		WebElement CTAInSec7_1= locateElement(Locators.XPATH, "(//a[text()='VIEW PAPER'])[4]");
		System.out.println("textBytn:"+CTAInSec7_1.getText());
		verifyExactText(CTAInSec7_1, prop.getProperty("CTAInSec7"));
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CruasolImgText3 = locateElement(Locators.XPATH, "//p[text()='Patient-reported burden of dry eye disease in the United States: results of an online cross-sectional survey']");
		verifyExactText(CruasolImgText3, prop.getProperty("CruasolImgText3"));
		WebElement CruasolImgText4 = locateElement(Locators.XPATH, "//div[@id='slick-slide01']/div[1]/p[2]");
		verifyExactText(CruasolImgText4, prop.getProperty("CruasolImgText4"));
		WebElement CTAInSec7_2= locateElement(Locators.XPATH, "(//a[text()='VIEW PAPER'])[5]");
		verifyExactText(CTAInSec7_2, prop.getProperty("CTAInSec7"));
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CruasolImgText5 = locateElement(Locators.XPATH, "//p[text()='TFOS DEWS II tear film report']");
		verifyExactText(CruasolImgText5, prop.getProperty("CruasolImgText5"));
		WebElement CruasolImgText6 = locateElement(Locators.XPATH, "//div[@id='slick-slide02']/div[1]/p[2]");
		verifyExactText(CruasolImgText6, prop.getProperty("CruasolImgText6"));
		WebElement CTAInSec7_3= locateElement(Locators.XPATH, "(//a[@data-href='https://www.sciencedirect.com/science/article/pii/S1542012417300721?via%3Dihub'])[1]");
		verifyExactText(CTAInSec7_3, prop.getProperty("CTAInSec7"));
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CruasolImgText7 = locateElement(Locators.XPATH, "//p[text()='TFOS DEWS II definition and classification report']");
		verifyExactText(CruasolImgText7, prop.getProperty("CruasolImgText7"));
		WebElement CruasolImgText8 = locateElement(Locators.XPATH, "//div[@id='slick-slide03']/div[1]/p[2]");
		verifyExactText(CruasolImgText8, prop.getProperty("CruasolImgText8"));
		WebElement CTAInSec7_4= locateElement(Locators.XPATH, "(//a[text()='VIEW PAPER'])[7]");
		verifyExactText(CTAInSec7_4, prop.getProperty("CTAInSec7"));
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CruasolImgText9 = locateElement(Locators.XPATH, "(//p[text()='Emerging strategies for the diagnosis and treatment of meibomian gland dysfunction: proceedings of the OCEAN group meeting'])[2]");
		verifyExactText(CruasolImgText9, prop.getProperty("CruasolImgText9"));
		WebElement CruasolImgText10 = locateElement(Locators.XPATH, "//div[@id='slick-slide04']/div[1]/p[2]");
		verifyExactText(CruasolImgText10, prop.getProperty("CruasolImgText10"));
		WebElement CTAInSec7_5= locateElement(Locators.XPATH, "(//a[@data-href='https://www.sciencedirect.com/science/article/pii/S1542012417300198?via%3Dihub'])[2]");
		verifyExactText(CTAInSec7_5, prop.getProperty("CTAInSec7"));
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CruasolImgText11 = locateElement(Locators.XPATH, "(//p[text()='TFOS DEWS II management and therapy report'])[2]");
		verifyExactText(CruasolImgText11, prop.getProperty("CruasolImgText11"));
		WebElement CruasolImgText12 = locateElement(Locators.XPATH, "//div[@id='slick-slide05']/div[1]/p[2]");
		verifyExactText(CruasolImgText12, prop.getProperty("CruasolImgText12"));
		WebElement CTAInSec7_6= locateElement(Locators.XPATH, "(//a[@data-href='https://www.sciencedirect.com/science/article/pii/S1542012417301143?via%3Dihub'])[2]");
		verifyExactText(CTAInSec7_6, prop.getProperty("CTAInSec7"));
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CruasolImgText13 = locateElement(Locators.XPATH, "(//p[text()='Impact of dry eye disease on work productivity, and patients’ satisfaction with over-the-counter dry eye treatments'])[2]");
		verifyExactText(CruasolImgText13, prop.getProperty("CruasolImgText13"));
		WebElement CruasolImgText14 = locateElement(Locators.XPATH, "//div[@id='slick-slide06']/div[1]/p[2]");
		verifyExactText(CruasolImgText14, prop.getProperty("CruasolImgText14"));
		WebElement CTAInSec7_7= locateElement(Locators.XPATH, "(//a[@data-href='https://iovs.arvojournals.org/article.aspx?articleid=2527938 '])[2]");
		verifyExactText(CTAInSec7_7, prop.getProperty("CTAInSec7"));
		return this;

	}

	public  NOVOHomepage VerifyFontPropInSec7() {
		WebElement HeadingInSec7 = locateElement(Locators.XPATH, "//section[@id='literature']/div[1]/div[1]/div[1]/h4[1]");
		scrollToElement(HeadingInSec7);
		verifytextBackgroundColor(HeadingInSec7, prop.getProperty("offsiteHeadingclr"));
		verifytextSize(HeadingInSec7, prop.getProperty("copytxtSec4Size"));
		verifytextWeight(HeadingInSec7, prop.getProperty("offsiteParah1Weight"));
		verifytextFamily(HeadingInSec7, prop.getProperty("TextFontFamily"));
		WebElement CruasolImgText1 = locateElement(Locators.XPATH, "//p[text()='Patient-reported burden of dry eye disease in the United States: results of an online cross-sectional survey']");
		verifytextBackgroundColor(CruasolImgText1, prop.getProperty("offsiteHeadingclr"));
		verifytextSize(CruasolImgText1, prop.getProperty("OffsiteOkBtnSize"));
		verifytextWeight(CruasolImgText1, prop.getProperty("offsiteParah1Weight"));
		verifytextFamily(CruasolImgText1, prop.getProperty("TextFontFamily"));
		WebElement CruasolImgText2 = locateElement(Locators.XPATH, "//div[@id='slick-slide00']/div[1]/p[2]");
		verifytextBackgroundColor(CruasolImgText1, prop.getProperty("offsiteHeadingclr"));
		verifytextSize(CruasolImgText1, prop.getProperty("OffsiteOkBtnSize"));
		verifytextWeight(CruasolImgText1, prop.getProperty("offsiteParah1Weight"));
		verifytextFamily(CruasolImgText1, prop.getProperty("TextFontFamily"));
		return this;


	}
	public  NOVOHomepage VerifyLayoutInSec7(String LayoutInSec7Size) {
		WebElement LayoutInSec7 = locateElement(Locators.XPATH, "//div[@class='slick-track']");
		verifyImgSize(LayoutInSec7, LayoutInSec7Size);
		//		WebElement LayoutInSec7Padding = locateElement(Locators.XPATH, "//div[contains(@class,'centermainslider slick-initialized')]");
		//		verifyImgSize(LayoutInSec7Padding, prop.getProperty(""));

		return this;

	}
	public  NOVOHomepage VerifyTooltipInSec7(String CTAInSec7_1link,String CTAInSec7_2link,String CTAInSec7_3link,String CTAInSec7_4link,String CTAInSec7_5link,String CTAInSec7_6link,String CTAInSec7_7link) {
		WebElement HeadingInSec7 = locateElement(Locators.XPATH, "//section[@id='literature']/div[1]/div[1]/div[1]/h4[1]");
		scrollToElement(HeadingInSec7);
		WebElement CTAInSec7_1= locateElement(Locators.XPATH, "(//a[@data-href='https://www.ajo.com/article/S0002-9394(20)30156-2/fulltext'])[1]");
		click(CTAInSec7_1);
		WebElement Popupok = locateElement(Locators.XPATH, "//a[contains(@class,'btn active')]");
		click(Popupok);
		switchToWindow(prop.getProperty("CTAInSec7_1Title"));
		verifyUrl(CTAInSec7_1link);
		close();
		switchToWindow(0);
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CTAInSec7_2= locateElement(Locators.XPATH, "(//a[@data-href='https://www.ncbi.nlm.nih.gov/pmc/articles/PMC6878923/'])[1]");
		click(CTAInSec7_2);
		click(Popupok);
		switchToWindow(prop.getProperty("CTAInSec7_2Title"));
		verifyUrl(CTAInSec7_2link);
		close();
		switchToWindow(0);
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CTAInSec7_3= locateElement(Locators.XPATH, "(//a[@data-href='https://www.sciencedirect.com/science/article/pii/S1542012417300721?via%3Dihub'])[1]");
		click(CTAInSec7_3);
		click(Popupok);
		switchToWindow(prop.getProperty("CTAInSec7_3Title"));
		verifyUrl(CTAInSec7_3link);
		close();
		switchToWindow(0);
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CTAInSec7_4= locateElement(Locators.XPATH, "(//a[@data-href='https://www.sciencedirect.com/science/article/pii/S1542012417300721?via%3Dihub'])[1]");
		click(CTAInSec7_4);
		click(Popupok);
		switchToWindow(prop.getProperty("CTAInSec7_4Title"));
		verifyUrl(CTAInSec7_4link);
		close();
		switchToWindow(0);
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CTAInSec7_5= locateElement(Locators.XPATH, "(//a[@data-href='https://www.sciencedirect.com/science/article/pii/S1542012417300198?via%3Dihub'])[2]");
		click(CTAInSec7_5);
		click(Popupok);
		switchToWindow(prop.getProperty("CTAInSec7_5Title"));
		verifyUrl(CTAInSec7_5link);
		close();
		switchToWindow(0);
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CTAInSec7_6= locateElement(Locators.XPATH, "(//a[@data-href='https://www.sciencedirect.com/science/article/pii/S1542012417301143?via%3Dihub'])[2]");
		click(CTAInSec7_6);
		click(Popupok);
		switchToWindow(prop.getProperty("CTAInSec7_6Title"));
		verifyUrl(CTAInSec7_6link);
		close();
		switchToWindow(0);
		click(Locators.XPATH, "//button[@class='slick-next slick-arrow']");
		WebElement CTAInSec7_7= locateElement(Locators.XPATH, "(//a[@data-href='https://iovs.arvojournals.org/article.aspx?articleid=2527938 '])[2]");
		click(CTAInSec7_7);
		click(Popupok);
		switchToWindow(prop.getProperty("CTAInSec7_7Title"));
		verifyUrl(CTAInSec7_7link);
		close();
		switchToWindow(0);
		return this;

	}
	public  NOVOHomepage VerifyMetaTitle(String PageTitle) {
		verifyTitle(PageTitle);

		return this;

	}
	public  NOVOHomepage VerifyMetaTitleDesc(String TitleDescription) {
		WebElement TitleDesc = locateElement(Locators.XPATH, "//meta[@content='Consider the role of tear evaporation in dry eye disease, how meibomian gland dysfunction contributes to dry eye pathology, and how dry eye disease is treated.']");
		verifyExactAttribute(TitleDesc, "content", TitleDescription);
		return this;
	}
	public  NOVOHomepage VerifyFavIcon(String hrefforfavicon) {
		WebElement favicon = locateElement(Locators.XPATH, "//link[@href='/siteassets/img/favicon.png']");
		verifyExactAttribute(favicon, "href",hrefforfavicon);

		return this;

	}
	public  NOVOHomepage VerifyDomainNovoWebSite(String Url) {
		verifyUrl(Url);


		return this;

	}
	public  NOVOHomepage VerifyPopupNotClosedWhenClickOutSide() {
		WebElement imgInSec5 = locateElement(Locators.XPATH, "//img[@alt='Icon of a clipboard and pencil']");
		scrollToElement(imgInSec5);
		WebElement shareonpov = locateElement(Locators.XPATH,"//a[@data-href='https://fuelinsights.com/ecp']");
		pause(2000);
		click(shareonpov);
		WebElement cancelBtnOfPopup = locateElement(Locators.XPATH, "//a[contains(@class,'btn m-l-15')]");
		click(cancelBtnOfPopup);
		reportStep("popup window should  get closed only when click 'cancel' or 'ok' button", "pass");

		return this;

	}
	public  NOVOHomepage VerifyHeaderLayout(String HeaderLayaout,String HeaderSizeWhenScroll,String HeaderClr) {
		WebElement HeaderLayout = locateElement(Locators.XPATH, "//header[@id='header-nav']");

		System.out.println("Size:"+HeaderLayout.getSize());
	verifyImgSize(HeaderLayout,HeaderLayaout);

		WebElement imgInSec5 = locateElement(Locators.XPATH, "//img[@alt='Icon of a clipboard and pencil']");
		scrollToElement(imgInSec5);
		verifyImgSize(HeaderLayout,HeaderSizeWhenScroll);
		verifyBackgroundColor(HeaderLayout, HeaderClr);


		return this;

	}
	public  NOVOHomepage VerifyMouseHoverFunctionality() {
		
//		WebElement ShareOnPovButtn = locateElement(Locators.XPATH, "//a[@data-href='https://fuelinsights.com/ecp']");
//		pause(2000);
//        moveToElement(ShareOnPovButtn);
//        reportStep("done", "pass");
//		WebElement SubmitButn = locateElement(Locators.XPATH, "//button[contains(@class,'btn Form__Element')]");
//        moveToElement(SubmitButn);
//		pause(2000);
//        reportStep("done", "pass");
//        WebElement CTAInSec7_1= locateElement(Locators.XPATH, "(//a[@data-href='https://www.ajo.com/article/S0002-9394(20)30156-2/fulltext'])[1]");
//        moveToElement(CTAInSec7_1);
//		pause(2000);
//        reportStep("done", "pass");
//        moveToElement(Policytxt);
//		pause(2000);
//        reportStep("done", "pass");
//		pause(2000);
//        moveToElement(ContactUstxt);
//		pause(2000);
//        reportStep("done", "pass");
//        moveToElement(LegalNoticetxt);
//		pause(2000);
//        reportStep("done", "pass");
		WebElement iframe = locateElement(Locators.XPATH, "//iframe[@title='reCAPTCHA']");
		switchToFrame(iframe);
        WebElement CaptchaImg = locateElement(Locators.XPATH, "//div[@role='presentation']//div[1]");
//        moveToElement(CaptchaImg);
        click(CaptchaImg);
        pause(2000);
       defaultContent();
		return this;


}
	public  NOVOHomepage VerifyBrokenLinkInNovoPage() {
		verifyBrokenLink();
		
		return this;

}
}