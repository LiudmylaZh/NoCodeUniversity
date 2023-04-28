import org.junit.Test;

public class HomePageTest extends BaseTest{
    @Test
    public void theElementsOnStartPageShouldBeVisible(){
        homePage.logoShouldBeVisible();
        homePage.buttonAboutUsShouldBeVisible();
        homePage.buttonCoursesShouldBeVisible();
        homePage.buttonProfessorsShouldBeVisible();
        homePage.singInButtonInMiddleOfPageShouldBeVisible();
        homePage.singUpButtonInMiddleOfPageShouldBeVisible();
        homePage.containersContentShouldBeVisible();
        homePage.containersContentShouldBeVisible();

    }
    @Test
    public void theButtonSingInIsAvailable(){
        homePage.clickOnSignInButton();
        signInPage.signInFormShouldBeVisible();
        signInPage.inputFieldEmailShouldBeVisible();
        signInPage.currentUrlIsCorrectOnPageSignIn();
    }
    @Test
    public void  theButtonSignUpIsAvailable(){
        homePage.clickOnSingUpButton();
        signUpPage.signUpFormShouldBeVisible();
        signUpPage.inputFieldFullNameShouldBeVisible();
        signUpPage.currentUrlIsCorrectOnPageSignUp();

    }
}
