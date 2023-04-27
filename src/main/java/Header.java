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

    private SelenideElement buttonCourses = $(byXpath("//*[@id=\"home-header-logged-in-teachers\"]/header/div/div/div[1]/a[2]"));
    private SelenideElement coursesList = $(byAttribute("role", "menuitem"));
    private SelenideElement buttonProfessors = $(byAttribute("href", "#teacher-spotlight-heading"));
    private SelenideElement headerOfProfessorsSection = $ (byClassName("ql-align-center"));
    private SelenideElement listOfProfessors = $ (byClassName("inbox-list-container"));
    private ElementsCollection cardsOfProfessors = $$(byClassName("horizontal-list-item"));
    private SelenideElement buttonStudentDirectory = $ (byAttribute("href", "/student-directory"));
    private SelenideElement buttonAddCourse = $ (byAttribute("href", "/add-course"));
    private SelenideElement userIconForTeacher = $ (byAttribute("alt", "Roxanne"));
    private SelenideElement userMenu = $ (byAttribute("href", "/user-profile"));
    private SelenideElement userIconStudent = $ (byAttribute("alt", "Malik"));




    public void buttonAboutAsIsAble (){
        buttonAboutUs.click();
        containerAboutUs.get(1).shouldBe(visible, Duration.ofSeconds(10));
        containerAboutUs.get(1).shouldHave(partialText("University"));

    }

    public void buttonCoursesIsAble (){
        buttonCourses.click();
        buttonCourses.shouldBe(visible, Duration.ofSeconds(5));
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

    public void clickOnUserIconTeacher() {
        userIconForTeacher.click();
    }
    public void userMenuIsVisible (){
        userMenu.shouldHave(visible);
    }
    public void clickOnUserIconStudent (){
        userIconStudent.click();
    }






}
