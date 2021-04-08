package PageObjects;

import org.openqa.selenium.By;

public class UserMgmtPage {
	
	  public static By chkboxAll        = By.id("ohrmList_chkSelectAll");
	  public static By drpdwnUsr        = By.id("searchSystemUser_userType");
	  public static By userlabel        = By.xpath("//*[@id='search_form']/fieldset/ol/li[2]/label");
	  public static String lnktxtString = "Admin";
	  public static By lnktxt           = By.partialLinkText(lnktxtString);
	  

}
