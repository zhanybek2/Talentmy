package ui_tests.auth_tests;

import config_reader.ConfigurationManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ui.admin_dashboard.AdminDashboardPage;
import ui.auth.LoginPage;
import ui_tests.BaseUiTest;

import static com.codeborne.selenide.Selenide.open;
import static config_reader.ConfigurationManager.getAppConfig;
import static config_reader.ConfigurationManager.getCredentials;

public class LoginTests {

    public LoginPage loginPage = new LoginPage();
    public AdminDashboardPage adminDashboardPage = new AdminDashboardPage();

    @Test
    void testLoginPositive() throws InterruptedException {
        open(getAppConfig().base_url());
        Thread.sleep(5000);
        loginPage.doLogin(getCredentials().adminUsername(), getCredentials().adminPassword());
        Thread.sleep(5000);
//        Assertions.assertEquals("Administrator",adminDashboardPage.getAdminText());
    }
}

