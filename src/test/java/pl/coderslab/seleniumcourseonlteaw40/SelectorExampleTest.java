package pl.coderslab.seleniumcourseonlteaw40;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorExampleTest {
    @Test
    public void byId() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocationInputBox = driver.findElement(By.id("hotel_location"));
        hotelLocationInputBox.sendKeys("Warsaw");
        //WebElement searchNowButton = driver.findElement(By.id("search_room_submit"));
        WebElement emailInputBox = driver.findElement(By.id("newsletter-input"));
        emailInputBox.sendKeys("ala@makota.pl");
    }

    @Test
    public void byName() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocationInputBox = driver.findElement(By.name("hotel_location"));
        hotelLocationInputBox.sendKeys("Warsaw");
    }
}
