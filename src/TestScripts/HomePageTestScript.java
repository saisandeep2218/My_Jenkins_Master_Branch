package TestScripts;

import DriverScript.driverUtility;
import GenericModules.genericModule;
import PageObjects.HomePage;

public class HomePageTestScript extends driverUtility {
	
	public boolean ValidateHomePage(){
		try{
			genericModule.seTakeScreenshot("Home_Page.png");
			genericModule.seMouseHover(HomePage.lnkAdmin);
			genericModule.seMouseHover(HomePage.lnkUserMgmt);
			genericModule.seMouseClick(HomePage.lnkUsers, "LinkClick");	
		}
		catch(Exception E){
			E.printStackTrace();
			System.out.println("Homepage  Succesfull");		
		}
		return false;
	}	    

}
