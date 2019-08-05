import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInAcceptanceTests extends WebDriverSetup {


    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get(Constants.LOG_IN_PAGE);
    }


    @Test
    public void logInAcceptanceTests() {
        checkIfLogInButtonIsPresent();
        checkIfUsernameFieldIsPresent();
        checkIfPasswordFieldIsPresent();
        checkLogInColorButton();
        checkIfForgotPasswordButtonIsPresent();
    }

    private void checkIfLogInButtonIsPresent() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.LOG_IN_BUTTON))).isDisplayed();
    }


    private void checkIfUsernameFieldIsPresent() {
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath(Constants.USERNAME_FIELD))).isDisplayed();
    }


    private void checkIfPasswordFieldIsPresent() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath(Constants.PASSWORD_FIELD))).isDisplayed();
    }


    private void checkLogInColorButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.LOG_IN_BUTTON)));
        String buttonColor = driver.findElement(
                By.id(Constants.LOG_IN_BUTTON)).getCssValue(Constants.CSS_BACKGROUND_COLOR_VALUE);
        Assert.assertEquals(Constants.LOG_IN_BUTTON_COLOR, buttonColor);
    }


    private void checkIfForgotPasswordButtonIsPresent() {
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath(Constants.FORGOT_PASSWORD_BUTTON))).isDisplayed();
    }

}
