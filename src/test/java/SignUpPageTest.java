import org.junit.Test;

public class SignUpPageTest extends BaseTest {

    @Test
    public void successfulSignUpAsTeacher () {
        homePage.clickOnSingUpButton();
        signUpPage.selectRoleTeacher();
        signUpPage.inputFullName();
        signUpPage.inputEmailTeacher();
        signUpPage.inputValidPassword();
        signUpPage.putCheckmarkInCheckBox();
        signUpPage.clickButtonSignUp();
        signUpPage.iconUserShouldBeVisible();
        header.buttonStudentDirectoryIsAble();
    }

    @Test
    public void successfulSignUpAsStudent () {
        homePage.clickOnSingUpButton();
        signUpPage.selectRoleStudent();
        signUpPage.inputFullName();
        signUpPage.inputEmailStudent();
        signUpPage.inputValidPassword();
        signUpPage.putCheckmarkInCheckBox();
        signUpPage.clickButtonSignUp();
        signUpPage.iconUserShouldBeVisible();
        header.buttonStudentDirectoryIsAble();
    }

    @Test
    public void signUpWithoutSelectedRole (){
        homePage.clickOnSingUpButton();
        signUpPage.inputFullName();
        signUpPage.inputEmailStudent();
        signUpPage.inputValidPassword();
        signUpPage.putCheckmarkInCheckBox();
        signUpPage.clickButtonSignUp();
        signUpPage.errorMassageHasText();
        signUpPage.errorMessageIsVisible();
    }

    @Test
    public void signInWithExistedEmail (){
        homePage.clickOnSingUpButton();
        signUpPage.selectRoleStudent();
        signUpPage.inputFullName();
        signUpPage.inputRegisteredEmail();
        signUpPage.inputValidPassword();
        signUpPage.putCheckmarkInCheckBox();
        signUpPage.clickButtonSignUp();
        signUpPage.errorMessageExistEmailIsVisible();
        signUpPage.errorMessageExistEmailHasText();
    }
    @Test
    public void linkOnTermsIsAble (){
        homePage.clickOnSingUpButton();
        signUpPage.clickOnLinkTerms();
        signUpPage.theTextOfTermsIsVisible();
    }
    @Test
    public void linkOnPrivacyPolicyIsAble (){
        homePage.clickOnSingUpButton();
        signUpPage.clinkOnPrivacyPolicy();
        signUpPage.thePrivacyPolicyTextIsVisible();
    }

    @Test
    public void headerIsExist () {
        homePage.clickOnSingUpButton();
        signUpPage.headerIsVisible();
    }

    @Test
    public void footerIsExist () {
        homePage.clickOnSingUpButton();
        signUpPage.footerIsVisible();
    }









    }


