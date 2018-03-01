package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.Parameters;
import resources.Resources;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Akinator extends Resources {



    private static WebDriver driver = new ChromeDriver();
    //TODO while(element with question present)
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", Parameters.CHROME_DRIVER_PATH);
//        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
        driver.get("http://ru.akinator.com/");
        driver.findElement(By.cssSelector("a.rouge")).click();
//        System.out.println(driver.findElement(By.cssSelector("#bulle-inner")).getText());
        String age = "22";
        Actions action = new Actions(driver);
        WebElement element=driver.findElement(By.cssSelector("#infos-area-footer>input[type='submit']"));
        driver.findElement(By.cssSelector("#elokence_sitebundle_identification_age")).sendKeys(age);
        action.doubleClick(element).build().perform();

        Thread.sleep(5000);
        while(isElementPresent()){
            System.out.println(driver.findElement(By.cssSelector("#bulle-inner")).getText());
            for(int j=1;j<6;j++){

                System.out.println(j+" - "+driver.findElement(By.cssSelector("a#reponse"+j)).getText());

            }
            String answer = readInput();
            driver.findElement(By.cssSelector("a#reponse"+answer)).click();
        }
//        for(int i=0;i<7;i++){
//            System.out.println(driver.findElement(By.cssSelector("#bulle-inner")).getText());
//            for(int j=1;j<6;j++){
//
//                System.out.println(j+" - "+driver.findElement(By.cssSelector("a#reponse"+j)).getText());
//
//            }
//            String answer = readInput();
//            driver.findElement(By.cssSelector("a#reponse"+answer)).click();
//        }

//        driver.findElement(By.cssSelector("#bulle-inner")).getText();

    }

    static String readInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш ответ");
        return scanner.nextLine();
    }

    public static boolean isElementPresent() {
        WebDriverWait wait = new WebDriverWait(driver,6,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bulle-inner")));
        return driver.findElement(By.cssSelector("#bulle-inner")).isDisplayed();

    }



//    public void waitFor$(POEnum el) {
//        if ($(el).isDisabled()) return;
//        By by = $Selector(el);
//        WebDriverWait wait = new WebDriverWait(getDriver(), getIntProp("implicitWait"));
//        ExpectedCondition<WebElement> waiter = ExpectedConditions.visibilityOfElementLocated(by);
//        try {
//            wait.until(waiter);
//        } catch (Exception e) {
//            Assert.assertEquals("Test expectetion failed", "Wasn't able to find an element: " +
//                    el + "by selector:" + by);
//        }
//
//
//    }

}
