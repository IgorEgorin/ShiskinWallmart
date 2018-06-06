package com.wallmartRegistraton;

import com.wallmartBase.BaseTest;
import com.wallmartPages.RegistrationPage;
import org.testng.annotations.Test;

/**
 * Created by 1 on 27.05.2018.
 */
public class PositiveRegistration extends BaseTest {

    @Test
    public void enterValidDataOnRegPage() throws Exception {
        RegistrationPage registrationPage = new RegistrationPage(driver, log);
        registrationPage.fillDataToRegForm("Igor", "Egorin", "9999@gmailll.com", "999988");
        registrationPage.clickOffSpamRegPage();
        registrationPage.clickCreateAccoutBtn();
        Thread.sleep(10000);


    }
}
