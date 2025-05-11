package ru.myhrlink.pages;

import ru.myhrlink.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeePositionModal extends BasePage {

    @FindBy(xpath = ".//h1[@id='mat-mdc-dialog-title-0']/span")
    private WebElement title;

    @FindBy(xpath = "(.//label[starts-with(@id, 'mat-form-field-label-')])[1]")
    private WebElement positionName;

    @FindBy(xpath = ".//input[@data-qa='employee-position-create-dlg-employee-position-name-input']")
    private WebElement positionNameField;

    @FindBy(xpath = ".//h3[@class='employee-position-create-dlg__declensions-title']/span")
    private WebElement declinationTitle;

    @FindBy(xpath = ".//information-svg")
    private WebElement informationIcon;

    @FindBy(xpath = ".//declension-employee-position-input[1]//div[@class='declension-employee-position-input__text']/span")
    private WebElement genitiveTitle;

    @FindBy(xpath = "(.//label[starts-with(@id, 'mat-form-field-label-')])[2]")
    private WebElement genitiveSubTitle;

    @FindBy(xpath = "(.//input[starts-with(@id, 'mat-input-')])[2]")
    private WebElement genitivePositionNameField;

    @FindBy(xpath = ".//declension-employee-position-input[2]//div[@class='declension-employee-position-input__text']/span")
    private WebElement dativeTitle;

    @FindBy(xpath = "(.//label[starts-with(@id, 'mat-form-field-label-')])[3]")
    private WebElement dativeSubTitle;

    @FindBy(xpath = "(.//input[starts-with(@id, 'mat-input-')])[3]")
    private WebElement dativePositionNameField;

    @FindBy(xpath = ".//button[@data-qa='employee-position-create-dlg-cancel-button']")
    private WebElement closeButton;

    @FindBy(xpath = ".//button[@data-qa='employee-position-create-dlg-cancel-button']/span[@class='mat-button-wrapper']")
    private WebElement closeButtonTitle;

    public String getTitle() {
        return getText(title);
    }

    public String getPositionName() {
        return getText(positionName);
    }

    public boolean isPositionNameFieldDisabledAndDisplayed() {
        return !isElementEnabled(positionNameField) && isElementDisplayed(positionNameField);
    }

    public String getDeclinationTitle() {
        return getText(declinationTitle);
    }

    public boolean isInformationIconDisplayed() {
        return isElementDisplayed(informationIcon);
    }

    public String getGenitiveTitle() {
        return getText(genitiveTitle);
    }

    public String getGenitiveSubTitle() {
        return getText(genitiveSubTitle);
    }

    public boolean isGenitivePositionNameFieldDisabledAndDisplayed() {
        return !isElementEnabled(genitivePositionNameField) && isElementDisplayed(genitivePositionNameField);
    }

    public String getDativeTitle() {
        return getText(dativeTitle);
    }

    public String getDativeSubTitle() {
        return getText(dativeSubTitle);
    }

    public boolean isDativePositionNameFieldDisabledAndDisplayed() {
        return !isElementEnabled(dativePositionNameField) && isElementDisplayed(dativePositionNameField);
    }

    public String getCloseButtonTitle() {
        return getText(closeButtonTitle);
    }

    public boolean isCloseButtonEnabledAndDisplayed() {
        return isElementEnabled(closeButton) && isElementDisplayed(closeButton);
    }
}
