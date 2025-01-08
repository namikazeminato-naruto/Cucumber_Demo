package pages;

import org.openqa.selenium.By;
import utilities.DriverClass;


public class loginP extends DriverClass {
    public static String signin_xpath ="//a[@class='nav__button-secondary btn-secondary-emphasis btn-md']";
    public static String email_xpath = "//input[@id='username']";
    public static String password_xpath = "//input[@id='password']";
    public static String signin_button_xpath ="//button[@class='btn__primary--large from__button--floating']";
    public static String name_xpath = "//h3[@class='profile-card-name text-heading-large']";

    public static void clickSignin() throws InterruptedException {
        driver.get("https://www.linkedin.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath(signin_xpath)).click();
    }
    public static void typeEmail(String email) throws InterruptedException {
        driver.findElement(By.xpath(email_xpath)).sendKeys(email);
    }
    public static void typePassword(String password) throws InterruptedException {
        driver.findElement(By.xpath(password_xpath)).sendKeys(password);
    }
    public static void clickSigninButton() {
        driver.findElement(By.xpath(signin_button_xpath)).click();
    }
    public static String homepage() throws InterruptedException {
        Thread.sleep(2000);
        String name= driver.findElement(By.xpath(name_xpath)).getText();
        return name;
    }
}
