import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class logauth {
    @Test
    void sucsesfulloginTest() {
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        open("https://niffler.qa.guru");
        $("[name=username]").setValue("qaguru31");
        $("[name=password]").setValue("1234").pressEnter();

    }


        @Test
        void badfulloginTest() {
            Configuration.holdBrowserOpen = true  ;
            open("https://niffler.qa.guru");
            $("[name=username]").setValue("stas");
            $("[name=password]").setValue("1234").pressEnter();
            $("[class=form__error]").shouldHave(text("Неверные учетные данные пользователя"));
        }
}