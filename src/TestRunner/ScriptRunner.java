package TestRunner;

import DriverScript.driverUtility;
import GenericModules.genericModule;
import TestScripts.HomePageTestScript;
import TestScripts.LoginTestScript;
import TestScripts.UserMgmtTPageTestScript;

public class ScriptRunner extends driverUtility {

	public static void main(String[] args) {
		HomePageTestScript      hs1 = new HomePageTestScript();
		UserMgmtTPageTestScript us1 = new UserMgmtTPageTestScript();
		genericModule.readInputFromUser1();
		driverUtility.launchDriver_Url1();
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
		genericModule.readInputFromUser();
		driverUtility.launchDriver_Url();
//		genericModule.seDragandDrop();
//		genericModule.seWindowHandle();
		genericModule.seWindowAlerts();

	}

}
