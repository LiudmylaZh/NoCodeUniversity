import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    private SelenideElement logo = $(By.className("sw-width-5xs"));
    private SelenideElement buttonAboutUs = $(byAttribute("href", "#about-us"));
    private SelenideElement buttonCourses = $(byAttribute("href", "#courses-grid-non-logged-in"));
    private SelenideElement buttonProfessors = $(byAttribute("href","#teacher-spotlight-heading"));
    private ElementsCollection singUpButtons = $$(byAttribute("href", "/sign-up"));
    private ElementsCollection singInButtons = $$(byAttribute("href", "/sign-in"));
    private ElementsCollection containersContent = $$ (byClassName("container"));
    private SelenideElement headerOfProfessorsSection = $ (byClassName("ql-align-center"));
    private SelenideElement listOfProfessors = $ (byClassName("inbox-list-container"));
    private ElementsCollection cardsOfProfessors = $$(byClassName("horizontal-list-item"));





    public void logoShouldBeVisible() {
        logo.shouldBe(Condition.visible);
    }
    public void buttonAboutUsShouldBeVisible() {
        buttonAboutUs.shouldBe(Condition.visible);
    }


    public void buttonProfessorsShouldBeVisible(){
        buttonProfessors.shouldBe(Condition.visible);

    }
    public void singInButtonInTheHeaderShouldBeVisible(){
        singUpButtons.get(0).shouldBe(Condition.visible);
    }
    public void singInButtonInMiddleOfPageShouldBeVisible(){
     singUpButtons.get(1).shouldBe(Condition.visible);
    }

    public void singUpButtonInMiddleOfPageShouldBeVisible(){
        singInButtons.get(1).shouldBe(Condition.visible);
    }
    public void singUpButtonInHeaderShouldBeVisible(){
        singInButtons.get(0).shouldBe(Condition.visible);
    }
    public void containersContentShouldBeVisible() {
        containersContent.get(0).shouldBe(Condition.visible);
        containersContent.get(1).shouldBe(Condition.visible);
    }
    public void buttonCoursesShouldBeVisible() {
        buttonCourses.shouldBe(Condition.visible);
    }

 public void clickOnSignInButton(){

        singInButtons.get(1).click();
    }

    public void clickOnSingUpButton (){
        singUpButtons.get(1).click();
    }

    public void formOfProfessorsIsOpen() {
        headerOfProfessorsSection.shouldHave(text("Professor spotlight"));
        listOfProfessors.shouldBe(visible);
        cardsOfProfessors.shouldHave(CollectionCondition.size(10));
    }


}


