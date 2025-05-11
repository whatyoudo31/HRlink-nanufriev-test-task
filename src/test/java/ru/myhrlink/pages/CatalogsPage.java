package ru.myhrlink.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.myhrlink.core.BasePage;

public class CatalogsPage extends BasePage {

    @FindBy(xpath = ".//span[@data-qa='catalogs-navigation-tab-EMPLOYEE_POSITIONS_CATALOG']")
    private WebElement employeePositionsTabButton;

    @FindBy(xpath = "(.//a[@data-qa='employee-positions-catalog-table-body-edit-employee-position-button'])[1]")
    private WebElement firstEmployeePosition;

    public CatalogsPage goToEmployeePositionsCatalog() {
        click(employeePositionsTabButton);
        return this;
    }

    public void openEmployeePositionWindow() {
        click(firstEmployeePosition);
    }
}