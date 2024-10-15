package ui.auth;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ui.page.BasePage;
import ui.admin_dashboard.AdminDashboardPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage  extends BasePage {

    public SelenideElement loginInput = $(By.id("username"));
    public SelenideElement passwordInput = $(By.id("password"));
    public SelenideElement loginButton = $x("//button[@type='submit']");

    public AdminDashboardPage doLogin (String username, String password){
        elementActions.input(loginInput,username)
                .input(passwordInput,password)
                .click(loginButton);
        return new AdminDashboardPage();
    }
}
