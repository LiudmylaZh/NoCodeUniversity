import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;

import javax.swing.*;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.Assert.assertTrue;

public class Courses {
    private ElementsCollection coursesCart = $$(byClassName("list-action-wrapper"));

    public void courseCartsAreExist() {
        coursesCart.shouldHave(CollectionCondition.size(8));
    }

    public void currentUrlIsCorrect() {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("course-list"));


    }
}
