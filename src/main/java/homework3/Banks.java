package homework3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import resources.Parameters;

import static resources.Resources.*;


public class Banks {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", Parameters.CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();

        driver.get(Parameters.PRIVAT_BANK);
        double privatBuy = getValuesFromBank(driver, ".section-content.rate");
        double privatSell = getSellFromPrivat(driver, ".section-content.rate");

        driver.get(Parameters.AVAL);
        double avalBuy = getValuesFromBank(driver, ".body-currency-block-rba>.body-currency tr:nth-child(2) td:nth-child(2)");
        double avalSell = getValuesFromBank(driver, ".body-currency-block-rba>.body-currency tr:nth-child(2) td:nth-child(3)");

        driver.get(Parameters.OSCHAD_BANK);
        double oschadBuy = getValuesFromBank(driver, "div.currency-item>.currency-sign.USD + .currency-rate>.buy-USD");
        double oschadSell = getValuesFromBank(driver, "div.currency-item>.currency-sign.USD + .currency-rate>.sell-USD");

        driver.get(Parameters.UKRSIBB);
        double ukrsibBuy = getValuesFromBank(driver, ".currency__table>tbody>tr:nth-child(1) td:nth-child(2)");
        double ukrsibSell = getValuesFromBank(driver, ".currency__table>tbody>tr:nth-child(1) td:nth-child(3)");

        driver.get(Parameters.BANK_GOV);
        double nbu = (getValuesFromBank(driver, "//table/tbody/tr/td[contains(.,'USD')]/following-sibling::td[3]")) / 100.00;

        Double[] banksBuy = {privatBuy, avalBuy, oschadBuy, ukrsibBuy, nbu};
        Double[] banksSell = {privatSell, avalSell, oschadSell, ukrsibSell, nbu};
        //debug:
//        for(int i=0;i<banksBuy.length;i++){
//            System.out.println(banksBuy[i]);
//        }
        System.out.println("average buy is:" + getAveraged(banksBuy));
        System.out.println("average sell is:" + getAveraged(banksSell));
        System.out.println("Bank with lowest buy: " + getBankByIndex(getIndexOfMinValue(banksBuy)));
        System.out.println("bank with max sell: " + getBankByIndex(getIndexOfMaxValue(banksSell)));
        driver.quit();

    }


}
