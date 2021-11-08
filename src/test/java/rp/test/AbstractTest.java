package rp.test;

import com.codeborne.selenide.WebDriverRunner;
import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;

public abstract class AbstractTest {
    @DisplayName("Preconditions")
    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver delegate = new ChromeDriver();
        SelfHealingDriver driver = SelfHealingDriver.create(delegate);
        WebDriverRunner.setWebDriver(driver);
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1920, 1024));
        open("https://uat.fleetframework.io");
    }

    @AfterEach
    public void shutDown() {
        WebDriverRunner.closeWebDriver();
    }
}
