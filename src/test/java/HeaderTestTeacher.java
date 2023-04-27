import com.codeborne.selenide.Configuration;
import org.junit.Test;

public class HeaderTestTeacher extends BaseTest{


    @Test
    public void theElementOfHeaderIsExist (){
        homePage.logoShouldBeVisible();
        homePage.buttonAboutUsShouldBeVisible();
        homePage.buttonCoursesShouldBeVisible();
        homePage.buttonProfessorsShouldBeVisible();
        homePage.singInButtonInTheHeaderShouldBeVisible();
        homePage.singUpButtonInHeaderShouldBeVisible();
    }

    @Test
    public void theButtonAboutUsIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("roxanne@example.com", "123456");
        header.buttonAboutAsIsAble();
    }

    @Test
    public void theButtonCoursesIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("roxanne@example.com", "123456");
        header.buttonCoursesIsAble();
        courses.courseCartsAreExist();
        courses.currentUrlIsCorrect();
    }

    @Test
    public void theButtonProfessorIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("roxanne@example.com", "123456");
        header.buttonProfessorsIsAble();
        homePage.formOfProfessorsIsOpen();
    }
    @Test
    public void buttonStudentDirectoryIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("roxanne@example.com", "123456");
        header.buttonStudentDirectoryIsAble();
        studentDirectory.formOfStudentIsExist();
    }

    @Test
    public void buttonAddCourseIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("roxanne@example.com", "123456");
        header.clickOnButtonAddCourse();
        addCoursePage.currentUrlIsCorrect();
        addCoursePage.headerOfAddCourseFormShouldHaveText();
    }
    @Test
    public void userIconIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("roxanne@example.com", "123456");
        header.clickOnUserIconTeacher();
        header.userMenuIsVisible();

    }

}
