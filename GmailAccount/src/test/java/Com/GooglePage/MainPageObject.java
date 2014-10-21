package Com.GooglePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPageObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GooglePage gp= new GooglePage();
		GmailPage gmp=gp.googlePage();
		GmailCreateAccountPage gcap =gmp.gmailLogin();
		gcap.createAccount();
		
	}

}
