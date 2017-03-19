package com.automation.remarks.video.service.pages;

import com.automation.remarks.video.service.pages.utils.Page;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by sergey on 19.03.17.
 */
public class MainPage  {

     public SelenideElement logo = $("a.navbar-brand");
     private SelenideElement uploadInput = $("#filestyle-0");
     private SelenideElement uploadBtn = $("#upload_submit > button");
     public Video video = new Video(".panel-heading");


     public MainPage uploadVideo(String... filename){
          uploadInput.uploadFromClasspath(filename);
          uploadBtn.click();
          return this;
     }
}
