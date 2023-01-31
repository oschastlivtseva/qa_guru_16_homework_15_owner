package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.config.ConfigProvider;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    public static void setUpForTest() {
        ConfigProvider.configure();
        open(Configuration.baseUrl);
    }

}
