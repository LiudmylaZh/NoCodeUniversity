import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Random;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public final String BASE_URL = "https://erich416.softr.app";
    public final String EMAIL_TEACHER = "monika@example.com";
    public final String FULL_NAME_TEACHER = "Monika Telli";
    public final String PASSWORD = "123456Q";
    public final String EMAIL_STUDENT = "braun@example.com";
    public final String FULL_NAME_STUDENT = "Beatrice Braun";




    @Before
    public void setUp(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        open(BASE_URL);
    }
    @After
    public void tearDown(){
        closeWebDriver();
    }

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    SignUpPage signUpPage = new SignUpPage();
    Header header = new Header();
    Courses courses= new Courses();
    StudentDirectory studentDirectory = new StudentDirectory();
    AddCoursePage addCoursePage = new AddCoursePage();
    ProfessorPage professorPage = new ProfessorPage();
    RecoverPasswordPage recoverPassword = new RecoverPasswordPage();




    }






