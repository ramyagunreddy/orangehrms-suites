package com.hrms.testscripts;

import com.hrms.lib.General;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC001 {
    //public static void main(String[] args) throws Exception {
    @Test
    public void tc101() throws Exception {
        General g = new General();
        DOMConfigurator.configure("log4j.xml");
        g.openapplication();
        g.login();
        g.addemp();
        g.welcome();
        g.logout();
        g.ss();
        g.closebrowser();
    }
}