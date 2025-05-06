package employeePositionModal;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabNavigationManager extends BasePage {

    @FindBy(xpath = ".//a[@data-qa='hr-app-nav-catalogs-link']")
    private WebElement catalogsButton;

    public TabNavigationManager() {
        PageFactory.initElements(driver, this);
    }

    public void goToCatalogs(){
        catalogsButton.click();
    }


}
