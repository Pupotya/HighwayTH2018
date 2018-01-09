package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchHelloWorld {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/romandubovyi/webDrivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com.ua");
        driver.findElement(By.cssSelector("[name='q']")).clear();
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Hello,world!");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".g h3 a")).click();
        System.out.println(driver.getTitle());
        driver.quit();


    }

}
