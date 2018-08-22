package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    @FindBy(className = "tl")
    private SelenideElement logIn;

    @FindBy(xpath = "(//label[@for='brandTooltipBrandAutocompleteInput-brand'])[2]")
    private SelenideElement brand;

    @FindBy(xpath = "//ul[@class='unstyle scrollbar autocomplete-select']")
    private SelenideElement listOfCars;


    public void searchCar(String marka_auto, String model1) {
        selectCar("brand", marka_auto);
        selectCar("model", model1);
    }

    public LoginPage clickLogIn() {
        logIn.click();
        return page(LoginPage.class);
    }
}
