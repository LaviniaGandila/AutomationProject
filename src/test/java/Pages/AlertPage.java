package Pages;

import LoggerUtility.LoggerUtility;
import ObjectData.AlertObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "alertButton")
    private WebElement buttonAlerts;

    @FindBy(id = "timerAlertButton")
    private WebElement buttonAlertsDelay;

    @FindBy(id = "confirmButton")
    private WebElement thirdAlertButton;

    @FindBy(id = "promtButton")
    private WebElement buttonPrompt;

    @FindBy(xpath = "//span[@id='confirmResult']")
    private WebElement thirdAlertResult;

    @FindBy(xpath = "//span[@id='promptResult']")
    private WebElement fourthAlertResult;

    public void dealWithAcceptAlert() {
        elementMethods.clickElement(buttonAlerts);
        LoggerUtility.infoTestCase("The user clicks on buttonAlerts element");
        alertMethods.acceptAlert();
        LoggerUtility.infoTestCase("The user accepts the alert");
    }

    public void dealWithDelayAlert (){
        elementMethods.clickElement(buttonAlertsDelay);
        LoggerUtility.infoTestCase("The user clicks on buttonAlertsDelay element");
        alertMethods.waitForAlert();
        LoggerUtility.infoTestCase("The user waits for the alert");
        alertMethods.acceptAlert();
        LoggerUtility.infoTestCase("The user accepts the alert");
    }

    public void dealWithCancelButton () {
        elementMethods.clickElement(thirdAlertButton);
        LoggerUtility.infoTestCase("The user clicks on thirdAlertButton element");
        alertMethods.cancelAlert();
        LoggerUtility.infoTestCase("The user cancels the alert");
        elementMethods.validateExpectedElement(thirdAlertResult,"You selected Cancel");
        LoggerUtility.infoTestCase("We validate the user clicks cancel");
    }

    public void dealWithPromptButton (AlertObject alertObject) {
        elementMethods.clickElement(buttonPrompt);
        LoggerUtility.infoTestCase("The user clicks on buttonPrompt element");
        alertMethods.fillAlert(alertObject.getInputAlert());
        LoggerUtility.infoTestCase("The user inputs data in the alert");
        elementMethods.validateExpectedElement(fourthAlertResult,"You entered " + alertObject.getInputAlert());
        LoggerUtility.infoTestCase("We validate the user filled the field with the text value" + alertObject.getInputAlert());
    }

}
