
package Pages;

import HelperMethods.ElementMethods;
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
        elementMethods.clickElement(elementsField);
    }

    public void navigateToFormsPage() {
        elementMethods.scrollElementByPixel(0, 450);
        elementMethods.clickElement(formsField);
    }

    public void navigateToAlertFrameWindowPage () {
        elementMethods.scrollElementByPixel(0, 450);
//        elementMethods.clickElement(consentField);
        elementMethods.clickElement(alertFrameWindowsField);
    }


}
