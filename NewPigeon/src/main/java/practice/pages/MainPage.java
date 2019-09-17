package practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import se.soprasteria.automatedtesting.webdriver.api.base.BasePageObject;
import se.soprasteria.automatedtesting.webdriver.api.base.BaseTestConfig;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class MainPage extends BasePageObject {

    @FindBy (xpath = "//*[@id=\"header_logo\"]/a/img")
    protected WebElement homeButton;


    public MainPage(AutomationDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        return elementHelper.isElementDisplayedWithinTime(homeButton, 2000);
    }

    public void navigateTo(){
        driver.navigateTo(BaseTestConfig.getConfigurationOption("url.adminpage"));

    }
}
