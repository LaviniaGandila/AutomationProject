package Tests;

import ObjectData.AlertObject;
import ObjectData.PracticeFormObject;
import Pages.AlertPage;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class AlertTest extends SharedData {

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

//
//        WebElement buttonAlerts = getWebDriver().findElement(By.id("alertButton"));
//        elementMethods.clickElement(buttonAlerts);
//        alertMethods.acceptAlert();
//
//        WebElement buttonAlertsDelay = getWebDriver().findElement(By.id("timerAlertButton"));
//        elementMethods.clickElement(buttonAlertsDelay);
//        alertMethods.waitForAlert();
//        //wait explicit
//        alertMethods.acceptAlert();
//
//        WebElement thirdAlertButton = getWebDriver().findElement(By.id("confirmButton"));
//        elementMethods.clickElement(thirdAlertButton);
//        alertMethods.cancelAlert();
//
//        WebElement buttonPrompt = getWebDriver().findElement(By.id("promtButton"));
//        elementMethods.clickElement(buttonPrompt);
//        String textToSend = "test";
//        alertMethods.fillAlert(textToSend);
//
//        //asserturile
//
//        WebElement thirdAlertResult = getWebDriver().findElement(By.xpath("//span[@id='confirmResult']"));
//        elementMethods.validateExpectedElement(thirdAlertResult,"You selected Cancel" );
//
//        WebElement fourthAlertResult = getWebDriver().findElement(By.xpath("//span[@id='promptResult']"));
//        elementMethods.validateExpectedElement(fourthAlertResult,"You entered " + textToSend );
    }
}