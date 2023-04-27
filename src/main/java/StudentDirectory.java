import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class StudentDirectory {
    private SelenideElement formOfStudentList = $ (byId("student-directory"));


    public void formOfStudentIsExist (){
        formOfStudentList.shouldHave(Condition.visible);
    }
}
