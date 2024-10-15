package ui.page;

import ui.helper.SelenideElementActions;
import lombok.Getter;

@Getter
public abstract class BasePage {

public SelenideElementActions elementActions = new SelenideElementActions();
}
