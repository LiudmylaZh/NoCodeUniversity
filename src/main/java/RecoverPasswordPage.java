import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class RecoverPasswordPage {
    private SelenideElement inputFieldEmail = $(byAttribute("placeholder", "Email"));

    public void inputFieldEmailIsVisible (){
        inputFieldEmail.shouldBe(Condition.visible);// inputFieldElement is not exist
    }
}
