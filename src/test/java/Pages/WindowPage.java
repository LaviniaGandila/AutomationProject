package Pages;

import LoggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends HomePage{
    public WindowPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "tabButton")
    private WebElement newTabButton;

    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    @FindBy(id = "messageWindowButton")
    private WebElement newWindowMsgButton;

    public void interactWithNewTab (){

        elementMethods.clickElement(newTabButton);
        LoggerUtility.infoTestCase("The user clicks on newTabButton element");

        windowMethods.switchToSpecificTabWindow(1);//sample window
        LoggerUtility.infoTestCase("The user moves the focus to new tabWindow with index 1");

        windowMethods.closeCurrentWindow();
        LoggerUtility.infoTestCase("The user closes the current window");

        windowMethods.switchToSpecificTabWindow(0);//browser window
        LoggerUtility.infoTestCase("The user moves the focus to new tabWindow with index 0");
    }
    public void interactWithNewWindow (){

        elementMethods.clickElement(newWindowButton);
        LoggerUtility.infoTestCase("The user clicks on newWindowButton element");

        windowMethods.switchToSpecificTabWindow(1);//sample window
        LoggerUtility.infoTestCase("The user moves the focus to new tabWindow with index 1");

        windowMethods.closeCurrentWindow();
        LoggerUtility.infoTestCase("The user closes the current window");

        windowMethods.switchToSpecificTabWindow(0);//browser window
        LoggerUtility.infoTestCase("The user moves the focus to new tabWindow with index 0");
    }
    public void interactWithNewWindowMsgButton(){

        elementMethods.clickElement(newWindowMsgButton);
        LoggerUtility.infoTestCase("The user clicks on newWindowMsgButton element");

        windowMethods.switchToSpecificTabWindow(1);//sample window
        LoggerUtility.infoTestCase("The user moves the focus to new tabWindow with index 1");

        windowMethods.closeCurrentWindow();
        LoggerUtility.infoTestCase("The user closes the current window");

        windowMethods.switchToSpecificTabWindow(0);//browser window
        LoggerUtility.infoTestCase("The user moves the focus to new tabWindow with index 0");
    }
}