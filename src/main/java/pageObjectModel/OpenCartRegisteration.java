package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartRegisteration {

	public WebDriver driver;

	public OpenCartRegisteration(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//input[@name='firstname']")
	WebElement firstname;

	@FindBy(xpath ="//input[@name='lastname']")
	WebElement lastname;

	@FindBy(xpath ="//input[@name='email']")
	WebElement email;

	@FindBy(xpath ="//input[@name='telephone']")
	WebElement telephone;

	@FindBy(xpath ="//input[@name='password']")
	WebElement password;

	@FindBy(xpath ="//input[@name='confirm']")
	WebElement confirm;

	@FindBy(xpath ="//input[@type='checkbox']")
	WebElement checkbox;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement continuebutton;


	public WebElement firstname()
	{
		return firstname;
	}

	public WebElement lastname()
	{
		return lastname;
	}
	public WebElement email()
	{
		return email;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement confirm()
	{
		return confirm;
	}
	public WebElement checkbox()
	{
		return checkbox;
	}
	public WebElement continuebutton()
	{
		return continuebutton;
	}

}
