import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverSetup {
    WebDriver driver;
    static WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 7);
    }

    static void acceptPrivacyPolicy(WebDriverWait wait) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.CONSENT_PROMPT_SUBMIT))).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
