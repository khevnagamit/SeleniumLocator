import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeLogInOut {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");

        //open browser
        driver =new ChromeDriver();

        //open website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //set implicitly wait for driver object
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //enter username
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");

        //enter password
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        //click on login
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

        //click on welcome
        driver.findElement(By.id("welcome")).click();

        //click on logout button
        driver.findElement(By.linkText("Logout")).click();

        //close window
        driver.close();
    }
}
