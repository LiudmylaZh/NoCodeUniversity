import com.codeborne.selenide.Configuration;
import org.junit.Test;

public class SignInPageTest extends BaseTest{
    @Test

    public void loginWithValidDatesWithRoleTeacher() {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_TEACHER, PASSWORD);
        signInPage.iconTeacherShouldBeVisible();
        signInPage.studentDirectoryButtonShouldBeVisible();

    }
@Test
    public void loginWithInvalidPasswordTeacher() {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_TEACHER, "123Q456");
        signInPage.theErrorMessageShouldBeVisible();
    }

    @Test
    public void loginWithValidDatesStudent() {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_STUDENT, PASSWORD);
        signInPage.iconStudentShouldBeVisible();
    }

    @Test
    public void loginWithInvalidEmailStudent() {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("braun.example.com", PASSWORD);
        signInPage.theErrorMessageShouldBeVisible();
    }

        @Test
    public void resetPassword (){
        homePage.clickOnSignInButton();
        signInPage.clickOnForgotPassword();
        recoverPassword.inputFieldEmailIsVisible();


    }

    @Test
    public void successfulLogOutTeacher () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_TEACHER, PASSWORD);
        signInPage.clickOnIconTeacher();
        signInPage.clickOnSignOutButtonTeacher();
        signInPage.signInFormShouldBeVisible();
        signInPage.currentUrlIsCorrectOnPageSignIn();
    }

    @Test
    public void successfulLogOutStudent () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_STUDENT, PASSWORD);
        signInPage.clickOnIconStudent();
        signInPage.clickOnSignOutButtonStudent();
        signInPage.signInFormShouldBeVisible();
        signInPage.currentUrlIsCorrectOnPageSignIn();
    }




}
