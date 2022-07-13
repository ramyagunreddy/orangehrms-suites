package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
    //var
    public WebDriver driver;
    public String url = "https://opensource-demo.orangehrmlive.com/";
    public String un = "Admin";
    public String pw = "admin123";

    //obj
    public String txt_loginname = "txtUsername";
    public String txt_password = "txtPassword";
    public String btn_login = "Submit";
    public  String btn_PIM="//a[@id='menu_pim_viewPimModule']";
    public String btn_welcome ="//a[@id='welcome']";
    public String btn_logout ="//a[@href='/index.php/auth/logout']";
    //public String link_logout = "Logout";

}
