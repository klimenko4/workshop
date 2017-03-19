package com.automation.remarks.video.service.tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.jupiter.api.BeforeAll;

/**
 * Created by sergey on 19.03.17.
 */
public class BaseTest {

    @BeforeAll
    public static void setUp(){
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
    }
}
