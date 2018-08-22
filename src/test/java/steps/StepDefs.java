package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.MainPage;
import pages.SearchResultPage;

import static com.codeborne.selenide.Selenide.open;

public class StepDefs {


    @Given("^Main page is opened$")
    public void main_page_is_opened() {
        open(Configuration.baseUrl);
    }

    @When("^I chose ?([^\"]*)?  and ?([^\"]*)? of the car$")
    public void iChoseModelAndMarkOfTheCar(String model, String mark) {
        Selenide.page(MainPage.class).searchCar(model, mark);
    }

    @Then("^the search results contains ?([^\"]*)?$")
    public void iCheckResult(String result) {
        SearchResultPage searchResultPage = Selenide.page(SearchResultPage.class);
        searchResultPage.getHeader().shouldHave(Condition.text(result));
    }

    @When("^login to account by ?([^\"]*)?$")
    public void iOpenLogInWithUserNameAndPassword(String social) {
        LoginPage loginPage = Selenide.page(MainPage.class).clickLogIn();
        loginPage.loginBySocial(social);
    }

    @Then("^user is logged ?([^\"]*)?$")
    public void iAmLogedAndISeeMyNameResult(String result) {
        MainPage mainPage = Selenide.page(MainPage.class);
        mainPage.switchtoAnotherWindow(0);
        LoginPage loginPage = mainPage.clickLogIn();
        loginPage.getLogedUser().shouldHave(Condition.text(result));
    }

    @And("^click ?([^\"]*)? button$")
    public void clickSubmitButton(String button) {
        Selenide.page(MainPage.class).clickButton(button);
    }

}
