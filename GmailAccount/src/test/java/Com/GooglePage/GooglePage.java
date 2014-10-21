package Com.GooglePage;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class GooglePage extends PageObject {
	
	//Type Google.co.uk in URL and click Gmail Link
	public GmailPage googlePage(){
		driver.get(config.getProperty("testPageURL"));
		driver.manage().window().maximize();
	    click("Top_Gmail_Link");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		return  new GmailPage();

	}
}
