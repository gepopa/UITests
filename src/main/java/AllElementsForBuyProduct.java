import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllElementsForBuyProduct extends WebDriverSetup {


    static void clickOnFirstProductSuggested() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(Constants.FIRST_PRODUCT_SUGGESTED_ON_LOG_IN_PAGE))).click();
    }

    static void addProductToCart() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(Constants.ADD_PRODUCT_TO_CART))).click();
    }

    static void goToCartFromPopUp() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(Constants.GO_TO_CART_FROM_POP_UP))).click();
    }

    static void proceedToCheckOut() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(By.id(Constants.GO_TO_CHECK_OUT))).click();

    }

    static void continueAsGuest() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(By.id(Constants.LOG_IN_METHOD1))).click();
    }

    static void goToMyDataScreen() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(By.id(Constants.GO_TO_NEXT_STEP))).click();

    }

    static void selectSalutation() {
        openDropDownMenu();
        selectMister();
    }

    private static void openDropDownMenu() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(Constants.OPEN_DROPDOWN_FOR_SALUTATION))).click();
    }

    private static void selectMister() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(Constants.SELECT_MR_SALUTATION))).click();
    }

    static void fillMyDataPage() {
        addFirstName();
        addLastName();
        addStreetName();
        addStreetNumber();
        addZipCode();
        addCity();
        addEmail();

    }

    private static void addFirstName() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.id(Constants.FIRST_NAME_FIELD))).sendKeys(Constants.FIRST_NAME);
    }

    private static void addLastName() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.id(Constants.LAST_NAME_FIELD))).sendKeys(Constants.LAST_NAME);
    }

    private static void addStreetName() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.id(Constants.STREET_NAME_FIELD))).sendKeys(Constants.STREET_NAME);
    }

    private static void addStreetNumber() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.id(Constants.STREET_NUMBER_FIELD))).sendKeys(Constants.STREET_NUMBER);
    }

    private static void addZipCode() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.id(Constants.ZIP_CODE_FIELD))).sendKeys(Constants.ZIP_CODE);
    }

    private static void addCity() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.id(Constants.CITY_FIELD))).sendKeys(Constants.CITY);
    }

    private static void addEmail() {
        WebDriverSetup.wait.until(ExpectedConditions
                .elementToBeClickable(By.id(Constants.EMAIL_FIELD))).sendKeys(Constants.EMAIL);
    }

    static void selectBirthday() {
        openBirthdayDayDropdown();
        selectDay12();
        openMonthDropdown();
        selectMonth4();
        openYearDropdown();
        selectYear1986();

    }

    private static void openBirthdayDayDropdown() {
        WebDriverSetup.wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath(Constants.BIRTHDAY_DAY_DROPDOWN))).click();
    }

    private static void selectDay12() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(Constants.BIRTHDAY_DAY12))).click();
    }

    private static void openMonthDropdown() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(Constants.BIRTHDAY_MONTH_DROPDOWN))).click();
    }

    private static void selectMonth4() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(Constants.BIRTHDAY_MONTH4))).click();
    }

    private static void openYearDropdown() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(Constants.BIRTHDAY_YEAR_DROPDOWN))).click();
    }

    private static void selectYear1986() {

        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(Constants.BIRThDAY_YEAR1986))).click();
    }

    static void acceptTermsAndConditions() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(By.id(Constants.TERMS_AND_CONDITIONS))).click();
    }

    static void goToPaymentScreen() {
        WebDriverSetup.wait.until(ExpectedConditions.elementToBeClickable(By.id(Constants.GO_TO_NEXT_STEP))).click();
    }

    static void checkIfPaymentScreenIsDisplayed() {

        WebDriverSetup.wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath(Constants.PAYMENT_SCREEN))).isDisplayed();
    }

}
