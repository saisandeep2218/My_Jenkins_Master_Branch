package DriverScript;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import GenericModules.genericModule;
import ScriptVariables.TestScriptVariables;

public class driverUtility {

	public static WebDriver Sedriver;

	public static   void launchDriver_Url(){
	  try{
	       switch(TestScriptVariables.BrowserInput){
	       case "CHROME":
	    	    System.setProperty(TestScriptVariables.Chromepropval, TestScriptVariables.Chromedriverpath);
	            Sedriver = new ChromeDriver();
	 	        genericModule.openBrowser_Url();
	       break;
	       case "INTERNET EXPLORER":
	    	    System.setProperty(TestScriptVariables.IEpropval, TestScriptVariables.IEdriverpath);
	            Sedriver = new InternetExplorerDriver();
	 	        genericModule.openBrowser_Url();
		   break;
	       case "FIREFOX":
	    	    System.setProperty(TestScriptVariables.Geckopropval, TestScriptVariables.Geckodriverpath);
	             Sedriver = new FirefoxDriver();
	 	         genericModule.openBrowser_Url();
		   break;
		   default :
		         System.out.println("Invalid Browser Selection has been Provided, Please Check and Execute the Script ");           		    
	       }          		    
	     }
	  catch(Exception E){
		  E.printStackTrace();
		  System.out.println("launchDriver_Url Method Processing Failed.");
	  }	
	  finally{
		   System.out.println("Driver Launch Completed Succesfully");
	  }
 }
	}
