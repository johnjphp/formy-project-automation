import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver75\\chromedriver.exe");

        // 6-17-19 works. Exercise 2-5
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        Thread.sleep(3000);
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();  // Click on Open new tab.  2 tabs will be opened.

        Thread.sleep(3000);
        String originalHandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        Thread.sleep(5000);
        driver.switchTo().window(originalHandle); // Switch back to first tab.
        Thread.sleep(3000);
        driver.quit();
    }
}
