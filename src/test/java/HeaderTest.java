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
        signInPage.successSignIn(EMAIL_TEACHER, PASSWORD);
        header.buttonAboutAsIsAble();
    }



    @Test
    public void theButtonProfessorIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_STUDENT, PASSWORD);
        header.buttonProfessorsIsAble();
        homePage.formOfProfessorsIsOpen();
    }
    @Test
    public void buttonStudentDirectoryIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_STUDENT, PASSWORD);
        header.buttonStudentDirectoryIsAble();
        studentDirectory.formOfStudentIsExist();
    }

    @Test
    public void buttonAddCourseIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_TEACHER, PASSWORD);
        header.clickOnButtonAddCourse();
        addCoursePage.currentUrlIsCorrect();
        addCoursePage.headerOfAddCourseFormShouldHaveText();
    }
    @Test
    public void teacherIconIsAble(){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_TEACHER, PASSWORD);
        header.clickOnTeacherIcon();
        header.userMenuIsVisible();

    }

    @Test
    public void theButtonAboutUsForStudentIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_STUDENT, PASSWORD);
        header.buttonAboutAsIsAble();
    }

    @Test
    public void theButtonCoursesForStudentIsAble () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_STUDENT, PASSWORD);
        header.buttonCoursesForStudent();
        courses.courseCartsAreExist();
        courses.currentUrlIsCorrect();
    }


    @Test
    public void theButtonProfessorForStudentIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_STUDENT, PASSWORD);
        header.buttonProfessorsIsAble();
        professorPage.formOfProfessorsIsOpen();
    }
    @Test
    public void buttonStudentDirectoryForStudentIsAble (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_STUDENT, PASSWORD);
        header.buttonStudentDirectoryIsAble();
        studentDirectory.formOfStudentIsExist();
    }


    @Test
    public void studentIconIsAble(){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn(EMAIL_STUDENT, PASSWORD);
        header.clickOnUserIconStudent ();
        header.userMenuIsVisible();

    }

}
