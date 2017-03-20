package tests;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.enums.RecordingMode;
import com.automation.remarks.video.enums.VideoSaveMode;
import com.automation.remarks.video.recorder.VideoRecorder;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import tests.utils.TestContainersListener;


/**
 * Created by sergey on 19.03.17.
 */
//@Docker(image = "spirogov/video_service:latest", exposePort = 8086)
@Listeners({TestContainersListener.class, VideoListener.class})
public class BaseTest {

    @BeforeClass
    public static void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        //Configuration.holdBrowserOpen = true;
        VideoRecorder.conf()
                .withVideoFolder("./build/video")
                .withRecordMode(RecordingMode.ALL)
                .withVideoSaveMode(VideoSaveMode.ALL);

    }
}
