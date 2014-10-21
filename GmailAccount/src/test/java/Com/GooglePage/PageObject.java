package Com.GooglePage;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class PageObject {
	
  public  static WebDriver driver = null;
  public Properties config=null;

  PageObject(){
	  if(driver==null)
	// initialize the property file
		  config= new Properties();
	  try{
		 //FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Com\\Properties\\config.properties");
		  FileInputStream fis = new FileInputStream("E:\\Cognizant\\GmailAccount\\src\\test\\java\\Com\\Properties\\Config.properties");
		  config.load(fis);
	  }
	  catch(Exception e){
		  return;
	  }
	  // initializing the browser
	  if(config.getProperty("browser").equals("mozilla"))
		  this.driver=new FirefoxDriver();
	  else if(config.getProperty("browser").equals("IE"))
		  this.driver=new InternetExplorerDriver();
	  else if(config.getProperty("browser").equals("Chrome"))
		   System.setProperty("webdriver.chrome.driver", "E:\\workspace\\usha\\GmailAccountCreation\\chromedriver.exe");
	}
    
    // click

	public void click(String Key){
		try{
		driver.findElement(By.xpath(config.getProperty(Key))).click();
	}
		catch(Exception e){
			e.printStackTrace();

		}
	}
	
	// input fields
	
	public void input(String Key,String text){
		try{
		driver.findElement(By.xpath(config.getProperty(Key))).sendKeys(text);
			}
		catch(Exception e){
			e.printStackTrace();
			}
	
	}
	// select
	
	public void select(String Key,String text){
		try{
			new Select(driver.findElement(By.xpath(config.getProperty(Key)))).selectByVisibleText(text);
		}
		catch(Exception e){
			e.printStackTrace();

		}
	}
	
	
}