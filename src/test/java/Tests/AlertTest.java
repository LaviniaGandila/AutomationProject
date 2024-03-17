package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import Pages.AlertPage;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AlertTest extends SharedData {

    @Test
    public void windowMethod () {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertPage();

        AlertPage alertPage = new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithPromptButton("test");
        alertPage.dealWithCancelButton();

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