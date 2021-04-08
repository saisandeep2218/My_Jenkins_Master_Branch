package GenericModules;

import java.io.File;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;

import DriverScript.driverUtility;
import ScriptVariables.TestScriptVariables;

public class genericModule extends driverUtility {
	
	public static String ChildWindow;

	public static void readInputFromUser() {
		try {
			@SuppressWarnings("resource")
			Scanner scr = new Scanner(System.in);
			System.out.println("Hey Programmer Please Enter the Browser You Would Like to Launch , Available Options are CHROME , INTERNET EXPLORER , FIREFOX");
			TestScriptVariables.BrowserInput = scr.next();
		} catch (Exception E) {
			E.printStackTrace();
		}

	}

	public static void openBrowser_Url() {
		try {
//			Sedriver.get(TestScriptVariables.baseurl);
			Sedriver.get(TestScriptVariables.drgdrpurl);
			Sedriver.manage().window().maximize();
			Thread.sleep(2500);
			System.out.println("Selected Browser is : "
					+ TestScriptVariables.BrowserInput);
		} catch (Exception E) {
			E.printStackTrace();
		}

	}

	public static void seMouseClick(By WebElement, String Optionaltxt) {
		try {
			Sedriver.findElement(WebElement).click();
		} catch (Exception E) {
			E.printStackTrace();
		}

	}

	public static void setxtboxClear(By WebElement, String Optionaltxt) {
		try {
			Sedriver.findElement(WebElement).clear();
		} catch (Exception E) {
			E.printStackTrace();
		}

	}

	public static void seSendKeys(By WebElement, String Input) {
		try {
			Sedriver.findElement(WebElement).sendKeys(Input);
		} catch (Exception E) {
			E.printStackTrace();
		}

	}

	public static boolean seVerifyElementEnabled(By WebElement) {
		try {
			if (Sedriver.findElement(WebElement).isEnabled()) {
				System.out.println("Element Provided is Enabled");
				return true;
			} else {
				System.out.println("Element Provided is Not Enabled");
			}

		} catch (Exception E) {
			E.printStackTrace();
		}
		return false;

	}

	public static boolean seVerifyElementDisabled(By WebElement, String txt) {
		try {
			if (!Sedriver.findElement(WebElement).isEnabled()) {
				System.out.println("Element Provided is  Not Enabled");
			} else {
				System.out.println("Element Provided is Enabled");
			}

		} catch (Exception E) {
			E.printStackTrace();
		}
		return false;
	}
	
	public static void seMouseHover(By WebElement) {
		try {
			Actions act    = new Actions(Sedriver);
			WebElement  id = Sedriver.findElement(WebElement);
			act.moveToElement(id).build().perform();

		} catch (Exception E) {
			E.printStackTrace();
		}
	}
	
	public static void seCheckBoxSelected(By WebElement){
		try{
			if (Sedriver.findElement(WebElement).isSelected()){
				System.out.println("Already Selected");
			}
			else{
				Sedriver.findElement(WebElement).click();
			}
		}
		catch(Exception E){
			E.printStackTrace();
		}
	}
	
	public static void sedropDownSelection(By WebElement){
		try{
			Select drpOpt = new Select(Sedriver.findElement(WebElement));
			drpOpt.selectByVisibleText("ESS");
		}
		catch(Exception E){
			E.printStackTrace();
		}
	}
	
	public static String segetText(By WebElement){
		try{
			 TestScriptVariables.txtresult = Sedriver.findElement(WebElement).getText();
		}
		catch(Exception E){
			E.printStackTrace();
		}
		return TestScriptVariables.txtresult;
		
	}
//*****************************************************************************************************************************************//	
	public static void seTakeScreenshot(String FileName){
		try{
			 File Screenshot = ((TakesScreenshot)Sedriver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(Screenshot, new File (TestScriptVariables.FileStoragePath +"//"+FileName),true);
		}
		catch(Exception E){
			E.printStackTrace();
		}
	
		
	}
	
	public static void seRightClick(){
		try{
			WebElement id = Sedriver.findElement(By.xpath("//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[3]/div/a/img"));
			Actions Act = new Actions(Sedriver);
			Act.contextClick(id).build().perform();
		}
		catch(Exception E){
			E.printStackTrace();
		}	
	}
	
	public static void seDragandDrop(){
		try{
			WebElement dragId  = Sedriver.findElement(By.xpath("//*[@id='todrag']/span[1]"));
			WebElement dropId  = Sedriver.findElement(By.xpath("//*[@id='mydropzone']"));				
			Actions Act = new Actions(Sedriver);
			Act.dragAndDrop(dragId, dropId).build().perform();
		}
		catch(Exception E){
			E.printStackTrace();
		}		
	}	
	
	
//	public static void seWindowHandle(){
//		try{
//			String ParentWindow = Sedriver.getWindowHandle();
//			Sedriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a")).click();
//			Set<String> count = Sedriver.getWindowHandles();
//			Iterator<String> Iterator = count.iterator();
//			while(Iterator.hasNext()){
//				  ChildWindow = Iterator.next();				  
//			}
//			Sedriver.switchTo().window(ChildWindow);
//			Thread.sleep(9000);
//			Sedriver.findElement(By.xpath("//*[@id='react-root']/div/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/span/span/span"));
//			Sedriver.switchTo().window(ParentWindow);
//			Thread.sleep(9000);
//		}
//		catch(Exception E){
//			E.printStackTrace();
//		}		
//	}	
	
	
//* This is has been written by Sai Sandeep Bandaru *//
		
		public static void seWindowAlerts(){
			try{
				Sedriver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/button")).click();
				Alert  alert = Sedriver.switchTo().alert();
				Thread.sleep(2500);
				alert.accept();
				Sedriver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")).click();
				Thread.sleep(2500);
				alert.dismiss();
				Sedriver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[3]/div[2]/button")).click();
				Thread.sleep(2500);
				alert.getText();
				System.out.println(alert.getText());
				
			}
			catch(Exception E){
				E.printStackTrace();
			}		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
