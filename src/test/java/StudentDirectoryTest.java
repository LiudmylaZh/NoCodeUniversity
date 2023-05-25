import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$$;

public class StudentDirectoryTest extends BaseTest {
    private ElementsCollection cardsInStudentList = $$(byClassName ("horizontal-list-item"));

    @Test
    public void listExistOnlyStudents (){
        homePage.clickOnSignInButton();
        signInPage.successSignIn(EMAIL_TEACHER, PASSWORD);
        homePage.clickOnStudentDirectory();
        studentDirectory.listOfStudentsCardsExistOnlyStudents();



    }
}
