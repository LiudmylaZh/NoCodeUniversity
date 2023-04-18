import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class SignUpPage {
    private SelenideElement signUpForm = $(byId("signup"));
    private SelenideElement inputFieldFullName = $ (byId("sw-form-capture-full_name-input"));

    public void signUpFormShouldBeVisible(){
        signUpForm.shouldBe(Condition.visible);
    }
    public void inputFieldFullNameShouldBeVisible(){
        inputFieldFullName.shouldBe(Condition.visible);
    }
    public void currentUrlIsCorrectOnPageSignUp(){
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/sign-up"));
    }


}
