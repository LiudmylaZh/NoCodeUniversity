import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.restassured.http.ContentType;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class SignUpPage {
    private SelenideElement signUpForm = $(byId("signup"));
    private SelenideElement inputFieldFullName = $ (byId("sw-form-capture-full_name-input"));
    private SelenideElement selectRole = $ (byClassName("filter-option-inner-inner"));
    private SelenideElement roleTeacher = $ (byId("bs-select-1-0"));
    private SelenideElement inputFieldEmail = $ (byId("sw-form-capture-email-input"));
    private SelenideElement inputFieldPassword = $ (byId("sw-form-password-input"));
    private SelenideElement checkMark = $ (byXpath("//*[@id=\"signup\"]/div[4]/div[2]/label/span[1]"));
    private SelenideElement buttonSignUpForm = $ (byId("sw-sign-up-submit-btn"));
    private ElementsCollection buttons = $$(byAttribute("type", "button"));
    private SelenideElement userIcon = buttons.get(0);
    private SelenideElement sectionWelcome = $ (byClassName("container"));
    private SelenideElement roleStudent = $ (byId("bs-select-1-1"));
    private SelenideElement errorMessageNotFullData = $ (byXpath("//*[@id=\"signup\"]/div[3]"));
    private SelenideElement linkOnTerms =  $ (byAttribute("href", "https://www.softr.io/terms"));
    private SelenideElement textOfTerms = $ (byClassName("container"));
    private SelenideElement linkOnPrivacyPolicy = $ (byAttribute("href", "https://www.softr.io/policy"));
    private SelenideElement textPrivacyPolicy = $ (byClassName("container"));
    private SelenideElement header = $ (byClassName("css-183hjg0"));
    private SelenideElement footer = $ (byId("home-footer"));
    private SelenideElement errorMessageExistedEmail = $ (byXpath("//*[@id=\"signup\"]/div[1]"));

    public static String  BASE_URI = "https://studio-api.softr.io";


    public void deleteTeacherAccount(){
        String generatedEmail = generateTeacherEmail();
       given()
                .baseUri(BASE_URI)
                .header("Softr-Api-Key", "khIbAyJIU5CIuh1oDuBRx1s49")
                .header("Softr-Domain", "jere237.softr.app")
                .when().log().all()
                .contentType(ContentType.JSON)
                .delete("/v1/api/users/"+ generatedEmail)
                .then().log().all()
                .statusCode(200);
    }

    public void deleteStudentAccount(){
        String generatedEmail = generateStudentEmail();
        given()
                .baseUri(BASE_URI)
                .header("Softr-Api-Key", "khIbAyJIU5CIuh1oDuBRx1s49")
                .header("Softr-Domain", "jere237.softr.app")
                .when().log().all()
                .contentType(ContentType.JSON)
                .delete("/v1/api/users/"+ generatedEmail)
                .then().log().all()
                .statusCode(200);
    }

    public void signUpFormShouldBeVisible(){
        signUpForm.shouldBe(Condition.visible);
    }
    public void inputFieldFullNameShouldBeVisible(){
        inputFieldFullName.shouldBe(Condition.visible);
    }
    public void currentUrlIsCorrectOnPageSignUp(){
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/sign-up"));
    }
    public void selectRoleTeacher (){
        selectRole.click();
        roleTeacher.click();

    }
    public void selectRoleStudent (){
        selectRole.click();
        roleStudent.click();

    }
    public void inputFullName (){

        String alphabet = "abcdefhuytrew";
        String firstName = RandomStringUtils.random(3, alphabet);
        String lastName = RandomStringUtils.random(4, alphabet);
        String fullName = ("S" + firstName + " " + "O"+lastName);
        inputFieldFullName.setValue(fullName);


    }
   public void inputEmailTeacher(){
        inputFieldEmail.click();
        inputFieldEmail.setValue(generateTeacherEmail());
    }

    public String generateTeacherEmail (){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String randomEmailTeacher = "Teacher"+ randomInt +"@gmail.com";
        return randomEmailTeacher;
    }

    public void inputRegisteredEmail (){
        inputFieldEmail.click();
        inputFieldEmail.setValue("roxanne@example.com");

    }

    public void inputEmailStudent(){
        inputFieldEmail.click();
        inputFieldEmail.setValue(generateStudentEmail());
    }

    public String generateStudentEmail (){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String randomEmailStudent = "Teacher"+ randomInt +"@gmail.com";
        return randomEmailStudent;
    }


    public void inputValidPassword (){
        inputFieldPassword.setValue("123QW!");

    }
    public void putCheckmarkInCheckBox(){
        checkMark.click();
        sleep(1000);

    }
    public void clickButtonSignUp (){
        buttonSignUpForm.click();
    }

    public void iconUserShouldBeVisible () {
        userIcon.shouldBe(Condition.visible);
    }

    public void errorMessageIsVisible () {
        errorMessageNotFullData.shouldBe(Condition.visible);
    }
    public void errorMassageHasText () {
        errorMessageNotFullData.shouldHave(Condition.text("Please make sure there are no empty required fields."));

    }
    public void clickOnLinkTerms (){
        linkOnTerms.click();
    }
    public void theTextOfTermsIsVisible(){
        textOfTerms.shouldBe(Condition.visible);
    }
    public void clinkOnPrivacyPolicy (){
        linkOnPrivacyPolicy.click();
    }
    public void thePrivacyPolicyTextIsVisible (){
        textPrivacyPolicy.shouldBe(Condition.visible);

    }
    public void headerIsVisible () {
        header.shouldBe(Condition.visible);
    }

    public void footerIsVisible (){
        footer.shouldBe(Condition.visible);
    }
    public void errorMessageExistEmailIsVisible (){
        errorMessageExistedEmail.shouldBe(Condition.visible);

    }
    public void errorMessageExistEmailHasText (){
        errorMessageExistedEmail.shouldHave(Condition.text("User by given email already exists."));

    }

}
