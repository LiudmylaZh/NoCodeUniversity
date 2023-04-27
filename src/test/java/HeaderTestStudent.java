import com.codeborne.selenide.Configuration;
import org.junit.Test;

public class HeaderTestStudent extends BaseTest{

    @Test
    public void theButtonAboutUsIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(" malik@example.com", "123456");
        header.buttonAboutAsIsAble();
    }

    @Test
    public void theButtonCoursesIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(" malik@example.com", "123456");
        header.buttonCoursesIsAble();
        courses.courseCartsAreExist();
        courses.currentUrlIsCorrect();
    }

    @Test
    public void theButtonProfessorIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("malik@example.com", "123456");
        header.buttonProfessorsIsAble();
        homePage.formOfProfessorsIsOpen();
    }
    @Test
    public void buttonStudentDirectoryIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("malik@example.com", "123456");
        header.buttonStudentDirectoryIsAble();
        studentDirectory.formOfStudentIsExist();
    }


    @Test
    public void userIconIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("malik@example.com", "123456");
        header.clickOnUserIconStudent ();
        header.userMenuIsVisible();

    }
}
