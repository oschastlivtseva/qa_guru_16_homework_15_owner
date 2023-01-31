package guru.qa.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;


public class FirstTest extends TestBase {

    String landingTitle = "Rise to your challenge.";

    @Test
    public void testBrainScape() {
        $(".landing-band-heading").shouldHave(text(landingTitle));
    }

}
