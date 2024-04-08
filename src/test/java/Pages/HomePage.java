
package Pages;

import HelperMethods.ElementMethods;
import LoggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {
    public HomePage (WebDriver webDriver) {
        super(webDriver);
    }

//    @FindBy(className = "fc-button-label")
//    private WebElement consentField;

    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsField;

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formsField;

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertFrameWindowsField;


    public void navigateToElementsPage() {
        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtility.infoTestCase("The user scrols down the page");

        elementMethods.clickElement(elementsField);
        LoggerUtility.infoTestCase("The user clicks on elementsField element");
    }

    public void navigateToFormsPage() {
        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtility.infoTestCase("The user scrols down the page");

        elementMethods.clickElement(formsField);
        LoggerUtility.infoTestCase("The user clicks on formsField element");
    }

    public void navigateToAlertFrameWindowPage () {
        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtility.infoTestCase("The user scrols down the page");

//        elementMethods.clickElement(consentField);
        elementMethods.clickElement(alertFrameWindowsField);
        LoggerUtility.infoTestCase("The user clicks on alertFrameWindowsField element");
    }


}
