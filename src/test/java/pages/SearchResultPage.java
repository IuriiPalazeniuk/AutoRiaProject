package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class SearchResultPage extends BasePage {

    @FindBy(id = "headerPage")
    private SelenideElement header;

}
