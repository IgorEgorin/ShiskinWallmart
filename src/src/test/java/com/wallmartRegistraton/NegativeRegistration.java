package com.wallmartRegistraton;

import com.wallmartBase.BaseTest;
import com.wallmartPages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by 1 on 09.05.2018.
 */
public class NegativeRegistration extends BaseTest {

    @Test
    public void negativeRegistration() throws Exception {
        String expectedErrorMessageRegistrationEmail = "Please enter a valid email address.";

        RegistrationPage registrationPage = new RegistrationPage(driver, log);
        registrationPage.fillDataToRegForm("Igor","Egorin","UnvalidMail","9999aaaa");
        System.out.println(registrationPage.getActualErrorMessUnvalidEmail());
        Assert.assertTrue(expectedErrorMessageRegistrationEmail.equals(registrationPage.getActualErrorMessUnvalidEmail()),
                "Test done. \nExpected error message was: " + expectedErrorMessageRegistrationEmail +
        "\nActual error message was: " + registrationPage.getActualErrorMessUnvalidEmail() );
        Thread.sleep(5000);
    }
}
