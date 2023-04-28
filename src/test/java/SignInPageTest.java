import com.codeborne.selenide.Configuration;
import org.junit.Test;

public class SignInPageTest extends BaseTest{
    @Test

    public void loginWithValidDatesWithRoleTeacher() {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.enterEmail("roxanne@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickOnSingInButton();
        signInPage.avatarOfTeacherShouldBeVisible();
        signInPage.studentDirectoryButtonShouldBeVisible();

    }
@Test
    public void loginWithInvalidDatesWithRoleTeacher() {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.enterEmail("roxanne1@example.com");
        signInPage.enterPassword("123Q456");
        signInPage.clickOnSingInButton();
        signInPage.theErrorMessageShouldBeVisible();


    }

    @Test

    public void loginWithValidDatesWithRoleStudent() {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.enterEmail("malik@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickOnSingInButton();
        signInPage.avatarOfStudentShouldBeVisible();



    }

    @Test
    public void loginWithInvalidDatesWithRoleStudent() {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.enterEmail("malik.example.com");
        signInPage.enterPassword("12345");
        signInPage.clickOnSingInButton();
        signInPage.theErrorMessageShouldBeVisible();
    }


        @Test
    public void resetPassword (){
        homePage.clickOnSignInButton();
        signInPage.clickOnForgotPassword();
        recoverPassword.inputFieldEmailIsVisible();
        // how does check the form which is not exist?

    }


}
