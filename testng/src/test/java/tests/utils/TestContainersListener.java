package tests.utils;

import org.testcontainers.containers.GenericContainer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.codeborne.selenide.Configuration.baseUrl;

/**
 * Created by sergey on 20.03.17.
 */
public class TestContainersListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    private GenericContainer container = new GenericContainer("spirogov/video_service:latest");

    @Override
    public void onStart(ITestContext context) {
        container.start();
        baseUrl = "http://localhost:" + container.getMappedPort(8086);
    }

    @Override
    public void onFinish(ITestContext context) {
        container.stop();
    }
}
