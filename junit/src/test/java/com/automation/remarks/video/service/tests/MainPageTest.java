package com.automation.remarks.video.service.tests;

import com.automation.remarks.video.service.pages.LoginPage;
import com.automation.remarks.video.service.pages.MainPage;
import com.automation.remarks.video.service.pages.Video;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.automation.remarks.video.service.pages.utils.SelenideUtils.open;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;

/**
 * Created by sergey on 19.03.17.
 */
public class MainPageTest extends BaseTest {

    private MainPage mainPage = new MainPage();

    @BeforeAll
    public static void login() {
        if (!WebDriverRunner.url().equals(Configuration.baseUrl + "/index")) {
            open(LoginPage.class)
                    .loginAs("admin", "admin");
        }
    }

    @Test
    void testCanUploadVideoFile() {
        mainPage.uploadVideo("test_video.mp4")
                .video.name()
                .shouldHave(text("test_video.mp4"));
    }

    @Test
    void testDeleteVideoFile() {
        Video video = mainPage.uploadVideo("test_video.mp4").video;
        video.delete();
        video.name().should(disappear);
    }
}
