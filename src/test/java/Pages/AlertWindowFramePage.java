package Pages;

import HelperMethods.ElementMethods;
import LoggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertWindowFramePage extends BasePage{
    public AlertWindowFramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertField;

    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement framesField;


    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement windowsField;


    public void navigateToAlertPage () {
        elementMethods.scrollElementByPixel(0, 350);
        LoggerUtility.infoTestCase("The user scrolls down the page");

        elementMethods.clickElement(alertField);
        LoggerUtility.infoTestCase("The user clicks on alertField element");
    }

    public void navigateToFramePage () {
        elementMethods.scrollElementByPixel(0, 350);
        LoggerUtility.infoTestCase("The user scrolls down the page");

        elementMethods.clickElement(framesField);
        LoggerUtility.infoTestCase("The user clicks on framesField element");
    }

    public void navigateToWindowPage (){
        elementMethods.clickElement(windowsField);
        LoggerUtility.infoTestCase("The user clicks on windowsField element");
    }

}
