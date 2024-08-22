import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test2 {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        open("http://localhost:8080/food");
        $("button.btn-primary").click();
        $("h5.modal-title").shouldHave(text("Добавление товара")).shouldBe(Condition.visible);
        $("#name").setValue("Картошка");
        $("select").selectOption("Овощ");
        $("#save").click();
    }
}
