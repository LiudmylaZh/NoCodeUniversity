import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static java.lang.Thread.sleep;

public class HeaderTest extends BaseTest{


    @Test
    public void theElementOfHeaderIsExist () throws InterruptedException {
        homePage.logoShouldBeVisible();
        homePage.buttonAboutUsShouldBeVisible();
        homePage.buttonCoursesShouldBeVisible();
        homePage.buttonProfessorsShouldBeVisible();
        sleep(1000);
        homePage.singInButtonInTheHeaderShouldBeVisible();
        homePage.singUpButtonInHeaderShouldBeVisible();
    }

    @Test
    public void theButtonAboutUsIsAble () throws InterruptedException {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("roxanne@example.com", "123456");
        sleep(10000);

        //header.buttonAboutAsIsAble();
    }

    @Test
    public void theButtonCoursesIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("roxanne@example.com", "123456");
        header.buttonCoursesForTeacher();
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

    @Test
    public void theButtonAboutUsForStudentIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(" malik@example.com", "123456");
        header.buttonAboutAsIsAble();
    }

    @Test
    public void theButtonCoursesForStudentIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("malik@example.com", "123456");
        header.buttonCoursesForStudent();
        courses.courseCartsAreExist();
        courses.currentUrlIsCorrect();
    }


    @Test
    public void theButtonProfessorForStudentIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("malik@example.com", "123456");
        header.buttonProfessorsIsAble();
        professorPage.formOfProfessorsIsOpen();
    }
    @Test
    public void buttonStudentDirectoryForStudentIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("malik@example.com", "123456");
        header.buttonStudentDirectoryIsAble();
        studentDirectory.formOfStudentIsExist();
    }


    @Test
    public void userIconOfStudentIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("malik@example.com", "123456");
        header.clickOnUserIconStudent ();
        header.userMenuIsVisible();

    }

}
