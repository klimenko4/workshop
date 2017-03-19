package com.automation.remarks.video.service.pages;

import com.automation.remarks.video.service.pages.utils.Page;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by sergey on 19.03.17.
 */
public class LoginPage extends Page {

    public LoginPage open(){
        Selenide.open("http://localhost:8086");
        return this;
    }

    public void loginAs(String username,String password){
        $("#inputEmail3").val(username);
        $("#inputPassword3").val(password);
        $("#parent > form > div:nth-child(3) > div > button").click();
    }
}
