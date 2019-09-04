import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterSuccessfullyNopcommerce {
    protected static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");

        //open browser
        driver = new ChromeDriver();

        //set implicitly wait for driver object
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //open the website
        driver.get("https://demo.nopcommerce.com/");

        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //enter first name
        driver.findElement(By.id("FirstName")).sendKeys("Baman");

        //enter last name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Lal");

        //enter email
        driver.findElement(By.name("Email")).sendKeys("BamanLal@test.com");

        //enter password
        driver.findElement(By.id("Password")).sendKeys("abc123");

        //enter confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");

        //click register button
        driver.findElement(By.id("register-button")).click();

        //close window
        driver.close();


    }
}
