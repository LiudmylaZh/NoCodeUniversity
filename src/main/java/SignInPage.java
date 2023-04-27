import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class SignInPage {
    private SelenideElement signInForm = $(byId("signin"));
    private SelenideElement inputFieldEmail = $ (byId("sw-form-capture-email-input"));
    private SelenideElement inputFieldPassword = $(byId("sw-form-password-input"));
    private SelenideElement signInButton = $(byId("sw-sign-in-submit-btn"));
    private SelenideElement avatarOfTeacher = $(byAttribute("alt", "Roxanne"));
    private SelenideElement studentDirectoryButton = $ (byAttribute("href", "/student-directory"));
    private SelenideElement errorMessage = $(byClassName("error-msg-icon"));
    private SelenideElement avatarOfStudent = $(byAttribute("src", "https://v5.airtableusercontent.com/v1/16/16/1681840800000/63dD2yME58NFOfJaUelKBg/NLWGdesIgGA919vHhzXHehxYJpaMaVEAYD_bS2WBUwp2s7u0urzP4TF4dZg1sj_t4EJinCOHbgCHesyRD6TIDw/5LrDTF51PjuGMM2dS7dYh2qRS-pGAA9b-tCDzJR6ezQ"));
    private SelenideElement linkToResetPassword = $(byAttribute("href","/forgot-password"));

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

    public void clickOnForgotPassword (){
        linkToResetPassword.click();
    }

   public void successSignIn(String valueEmail, String valuePassword) {
        clickOnSingInButton();
        enterEmail(valueEmail);
        enterPassword(valuePassword);
        clickOnSingInButton();

   }



}
