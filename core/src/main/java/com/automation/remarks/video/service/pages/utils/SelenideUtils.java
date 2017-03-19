package com.automation.remarks.video.service.pages.utils;

/**
 * Created by sergey on 19.03.17.
 */
public class SelenideUtils {

    public static <T> T open(Class<T> tClass) {
        try {
            Page page = (Page) tClass.newInstance();
            page.open();
            return (T) page;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
