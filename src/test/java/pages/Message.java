package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static pages.loginP.driver;

public class Message {
    public static String search_xpath= "//input[@placeholder='Search']";
    public static String profilename_xpath = "(//a[contains(@href, 'linkedin.com/in/') and @data-test-app-aware-link]//span[@aria-hidden='true'])[1]";
    public static String messsage_button_xpath = "(//button[contains(@aria-label,'Message')])[2]";
    public static String messagebox_xpath="//div[@role ='textbox']";
    public static String send_xpath="//button[@type ='submit' and text()='Send']";
    public static String sentmsg_xpath="(//div[@class ='msg-s-event__content']//p)[last()]";
     public static void profilesearch() throws InterruptedException {
         WebElement searchfield = driver.findElement(By.xpath(search_xpath));
         searchfield.click();
         Thread.sleep(2000);
         searchfield.sendKeys("Rajesh Battula");
         Actions actions = new Actions(driver);
         actions.sendKeys(Keys.ENTER).perform();
     }
     public static void clickprofilename() throws InterruptedException {
         Thread.sleep(2000);
         String profilename = driver.findElement(By.xpath(profilename_xpath)).getText();
         if (profilename.equals("Rajesh Battula")){
             driver.findElement(By.xpath(profilename_xpath)).click();

         }
         else
         {
             driver.quit();
             System.out.println(profilename + "is not visible");
         }
     }
     public static void messageclick() throws InterruptedException {
         Thread.sleep(3000);
         driver.findElement(By.xpath(messsage_button_xpath)).click();
     }
     public static void writemessage() throws InterruptedException {
         Thread.sleep(3000);
         WebElement messagestring = driver.findElement(By.xpath(messagebox_xpath));
         messagestring.click();
         messagestring.sendKeys("Hi Rajesh Battula");
         WebElement send = driver.findElement(By.xpath(send_xpath));
         send.click();
         send.submit();
     }
     public static String sentmsg() throws InterruptedException {
         String sentmsg= driver.findElement(By.xpath(sentmsg_xpath)).getText();
         return sentmsg;
     }
}
