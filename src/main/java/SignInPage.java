import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

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
    private SelenideElement iconTeacher = $ (byXpath("//*[@id=\"home-header-logged-in-teachers\"]/header/div/div/div[2]/button"));;
    private SelenideElement studentDirectoryButton = $ (byAttribute("href", "/student-directory"));
    private SelenideElement errorMessage = $(byClassName("error-msg-icon"));
    private SelenideElement iconStudent = $ (byXpath("//*[@id=\"home_header4\"]/header/div/div/div[2]/button"));
    private SelenideElement linkToResetPassword = $(byAttribute("href","/forgot-password"));
    private SelenideElement signOutButtonTeacher = $ (byXpath("//*[@id=\"home-header-logged-in-teachers\"]/div/div[3]/ul/a[2]/span[1]"));
    private SelenideElement signOutButtonStudent = $ (byXpath("//*[@id=\"home_header4\"]/div/div[3]/ul/a[2]"));

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
    public void iconTeacherShouldBeVisible(){
        iconTeacher.shouldBe(visible);
    }
    public void studentDirectoryButtonShouldBeVisible (){
        studentDirectoryButton.shouldBe(visible);

    }
    public void theErrorMessageShouldBeVisible (){
        errorMessage.shouldBe(visible);
    }
    public void iconStudentShouldBeVisible(){
        iconStudent.shouldBe(visible);
    }
    public void clickOnIconStudent() {
        iconStudent.click();

    }
    public void clickOnSignOutButtonTeacher() {signOutButtonTeacher.click();}

    public void clickOnSignOutButtonStudent() {signOutButtonStudent.click();}
    public void clickOnIconTeacher (){
        iconTeacher.click();
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
