package Pages;

import HelperMethods.ElementMethods;
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


    public void navigateToAlertPage () {
        elementMethods.scrollElementByPixel(0, 350);
        elementMethods.clickElement(alertField);
    }

    public void navigateToFramePage () {
        elementMethods.scrollElementByPixel(0, 350);
        elementMethods.clickElement(framesField);
    }

}
