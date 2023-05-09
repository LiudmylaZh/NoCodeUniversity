import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static java.lang.Thread.sleep;

public class ProfessorsPageTest extends BaseTest {
    @Test
    public void searchByCourseManeInProfessorsSection () throws InterruptedException {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("roxanne@example.com", "123456");
        //professorPage.scrollDownSectionProfessors();
        professorPage.fillInputSearchField("Computer Science");
        professorPage.noSearchingResultByCourseName();


    }
}
