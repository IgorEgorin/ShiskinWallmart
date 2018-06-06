package com.wallmartBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * Created by 1 on 08.05.2018.
 */
public class BaseTest {
    protected WebDriver driver;
    protected Logger log;

    @BeforeClass()
    protected void setUp(ITestContext ctx) {
        String testName = ctx.getCurrentXmlTest().getName();
        log = Logger.getLogger(testName);
    }

    @Parameters({"browser"})
    @BeforeMethod()
    protected void setUpMethod(String browser) {
        switch (browser) {
            case  "IE":
//                log.info("IeStartWork");
//                System.setProperty("webdriver.ie.driver", "C:\\Users\\1\\Downloads\\IEDriver.exe");
//                driver = new InternetExplorerDriver();
                break;

            case "chrome":
                log.info("ChromeStartWork");
                driver = new ChromeDriver();
                break;
        }
        driver.get("https://www.walmart.com/account/signup?tid=0&returnUrl=%2F");

    }

    @AfterMethod()
    public void quit() {
        driver.quit();
    }
}
