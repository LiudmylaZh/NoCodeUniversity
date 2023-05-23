import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$$;

public class StudentDirectoryTest extends BaseTest {
    private ElementsCollection cardsInStudentList = $$(byClassName ("horizontal-list-item"));

    @Test
    public void listExistOnlyStudents (){
        homePage.clickOnSignInButton();
        signInPage.successSignIn("roxanne@example.com", "123456");
        homePage.clickOnStudentDirectory();
        studentDirectory.listOfStudentsCardsExistOnlyStudents();



    }
}
