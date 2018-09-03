import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class MyFirstTest extends TestBase {

    @Test
    public void myFirstTest() {
        driver.get("http://www.google.com.ua/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void mySecondTest() {
        driver.get("http://www.google.com.ua/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        wait.until(titleIs("webdriver - Поиск в Google"));
    }


    @Test
    public void myThirdTest() {
        driver.get("http://www.google.com.ua/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        wait.until(titleIs("webdriver - Поиск в Google"));
    }


}
