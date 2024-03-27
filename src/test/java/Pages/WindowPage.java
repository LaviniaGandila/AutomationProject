package Pages;

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
        windowMethods.switchToSpecificTabWindow(1);//sample window
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificTabWindow(0);//browser window
    }
    public void interactWithNewWindow (){

        elementMethods.clickElement(newWindowButton);
        windowMethods.switchToSpecificTabWindow(1);//sample window
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificTabWindow(0);//browser window
    }
    public void interactWithNewWindowMsgButton(){

        elementMethods.clickElement(newWindowMsgButton);
        windowMethods.switchToSpecificTabWindow(1);//sample window
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificTabWindow(0);//browser window
    }
}