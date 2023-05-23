import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;

public class ProfessorPage {

    private SelenideElement headerOfProfessorsSection = $ (byClassName("ql-align-center"));
    private SelenideElement listOfProfessors = $ (byClassName("inbox-list-container"));
    private ElementsCollection cardsOfProfessors = $$(byClassName("horizontal-list-item"));
    //private SelenideElement inputSearchField = $ (byXpath("//*[@id=\":r0:\"]"));
    private SelenideElement inputSearchField = $ (byAttribute("aria-invalid","false"));
    private ElementsCollection sectionOnHomePage = $$ (byClassName("filter-container"));
    private SelenideElement errorText = $ (byCssSelector("[class=\"inbox-list-container\"] div"));
    //private ElementsCollection professorsCards = $$ (byClassName("css-1w7j2y6"));
    private ElementsCollection professorsCards = $$ (byClassName("horizontal-list-item"));


    public void formOfProfessorsIsOpen() {
        headerOfProfessorsSection.shouldHave(text("Professor spotlight"));
        listOfProfessors.shouldBe(visible);
        cardsOfProfessors.shouldHave(CollectionCondition.size(10));
    }


    public void fillInputSearchField(String valueNameCourse) {
        inputSearchField.shouldBe(enabled);
        inputSearchField.click();
        inputSearchField.sendKeys(valueNameCourse);

    }

    public void noSearchingResultByCourseName (){
        sectionOnHomePage.get(1).scrollIntoView(true);
        sleep(1000);
        System.out.println(errorText.getText());
        errorText.shouldNotHave(text("No results found, try adjusting your search and filters."));
    }

    public void teacherListShouldHaveOnlyTeachers (){
        sectionOnHomePage.get(1).scrollIntoView(true);
        sleep(1000);
       for (SelenideElement teacherCard:
            professorsCards) {teacherCard.shouldNotHave(text("student"));
       }
    }

}
