import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchBarTests extends WebDriverSetup {

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get(Constants.HOME_PAGE);
        WebDriverSetup.acceptPrivacyPolicy(wait);
    }

    @Test
    public void searchBar() {

        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.id(Constants.SEARCH_BAR))).sendKeys(Constants.SEARCH_STRING1);


        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath(Constants.FIRST_SUGGESTION_ON_SEARCH_BAR))).click();

        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath(Constants.SEARCH_BUTTON))).click();

        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.className(Constants.SEARCH_PAGE_CLASS))).isDisplayed();
    }

}
