package com.automation.remarks.video.service.tests.utils;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ContainerExtensionContext;
import org.testcontainers.containers.GenericContainer;

import static com.codeborne.selenide.Configuration.baseUrl;

/**
 * Created by sergey on 20.03.17.
 */
public class TestcontainersExtension implements BeforeAllCallback, AfterAllCallback {

    private GenericContainer container = new GenericContainer("spirogov/video_service:latest");

    @Override
    public void beforeAll(ContainerExtensionContext context) throws Exception {
        container.start();
        baseUrl = "http://localhost:" + container.getMappedPort(8086);
    }

    @Override
    public void afterAll(ContainerExtensionContext context) throws Exception {
        container.stop();
    }
}
