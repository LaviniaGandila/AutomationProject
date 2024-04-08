package Tests;

import ObjectData.AlertObject;
import ObjectData.PracticeFormObject;
import Pages.AlertPage;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import PropertyUtility.PropertyUtility;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class AlertTest extends SharedData.Hooks {

    @Test
    public void windowMethod () {
        PropertyUtility propertyUtility = new PropertyUtility("AlertTestData");
        AlertObject alertObject = new AlertObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertPage();

        AlertPage alertPage = new AlertPage(getWebDriver());

        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithCancelButton();
        alertPage.dealWithPromptButton(alertObject);
    }
}