package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccessProperties {


	public WebDriver driver;
	public  Properties prop;



	public  void loadProperties() throws Exception
	{
		prop = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\com.properties\\properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
	}


	public void loginurl(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("Opencartlogin"));
	}

	public void Registerurl(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("OpenCartregister"));
	}



	public void initilizeBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("url"));
	}

}
