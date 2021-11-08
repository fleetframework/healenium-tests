package com.fleetframework.page;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends ElementsContainer {

    @FindBy(css = "form[class*=login] input[type=text]")
    SelenideElement login;

    @FindBy(css = "form[class*=login] input[type=password]")
    SelenideElement password;

    @FindBy(css = "form[class*=login] button[type=submit]")
    SelenideElement submit;

    @FindBy(css = "form[class*=login] a")
    SelenideElement forgotPasswordLink;

    @FindBy(css = "form[class*=login] input[type=text]")
    SelenideElement wrongEmail;

    @FindBy(css = "form[class*=forgot] input[type=text]")
    SelenideElement correctEmail;

    @FindBy(css = "a[href*=dashboard] span[class*=title]")
    SelenideElement dashboard;

}
