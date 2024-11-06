package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLogin  extends com.utilities.DataDriven{


	public WebDriver driver;

	public OpenCartLogin(WebDriver driver)
	{
		this.driver = driver;
	}

	By username = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='password']");
	By submit = By.xpath("//input[@type='submit']");



	public void username(String name)
	{
		driver.findElement(username).sendKeys(name);
	}

	public void password(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}

	public void login()
	{
		driver.findElement(submit).click();
	}

}
