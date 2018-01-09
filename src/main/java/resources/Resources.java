package resources;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class Resources {
    public static ExpectedCondition<Boolean> waitForJsToLoad() {
        return new ExpectedCondition<Boolean>() {
//            @Override
            public Boolean apply(WebDriver driver) {
                return (Boolean) ((JavascriptExecutor) driver).executeScript("return document.readyState === 'complete'");
            }};
        }

    public static double getValuesFromBank(WebDriver driver, String selector) {
        String bank = driver.findElement(By.cssSelector(selector)).getText().replace(",",".");
        return Double.parseDouble(bank);
    }



}
