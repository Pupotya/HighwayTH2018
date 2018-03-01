package homework3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import resources.Parameters;

import java.util.concurrent.TimeUnit;


public class CinemaFreeSeats {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", Parameters.CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();

        driver.get("http://liniakino.com/showtimes/aladdin");
        driver.findElement(By.xpath("//li[contains(h1,'Астрал: Останній ключ')]//li/a")).click();
            Thread.sleep(200);
        WebDriverWait wait = new WebDriverWait(driver, 6, 300);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe")));
        WebElement iFrameElement = driver.findElement(By.cssSelector("iframe"));
        driver.switchTo().frame(iFrameElement);
        wait.until(ExpectedConditions.invisibilityOfElementWithText((By.id("hall-scheme-loading")),"\n" +
                "\t\tЗавантаження, зачекайте\t\t"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#hall-scheme-container>div>.seat:nth-child(180)")));
        int allSeats = count(driver, "#hall-scheme-container>div>.seat");
        int freeSeats = count(driver, "#hall-scheme-container>div>.seat-color1");
        int occupiedSeats = count(driver, "#hall-scheme-container>div>.seat-occupied");

        String freePercentage = String.format("%.02f", (float) freeSeats / allSeats * 100) + "%";
        String occupiedPercentage = String.format("%.02f", (float) occupiedSeats / allSeats * 100) + "%";

        System.out.println("All Seats - " + allSeats);
        System.out.println("Occupied Seats - " + occupiedSeats + " | " + occupiedPercentage);
        System.out.println("Free Seats - " + freeSeats + " | " + freePercentage);
        driver.quit();
    }

    private static int count(WebDriver driver, String selector) {
        return driver.findElements(By.cssSelector(selector)).size();
    }

}
