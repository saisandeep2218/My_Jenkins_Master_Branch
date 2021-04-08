package TestRunner;

import DriverScript.driverUtility;
import GenericModules.genericModule;
import TestScripts.HomePageTestScript;
import TestScripts.LoginTestScript;
import TestScripts.UserMgmtTPageTestScript;

public class ScriptRunner extends driverUtility {

	public static void main(String[] args) {
		HomePageTestScript      hs = new HomePageTestScript();
		UserMgmtTPageTestScript us = new UserMgmtTPageTestScript();
		genericModule.readInputFromUser();
		driverUtility.launchDriver_Urls();
//		genericModule.seDragandDrop();
//		genericModule.seWindowHandle();
		genericModule.seWindowAlerts();
//		LoginTestScript.ValidateLoginPage();
//		genericModule.seRightClick();
//		hs.ValidateHomePage();
//		us.Validatelink();
//		us.ValidateCheckBox();
//		us.ValidateDropDown();
//		us.ValidateGetText();
//		Sedriver.close();

	}

}
