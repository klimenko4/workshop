package com.automation.remarks.video.service.tests;

import com.automation.remarks.video.service.tests.utils.TestcontainersExtension;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Created by sergey on 19.03.17.
 */
//@Docker(image = "spirogov/video_service:latest", exposePort = 8086)
@ExtendWith(TestcontainersExtension.class)
public class BaseTest {

    @BeforeAll
    public static void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        //Configuration.holdBrowserOpen = true;
    }
}
