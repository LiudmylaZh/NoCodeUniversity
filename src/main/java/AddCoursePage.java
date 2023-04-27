import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class AddCoursePage {
    private SelenideElement headerOfAddCourseForm = $(byClassName ("header-holder"));

    public void currentUrlIsCorrect (){
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/add-course"));
    }
    public void headerOfAddCourseFormShouldHaveText (){
        headerOfAddCourseForm.shouldHave(Condition.text("Add a new course"));
    }

}
