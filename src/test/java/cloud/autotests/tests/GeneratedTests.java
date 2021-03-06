package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Creator")
    void generatedTest() {
        step("Open https://tkles-cmprb0006.vm.esrt.cloud.sbrf.ru/caas/#/login/", () -> {
            step("// todo: just add selenium action");
        });

        step("Set login 'copy4'", () -> {
            step("// todo: just add selenium action");
        });

        step("Set password '1234'", () -> {
            step("// todo: just add selenium action");
        });
    }
}