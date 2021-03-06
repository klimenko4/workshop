package tests;


import com.automation.remarks.video.service.pages.LoginPage;
import com.automation.remarks.video.service.pages.utils.SelenideUtils;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

/**
 * Created by sergey on 19.03.17.
 */
public class LoginTest extends BaseTest{

    @Test
    public void testCanLoginWithValidUser() {
        SelenideUtils.open(LoginPage.class)
                .loginAs("admin","admin")
                .logo.shouldHave(text("Video service"));
    }
}
