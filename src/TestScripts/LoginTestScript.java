package TestScripts;
import DriverScript.driverUtility;
import GenericModules.genericModule;
import PageObjects.LoginPage;
import ScriptVariables.TestScriptVariables;

public class LoginTestScript extends driverUtility {
	
	       
	public static boolean ValidateLoginPage(){
		try{
			genericModule.seMouseClick(LoginPage.txtUserName, "MouseClick");
			genericModule.setxtboxClear(LoginPage.txtUserName, "UserNameTxtBox");	
			genericModule.seSendKeys(LoginPage.txtUserName,   TestScriptVariables.Username);	
			
			genericModule.seMouseClick(LoginPage.txtPassword, "MouseClick");
			genericModule.setxtboxClear(LoginPage.txtPassword, "PasswordTxtBox");	
			genericModule.seSendKeys(LoginPage.txtPassword, TestScriptVariables.Password);	
            genericModule.seTakeScreenshot("Login_Page.png");
			if(genericModule.seVerifyElementEnabled(LoginPage.BtnLogin)){
				genericModule.seMouseClick(LoginPage.BtnLogin, "LoginBtnClick");	
			}			
		} 
		catch(Exception E){
			E.printStackTrace();
			System.out.println("Login to Orange HRM Succesfull");		
		}
		return false;
	}	         
}
