import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HighlightElement {

    public static void main(String[] args) {
        // youtube 2019  https://www.youtube.com/watch?v=M8hfm1ekkyQ
        //  JavaScriptExecutor - interface
        // Used to execute Javascript using selenium webdriver
        // It uses two methods - executeAsyncScript and executeScript
        // Purpose: if locators don't work then we use javascriptexecutor

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver75b\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        Thread.sleep(3000);

    }


}
