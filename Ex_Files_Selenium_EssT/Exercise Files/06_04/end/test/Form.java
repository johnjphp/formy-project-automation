import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        // System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        // Exercise 06 04 - 6-20-19 use page objects; create new folder under start: pages and then create
        // 2 classes:  ConfirmationPage, FormPage and call classes / methopds from these page objects.
        // Refer to project to run this Form with 2 new pages.

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver75\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }
}
