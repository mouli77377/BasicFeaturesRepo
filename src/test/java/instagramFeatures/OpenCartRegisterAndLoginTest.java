package instagramFeatures;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjectModel.OpenCartLogin;

public class OpenCartRegisterAndLoginTest extends com.utilities.AccessProperties
{

	@BeforeMethod
	@Parameters("browser")
	public void lunch(String browsername) throws Exception
	{

		loadProperties();
		loginurl(browsername);
	}

	@Test(groups = {"sanity, smoke, regrestion"})
	public void login() throws Exception
	{
		loadProperties();
		OpenCartLogin opc = new OpenCartLogin(driver);
		opc.username(prop.getProperty("opUsername"));
		opc.password(prop.getProperty("opPassword"));
		opc.login();
	}

	@Test
	public void login1() throws Exception
	{
		loadProperties();
		OpenCartLogin opc = new OpenCartLogin(driver);
		opc.username(prop.getProperty("opUsername1"));
		opc.password(prop.getProperty("opPassword1"));
		opc.login();
	}

	@Test
	public void login2() throws Exception
	{
		loadProperties();
		OpenCartLogin opc = new OpenCartLogin(driver);
		opc.username(prop.getProperty("opUsername2"));
		opc.password(prop.getProperty("opPassword2"));
		opc.login();
	}

	@Test
	public void login3() throws Exception
	{
		loadProperties();
		OpenCartLogin opc = new OpenCartLogin(driver);
		opc.username(prop.getProperty("opUsername3"));
		opc.password(prop.getProperty("opPassword3"));
		opc.login();
	}

	@Test
	public void login4() throws Exception
	{
		loadProperties();
		OpenCartLogin opc = new OpenCartLogin(driver);
		opc.username(prop.getProperty("opUsername4"));
		opc.password(prop.getProperty("opPassword4"));
		opc.login();
	}



















}
