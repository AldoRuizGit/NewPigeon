package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class PerformPracticeTest extends PracticeBaseTest{


    @Test(timeOut = 18000, dataProvider = "getDriver")
    public void  performAtest(AutomationDriver driver){
        Assert.assertTrue(mainPage.isPageLoaded(), "Login page did not work");
    }
    @Test(timeOut = 18000, dataProvider = "getDriver")
    public void sendSomething(AutomationDriver driver){
        Assert.assertTrue(mainPage.isPageLoaded(), "Login page did not work");
        mainPage.sendKeys();
    }
    @Test (timeOut = 18000, dataProvider = "getDriver")
    public void getElements(AutomationDriver driver){
        Assert.assertTrue(mainPage.isPageLoaded(), "Login page did not work");
        mainPage.getPictures();

    }

}
