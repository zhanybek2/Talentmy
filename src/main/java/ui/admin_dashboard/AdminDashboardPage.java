package ui.admin_dashboard;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import ui.page.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class AdminDashboardPage extends BasePage {

    public SelenideElement admin = $x("//div[text() = 'Administrator']");

    public String getAdminText() {
        return elementActions.getText(admin);


    }

}
