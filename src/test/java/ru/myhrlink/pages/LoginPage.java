package ru.myhrlink.pages;

import ru.myhrlink.core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = ".//input[@data-qa = 'credential-form-login-input']")
    private WebElement loginField;

    @FindBy(xpath = ".//input[@data-qa = 'credential-form-password-input']")
    private WebElement passwordField;

    @FindBy(xpath = ".//button[@data-qa='telegram-invitation-dlg-cancel-button']")
    private WebElement closeButton;

    public LoginPage login(String loginValue, String passwordValue) {
        sendKeys(loginField, loginValue);
        sendKeys(passwordField, passwordValue + Keys.ENTER);
        return this;
    }

    public void closeTelegramInvitationWindow() {
        click(closeButton);
    }
}
