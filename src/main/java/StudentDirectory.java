import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class StudentDirectory {
    private SelenideElement formOfStudentList = $ (byId("student-directory"));
    private ElementsCollection listOfCards = $$ (byClassName("css-1w7j2y6"));
    private SelenideElement wrapperOfList = $ (byClassName("filter-container"));


    public void formOfStudentIsExist (){
        formOfStudentList.shouldHave(Condition.visible);
    }

    public void listOfStudentsCardsExistOnlyStudents (){
        wrapperOfList.scrollIntoView(true);
        sleep(1000);
        for (SelenideElement cards:
                listOfCards
             ) {cards.shouldNotHave(Condition.text("teacher"));
            
        }


    }


}

