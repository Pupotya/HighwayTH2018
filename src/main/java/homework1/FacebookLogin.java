package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import resources.Parameters;

import java.util.concurrent.TimeUnit;

public class FacebookLogin {

    public static void main(String[] args) {

        String login = "teuytwet@gmail.com";
        String password = "gfrhdhfyt";


        System.setProperty("webdriver.chrome.driver", Parameters.CHROME_DRIVER_PATH);

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);

        driver.get("https://facebook.com");

        driver.findElement(By.xpath("//input[@type='email']")).clear();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(login);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        System.out.println("Title is : " + driver.getTitle());

        driver.quit();
    }


}
