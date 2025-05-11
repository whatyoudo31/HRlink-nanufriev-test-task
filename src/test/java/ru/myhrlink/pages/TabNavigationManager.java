package ru.myhrlink.pages;

import ru.myhrlink.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabNavigationManager extends BasePage {

    @FindBy(xpath = ".//a[@data-qa='hr-app-nav-catalogs-link']")
    private WebElement catalogsButton;

    public void goToCatalogs() {
        click(catalogsButton);
    }
}
