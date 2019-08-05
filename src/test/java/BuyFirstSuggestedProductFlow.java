
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BuyFirstSuggestedProductFlow extends WebDriverSetup {


    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get(Constants.HOME_PAGE);
        WebDriverSetup.acceptPrivacyPolicy(wait);
    }

    @Test
    public void buyProduct() {
        AllElementsForBuyProduct.clickOnFirstProductSuggested();
        AllElementsForBuyProduct.addProductToCart();
        AllElementsForBuyProduct.goToCartFromPopUp();
        AllElementsForBuyProduct.proceedToCheckOut();
        AllElementsForBuyProduct.continueAsGuest();
        AllElementsForBuyProduct.goToMyDataScreen();
        AllElementsForBuyProduct.selectSalutation();
        AllElementsForBuyProduct.fillMyDataPage();
        AllElementsForBuyProduct.selectBirthday();
        AllElementsForBuyProduct.acceptTermsAndConditions();
        AllElementsForBuyProduct.goToPaymentScreen();
        AllElementsForBuyProduct.checkIfPaymentScreenIsDisplayed();


    }

}

