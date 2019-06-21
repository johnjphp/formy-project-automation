import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
    public static void main(String[] args) {

        // System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver75\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Exercise 5.3.   lynda Explicit wait better;  wait for expeted condition!  Pools for condition to be true. 6-20-19  jj
        // Lots of expected condition to test for:
        // Use API Class ExpectedConditions doc:
        // Obsolete:  https://stackoverflow.com/questions/49866334/c-sharp-selenium-expectedconditions-is-obsolete
        // And: from Wait.Until(ExpectedConditions.ElementIsVisible(By.Id("content-section")));  to Wait.Until(c => c.FindElement(By.Id("content-section")));   2018
        // Class ExpectedConditions:   https://seleniumhq.github.io/selenium/docs/api/dotnet/html/T_OpenQA_Selenium_Support_UI_ExpectedConditions.htm
        //
        // Depreciated:   https://www.reddit.com/r/selenium/comments/8os8l6/c_selenium_311_expectedconditions_replacements/  with Selenium 3.11
        // https://social.msdn.microsoft.com/Forums/vstudio/en-US/384f0b68-8278-4ecb-b637-f22df6f2a7d9/replace-waituntilexpectedconditions?forum=vsunittest
        // 2019 update:    https://sqa.stackexchange.com/questions/37250/selenium-web-driver-expectedconditions-deprecated-alternative

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));

        autocompleteResult.click();

        driver.quit();
    }
}
