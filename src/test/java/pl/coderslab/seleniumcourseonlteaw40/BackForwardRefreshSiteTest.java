package pl.coderslab.seleniumcourseonlteaw40;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefreshSiteTest {
    @Test
    public void BackForwardRefreshSite() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //driver.quit();
    }
}
