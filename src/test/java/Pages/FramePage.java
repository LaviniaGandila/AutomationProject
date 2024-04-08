package Pages;

import LoggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {
    public FramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "sampleHeading")
    private WebElement frame1Element;



    public void dealWithIframe (){
        frameMethods.switchSpecificIframe("frame1");
        System.out.println(frame1Element.getText());
        LoggerUtility.infoTestCase("The user switches to a specific Iframe");

        elementMethods.printElementText(frame1Element);
        LoggerUtility.infoTestCase("The user interacts with the text of the frame element");

        //specificam sa revina la frame-ul curent
        frameMethods.switchToParentFrame();
        LoggerUtility.infoTestCase("The user switched to the default frame");

        frameMethods.switchSpecificIframe("frame2");
        LoggerUtility.infoTestCase("The user switches to a specific Iframe");

        System.out.println(frame1Element.getText());
        LoggerUtility.infoTestCase("The user interacts with the text of the frame element");
    }



}
