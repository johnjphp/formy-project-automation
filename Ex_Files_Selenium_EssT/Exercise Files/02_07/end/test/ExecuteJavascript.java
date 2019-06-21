import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        // Exercise 2-7   6-18-19
        // Use javascriptExecutor to find hard to select elements i.e. modal pop-ups
        // System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver75\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        Thread.sleep(3000);
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();  // modal window is open.

        Thread.sleep(3000);
        WebElement closeButton = driver.findElement(By.id("close-button"));
        // closeButton.click();   // Note this also worked to select Close.
        JavascriptExecutor js = (JavascriptExecutor)driver;

        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", closeButton);

        driver.quit();
    }
}
