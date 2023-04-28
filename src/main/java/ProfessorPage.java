import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProfessorPage {

    private SelenideElement headerOfProfessorsSection = $ (byClassName("ql-align-center"));
    private SelenideElement listOfProfessors = $ (byClassName("inbox-list-container"));
    private ElementsCollection cardsOfProfessors = $$(byClassName("horizontal-list-item"));

    public void formOfProfessorsIsOpen() {
        headerOfProfessorsSection.shouldHave(text("Professor spotlight"));
        listOfProfessors.shouldBe(visible);
        cardsOfProfessors.shouldHave(CollectionCondition.size(10));
    }


}
