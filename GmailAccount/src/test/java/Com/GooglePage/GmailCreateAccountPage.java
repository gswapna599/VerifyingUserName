package Com.GooglePage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GmailCreateAccountPage extends PageObject {
	// Gmail Account Creation 
	public void createAccount()
	{
		//entering data for FirstName
		input("User_Name_First","abcd");
		//entering data for LastName
		input("User_Name_Last","efgh");
		// Leaving your Name field as blank
		input("Choose_Your_Name","");
		// entering data for Password
		input("Password","abcd1234");
		//entering data for confirmation password
		input("Confirm_password","abcd1234");
		//selecting DOB Month
		select("BDay_Month","May");
		// entering DOB Date
		input("BDay_Date","12");
		// entering DOB Year
		input("BDay_Year","1987");
		//selecting Gender
		select("Gender","Female");
		// entering mobile number
		input("Mobile_phone","07581371676");
		// enter emial addr
		input("Current_Email_Addr","abcd1234@gmail.com");
		//select location
		select("Location","united Kingdom");
		click("I_Agree_CheckBOX");
		//click on Next Step button
		click("Next_Step");	
		
// verifying theError Message
Assert.assertEquals((driver.findElement(By.id("//*[@id='errormsg_0_GmailAddress']")).getText()), " You can't leave this empty");
		

	}


}
