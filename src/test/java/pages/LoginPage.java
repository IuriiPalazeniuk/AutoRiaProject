package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.byXpath;

@Getter
public class LoginPage extends BasePage {

    private String mail = "10rubliv@gmail.com";
    private String password = "Yura19861116";

    @FindBy(xpath = "//div[@class='loginbar']/a[1]")
    private SelenideElement logedUser;

    @FindBy(id = "email")
    private SelenideElement mailFacebook;

    @FindBy(id = "pass")
    private SelenideElement passFacebook;

    @FindBy(id = "login_frame")
    private WebElement loginFrame;


    public void loginBySocial(String social) {
        switchTo().frame(loginFrame);
        $(byXpath("//a[contains(@title, '" + social + "')]")).waitUntil(Condition.enabled, 5000).click();
        switchTo().window("Facebook");
        mailFacebook.setValue(mail);
        passFacebook.setValue(password).pressEnter();
    }
}
