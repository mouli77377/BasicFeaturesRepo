package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SendMessage {



     public WebDriver driver;

     public SendMessage(WebDriver driver)
     {
    	 this.driver = driver;
     }

       By search = By.cssSelector("svg[aria-label='Search']");
       By searchinput = By.cssSelector("input[aria-label='Search input']");
       By findElement = By.xpath("//span[text() ='Sreedhar • Followed by tamizhan_04 + 3 more']");

       By message = By.xpath("//div[text() ='Message']");
       By notnow =  By.xpath("//button[text()='Not Now']");
       By textmessage =By.xpath("//div[@aria-placeholder='Message...']");
       By send = By.xpath("//div[text()='Send']");

       public void search() throws Exception
       {
    	   driver.findElement(search).click();
    	   Thread.sleep(2000);
       }

       public void searchinput() throws Exception
       {
    	   driver.findElement(searchinput).click();
    	   Thread.sleep(2000);
    	   driver.findElement(searchinput).sendKeys("sreedhar__07",Keys.ENTER);

       }

       public void identify() throws Exception
       {
    	   driver.findElement(findElement).click();
    	   Thread.sleep(2000);
    	   driver.findElement(message).click();
    	   Thread.sleep(2000);
    	   driver.findElement(notnow).click();
    	   Thread.sleep(2000);
    	   driver.findElement(textmessage).click();
    	   Thread.sleep(2000);

    	   
           driver.findElement(textmessage).sendKeys("Hey sridhar your receiving this message from mouli using automation");
           Thread.sleep(1000);
           //driver.findElement(send).click();
    	   
       }



}
