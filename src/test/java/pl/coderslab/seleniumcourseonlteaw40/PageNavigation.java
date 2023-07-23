package pl.coderslab.seleniumcourseonlteaw40;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigation {
    @Test
    public void searchWithDuckDuckGo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        driver.get("https://duckduckgo.com/");
        driver.get("https://duckduckgo.com/");
        //driver.quit();
    }
}
