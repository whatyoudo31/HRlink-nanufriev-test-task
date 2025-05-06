package employeePositionModal;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePositionModal extends BasePage {

    // Заголовок картоки должности
    @FindBy(xpath = ".//h1[@id='mat-mdc-dialog-title-0']/span")
    public WebElement title;

    //Заголовок поля "Название должности"
    @FindBy(xpath = "(.//label[starts-with(@id, 'mat-form-field-label-')])[1]")
    public WebElement positionName;

    // Поле с названием должности
    @FindBy(xpath = ".//input[@data-qa='employee-position-create-dlg-employee-position-name-input']")
    public WebElement positionNameField;

    // Заголовок "Склонения по падежам"
    @FindBy(xpath = ".//h3[@class='employee-position-create-dlg__declensions-title']/span")
    public WebElement declinationTitle;

    // Информационнная иконка
    @FindBy(xpath = ".//information-svg")
    public WebElement informationIcon;

    // Заголовок поля "Родительный падеж"
    @FindBy(xpath = ".//declension-employee-position-input[1]//div[@class='declension-employee-position-input__text']/span")
    public WebElement genitiveTitle;

    // Подзаголовок "Название должности (От кого?)"
    @FindBy(xpath = "(.//label[starts-with(@id, 'mat-form-field-label-')])[2]")
    public WebElement genitiveSubTitle;

    // Поле с названием должности в родительском падеже
    @FindBy(xpath = "(.//input[starts-with(@id, 'mat-input-')])[2]")
    public WebElement genitivePositionNameField;

    // Заголовок поля "Дательный падеж"
    @FindBy(xpath = ".//declension-employee-position-input[2]//div[@class='declension-employee-position-input__text']/span")
    public WebElement dativeTitle;

    // Подзаголовок "Название должности (Кому?)"
    @FindBy(xpath = "(.//label[starts-with(@id, 'mat-form-field-label-')])[3]")
    public WebElement dativeSubTitle;

    // Поле с названием должности в дательном падеже
    @FindBy(xpath = "(.//input[starts-with(@id, 'mat-input-')])[3]")
    public WebElement dativePositionNameField;

    // Кнопка "Закрыть"
    @FindBy(xpath = ".//button[@data-qa='employee-position-create-dlg-cancel-button']")
    public WebElement closeButton;

    // Текст кнопки "Закрыть"
    @FindBy(xpath = ".//button[@data-qa='employee-position-create-dlg-cancel-button']/span[@class='mat-button-wrapper']")
    public WebElement closeButtonTitle;

    public EmployeePositionModal() {
        PageFactory.initElements(driver, this);
    }

    // Заголовок "Карточка должности"
    public String getTitle(){
        return title.getText();
    }

    // Название должности
    public String getPositionName(){
        return positionName.getText();
    }

    public boolean isPositionNameFieldDisabledAndDisplayed(){
        boolean isDisabled = !positionNameField.isEnabled();
        boolean isVisible = positionNameField.isDisplayed();
        return isDisabled && isVisible;
    }

    // Заголовок "Склонения по падежам" и иконка
    public String getDeclinationTitle(){
        return declinationTitle.getText();
    }

    public boolean isInformationIconDisplayed(){
        return positionNameField.isDisplayed();
    }

    // Родительный падеж
    public String getGenitiveTitle(){
        return genitiveTitle.getText();
    }

    public String getGenitiveSubTitle(){
        return genitiveSubTitle.getText();
    }

    public boolean isGenitivePositionNameFieldDisabledAndDisplayed(){
        boolean isDisabled = !genitivePositionNameField.isEnabled();
        boolean isVisible = genitivePositionNameField.isDisplayed();
        return isDisabled && isVisible;
    }

    // Дательный падеж
    public String getDativeTitle(){
        return dativeTitle.getText();
    }

    public String getDativeSubTitle(){
        return dativeSubTitle.getText();
    }

    public boolean isDativePositionNameFieldDisabledAndDisplayed(){
        boolean isDisabled = !dativePositionNameField.isEnabled();
        boolean isVisible = dativePositionNameField.isDisplayed();
        return isDisabled && isVisible;
    }

    // Кнопка Закрыть
    public String getСloseButtonTitle(){
        return closeButtonTitle.getText();
    }

    public boolean isСloseButtonDisabledAndDisplayed(){
        boolean isDisabled = closeButton.isEnabled();
        boolean isVisible = closeButton.isDisplayed();
        return isDisabled && isVisible;
    }

}
