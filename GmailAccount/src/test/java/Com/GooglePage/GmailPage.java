package Com.GooglePage;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class GmailPage extends PageObject{
	
	// Click on CreateAccountLink in Gmail Page
		public GmailCreateAccountPage gmailLogin(){
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		click("Create_Account_Link");
		return new GmailCreateAccountPage();
		
}
}