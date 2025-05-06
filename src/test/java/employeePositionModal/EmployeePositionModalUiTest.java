package employeePositionModal;

import core.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.*;

@DisplayName("13884 Отображение карточки должности без возможности редактирования (positive)")
public class EmployeePositionModalUiTest extends BaseTest {

    @Test
    @Description("Проверка отображения и доступности всех элементов карточки должности под Делопроизводителем")
    public void verifyEmployeePositionModalUiСlerk() {

        String email = "nanufriev+petr@hr-link.ru";
        String password = "PetrPetr123@";

        LoginPage loginPage = new LoginPage();
        loginPage.login(email, password).closeTelegramInvitationWindow();

        TabNavigationManager tabNavigationManager = new TabNavigationManager();
        tabNavigationManager.goToCatalogs();

        CatalogsPage catalogsPage = new CatalogsPage();
        catalogsPage.goToEmployeePositionsCatalog().openEmployeePositionWindow();

        EmployeePositionModal employeePositionModal = new EmployeePositionModal();

        assertAll(
                // Заголовок окна
                () -> Allure.step("Проверка заголовка окна 'Карточка должности'",() -> Assertions.assertEquals(
                        "Карточка должности",
                        employeePositionModal.getTitle(),
                        "Заголовоки окна не совпадают!")
                ),

                // Название должности
                () -> Allure.step("Проверка заголовка 'Название должности'", () -> Assertions.assertEquals(
                        "Название должности",
                        employeePositionModal.getPositionName(),
                        "Заголовок поля с названием должности не совпадает!")
                ),

                () -> Allure.step("Проверка недоступности поля 'Название должности'", () -> Assertions.assertTrue(
                        employeePositionModal.isPositionNameFieldDisabledAndDisplayed(),
                        "Поле с названием должности должно быть отображено и недоступно для редактирования")
                ),

                // Заголовок Склонения по падежам и иконка
                () -> Allure.step("Проверка заголовка 'Склонение по падежам'", () -> Assertions.assertEquals(
                        "Склонения по падежам",
                        employeePositionModal.getDeclinationTitle(),
                        "Заголовок раздела 'Склонения по падежам' не совпадает!")
                ),

                () -> Allure.step("Проверка отображения иконки'", () -> Assertions.assertTrue(
                        employeePositionModal.isInformationIconDisplayed(),
                        "Информационная иконка должна отображаться")
                ),

                // Родительный падеж
                () -> Allure.step("Проверка заголовка 'Родительский падеж'", () -> Assertions.assertEquals(
                        "Родительный падеж",
                        employeePositionModal.getGenitiveTitle(),
                        "Заголовок раздела 'Родительный падеж' не совпадает!")
                ),

                () -> Allure.step("Проверка подзаголовка 'Название должности (От кого?)'", () -> Assertions.assertEquals(
                        "Название должности (От кого?)",
                        employeePositionModal.getGenitiveSubTitle(),
                        "Подзаголовок раздела 'Родительный падеж' не совпадает!")
                ),

                () -> Allure.step("Проверка недоступности поля 'Родительский падеж'", () -> Assertions.assertTrue(
                        employeePositionModal.isGenitivePositionNameFieldDisabledAndDisplayed(),
                        "Поле с родительным падежом должно быть отображено и недоступно для редактирования")
                ),

                // Дательный падеж
                () -> Allure.step("Проверка заголовка 'Дательный падеж'", () -> Assertions.assertEquals(
                        "Дательный падеж",
                        employeePositionModal.getDativeTitle(),
                        "Заголовок раздела 'Дательный падеж' не совпадает!")
                ),

                () -> Allure.step("Проверка подзаголовка 'Название должности (Кому?)'", () -> Assertions.assertEquals(
                        "Название должности (Кому?)",
                        employeePositionModal.getDativeSubTitle(),
                        "Подзаголовок раздела 'Дательный падеж' не совпадает!")
                ),

                () -> Allure.step("Проверка недоступности поля 'Дательный падеж'", () -> Assertions.assertTrue(
                        employeePositionModal.isDativePositionNameFieldDisabledAndDisplayed(),
                        "Поле с дательным падежом должно быть отображено и недоступно для редактирования")
                ),

                // Кнопка закрыть
                () -> Allure.step("Проверка заголовка кнопки 'Закрыть'",() -> Assertions.assertEquals(
                        "Закрыть",
                        employeePositionModal.getСloseButtonTitle(),
                        "Надпись на кнопке закрытия не совпадает")
                ),

                () -> Allure.step("Проверка доступности кнопки 'Закрыть'",() -> Assertions.assertTrue(
                        employeePositionModal.isСloseButtonDisabledAndDisplayed(),
                        "Кнопка закрытия должна быть отображена и доступна для клика")
                )


        );
    }

}
