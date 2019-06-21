import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) throws InterruptedException {

       //  System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver75\\chromedriver.exe");

        // Exercise 06-01 full form;    6-20-19
        WebDriver driver = new ChromeDriver();

        // driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);    // 8 in units of seconds;
        // To slow it down add some sleeps to view in the browser.

        driver.get("https://formy-project.herokuapp.com/form");
        Thread.sleep(3000);

        driver.findElement(By.id("first-name")).sendKeys("John");
        Thread.sleep(3000);

        driver.findElement(By.id("last-name")).sendKeys("Doe");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();  // selector

        driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
        Thread.sleep(3000);

        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();  // submit button;

        driver.quit();
    }
}
