package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import resources.Parameters;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Akinator {
    //TODO while(element with question present)
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", Parameters.CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);

        driver.get("http://ru.akinator.com/");
        driver.findElement(By.cssSelector("a.rouge")).click();
        System.out.println(driver.findElement(By.cssSelector("#bulle-inner")).getText());
        String age = "22";
        Actions action = new Actions(driver);
        WebElement element=driver.findElement(By.cssSelector("#infos-area-footer>input[type='submit']"));
        driver.findElement(By.cssSelector("#elokence_sitebundle_identification_age")).sendKeys(age);
        action.doubleClick(element).build().perform();

        Thread.sleep(2000);

        for(int i=0;i<7;i++){
            System.out.println(driver.findElement(By.cssSelector("#bulle-inner")).getText());
            for(int j=1;j<6;j++){

                System.out.println(j+" - "+driver.findElement(By.cssSelector("a#reponse"+j)).getText());

            }

            driver.findElement(By.cssSelector("a#reponse"+readInput())).click();
        }

//        driver.findElement(By.cssSelector("#bulle-inner")).getText();

    }

    static String readInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш ответ");
        return scanner.nextLine();
    }

}
