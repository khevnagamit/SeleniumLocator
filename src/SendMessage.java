import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendMessage {
    protected static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //open the website
        driver.get("https://demo.nopcommerce.com/");

        //click on login
        driver.findElement(By.className("ico-login")).click();

        //enter email
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Maganlal@test.com");

        //enter password
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("abc123");

        //click on login button
        driver.findElement(By.xpath("//input[@value='Log in']")).click();

        //select Apple Macbook
        driver.findElement(By.xpath("//img[contains(@src,'apple-macbook-pro-13-inch')]")).click();

        //click email a friend
        driver.findElement(By.xpath("//input[@onclick='setLocation(\"/productemailafriend/4\")']")).click();

        //enter friend's email
        driver.findElement(By.className("friend-email")).sendKeys("ChaganLal@test.com");

        //enter message
        driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("Amazing Product have a look in it.");

        //click on send email
        driver.findElement(By.name("send-email")).click();

        //close window
        driver.close();
    }
}
