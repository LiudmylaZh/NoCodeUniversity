import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;


public class ProfessorsPageTest extends BaseTest {
    @Test
    public void searchByCourseNameInProfessorsSection () {
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("malik@example.com", "123456");
        professorPage.fillInputSearchField("Computer Science");
        professorPage.noSearchingResultByCourseName();

    }

    @Test
    public void listOfTeachersExistOnlyTeacher (){
        homePage.clickOnSignInButton();
        Configuration.fastSetValue = true;
        signInPage.successSignIn("roxanne@example.com", "123456");
        professorPage.teacherListShouldHaveOnlyTeachers();


    }
}
