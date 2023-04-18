import org.junit.Test;

public class StartPageTest extends BaseTest{
    @Test
    public void theElementsOnStartPageShouldBeVisible(){
        startPage.logoShouldBeVisible();
        startPage.buttonAboutUsShouldBeVisible();
        startPage.buttonCoursesShouldBeVisible();
        startPage.setButtonProfessorsShouldBeVisible();
        startPage.singInButtonInMiddleOfPageShouldBeVisible();
        startPage.singUpButtonInMiddleOfPageShouldBeVisible();
        startPage.containersContentShouldBeVisible();
        startPage.containersContentShouldBeVisible();


    }

    @Test
    public void theButtonSingInIsAvailable(){
        startPage.clickOnSingInButton();
        signInPage.signInFormShouldBeVisible();
        signInPage.inputFieldEmailShouldBeVisible();
        signInPage.currentUrlIsCorrectOnPageSignIn();
    }
    @Test
    public void  theButtonSignUpIsAvailable(){
        startPage.clickOnSingUpButton();
        signUpPage.signUpFormShouldBeVisible();
        signUpPage.inputFieldFullNameShouldBeVisible();
        signUpPage.currentUrlIsCorrectOnPageSignUp();

    }
}
