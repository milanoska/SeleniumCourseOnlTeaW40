package pl.coderslab.seleniumcourseonlteaw40;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorByCssTest {
        @Test
        public void byCSS() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://hotel-testlab.coderslab.pl/en/");
            WebElement hotelLocationInputBox = driver.findElement(By.cssSelector("#hotel_location"));
            hotelLocationInputBox.sendKeys("Warsaw");
            WebElement hotelSelectName = driver.findElement(By.cssSelector("#search_hotel_block_form > div:nth-child(2) > div"));
            hotelSelectName.click();
            WebElement hotelSelectName1 = driver.findElement(By.cssSelector("#search_hotel_block_form > div:nth-child(2) > div > ul > li"));
            hotelSelectName1.click();
            WebElement hotelCheckInBoxCSS = driver.findElement(By.cssSelector("#check_in_time"));
            hotelCheckInBoxCSS.sendKeys("24-07-2023" + Keys.ENTER);
            WebElement hotelCheckOutBoxCSS = driver.findElement(By.cssSelector("#check_out_time"));
            hotelCheckOutBoxCSS.sendKeys("25-07-2023" + Keys.ENTER);
            WebElement hotelSearchRoomSubmit = driver.findElement(By.cssSelector("#search_room_submit"));
            hotelSearchRoomSubmit.click();
        }
    }
