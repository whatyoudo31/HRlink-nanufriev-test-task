package ru.myhrlink.tests;

import ru.myhrlink.pages.CatalogsPage;
import ru.myhrlink.pages.EmployeePositionModal;
import ru.myhrlink.pages.LoginPage;
import ru.myhrlink.pages.TabNavigationManager;
import ru.myhrlink.core.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("13884 Отображение карточки должности без возможности редактирования (positive)")
@Epic("UI Tests")
@Feature("Employee Position Modal")
public class EmployeePositionModalUiTest extends BaseTest {

    private LoginPage loginPage;
    private TabNavigationManager tabNavigationManager;
    private CatalogsPage catalogsPage;
    private EmployeePositionModal employeePositionModal;

    @BeforeEach
    public void initPages() {
        loginPage = new LoginPage();
        tabNavigationManager = new TabNavigationManager();
        catalogsPage = new CatalogsPage();
        employeePositionModal = new EmployeePositionModal();
    }

    @Test
    @Description("Проверка отображения и доступности всех элементов карточки должности под Делопроизводителем")
    @Story("Employee Position Modal UI Verification")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyEmployeePositionModalUiClerk() {
        // Login
        loginPage.login(config.getDefaultUsername(), config.getDefaultPassword())
                .closeTelegramInvitationWindow();

        tabNavigationManager.goToCatalogs();

        catalogsPage.goToEmployeePositionsCatalog()
                .openEmployeePositionWindow();

        // Asserts
        assertAll(
                // Заголовок окна
                () -> Allure.step("Проверка заголовка окна 'Карточка должности'",
                        () -> assertEquals("Карточка должности", employeePositionModal.getTitle(),
                                "Заголовок окна не совпадает!")),

                // Название должности
                () -> Allure.step("Проверка заголовка 'Название должности'",
                        () -> assertEquals("Название должности", employeePositionModal.getPositionName(),
                                "Заголовок поля с названием должности не совпадает!")),

                () -> Allure.step("Проверка недоступности поля 'Название должности'",
                        () -> assertTrue(employeePositionModal.isPositionNameFieldDisabledAndDisplayed(),
                                "Поле с названием должности должно быть отображено и недоступно для редактирования")),

                // Заголовок Склонения по падежам и иконка
                () -> Allure.step("Проверка заголовка 'Склонение по падежам'",
                        () -> assertEquals("Склонения по падежам", employeePositionModal.getDeclinationTitle(),
                                "Заголовок раздела 'Склонения по падежам' не совпадает!")),

                () -> Allure.step("Проверка отображения иконки",
                        () -> assertTrue(employeePositionModal.isInformationIconDisplayed(),
                                "Информационная иконка должна отображаться")),

                // Родительный падеж
                () -> Allure.step("Проверка заголовка 'Родительский падеж'",
                        () -> assertEquals("Родительный падеж", employeePositionModal.getGenitiveTitle(),
                                "Заголовок раздела 'Родительный падеж' не совпадает!")),

                () -> Allure.step("Проверка подзаголовка 'Название должности (От кого?)'",
                        () -> assertEquals("Название должности (От кого?)", employeePositionModal.getGenitiveSubTitle(),
                                "Подзаголовок раздела 'Родительный падеж' не совпадает!")),

                () -> Allure.step("Проверка недоступности поля 'Родительский падеж'",
                        () -> assertTrue(employeePositionModal.isGenitivePositionNameFieldDisabledAndDisplayed(),
                                "Поле с родительным падежом должно быть отображено и недоступно для редактирования")),

                // Дательный падеж
                () -> Allure.step("Проверка заголовка 'Дательный падеж'",
                        () -> assertEquals("Дательный падеж", employeePositionModal.getDativeTitle(),
                                "Заголовок раздела 'Дательный падеж' не совпадает!")),

                () -> Allure.step("Проверка подзаголовка 'Название должности (Кому?)'",
                        () -> assertEquals("Название должности (Кому?)", employeePositionModal.getDativeSubTitle(),
                                "Подзаголовок раздела 'Дательный падеж' не совпадает!")),

                () -> Allure.step("Проверка недоступности поля 'Дательный падеж'",
                        () -> assertTrue(employeePositionModal.isDativePositionNameFieldDisabledAndDisplayed(),
                                "Поле с дательным падежом должно быть отображено и недоступно для редактирования")),

                // Кнопка закрыть
                () -> Allure.step("Проверка заголовка кнопки 'Закрыть'",
                        () -> assertEquals("Закрыть", employeePositionModal.getCloseButtonTitle(),
                                "Надпись на кнопке закрытия не совпадает")),

                () -> Allure.step("Проверка доступности кнопки 'Закрыть'",
                        () -> assertTrue(employeePositionModal.isCloseButtonEnabledAndDisplayed(),
                                "Кнопка закрытия должна быть отображена и доступна"))
        );
    }
}
