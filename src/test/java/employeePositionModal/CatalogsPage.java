package employeePositionModal;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogsPage extends BasePage {

    @FindBy(xpath = ".//span[@data-qa='catalogs-navigation-tab-EMPLOYEE_POSITIONS_CATALOG']")
    public WebElement employeePositionsTabButton;

    @FindBy(xpath = "(.//a[@data-qa='employee-positions-catalog-table-body-edit-employee-position-button'])[1]")
    public WebElement firstEmployeePosition;

    public CatalogsPage() {
        PageFactory.initElements(driver, this);
    }

    public CatalogsPage goToEmployeePositionsCatalog(){
        employeePositionsTabButton.click();
        return this;
    }

    public void openEmployeePositionWindow(){
        firstEmployeePosition.click();
    }

}