package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginP {
    public static WebDriver driver;;
    public static String signin_xpath ="//a[@class='nav__button-secondary btn-secondary-emphasis btn-md']";
    public static String email_xpath = "//input[@id='username']";
    public static String password_xpath = "//input[@id='password']";
    public static String signin_button_xpath ="//button[@class='btn__primary--large from__button--floating']";
    public static String name_xpath = "//h3[@class='profile-card-name text-heading-large']";

    public static void clickSignin() throws InterruptedException {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","'/Users/saisreekar/Documents/QA/chromedriver-mac-arm64 2/chromedriver'");
        driver.get("https://www.linkedin.com");

        Thread.sleep(2000);
        driver.findElement(By.xpath(signin_xpath)).click();
    }
    public static void typeEmail() throws InterruptedException {
        driver.findElement(By.xpath(email_xpath)).sendKeys("srikar36sai@gmail.com");
    }
    public static void typePassword() throws InterruptedException {
        driver.findElement(By.xpath(password_xpath)).sendKeys("Idontknow!3636");
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
