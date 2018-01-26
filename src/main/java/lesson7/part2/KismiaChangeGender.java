package lesson7.part2;

import org.testng.annotations.Test;

public class KismiaChangeGender extends BrowserFactory {

    @Test
    public void changeGender(){

        driver.get("https://kismia.com/settings#profile");

    }

}
