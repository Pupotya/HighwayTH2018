package lesson7.part2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KismiaLogin extends BrowserFactory {

    @Test
    @Parameters({"email", "password"})
    public void login(@Optional("bimbamail@cryp.email") String email, @Optional("bimbamail") String password) throws InterruptedException {
        driver.get("https://kismia.com/");
        driver.findElement(By.cssSelector("#user-email")).clear();
        driver.findElement(By.cssSelector("#user-email")).sendKeys(email);
        driver.findElement(By.cssSelector("#user-password")).clear();
        driver.findElement(By.cssSelector("#user-password")).sendKeys(password);
        driver.findElement(By.cssSelector("#sign-in-form .submit")).click();
        Thread.sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://kismia.com/u"), "Wrong PAGE: " + driver.getCurrentUrl());
    }

}
