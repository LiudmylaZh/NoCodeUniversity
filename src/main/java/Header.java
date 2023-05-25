import com.codeborne.selenide.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.Assert.assertTrue;

public class Header {
    private SelenideElement buttonAboutUs = $(byAttribute("href", "#about-us"));
    private ElementsCollection containerAboutUs = $$(byClassName("container"));

    private SelenideElement buttonCourses = $(byId("#courses-grid-non-logged-in"));
    private SelenideElement coursesList = $(byAttribute("role", "menuitem"));
    private SelenideElement buttonProfessors = $(byAttribute("href", "#teacher-spotlight-heading"));
    private SelenideElement headerOfProfessorsSection = $ (byClassName("ql-align-center"));
    private SelenideElement listOfProfessors = $ (byClassName("inbox-list-container"));
    private ElementsCollection cardsOfProfessors = $$(byClassName("horizontal-list-item"));
    private SelenideElement buttonStudentDirectory = $ (byAttribute("href", "/student-directory"));
    private SelenideElement buttonAddCourse = $ (byAttribute("href", "/add-course"));
    private SelenideElement iconTeacher = $ (byXpath("//*[@id=\"home-header-logged-in-teachers\"]/header/div/div/div[2]/button/div"));
    private SelenideElement userMenu = $ (byAttribute("href", "/user-profile"));
    private SelenideElement iconStudent = $ (byXpath("//*[@id=\"home_header4\"]/header/div/div/div[2]/button"));
    private SelenideElement buttonCourseForTeacher = $ (byXpath("//*[@id=\"home-header-logged-in-teachers\"]/header/div/div/div[1]/a[2]"));

    private SelenideElement buttonCourseForStudent = $ (byXpath("//*[@id=\"home_header4\"]/header/div/div/div[1]/a[2]"));



    public void buttonAboutAsIsAble (){
        buttonAboutUs.shouldBe(enabled);
        buttonAboutUs.click();
        containerAboutUs.get(1).shouldBe(visible, Duration.ofSeconds(10));
        containerAboutUs.get(1).shouldHave(partialText("University"));

    }


    public void buttonCoursesForTeacher() {
        buttonCourseForTeacher.click();
        buttonCourseForTeacher.shouldBe(Condition.visible);
        coursesList.click();

    }
    public void buttonCoursesForStudent() {
        buttonCourseForStudent.click();
        buttonCourseForStudent.shouldBe(Condition.visible);
        coursesList.click();
    }



    public void buttonProfessorsIsAble () {
        buttonProfessors.click();
        buttonProfessors.shouldBe(visible, Duration.ofSeconds(5));
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/#teacher-spotlight-heading"));
    }

    public void buttonStudentDirectoryIsAble() {
        buttonStudentDirectory.click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/student-directory"));
    }
    public void clickOnButtonAddCourse(){
        buttonAddCourse.click();
    }

    public void clickOnTeacherIcon() {
        iconTeacher.click();
    }
    public void userMenuIsVisible (){
        userMenu.shouldHave(visible);
    }
    public void clickOnUserIconStudent (){
        iconStudent.click();
    }




}
