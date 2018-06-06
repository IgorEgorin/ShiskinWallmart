package com.wallmartPages;

import com.wallmartBase.BasePageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by 1 on 09.05.2018.
 */
public class RegistrationPage extends BasePageObject<RegistrationPage> {



    private By firstNameField = By.xpath("//input[@data-tl-id='signup-first-name-input']");
    private By lastNameField = By.xpath("//input[@data-tl-id='signup-last-name-input']");
    private By emailField = By.xpath("//input[@data-tl-id='signup-email-input']");
    private By passwordField = By.xpath("//input[@data-tl-id='signup-password-input']");
    private By mainTitle = By.xpath("//h1");
    private By actualErrorMessUnvalidEmail = By.xpath("//span[@class='ada-error-text']");
    private By chkBoxKeepMeSignIn = By.xpath("//span[@class=\"remember-me-label\"]");
    private By chkBoxOffSpam = By.xpath("//input[@data-automation-id=\"signup-newsletter-checkbox\"]");
    private By btnCreateAccount = By.xpath("//button[@data-tl-id=\"signup-submit-btn\"]");

    public RegistrationPage(WebDriver driver, Logger log) {
        super(driver, log);

    }

    public void fillDataToRegForm(String firstName, String lastName, String email, String password) {
        log.info("fillDataToField");
        type(firstName,firstNameField);
        type(lastName,lastNameField);
        type(email,emailField);
        type(password,passwordField);
    }

    public String getRegisPageTitle() {
//        log.info("Check Actual Title");
        return find(mainTitle).getText();
    }

    public String getActualErrorMessUnvalidEmail() {
//        log.info("Take actual error message if email is unvalid on registration page");
        return find(actualErrorMessUnvalidEmail).getText();
    }

    public void clickSignInChk() {
        find(chkBoxKeepMeSignIn).click();
    }

    public void clickOffSpamRegPage() {
        find(chkBoxOffSpam).click();
    }

    public MainPage clickCreateAccoutBtn() {
        find(btnCreateAccount).click();
        return new MainPage(driver, log);
    }


}
