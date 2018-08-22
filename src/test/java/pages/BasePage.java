package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byXpath;


public class BasePage extends Selenide {

    public void selectCar(String car, String parameters) {
        $(byXpath("(//label[@for='brandTooltipBrandAutocompleteInput-" + car + "'])[2]")).click();
        $(byXpath(" //a[@class='item bold' and contains(text(), '" + parameters + "')]")).click();
    }

    public void clickButton(String name) {
        $(byXpath("//button[@type='" + name + "']")).click();
    }

    public void switchtoAnotherWindow(int window) {
        switchTo().window(window);
    }
}
