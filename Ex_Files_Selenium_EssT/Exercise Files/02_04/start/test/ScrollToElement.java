import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver75\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        Thread.sleep(2000);

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions. moveToElement(name);
        Thread.sleep(3000);
        name.sendKeys("john jjjj");

        Thread.sleep(3000);
        WebElement date = driver.findElement(By.id ("date"));
        Thread.sleep(3000);
        date.sendKeys("06/17/19");
        Thread.sleep(3000);

        driver.quit();
    }
}
