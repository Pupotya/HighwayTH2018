package homework3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import resources.Parameters;

import static resources.Resources.getValuesFromBank;


public class Banks {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", Parameters.CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get(Parameters.PRIVAT_BANK);
//        double privatBuy = getValuesFromBank(driver,".section-content.rate");
//        double privatSell = getValuesFromBank(driver,".section-content.rate");
        driver.get(Parameters.AVAL);
        double avalBuy = getValuesFromBank(driver,".body-currency-block-rba>.body-currency tr:nth-child(2) td:nth-child(2)");
        double avalSell = getValuesFromBank(driver,".body-currency-block-rba>.body-currency tr:nth-child(2) td:nth-child(3)");

        System.out.println(avalSell);
        System.out.println(avalBuy);

        driver.quit();

    }



}
