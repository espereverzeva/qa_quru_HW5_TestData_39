package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TableResponsive {
    private final SelenideElement tableResponsiveInput = $(".table-responsive");

    public void setTable (String key, String value){
        tableResponsiveInput.$(byText(key)).parent().shouldHave(text(value));
    }
}
