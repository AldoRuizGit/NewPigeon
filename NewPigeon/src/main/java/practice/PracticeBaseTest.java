package practice;

import practice.pages.MainPage;
import se.soprasteria.automatedtesting.webdriver.api.base.BaseTestCase;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class PracticeBaseTest extends BaseTestCase {



    protected MainPage mainPage;



    @Override
    protected String getDriverConfigId() {return "chromedriver";}

    @Override
    protected String getConfigFile() { return "config.xml"; }

    @Override
    protected void initPages(AutomationDriver automationDriver) {
        mainPage = new MainPage(automationDriver);
        mainPage.navigateTo();

    }
}
