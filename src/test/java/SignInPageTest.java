import com.codeborne.selenide.Configuration;
import org.junit.Test;

public class SignInPageTest extends BaseTest{
    @Test

    public void loginWithValidDatesWithRoleTeacher() {
        startPage.clickOnSingInButton();
        Configuration.fastSetValue = true;
        signInPage.enterEmail("roxanne@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickOnSingInButton();
        signInPage.avatarOfTeacherShouldBeVisible();
        signInPage.studentDirectoryButtonShouldBeVisible();

    }
@Test
    public void loginWithInvalidDatesWithRoleTeacher() {
        startPage.clickOnSingInButton();
        Configuration.fastSetValue = true;
        signInPage.enterEmail("roxanne1@example.com");
        signInPage.enterPassword("123Q456");
        signInPage.clickOnSingInButton();
        signInPage.theErrorMessageShouldBeVisible();


    }

    @Test

    public void loginWithValidDatesWithRoleStudent() {
        startPage.clickOnSingInButton();
        Configuration.fastSetValue = true;
        signInPage.enterEmail("malik@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickOnSingInButton();
        signInPage.avatarOfStudentShouldBeVisible();



    }

    @Test
    public void resetPassword (){
        startPage.clickOnSingInButton();
        signInPage.clickOnForgotPassword();
        // how check the form which is not present?

    }


}
