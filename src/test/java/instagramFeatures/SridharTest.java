package instagramFeatures;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjectModel.Login;
import pageObjectModel.SendMessage;

public class SridharTest extends com.utilities.AccessProperties  {


	@BeforeClass
     public void lunch() throws Exception
	{
		loadProperties();
		initilizeBrowser(prop.getProperty("browsername"));
		Thread.sleep(3000);
	}


	@Test(priority =1)
	public void login()
	{
		Login l = new Login(driver);
		l.username().sendKeys(prop.getProperty("username"));
		l.password().sendKeys(prop.getProperty("password"));
		l.submit().click();
	}

	@Test(priority  =2)
	public void findandsend() throws Exception
	{
		SendMessage sm = new SendMessage(driver);
		sm.search();
		sm.searchinput();
		sm.identify();
	}


}
