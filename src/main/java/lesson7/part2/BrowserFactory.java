package lesson7.part2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import resources.Parameters;

public class BrowserFactory {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", Parameters.CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
    }


    @AfterSuite
    public void setDown() {
        driver.quit();
    }

}
