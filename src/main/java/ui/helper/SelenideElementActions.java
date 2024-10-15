package ui.helper;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;

public class SelenideElementActions {

    public  SelenideElementActions click(SelenideElement element){
        element
                .shouldBe(interactable, Duration.ofSeconds(10))
                .click();
        return this;
    }

    public SelenideElementActions input(SelenideElement element,String text){
        element
                .shouldBe(visible)
                .scrollTo()
                .sendKeys(text);
        return this;
    }
public String getText(SelenideElement element){
        element
                .shouldBe(visible,Duration.ofSeconds(5))
                .shouldNotBe(empty,Duration.ofSeconds(5));
        return  element.getText();
}
    public void refreshPage() {
        Selenide.refresh();
    }

    public SelenideElementActions clickElementWithJsExecutor(SelenideElement element) {
        Selenide.executeJavaScript("arguments[0].click();", element);
        return this;
    }


}
