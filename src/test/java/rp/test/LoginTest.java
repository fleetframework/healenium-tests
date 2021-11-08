package rp.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.fleetframework.page.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends AbstractTest {

    @DisplayName("Login test")
    @Test
    public void loginTest() throws InterruptedException {
        LoginPage loginPage = Selenide.page(LoginPage.class);
        loginPage.getForgotPasswordLink().click();
        loginPage.getWrongEmail().sendKeys("email");
        loginPage.getCorrectEmail().shouldHave(Condition.attribute("value","email"));
    }
}
