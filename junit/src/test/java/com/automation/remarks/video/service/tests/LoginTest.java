package com.automation.remarks.video.service.tests;

import com.automation.remarks.video.service.pages.LoginPage;
import com.automation.remarks.video.service.pages.utils.SelenideUtils;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Created by sergey on 19.03.17.
 */
public class LoginTest {

    @BeforeAll
    public static void setUp(){
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
    }

    @Test
    public void testCanLoginWithValidUser() {
        SelenideUtils.open(LoginPage.class)
                .loginAs("admin","admin");
    }
}
