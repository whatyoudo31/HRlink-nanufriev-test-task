package employeePositionModal;

import core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = ".//input[@data-qa = 'credential-form-login-input']")
    private WebElement loginField;

    @FindBy(xpath = ".//input[@data-qa = 'credential-form-password-input']")
    private WebElement passwordField;

    @FindBy(xpath = ".//button[@data-qa='telegram-invitation-dlg-cancel-button']")
    private WebElement closeButton;


    public LoginPage() {
        driver.get("https://app-test19-nanufriev.myhrlink.ru/login");
        PageFactory.initElements(driver, this);
    }

    public LoginPage login(String loginValue, String passwordValue) {
        loginField.sendKeys(loginValue);
        passwordField.sendKeys(passwordValue, Keys.ENTER);
        return this;
    }

    public void closeTelegramInvitationWindow() {
        closeButton.click();
    }
}
