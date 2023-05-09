import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class SignInPage {
    private SelenideElement signInForm = $(byId("signin"));
    private SelenideElement inputFieldEmail = $ (byId("sw-form-capture-email-input"));
    private SelenideElement inputFieldPassword = $(byId("sw-form-password-input"));
    //private ElementsCollection singInButtons = $$(byAttribute("href", "/sign-in"));
    //private SelenideElement avatarOfTeacher = $(byAttribute("alt", "Roxanne"));
    private SelenideElement signInButton = $(byId("sw-sign-in-submit-btn"));
    private SelenideElement avatarOfTeacher = $(byCssSelector("class*='MuiAvatar-img'"));
    private SelenideElement studentDirectoryButton = $ (byAttribute("href", "/student-directory"));
    private SelenideElement errorMessage = $(byClassName("error-msg-icon"));
    private SelenideElement avatarOfStudent = $(byAttribute("alt", "Malik"));
    private SelenideElement linkToResetPassword = $(byAttribute("href","/forgot-password"));
    private SelenideElement signOutStudent = $ (byAttribute("href", "#"));

    public void signInFormShouldBeVisible() {
        signInForm.shouldBe(Condition.visible);
    }
    public void inputFieldEmailShouldBeVisible(){
        inputFieldEmail.shouldBe(Condition.visible);
    }
    public void currentUrlIsCorrectOnPageSignIn(){
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/sign-in"));
    }
    public void enterEmail(String enterEmail) {
        inputFieldEmail.setValue(enterEmail);
    }
    public void enterPassword(String enterPassword) {
        inputFieldPassword.setValue(enterPassword);
    }
    public void clickOnSingInButton (){
        signInButton.click();
    }
    public void avatarOfTeacherShouldBeVisible(){
        avatarOfTeacher.shouldBe(visible);
    }
    public void studentDirectoryButtonShouldBeVisible (){
        studentDirectoryButton.shouldBe(visible);

    }
    public void theErrorMessageShouldBeVisible (){
        errorMessage.shouldBe(visible);
    }
    public void avatarOfStudentShouldBeVisible (){
        avatarOfStudent.shouldBe(visible);
    }
    public void clickOnAvatarStudent () {
        avatarOfStudent.click();

    }
    public void clickOnSignOutButtonStudent () {
        avatarOfStudent.shouldBe(visible, Duration.ofSeconds(1000));
        signOutStudent.click();

    }


    public void clickOnForgotPassword (){
        linkToResetPassword.click();
    }

   public void successSignIn(String valueEmail, String valuePassword)  {
        clickOnSingInButton();
        enterEmail(valueEmail);
        enterPassword(valuePassword);
        clickOnSingInButton();

   }



}
