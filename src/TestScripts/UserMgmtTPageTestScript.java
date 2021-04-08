package TestScripts;

import DriverScript.driverUtility;
import GenericModules.genericModule;
import PageObjects.UserMgmtPage;
import ScriptVariables.TestScriptVariables;

public class UserMgmtTPageTestScript extends driverUtility {
	
	public boolean Validatelink(){
		try{
			genericModule.seMouseClick(UserMgmtPage.lnktxt, "LinkText");
			genericModule.seTakeScreenshot("Link_Text.png");
		}
		catch(Exception E){
			E.printStackTrace();	
		}
		return false;
	}	 
	
	public boolean ValidateCheckBox(){
		try{
			genericModule.seCheckBoxSelected(UserMgmtPage.chkboxAll);
			genericModule.seTakeScreenshot("CheckBox_All.png");
		}
		catch(Exception E){
			E.printStackTrace();	
		}
		return false;
	}	
	
	public boolean ValidateDropDown(){
		try{
			genericModule.sedropDownSelection(UserMgmtPage.drpdwnUsr);
			genericModule.seTakeScreenshot("DropdownUser.png");	
		}
		catch(Exception E){
			E.printStackTrace();	
		}
		return false;
	}	
	
	public boolean ValidateGetText(){
		try{	
			genericModule.segetText(UserMgmtPage.userlabel);
			System.out.println("Retreived Text Value is : " + TestScriptVariables.txtresult);
		}
		catch(Exception E){
			E.printStackTrace();	
		}
		return false;
	}	

}
